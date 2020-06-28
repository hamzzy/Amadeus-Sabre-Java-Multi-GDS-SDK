package flight.dto.entity

import scala.beans.BeanProperty

class ReservationItem extends BaseDto {
  @BeanProperty var RPH = ""
  @BeanProperty var eTicketType = false
  @BeanProperty var stopQuantity = 0
  @BeanProperty var status = ""
  @BeanProperty var specialMeal = false
  @BeanProperty var smokingAllowed = false
  @BeanProperty var segmentNumber = 0
  @BeanProperty var resBookingCode = ""
  @BeanProperty var numberInParty = 0
  @BeanProperty var flightNumber = 0
  @BeanProperty var elapsedTime = ""
  @BeanProperty var departureDateTime = ""
  @BeanProperty var dayOfWeekInd = ""
  @BeanProperty var arrivalDateTime = ""
  @BeanProperty var airMilesFlown = 0L
  @BeanProperty var destinationLocationCode = ""
  @BeanProperty var airEquipType = ""
  @BeanProperty var airline = ""
  @BeanProperty var marriageGrp = ""
  @BeanProperty var mealCode = ""
  @BeanProperty var originLocationCode = ""
  @BeanProperty var updatedArrivalTime = ""
  @BeanProperty var updatedDepartureTime = ""
}
