package dto

object BookingStatus {
  val FAILED = "FAILED"
  val AVAILABLE = "AVAILABLE"
  val UNAVAILABLE = "UNAVAILABLE"
  val SUCCESS = "SUCCESS"
  val FALLBACK = "FALLBACK"
  val PRICE_CHANGE = "PRICE_CHANGE"
  val CANCELLED = "CANCELLED"
  val TICKET_ISSUED = "TICKET_ISSUED"
  val TICKET_VOIDED = "TICKET_VOIDED"
  val UNKNOWN = "UNKNOWN"

  //User Activity
  val TICKET_ISSUE_REQUEST = "TICKET_ISSUE_REQUEST"
  val TICKET_VOID_REQUEST = "TICKET_VOID_REQUEST"
  val TICKET_CANCEL_REQUEST = "TICKET_CANCEL_REQUEST"
  val TICKET_DATE_CHANGE_REQUEST = "TICKET_DATE_CHANGE_REQUEST"
}
