package flight.dto.utils

import java.io.{File, FileInputStream}

import io.circe._
import io.circe.parser._
import io.circe.generic.semiauto._
import flight.dto.entity._
import services.{ConfigLoad, ConfigLoadObject}

import scala.xml.{Elem, XML}
import scala.concurrent.{ExecutionContext, Future}
import scala.io.Source


/**
  * Created by Igbalajobi Jamiu on 12/12/17. Edited on 20/05/18
  */

case class AirportDAO(airportCode: String = "", airportName: String = "", countryCode: String = "", cityCode: String = "", typeCode: String = "", city: String = "", state: String = "", country: String = "")
case class CityDAO(cityCode: String = "", cityName: String = "", countryCode: String = "")
case class CountryDAO(code: String = "", name: String = "", continent: String = "")


object AirportCityGetter {

  object Implicit {

    object File {
      val airportsXMLFile = new File(s"${System.getProperty("user.dir")}/resources/airports.xml")
      val citiesXMLFile = new File(s"${System.getProperty("user.dir")}/resources/cities.xml")
      val countryXMLFile = new File(s"${System.getProperty("user.dir")}/resources/countries.xml")

      implicit val citiesList: Vector[CityDAO] = (XML.loadFile(citiesXMLFile) \\ "City").toVector.map(node => CityDAO(
        cityCode = (node \ "CityCode").text,
        cityName = (node \ "CityName").text,
        countryCode = (node \ "CountryCode").text
      ))
      implicit val countriesList: Vector[CountryDAO] = (XML.loadFile(countryXMLFile) \\ "Country").toVector.map(node => CountryDAO(
        name = (node \ "CountryName").text,
        code = (node \ "CountryCode").text,
        continent = (node \ "Continent").text
      ))
      implicit lazy val airportsList: Vector[AirportDAO] = (XML.loadFile(airportsXMLFile) \\ "Airport").toVector.map { node =>
        val city = cityListMap.getOrElse((node \ "AirportCode").text, cityListMap.getOrElse((node \ "CityCode").text, CityDAO()))
        AirportDAO(
          airportCode = (node \ "AirportCode").text,
          airportName = (node \ "AirportName").text,
          countryCode = (node \ "CountryCode").text,
          cityCode = (node \ "CityCode").text,
          typeCode = (node \ "TypeCode").text,
          state = city.cityName,
          city = city.cityName
        )
      }

      implicit val cityListMap: Map[String, CityDAO] = citiesList.map(a => a.cityCode -> a).toMap
      implicit val countriesListMap: Map[String, CountryDAO] = countriesList.map(a => a.code -> a).toMap
      implicit val airportListMap: Map[String, AirportDAO] = airportsList.map(node => node.airportCode -> node).toMap
    }

//    object Cache extends DBConfiguration with ConfigLoad {
//
//      import shade.memcached._
//      import scala.concurrent.ExecutionContext.Implicits.global
//
//      implicit val a = AirportCodec
//      val memcached = Memcached(Configuration(Option(configuration.getString("elasticache.config.endpoint")).getOrElse(configuration.getString("memcached.host"))))
//
//      implicit lazy val airportList: Map[String, AirportDAO] = memcached.awaitGet[Seq[AirportDAO]]("airport").getOrElse(Database.airportList).map { item =>
//        item.airportCode -> item
//      }.toMap
//
//
//      object AirportCodec extends Codec[Seq[AirportDAO]] {
//        def serialize(user: Seq[AirportDAO]): Array[Byte] = user.map(a => s"${a.airportCode}|${a.cityCode}|${a.city}|${a.airportCode}|${a.airportName}|${a.country}|${a.countryCode}|${a.state}|${a.typeCode}").mkString("||").getBytes("utf-8")
//
//        def deserialize(data: Array[Byte]): Seq[AirportDAO] = {
//          val str = new String(data, "utf-8")
//          str.split("||").toSeq.map { a =>
//            val Array(airportCode, airportName, countryCode, cityCode, typeCode, city, state, country) = a.split("|")
//            AirportDAO(airportCode, airportName, countryCode, cityCode, typeCode, city, state, country)
//          }
//        }
//      }
//
//    }
//
//    object Database extends DBConfiguration {
//
//      import profile._
//
//      lazy val airportTableName = "airport"
//      lazy val cityTableName = "airport"
//
//      def airportListFuture(implicit ex: ExecutionContext): Future[Vector[AirportDAO]] = db.run(sql"""SELECT `stateName`, `airCode`, `cityCode`, `airportName`, `countryName`, `countryCode`, `cityName` FROM #$airportTableName""".as[(String, String, String, String, String, String, String)]).map(item =>
//        item.map(a => AirportDAO(
//          airportCode = a._2,
//          airportName = a._4,
//          city = a._7,
//          cityCode = a._3,
//          countryCode = a._6
//        ))
//      )
//
//
//      implicit lazy val cityList: Vector[CityDAO] = exec(sql"""SELECT `cityCode`, `cityName`, `countryCode` FROM #$cityTableName""".as[(String, String, String)]).toVector.map(a => CityDAO(
//        cityCode = a._1,
//        cityName = a._2,
//        countryCode = a._3
//      ))
//      implicit lazy val airportList: Vector[AirportDAO] = exec(sql"""SELECT `stateName`, `airCode`, `cityCode`, `airportName`, `countryName`, `countryCode`, `cityName` FROM #$airportTableName""".as[(String, String, String, String, String, String, String)]).toVector.map(a => AirportDAO(
//        airportCode = a._2,
//        airportName = a._4,
//        city = a._7,
//        cityCode = a._3,
//        countryCode = a._6,
//        country = a._5,
//        state = a._1
//      ))
//      implicit lazy val airportListMap: Map[String, AirportDAO] = airportList.map(a => a.airportCode -> a).toMap
//    }

  }

  def getCityByCode(cityCode: String)(implicit cities: Vector[CityDAO]): Option[City] = cities.find(a => a.cityCode.equalsIgnoreCase(cityCode)).flatMap(item => Option(City(item.cityCode, item.cityName, item.countryCode)))

  def getAirportsByCityCode(code: String)(implicit airportXML: Vector[AirportDAO], cityXML: Vector[CityDAO]): Seq[Airports] = airportXML.filter(a => a.cityCode.equalsIgnoreCase(code) && a.typeCode.equals("A")).map { xml =>
    val city = cityXML.find(city => city.cityCode.equalsIgnoreCase(xml.cityCode)).get
    Airports(
      id = None,
      xml.airportCode,
      xml.airportName,
      city.countryCode,
      xml.countryCode,
      xml.cityCode,
      city.cityName
    )
  }

  def allAirports(implicit airports: Vector[AirportDAO]): Vector[Airports] = airports.map(item => Airports(None, item.airportCode, item.airportName, item.countryCode, item.countryCode, item.cityCode, item.city, item.state))

  def allAirportsMap(implicit airports: Map[String, AirportDAO]): Map[String, Airports] = airports.map(item => item._1 -> Airports(None, item._2.airportCode, item._2.airportName, item._2.countryCode, item._2.countryCode, item._2.cityCode, item._2.city, item._2.state))


  def getCountryByCode(countryCode: String)(implicit countries: Vector[CountryDAO]): Option[CountryDAO] = countries.find(a => a.code.equalsIgnoreCase(countryCode)).flatMap(item => Option(CountryDAO(code = item.code, name = item.name, continent = item.continent)))


}

