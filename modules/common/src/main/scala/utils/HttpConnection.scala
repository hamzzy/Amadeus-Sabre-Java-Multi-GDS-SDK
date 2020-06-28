package utils

import java.io.{BufferedReader, InputStream, InputStreamReader, OutputStreamWriter}
import java.net.{HttpURLConnection, URL}
import javax.inject.Singleton
import javax.net.ssl.HttpsURLConnection

import dto.HttpResponseDto
import org.apache.http.client.methods.{HttpPost => cHttpPost}

/**
  * Created by Igbalajobi Jamiu O. on 14/12/2016 11:28 AM.
  */
object HttpConnection extends HttpConnection

@Singleton
class HttpConnection {

  val timeOut = 15 * 1000 //30 Seconds timeout

  var maxTimeoutRetry = 3

    def post(endpointUrl: String, content: String, headers: Map[String, String]): HttpResponseDto = try {
      val url = new URL(endpointUrl)
      val httpConnection = url.openConnection().asInstanceOf[HttpsURLConnection]
      headers.foreach(header => httpConnection.setRequestProperty(header._1, header._2) )
      httpConnection.setDoOutput(true)
      httpConnection.setDoInput(true)
      httpConnection.setConnectTimeout(timeOut)
      httpConnection.setReadTimeout(timeOut)

      // write request content
      val outputStreamWriter = new OutputStreamWriter(httpConnection.getOutputStream)
      outputStreamWriter.write(content)
      outputStreamWriter.close()

      // read response content
      val inputStream = try {
        httpConnection.getInputStream
      } catch {
        case e: Exception => httpConnection.getErrorStream
      } //httpConnection.getInputStream
      val resultBuffer: StringBuffer = new StringBuffer
      val inputStreamReader = new InputStreamReader(inputStream)
      val reader = new BufferedReader(inputStreamReader)

      while (reader.readLine != null) {
          resultBuffer.append(reader.readLine())
      }

      val httpCode = httpConnection.getResponseCode
      val resCode = Integer.toString(httpCode)
      val response = resultBuffer.toString
      println("Status: " + resCode)
      println("Request: " + content)
      println("Response: " + response)
      HttpResponseDto(resCode.toInt, response, httpConnection.getHeaderFields)
    } catch {
      case e: Exception => e.printStackTrace(); HttpResponseDto(500, "", null)
    }

  def delete(endpointUrl: String, urlEncode: Map[String, String], headers: Map[String, String]): HttpResponseDto = try {
    val url = new URL(endpointUrl)
    val httpCon = url.openConnection().asInstanceOf[HttpURLConnection]
    httpCon.setDoOutput(true)
    headers.foreach(header => httpCon.setRequestProperty(header._1, header._2))
    httpCon.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
    httpCon.setRequestMethod("DELETE")
    httpCon.connect()

    // read response content
    val inputStream = httpCon.getInputStream
    val resultBuffer = new StringBuffer
    val inputStreamReader: InputStreamReader = new InputStreamReader(inputStream)
    val reader: BufferedReader = new BufferedReader(inputStreamReader)
    resultBuffer.append(reader.readLine())
//    println("Status: " + httpCon.getResponseCode)
//    println("Response: " + resultBuffer.toString)
    HttpResponseDto(httpCon.getResponseCode, resultBuffer.toString, httpCon.getHeaderFields)
  } catch {
    case e: Exception => e.printStackTrace(); HttpResponseDto(500, "", null)
  }

  def get(endpointUrl: String, headers: Map[String, String]): HttpResponseDto = try {
    val connUrl: URL = new URL(endpointUrl)
    val urlConnection: HttpsURLConnection = connUrl.openConnection.asInstanceOf[HttpsURLConnection]
    headers.foreach(header => urlConnection.setRequestProperty(header._1, header._2))
    // do post request
    urlConnection.setDoOutput(true)
    urlConnection.setConnectTimeout(timeOut)
    urlConnection.setReadTimeout(timeOut)
    urlConnection.setRequestMethod("GET")

    // read response content
    val inputStream: InputStream = urlConnection.getInputStream
    val resultBuffer: StringBuffer = new StringBuffer
    val inputStreamReader: InputStreamReader = new InputStreamReader(inputStream)
    val reader: BufferedReader = new BufferedReader(inputStreamReader)
    resultBuffer.append(reader.readLine())
    val httpCode: Int = urlConnection.getResponseCode
    //If 'Gateway Timeout' retry the process again
    if (httpCode.equals(504) && maxTimeoutRetry > 0) {
      maxTimeoutRetry -= 1
      return get(endpointUrl = endpointUrl, headers = headers)
    }
//    println("Response: " + resultBuffer.toString)
    HttpResponseDto(httpCode, resultBuffer.toString, urlConnection.getHeaderFields)
  } catch {
    case e: Exception => e.printStackTrace(); HttpResponseDto(500, "", null)
  }


}