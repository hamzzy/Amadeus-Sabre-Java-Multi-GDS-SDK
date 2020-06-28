package flight.dto.entity

trait BaseDto extends Serializable {
  val EMPTY_STRING: String = ""
  val ZERO_DECIMAL: Double =   .0
  val NULL = null
}