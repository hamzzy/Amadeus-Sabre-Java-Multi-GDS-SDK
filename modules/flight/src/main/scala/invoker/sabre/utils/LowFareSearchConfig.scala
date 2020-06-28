package flight.invoker.sabre.utils

import services.ConfigLoad

/**
  * Created by Igbalajobi Jamiu O. on 26/02/2017 2:03 AM.
  */
trait LowFareSearchConfig extends ConfigLoad {
  this: SabreXMLRequestUtils =>

  val bfmAd = BfmConfig.apply(configuration.getString("sabre.bfmAd.version"), configuration.getString("sabre.bfmAd.service"), SERVICE_TYPE, configuration.getString("sabre.bfmAd.action"), configuration.getString("sabre.bfmAd.description"), configuration.getString("sabre.bfmAd.requestType"), configuration.getString("sabre.bfmAd.segmentType"), configuration.getString("sabre.bfmAd.longConnectTime.max"))
  val bfm = BfmConfig.apply(configuration.getString("sabre.bfm.version"), configuration.getString("sabre.bfm.service"), SERVICE_TYPE, configuration.getString("sabre.bfm.action"), configuration.getString("sabre.bfm.description"), configuration.getString("sabre.bfm.requestType"), configuration.getString("sabre.bfm.segmentType"), configuration.getString("sabre.bfm.longConnectTime.max"))
  val bfmConfigOptions: Map[Boolean, BfmConfig] = Map(true -> bfmAd, false -> bfm)
}
