package utils

import services.ConfigLoad

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 1:58 PM.
  */

object SupplierConfigManager extends ConfigLoad {

  //TODO
  def getSupplierInfo(supplierName: String): Map[String, SupplierConfig] = ???
  //configuration.getConfig(supplierName).entrySet().map(a => a.getKey -> a.getValue.render().replaceAll("\"", "")).toMap.map(item => item._1 -> SupplierConfig(item._1, item._2.replaceAll("\"", "")))

  def getSupplierConfig(supplier: ApiSuppliers, configKeys: String): Option[SupplierConfig] = getSupplierInfo(supplier.supName).get(configKeys)

  def getSupplierConfig(supplier: String, configKeys: String): Option[SupplierConfig] = getSupplierInfo(supplier).get(configKeys)
}
case class SupplierConfig(configKey: String, configValue: String)
case class ApiSuppliers(supName: String)

