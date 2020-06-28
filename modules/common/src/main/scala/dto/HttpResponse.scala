package dto

import java._
/**
  * Created by Igbalajobi Jamiu O. on 25/11/2016 12:45 AM.
  */

trait HttpResponse[T] {

  def httpStatusCode: Int
  def httpBodyContent: T
  def requestBody: String

}
case class HttpResponseDto(httpStatusCode: Int,
                           httpBodyContent: String,
                           responseHeader: util.Map[String, util.List[String]],
                           requestBody: String = ""
                          ) extends HttpResponse[String]
