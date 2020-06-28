package flight.converter.amadeus.epower;

import wsimport.lib.epower.ArrayOfAirItineraryTypeOriginDestinationOption;
import wsimport.lib.epower.PricedItinerariesType.*;
import wsimport.lib.epower.ArrayOfAirItineraryTypeOriginDestinationOption.*;

import java.math.BigInteger;
import java.util.*;

public class EPowerDupDataExtractor {
    public EPowerDupDataExtractor() {
    }

    private static List<OriginDestinationOption> getDupDestinationOrigin(PricedItinerary pricedItinerary) {
        List<OriginDestinationOption> dupOrigin = new ArrayList<>();
        List<OriginDestinationOption> destinationOption = pricedItinerary.getAirItinerary().getOriginDestinationOptions().getOriginDestinationOption();

        //start checking for duplicate
        for (int i = 0; i < destinationOption.size(); i++) {
            OriginDestinationOption check = destinationOption.get(i);
            boolean anyDup = false;
            for (int j = 0; j < i + 1; j++) {
                if (j == destinationOption.size()) break;
                OriginDestinationOption against = destinationOption.get(j);

                if (check.getDirectionId() == against.getDirectionId()) {
                    dupOrigin.add(against);
                    anyDup = true;
                }
            }

            if (anyDup) dupOrigin.add(check);//add the main object that as a dup of it self
        }
        return dupOrigin;
    }

    public List<PricedItinerary> expandPricedItineraryBO_DupOriginDestination(List<PricedItinerary> pricedItineraryList) {
        List<PricedItinerary> expandedPricedItinerary = new ArrayList<>();
        for (PricedItinerary pricedItinerary : pricedItineraryList) {
            List<OriginDestinationOption> d = getDupDestinationOrigin(pricedItinerary);
            if (!d.isEmpty()) {
                pricedItinerary.getAirItinerary().getOriginDestinationOptions().getOriginDestinationOption().removeAll(d);
                for (OriginDestinationOption aD : d) {
                    try {
                        PricedItinerary copy = (PricedItinerary) pricedItinerary.clone();
                        copy.getAirItinerary().getOriginDestinationOptions().getOriginDestinationOption().add(aD);
                        expandedPricedItinerary.add(copy);
                    } catch (CloneNotSupportedException ignored) {
                    }
                }
            }
        }

        if (!expandedPricedItinerary.isEmpty()) pricedItineraryList.addAll(expandedPricedItinerary);
        return expandedPricedItinerary;
    }


    static void println(Object obj) {
        System.out.println(obj + "\n\n");
    }
}
