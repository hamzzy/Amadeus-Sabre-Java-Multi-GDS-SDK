package flight.dto.utils

import java.io.File

//import com.google.gson.Gson
import flight.dto.entity._

import scala.xml.{Elem, XML}

/**
  * Created by Brakket on 12/12/17.
  */
case class AirlineDAO(name: String, code: String)

object AirlineGetter {

  object Implicit {
    val airlineXMLFile = new File(s"${System.getProperty("user.dir")}/resources/airlines.xml")
    if (!airlineXMLFile.exists()) {
      System.err.println(s"Airline XML File not exist in ${airlineXMLFile.getAbsolutePath}")
      throw new Exception(s"Airline XML file not found in ${airlineXMLFile.getAbsolutePath}")
    }
    implicit lazy val airlineXML: Vector[AirlineDAO] = (XML.loadFile(airlineXMLFile) \\ "Airline").toVector.map(item => AirlineDAO(code = (item \ "AirLineCode").text, name = (item \ "AirLineName").text))
    implicit lazy val airlineXMLMap: Map[String, AirlineDAO] = airlineXML.map(a => a.code -> a).toMap
  }

  def getAirlineByCode(code: String)(implicit airlineList: Vector[AirlineDAO]): Option[Airlines] = airlineList.find(a => a.code.equalsIgnoreCase(code)).flatMap(item => Option(Airlines(item.name, item.code)))
  def allAirlines(implicit airlineList: Vector[AirlineDAO]): Vector[Airlines] = airlineList.map(item => Airlines(item.name, item.code))
  def allAirlinesMap(implicit airlineList: Vector[AirlineDAO]): Map[String, Airlines] = airlineList.map(item => item.code -> Airlines(item.name, item.code)).toMap
}
