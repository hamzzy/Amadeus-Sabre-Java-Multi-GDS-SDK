package dto

import org.joda.time.DateTime

case class SearchRequestHeader(searchFrom: Long = System.currentTimeMillis(),
                               searchTo: Long = 0,
                               httpCookieID: Option[String] = None,
                               httpRequest: Option[String] = None,
                               httpResponse: Option[String] = None,
                               ipAddress: Option[String] = None,
                               userAgent: Option[String] = None
                              ) {
  lazy val elapsedTime = (searchTo - searchFrom) / 1000;
}