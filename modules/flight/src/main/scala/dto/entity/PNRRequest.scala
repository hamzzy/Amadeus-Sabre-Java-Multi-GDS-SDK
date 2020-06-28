package flight.dto.entity

/**
 * Created by Kode on 30/09/2016 4:05 PM.
 */

case class PNRRequest(pnrRef: String = "", supplier: String = "", surname: String = "", isReIssue: Boolean = false) extends BaseDto
