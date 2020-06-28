package flight.converter.amadeus.epower

import flight.converter.Converter
import flight.dto.entity.{ExchangeRateRequest, ExchangeRateResponse}
import utils.StringUtil
import wsimport.lib.epower.{CurrencyConversion, CurrencyConversionResponse, OTACurrencyConversionRQ}

object EPowerAmadeusCurrencyConverter extends Converter[CurrencyConversion, ExchangeRateResponse] {

  override def toSupplier(baseDto: AnyRef): CurrencyConversion = {
    val exchangeRateRequest = baseDto.asInstanceOf[ExchangeRateRequest]
    val currencyConversion = new CurrencyConversion
    val oTACurrencyConversionRQ = new OTACurrencyConversionRQ
    oTACurrencyConversionRQ.setAmount(exchangeRateRequest.amount.bigDecimal)
    oTACurrencyConversionRQ.setFromCurrency(exchangeRateRequest.fromCurrency)
    oTACurrencyConversionRQ.setToCurrency(exchangeRateRequest.toCurrency)
    currencyConversion.setOTACurrencyConversionRQ(oTACurrencyConversionRQ)
    currencyConversion
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): ExchangeRateResponse = {
    val currencyConversionResponse = response.asInstanceOf[CurrencyConversionResponse]
    ExchangeRateResponse(exchangeRateRequest = request.asInstanceOf[ExchangeRateRequest], currencyConversionResponse.getOTACurrencyConversionRS.getAmount)
  }

}
