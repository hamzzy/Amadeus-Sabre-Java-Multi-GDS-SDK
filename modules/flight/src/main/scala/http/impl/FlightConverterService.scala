package flight.http.impl

import flight.converter.amadeus.tripxml._
import javax.inject.Singleton
import dto.enums.{Supplier => cSupplier}
import flight.converter.amadeus._
import flight.converter.crane.{CraneAvailabilityConverter, CraneBookItineraryConverter, CraneIssueTicketConverter, CraneItinerarySearchConverter}
import flight.converter.amadeus.epower._
import flight.converter.sabre._

/**
  * Created by Igbalajobi Jamiu O. on 15/01/2017 10:18 AM.
  */
@Singleton
class FlightConverterService {

  def getSearchInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusItinerarySearchConverter
    case cSupplier.SABRE => SabreItinerarySearchConverter
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusItinerarySearchConverter
    case cSupplier.AMADEUS_RESTAPI => EPowerAmadeusItinerarySearchConverter
    case cSupplier.CRANE => CraneItinerarySearchConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getSearchMatrixInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusItineraryMatrixSearchConverter
    case cSupplier.SABRE => SabreItineraryMatrixSearchConverter
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusItinerarySearchMatrixConverter
    case cSupplier.CRANE => CraneItinerarySearchConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getAvailabilityInstance(supplierId: String) = supplierId match {
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusAvailabilityItineraryConverter
    case cSupplier.AMADEUS => AmadeusItinerarySeatAvailabilityConverter
    case cSupplier.CRANE => CraneAvailabilityConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getFareRulesInstance(supplierId: String) = supplierId match {
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusFareRuleConverter
    case cSupplier.AMADEUS => AmadeusFareRuleConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getAPISInfoInstance(supplierId: String) = supplierId match {
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusGetAPISInfoConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getGDSExchangeRateInstance(supplierId: String) = supplierId match {
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusCurrencyConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getBookingInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusBookItineraryConverter
    case cSupplier.SABRE => SabreBookItineraryConverter
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusBookItineraryConverter
    case cSupplier.CRANE => CraneBookItineraryConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getCancelInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusCancelBookingConverter
    case cSupplier.SABRE => SabreCancelBookingConverter
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusItineraryCancelConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getReadPNRInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusReadItineraryConverter
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusReadPNRConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getVoidTicketInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusVoidTicketConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getIssueTicketInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusIssueTicketConverter
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusIssueTicketConverter
    case cSupplier.CRANE => CraneIssueTicketConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getCloseSession(supplierId: String) = supplierId match {
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusSignOutConverter
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

}
