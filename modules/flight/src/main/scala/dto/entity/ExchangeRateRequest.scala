package flight.dto.entity

case class ExchangeRateRequest(supplier: String = "", fromCurrency: String = "", toCurrency: String = "", amount: BigDecimal = BigDecimal(0.0))