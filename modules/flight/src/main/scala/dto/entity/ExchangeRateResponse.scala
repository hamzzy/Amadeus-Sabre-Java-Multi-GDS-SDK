package flight.dto.entity

case class ExchangeRateResponse(exchangeRateRequest: ExchangeRateRequest = ExchangeRateRequest(), amount: BigDecimal = BigDecimal(0.0))
