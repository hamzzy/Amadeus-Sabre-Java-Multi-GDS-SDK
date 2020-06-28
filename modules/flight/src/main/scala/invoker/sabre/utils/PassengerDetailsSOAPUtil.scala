/**
  * Created by Igbalajobi Jamiu O. on 4/22/2016.
  */

package flight.invoker.sabre.utils

import java.util.{List => JList}

import dto.entity.enums.PassengerCode
import flight.dto.entity._
import services.ConfigLoad

import scala.collection.JavaConversions._
import scala.xml.NodeSeq

trait PassengerDetailsSOAPUtil extends SabreXMLRequestUtils with ConfigLoad {
  val SERVICE = configuration.getString("sabre.passengerDetails.service")
  val ACTION = configuration.getString("sabre.passengerDetails.action")
  val DESCRIPTION = configuration.getString("sabre.passengerDetails.description")
  val TICKET_TYPE = configuration.getString("sabre.passengerDetails.ticketType")
  val ADDRESS_LINE = configuration.getString("sabre.agency.addressLine")
  val CITY_NAME = configuration.getString("sabre.agency.city")
  val COUNTRY_CODE = configuration.getString("sabre.agency.countryCode")
  val POSTAL_CODE = configuration.getString("sabre.agency.postalCode")
  val STATE_CODE = configuration.getString("sabre.agency.stateCode")
  val STREET_NUMBER = configuration.getString("sabre.agency.streetNumber")
  val defaultNameNumber = 1.1

  def passengerDetailsRequest(binarySecurityToken: String, bookingRequest: BookingRequest, priceQuotes: JList[PriceQuote]) = {
    val passengers: JList[Passenger] = bookingRequest.getPassengers
    val passengerDetailsRQ = {
      <PassengerDetailsRQ version="3.2.0" xmlns="http://services.sabre.com/sp/pd/v3_2" IgnoreOnError="true" HaltOnError="true">
        {getPostProcessingNode}<PriceQuoteInfo>
        {getPriceQuoteInfoLinkNodes(priceQuotes, passengers)}
      </PriceQuoteInfo>
        <TravelItineraryAddInfoRQ>
          {getAgencyInfo}<CustomerInfo>
          <ContactNumbers>
            {toContactNumberNodes(passengers)}
          </ContactNumbers>{getPersonNameNodesWithEmailNodes(passengers)}
        </CustomerInfo>
        </TravelItineraryAddInfoRQ>
      </PassengerDetailsRQ>
    }
    soapTemplateWithToken(binarySecurityToken, SERVICE, ACTION, DESCRIPTION, passengerDetailsRQ)
  }

  private def toContactNumberNodes(passengers: JList[Passenger]) = {
    for {
      index <- passengers.indices
      telephones =  passengers(index).telephones
      nameNumber = defaultNameNumber + index
      if telephones.nonEmpty
      telephone <- telephones
    } yield {
        <ContactNumber LocationCode={telephone.locationCode} NameNumber={nameNumber.toString} Phone={telephone.phoneNumber} PhoneUseType={flight.dto.entity.enums.PhoneUseType.H.value()}/>
    }
  }

  private def getPersonNameNodesWithEmailNodes(passengers: JList[Passenger]) = {
    toEmailNodes(passengers) ++ toPersonNameNodes(passengers)
  }

  private def toEmailNodes(passengers: JList[Passenger]) = {
    val emailsWithNameNumber = for {
      index <- passengers.indices
      emails = passengers(index).emails
      nameNumber = defaultNameNumber + index
      if emails.nonEmpty
    } yield {
      nameNumber -> emails
    }

    emailsWithNameNumber.toSeq.flatMap {
      case (nameNumber, emails) => emails.map { email => <Email Address={email} NameNumber={nameNumber.toString}/> }
    }
  }

  private def toPersonNameNodes(passengers: JList[Passenger]) = {
    val personNameNodes = for {
      index <- passengers.indices
      passenger = passengers(index)
      nameNumber = defaultNameNumber + index
    } yield {
      <PersonName NameNumber={nameNumber.toString} Infant={if (passenger.code == PassengerCode.INFANT) "true" else "false"} PassengerType={passenger.code.value()}>
        <GivenName>{s"${passenger.givenName} ${if (passenger.code != PassengerCode.INFANT) passenger.namePrefix}"}</GivenName>
        <Surname>{passenger.surname}</Surname>
      </PersonName>
    }
    personNameNodes.toList
  }

  private def getPostProcessingNode = {
    <PostProcessing RedisplayReservation="true">
      <ARUNK_RQ/>
      <EndTransactionRQ>
        <EndTransaction Ind="true"/>
        <Source ReceivedFrom={AGENCY_NAME}/>
      </EndTransactionRQ>
    </PostProcessing>
  }

  private def getPriceQuoteInfoLinkNodes(priceQuotes: JList[PriceQuote], passengers: JList[Passenger]) = {
    for {
      index <- passengers.indices
      passenger = passengers(index)
      nameNumber = defaultNameNumber + index
      priceQuote <- priceQuotes
      if priceQuote.passengerType.code.equals(passenger.code)
    } yield {
        <Link NameNumber={nameNumber.toString} Record={priceQuote.RPH}/>
    }
  }

  private def getAgencyInfo = {
    <AgencyInfo>
      <Address>
        <AddressLine>{ADDRESS_LINE}</AddressLine>
        <CityName>{CITY_NAME}</CityName>
        <CountryCode>{COUNTRY_CODE}</CountryCode>
        <PostalCode>{POSTAL_CODE}</PostalCode>
        <StateCountyProv StateCode={STATE_CODE}/>
        <StreetNmbr>{STREET_NUMBER}</StreetNmbr>
      </Address>
      <Ticketing PseudoCityCode={SABRE_PCC} QueueNumber="75" ShortText="PNR Generated From SabreWA Server" TicketType={TICKET_TYPE}/>
    </AgencyInfo>
  }

  def getPriceQuotes = {
    val firstPriceQuote = PriceQuote(passengerType = PassengerType(code = PassengerCode.ADULT, quantity = 2), RPH = "1")
    val secondPriceQuote = PriceQuote(passengerType = PassengerType(code = PassengerCode.SABRE_CHILD, quantity = 1))
    List(firstPriceQuote, secondPriceQuote)
  }

  def toPNRDetails(itineraryRef: NodeSeq) = {
    val pNRDetails = new  PNRDetails()
    pNRDetails.setItineraryRef(itineraryRef \@ "ID")
    pNRDetails
  }
}
