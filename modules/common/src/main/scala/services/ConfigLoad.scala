package services

/**
  * Created by Igbalajobi Jamiu O. on 13/10/2016 1:37 AM.
  */

import com.typesafe.config.{Config, ConfigFactory}

trait ConfigLoad {
  implicit val configuration: Config = ConfigFactory.load()
}

object ConfigLoadObject extends ConfigLoad {
  implicit def apply() = configuration
}