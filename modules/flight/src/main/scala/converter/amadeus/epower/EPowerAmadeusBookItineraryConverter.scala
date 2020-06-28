package flight.converter.amadeus.epower

import java.math.BigInteger
import java.time.ZoneId
import java.util.Date

import flight.converter.Converter
import flight.dto.entity.{Airlines, _}
import flight.dto.utils.AirlineGetter
import wsimport.lib.epower.ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption
import wsimport.lib.epower.BookFlight.OTAAirBookRQ
import wsimport.lib.epower.BookResponse.BookBasketRS.FullFilment
import wsimport.lib.epower.Cancel.OTACancelRQ
import wsimport.lib.epower.TravelerInfoType.AirTraveler
import wsimport.lib.epower.VerificationType.PersonName
import wsimport.lib.epower._
import org.apache.commons.lang3.text.WordUtils

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import wsimport.lib.epower.TicketType
import dto.BookingStatus
import dto.entity.enums.{Gender, PassengerCode}
import dto.enums.Supplier
import flight.invoker.amadeus.epower.EPowerBookItineraryInvoker.supplierConfigs
import utils.StringUtil
import javax.xml.datatype.{DatatypeFactory, XMLGregorianCalendar}
import org.apache.commons.codec.digest.DigestUtils

import scala.collection.immutable

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object EPowerAmadeusBookItineraryConverter extends Converter[BookFlight, PNRDetails] with EPowerHeader {

  @throws[Exception]
  def encrypt(x: String): Array[Byte] = {
    val d = java.security.MessageDigest.getInstance("SHA-1")
    d.reset()
    d.update(x.getBytes)
    d.digest()
  }

  override def toSupplier(baseDto: AnyRef): BookFlight = {
    val bookFlight = new BookFlight
    val bookingRequest = baseDto.asInstanceOf[BookingRequest]
    println(bookFlight.getSessionId)
    bookFlight.setSessionId(bookingRequest.getSessionId)
    val otaAirBookRQ = new OTAAirBookRQ
    if (bookingRequest.getIsPricedBooking) {
      val wsSecurityNo = supplierConfigs(ConstKey.E_CLIENTID).configValue
      otaAirBookRQ.setReferenceNumber(s"${bookingRequest.getRePriceReferenceNo}")
      otaAirBookRQ.setControlNumber(DigestUtils.sha1Hex(s"${bookingRequest.getRePriceReferenceNo}$wsSecurityNo"))
    } else {
      val pricedItineraryWSResponseInterface = bookingRequest.getItineraryWSResponse
      otaAirBookRQ.setIsOneWayCombinable(pricedItineraryWSResponseInterface.getOneWayCombinable)
      otaAirBookRQ.setRecommendationID(pricedItineraryWSResponseInterface.getSequenceNumber.toInt)
      otaAirBookRQ.setCombinationID(pricedItineraryWSResponseInterface.getSelectedCombinationId.toInt)
      otaAirBookRQ.setTravelerInfo(createTravellerInfo(bookingRequest.getPassengers))
      val fulfilment = new OTAAirBookRQ.Fulfillment
      val arrayOfPaymentDetailType = new ArrayOfPaymentDetailType
      val paymentDetailType = new PaymentDetailType
      paymentDetailType.setPaymentType(PaymentTypes.NONE)
      arrayOfPaymentDetailType.getPaymentDetail.add(paymentDetailType)
      fulfilment.setPaymentDetails(arrayOfPaymentDetailType)
      otaAirBookRQ.setFulfillment(fulfilment)
      val ticketing = new OTAAirBookRQ.Ticketing
      ticketing.setTicketType(TicketType.BOOKING_ONLY)
      otaAirBookRQ.getTicketing.add(ticketing)
    }
    bookFlight.setOTAAirBookRQ(otaAirBookRQ)
    bookFlight
  }

  private def createTravellerInfo(passengers: List[Passenger]): TravelerInfoType = {
    val travelerInfoType = new TravelerInfoType
    val airTravelers = passengers.map { item =>
      val airTraveler = new AirTraveler
      airTraveler.setPassengerTypeCode(item.code.value())
      val personName = new PersonNameType
      personName.getNamePrefix.add(item.namePrefix)
      if (item.middleName.isDefined && item.middleName.nonEmpty) personName.getMiddleName.add(item.middleName.orNull) //"'orNull' for null exception saftey"
      personName.getGivenName.add(item.givenName)
      personName.setSurname(item.surname)
      airTraveler.setPersonName(personName)
      val phoneType = new AirTravelerType.Telephone
      phoneType.setRPH(item.rph)
      phoneType.setPhoneNumber(item.contactPhone)
      val emailType = new AirTravelerType.Email
      emailType.setEmailType("1")
      emailType.setValue(item.contactEmail)
      airTraveler.getEmail.add(emailType)
      airTraveler.getTelephone.add(phoneType)
      val dob = Date.from(item.birthDate.atZone(ZoneId.systemDefault()).toInstant)
      airTraveler.setBirthDate(xmlDate(dob))
      airTraveler
    }
    travelerInfoType.getAirTraveler.addAll(airTravelers)
    travelerInfoType
  }

  def xmlDate(date: Date) = {
    import javax.xml.datatype.DatatypeFactory
    import java.util.GregorianCalendar
    val c = new GregorianCalendar
    c.setTime(date)
    DatatypeFactory.newInstance.newXMLGregorianCalendar(c)
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRDetails = {
    val bookingRequest = request.asInstanceOf[BookingRequest]
    val pnrDetails = new PNRDetails()
    val otaBookRS = response.asInstanceOf[BookFlightResponse]
    pnrDetails.setRequestXml(otaBookRS.getBookRequestXML)
    pnrDetails.setResponseXml(StringUtil.classToXmlString(otaBookRS))
    pnrDetails.setBookingRequest(bookingRequest)
    pnrDetails.setGdsPlainResponse(otaBookRS)
    if (otaBookRS.getOTAAirBookRS.getAirReservation != null) {
      pnrDetails.setItineraryRef(otaBookRS.getOTAAirBookRS.getAirReservation.getBookingReferenceID.head.getIDContext)
      pnrDetails.setAirlineRef(otaBookRS.getOTAAirBookRS.getAirReservation.getBookingReferenceID.head.getIDContext)
      pnrDetails.setTicketTimeLimit(otaBookRS.getOTAAirBookRS.getAirReservation.getTicketing.head.getTicketTimeLimit.toString)
      var rph = 1
      val item = otaBookRS.getOTAAirBookRS.getAirReservation.getTravelerInfo.getAirTraveler.map { traveller =>
        val personName = traveller.getPersonName
        val namePrefix = if (personName.getNamePrefix != null) personName.getNamePrefix.head else ""
        val pass = Passenger(
          namePrefix = namePrefix,
          givenName = if (personName.getGivenName != null) personName.getGivenName.head else "",
          surname = personName.getSurname,
          code = PassengerCode.fromValue(traveller.getPassengerTypeCode),
          rph = rph.toString,
          contactEmail = if (traveller.getEmail.headOption.nonEmpty) traveller.getEmail.head.getValue else "",
          gender = namePrefix.toLowerCase match {
            case "Mr" | "Master" => Gender.MALE
            case _ => Gender.FEMALE
          }
        )
        rph += 1
        pass
      }
      if (pnrDetails.getBookingRequest != null) pnrDetails.getBookingRequest.setPassengers(item.toList)
      val airItineraryType = otaBookRS.getOTAAirBookRS.getAirReservation.getAirItinerary
      val firstFlight = airItineraryType.getOriginDestinationOptions.getOriginDestinationOption.head.getFlightSegment.head
      pnrDetails.setPnrRemarks(otaBookRS.getOTAAirBookRS.getAirReservation.getPNRRemarks.getPNRRemark.map { remark =>
        PnrRemark(typez = remark.getRemarkType, category = remark.getRemarkCategory, description = remark.getNote)
      }.toList)
      pnrDetails.setStatus(BookingStatus.SUCCESS)
      //Save Remark on the booking information
      try {
        val pnrRemarks = otaBookRS.getOTAAirBookRS.getAirReservation.getFlightRulePenalties.map { xmlRemark =>
          if (xmlRemark.getFareRules != null) {
            PnrRemark(description = xmlRemark.getFareRules.head.getSubSection.head.getParagraph.head.getText)
          } else PnrRemark()
        }
        pnrDetails.setPnrRemarks(pnrRemarks.toList)
      } catch {
        case ignore: Throwable =>
      }
      return pnrDetails
    } else if (otaBookRS.getOTAAirBookRS.getFailback != null && otaBookRS.getOTAAirBookRS.getReferenceNumber != null) {
      val fallback = otaBookRS.getOTAAirBookRS.getFailback
      val referenceNo = otaBookRS.getOTAAirBookRS.getReferenceNumber
      /*
       * Get the specific kind of fallback
       */
      val itinerary = bookingRequest.getItineraryWSResponse
      pnrDetails.setBookingRequest(bookingRequest)
      pnrDetails.setStatus(otaBookRS.getOTAAirBookRS.getFailback.getFailbackIndicator.last.getFailbackStatus.value())
      pnrDetails.getStatus match {
        case "SeatTaken" =>
        case "ScheduleChange" => {
          val fallback = otaBookRS.getOTAAirBookRS.getFailback
          bookingRequest.setIsScheduleChanged(true)
          bookingRequest.setItineraryWSResponse(itinerary)
          val scheduleChangePref: Seq[Map[String, Map[String, String]]] = fallback.getFailbackIndicator.flatMap(_.getScheduleChangeParameter).map { scheduleChangeParam =>
            val dtFormat = "yyyy-MM-dd'T'HH:mm:ss"
            Map(scheduleChangeParam.getSegmentRef -> Map("oldDate" -> EPowerAmadeusItinerarySearchConverter.parseDate(dtFormat, scheduleChangeParam.getOldDate), "newDate" -> EPowerAmadeusItinerarySearchConverter.parseDate(dtFormat, scheduleChangeParam.getNewDate)))
          }.toList
          itinerary.setScheduleChangePref(scheduleChangePref)
          bookingRequest.setRePriceReferenceNo(referenceNo)
          pnrDetails.setBookingRequest(bookingRequest)
          pnrDetails.setFailBackItineraryInfo(itinerary)
          return pnrDetails
        }
        case "PriceChange" => {
          val fallback = otaBookRS.getOTAAirBookRS.getFailback
          bookingRequest.setIsPricedBooking(true)
          bookingRequest.setItineraryWSResponse(itinerary)
          val newprice = fallback.getNewPrice
          val priceInfoWSResponse = itinerary.getPricingInfoWSResponse

          priceInfoWSResponse.setOldGdsBaseFare(priceInfoWSResponse.getBaseFare.amount)
          priceInfoWSResponse.setOldGdsTaxFare(priceInfoWSResponse.getGdsTaxFare.doubleValue())
          priceInfoWSResponse.setOldTotalFare(priceInfoWSResponse.getTotalFare)

          priceInfoWSResponse.setGdsBaseFare(newprice.getItinTotalFare.getBaseFare.getAmount)
          priceInfoWSResponse.setGdsTotalFare(newprice.getItinTotalFare.getTotalFare.getAmount)

          priceInfoWSResponse.setBaseFare(BaseFare(amount = newprice.getItinTotalFare.getBaseFare.getAmount.doubleValue(), currencyCode = newprice.getItinTotalFare.getBaseFare.getCurrency))
          priceInfoWSResponse.setTotalFare(newprice.getItinTotalFare.getTotalFare.getAmount)

//          val priceDirection = Option(priceInfoWSResponse.getPriceDirection)
//          if (priceDirection.isDefined && priceDirection.nonEmpty) {
//            val defaultBaseFare = newprice.getItinTotalFare.getBaseFare.getAmount.doubleValue()
//            var newBaseFare = defaultBaseFare.doubleValue()
//
//            val isPercent = priceInfoWSResponse.valueType.equalsIgnoreCase("PERCENTAGE")
//            if (priceDirection.get.equals("+")) {
//              //markup
//              newBaseFare = if (isPercent) {
//                priceInfoWSResponse.setDispenseValueAmount(calculatePercentage(defaultBaseFare.doubleValue(), priceInfoWSResponse.getDispenseValue.doubleValue()))
//                defaultBaseFare.doubleValue() + calculatePercentage(defaultBaseFare.doubleValue(), priceInfoWSResponse.getDispenseValue.doubleValue())
//              } else {
//                priceInfoWSResponse.setDispenseValueAmount(priceInfoWSResponse.getDispenseValue.doubleValue)
//                defaultBaseFare.doubleValue() + priceInfoWSResponse.getDispenseValue.doubleValue()
//              }
//              priceInfoWSResponse.setBaseFare(BaseFare(amount = newBaseFare, currencyCode = newprice.getItinTotalFare.getBaseFare.getCurrency))
//              priceInfoWSResponse.setTotalFare(priceInfoWSResponse.getBaseFare.amount + priceInfoWSResponse.getTotalTax.map(_.amount).sum)
//            } else if (priceDirection.get.equals("-")) {
//              newBaseFare = if (isPercent) {
//                priceInfoWSResponse.setDispenseValueAmount(calculatePercentage(defaultBaseFare.doubleValue(), priceInfoWSResponse.getDispenseValue.doubleValue()))
//                defaultBaseFare.doubleValue() - calculatePercentage(defaultBaseFare.doubleValue(), priceInfoWSResponse.getDispenseValue.doubleValue())
//              } else {
//                priceInfoWSResponse.setDispenseValueAmount(priceInfoWSResponse.getDispenseValue.doubleValue)
//                defaultBaseFare.doubleValue() - priceInfoWSResponse.getDispenseValue.doubleValue()
//              }
//              priceInfoWSResponse.setBaseFare(BaseFare(amount = newBaseFare, currencyCode = newprice.getItinTotalFare.getBaseFare.getCurrency))
//              priceInfoWSResponse.setTotalFare(priceInfoWSResponse.getBaseFare.amount + priceInfoWSResponse.getTotalTax.map(_.amount).sum)
//            }
//          }

          priceInfoWSResponse.setGdsEquivCurrency(newprice.getItinTotalFare.getBaseFare.getCurrency)
          priceInfoWSResponse.setPassengerFare(newprice.getPTCFareBreakdowns.getPTCFareBreakdown.map(ptcFareBreakDown => FareBreakDown(
            passengerType = PassengerType(code = PassengerCode.fromValue(ptcFareBreakDown.getPassengerTypeQuantity.getCode), quantity = ptcFareBreakDown.getPassengerTypeQuantity.getQuantity),
            passengerFare = PassengerFare(
              baseFare = ptcFareBreakDown.getPassengerFare.getBaseFare.getAmount,
              totalFare = ptcFareBreakDown.getPassengerFare.getTotalFare.getAmount,
              totalTax = ptcFareBreakDown.getPassengerFare.getTaxes.getTax.map(_.getAmount.doubleValue()).sum
            ),
            quantity = ptcFareBreakDown.getPassengerTypeQuantity.getQuantity
          )).toList)

          itinerary.setPricingInfoWSResponse(priceInfoWSResponse)
          bookingRequest.setRePriceReferenceNo(referenceNo)
          pnrDetails.setBookingRequest(bookingRequest)
          pnrDetails.setFailBackItineraryInfo(itinerary)
          return pnrDetails
        }
        case "FareBasisChange" =>
        case "PricingFareEror" =>
        case "AncillaryPriceChange" =>

      }
      bookingRequest.setRePriceReferenceNo(referenceNo)
    } else if (otaBookRS.getOTAAirBookRS.getErrorsOrSuccessOrWarnings != null && otaBookRS.getOTAAirBookRS.getErrorsOrSuccessOrWarnings.size() > 0) {
      pnrDetails.setStatus(BookingStatus.FAILED)
      val errorsType = otaBookRS.getOTAAirBookRS.getErrorsOrSuccessOrWarnings.head.asInstanceOf[ErrorsType]
      //      errorsType.getError.foreach(errorType => pnrDetails.getErrors.add(errorType.getShortText))
    }
    pnrDetails
  }

  private def calculatePercentage(amount: Double, percentage: Double) = (amount / 100.0D) * percentage

}
