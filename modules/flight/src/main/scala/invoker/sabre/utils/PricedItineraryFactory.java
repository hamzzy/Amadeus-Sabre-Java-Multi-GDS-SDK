package flight.invoker.sabre.utils;

import wsimport.lib.sabre.bfm.sapt.PricedItineraryWrapper;

public interface PricedItineraryFactory {
    flight.dto.entity.ItineraryWSResponse createPricedItineraryWSResponse(PricedItineraryWrapper var1);
}
