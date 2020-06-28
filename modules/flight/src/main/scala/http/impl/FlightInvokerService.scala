package flight.http.impl

import javax.inject.Singleton
import flight.invoker.amadeus.epower._
import dto.enums.{Supplier => cSupplier}
import flight.invoker.amadeus.tripxml.{AmadeusFareRuleInvoker, AmadeusIssueTicketInvoker, AmadeusItinerarySeatAvailabilityInvoker, AmadeusVoidTicketInvoker}
import flight.invoker.crane.{CraneBookItineraryInvoker, CraneIssueTicketInvoker, CraneItinerarySearchInvoker}
import wsimport.lib.amadeus._
import wsimport.lib.sabre._
import flight.invoker.sabre.SabreItinerarySearchInvoker
import flight.invoker.amadeus.tripxml._

/**
  * Created by Igbalajobi Jamiu O. on 13/01/2017 6:07 PM.
  */
@Singleton
class FlightInvokerService {

  def getSearchInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusItinerarySearchInvoker
    case cSupplier.SABRE => SabreItinerarySearchInvoker
    case cSupplier.EPOWER_AMADEUS => EPowerItinerarySearchInvoker
    case cSupplier.CRANE => CraneItinerarySearchInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getSearchMatrixInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusItineraryMatrixSearchInvoker
    case cSupplier.SABRE => SabreItineraryMatrixSearchInvoker
    case cSupplier.EPOWER_AMADEUS => EPowerItinerarySearchMatrixInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getAvailabilityInstance(supplierId: String) = supplierId match {
    case cSupplier.EPOWER_AMADEUS => EPowerItineraryAvailabilityInvoker
    case cSupplier.AMADEUS => AmadeusItinerarySeatAvailabilityInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getFareRulesInstance(supplierId: String) = supplierId match {
    case cSupplier.EPOWER_AMADEUS => EPowerFareRuleInvoker
    case cSupplier.AMADEUS => AmadeusFareRuleInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getAPISInfoInstance(supplierId: String) = supplierId match {
    case cSupplier.EPOWER_AMADEUS => EPowerGetAPISInfoInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getGDSExchangeRateInstance(supplierId: String) = supplierId match {
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusCurrencyInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getBookingInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusBookItineraryInvoker
    case cSupplier.SABRE => SabreBookItineraryInvoker
    case cSupplier.EPOWER_AMADEUS => EPowerBookItineraryInvoker
    case cSupplier.CRANE => CraneBookItineraryInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getQueryInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusReadItineraryInvoker
    case cSupplier.SABRE => SabreReadItineraryInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getCancelInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusCancelBookingInvoker
    case cSupplier.SABRE => SabreCancelBookingInvoker
    case cSupplier.EPOWER_AMADEUS => EPowerCancelItineraryInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getReadPNRInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusReadItineraryInvoker
    case cSupplier.EPOWER_AMADEUS => EPowerReadPNRInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getVoidTicketInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusVoidTicketInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getIssueTicketInstance(supplierId: String) = supplierId match {
    case cSupplier.AMADEUS => AmadeusIssueTicketInvoker
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusIssueTicketInvoker
    case cSupplier.CRANE => CraneIssueTicketInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

  def getCloseSession(supplierId: String) = supplierId match {
    case cSupplier.EPOWER_AMADEUS => EPowerAmadeusSignOutInvoker
    case _ => throw new Throwable("Invalid `supplierId` Specified. Please Check Supported Supplier and Try Again")
  }

}
