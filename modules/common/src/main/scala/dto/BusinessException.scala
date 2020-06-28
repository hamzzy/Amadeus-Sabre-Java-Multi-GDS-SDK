package dto

/**
  * Created by Igbalajobi Jamiu Okunade on 6/1/17.
  */
class BusinessException(val message: Any = AnyRef, val code: String = "") extends RuntimeException {
  val serialVersionUID: Long = 1L
//  println(message)
}
