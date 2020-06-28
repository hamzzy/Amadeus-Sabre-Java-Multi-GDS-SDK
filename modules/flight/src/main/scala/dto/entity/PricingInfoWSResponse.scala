package flight.dto.entity

import dto.entity.FareItem

import scala.beans.BeanProperty

class PricingInfoWSResponse extends BaseDto {
  @BeanProperty var gdsBaseFare: BigDecimal = ZERO_DECIMAL
  @BeanProperty var gdsTaxFare: BigDecimal = ZERO_DECIMAL
  @BeanProperty var gdsTotalFare: BigDecimal = ZERO_DECIMAL

  @BeanProperty var fareBasisCode: String = EMPTY_STRING

  @BeanProperty var oldGdsBaseFare: BigDecimal = ZERO_DECIMAL
  @BeanProperty var oldGdsTaxFare: BigDecimal = ZERO_DECIMAL
  @BeanProperty var oldTotalFare: BigDecimal = ZERO_DECIMAL //If failback occured for price change.
  @BeanProperty var gdsEquivCurrency: String = EMPTY_STRING
  @BeanProperty var gdsEquivBaseFare: BigDecimal = ZERO_DECIMAL
  @BeanProperty var baseFare: BaseFare = BaseFare()
  @BeanProperty var totalTax: List[TaxFare] = Nil
  @BeanProperty var subCharges: BigDecimal = ZERO_DECIMAL
  @BeanProperty val internalTaxes: List[TaxFare] = Nil
  @BeanProperty var totalFare: BigDecimal = ZERO_DECIMAL
  @BeanProperty var currencyCode: String = EMPTY_STRING
  @BeanProperty var decimalPlaces: Integer = 0
  @BeanProperty var pricingSource: String = EMPTY_STRING
  @BeanProperty var totalMarkupFare: BigDecimal = ZERO_DECIMAL
  @BeanProperty var adtMarkMC: BigDecimal = ZERO_DECIMAL
  @BeanProperty var chdMarkMC: BigDecimal = ZERO_DECIMAL
  @BeanProperty var infMarkMC: BigDecimal = ZERO_DECIMAL
  @BeanProperty var passengerFare: List[FareBreakDown] = Nil
  @BeanProperty var serviceCharges: List[ServiceCharge] = Nil
  @BeanProperty var priceDirection: String = EMPTY_STRING
  @BeanProperty var valueType: String = EMPTY_STRING
  @BeanProperty var fareOption: String = EMPTY_STRING
  @BeanProperty var adtDispenseValue: BigDecimal = ZERO_DECIMAL
  @BeanProperty var chdDispenseValue: BigDecimal = ZERO_DECIMAL
  @BeanProperty var infDispenseValue: BigDecimal = ZERO_DECIMAL
  @BeanProperty var dispenseValueAmount: BigDecimal = ZERO_DECIMAL
  @BeanProperty var additionalItems: List[FareItem] = Nil
  @BeanProperty var b2bAdditionalMarkup: (String, BigDecimal) = ("", BigDecimal(.0))

  /*
  * Begin of crane mod
  */
  @BeanProperty var ref: String = EMPTY_STRING
  @BeanProperty var cabin: String = EMPTY_STRING
  @BeanProperty var resBookDesigCode: String = EMPTY_STRING
  @BeanProperty var resBookDesigQuantity: String = EMPTY_STRING
  @BeanProperty var cabinClassCode: String = EMPTY_STRING
  @BeanProperty var fareGroupName: String = EMPTY_STRING
  @BeanProperty var fareReferenceCode: String = EMPTY_STRING
  @BeanProperty var fareReferenceID: String = EMPTY_STRING
  @BeanProperty var fareReferenceName: String = EMPTY_STRING
  @BeanProperty var flightSegmentSequence: String = EMPTY_STRING
  /*
   * End of crane mod
   */
}
