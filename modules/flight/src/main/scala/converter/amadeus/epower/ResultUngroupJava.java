package flight.converter.amadeus.epower;

import flight.dto.entity.BaseFare;
import wsimport.lib.epower.*;
import wsimport.lib.epower.PricedItinerariesType.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResultUngroupJava {


    public static List<PricedItinerary> getPricedItinerary(List<PricedItinerary> epowerItineraries) throws CloneNotSupportedException {
        List<PricedItinerary> responseList = new ArrayList<>();
        for (PricedItinerary pricedItinerary : epowerItineraries) {
            for (OriginDestinationCombinationType originDestinationCombination : pricedItinerary.getAirItinerary().getOriginDestinationCombinations().getOriginDestinationCombination()) {
                int index = 0;
                List<ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption> originDestinationOptions = new ArrayList<>();
                for (String refNumber : originDestinationCombination.getIndexList().split(";")) {
                    int finalIndex = index;
                    Optional<ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption> originDestinationOption = pricedItinerary.getAirItinerary().getOriginDestinationOptions().getOriginDestinationOption().stream().filter(a -> a.getRefNumber().toString().equals(refNumber) && a.getDirectionId() == finalIndex).findFirst();
                    originDestinationOption.ifPresent(originDestinationOptions::add);
                    index += 1;
                }

                PricedItinerary newPricedItinerary = new PricedItinerary();
                newPricedItinerary.setSequenceNumber(pricedItinerary.getSequenceNumber());
                newPricedItinerary.setOWCF(false);
                newPricedItinerary.setProviderType(pricedItinerary.getProviderType());
                newPricedItinerary.setCurrency(pricedItinerary.getCurrency());
                newPricedItinerary.setIsOneWayCombinable(pricedItinerary.isIsOneWayCombinable());
                newPricedItinerary.setTicketingInfo(pricedItinerary.getTicketingInfo());
                newPricedItinerary.getNotes().addAll(pricedItinerary.getNotes());
                newPricedItinerary.setAirItineraryPricingInfo(pricedItinerary.getAirItineraryPricingInfo());
                AirItineraryType airItinerary = new AirItineraryType();
                ArrayOfAirItineraryTypeOriginDestinationOption arrayOfAirItineraryTypeOriginDestinationOption = new ArrayOfAirItineraryTypeOriginDestinationOption();
                arrayOfAirItineraryTypeOriginDestinationOption.setOriginDestinationOption(originDestinationOptions);
                airItinerary.setOriginDestinationOptions(arrayOfAirItineraryTypeOriginDestinationOption);
                ArrayOfOriginDestinationCombinationType arrayOfOriginDestinationCombinationType = new ArrayOfOriginDestinationCombinationType();
                arrayOfOriginDestinationCombinationType.getOriginDestinationCombination().add(originDestinationCombination);
                airItinerary.setOriginDestinationCombinations(arrayOfOriginDestinationCombinationType);
                newPricedItinerary.setAirItinerary(airItinerary);
                responseList.add(newPricedItinerary);
            }
        }
        return responseList;
    }

    public static List<PricedItinerary> getPricedItineraryOWC(List<PricedItineraryForOWC> epowerItineraries) throws CloneNotSupportedException {
        List<PricedItinerary> responseList = new ArrayList<>();
        for (PricedItineraryForOWC pricedItineraryForOWC : epowerItineraries) {
            for (OriginDestinationCombinationType originDestinationCombination : pricedItineraryForOWC.getAirItinerary().getOriginDestinationCombinations().getOriginDestinationCombination()) {
                int owcIndex = 0;
                List<ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption> originDestinationOptions = new ArrayList<>();
                List<AirItineraryPricingInfoType> pricingSourceTypeStream = new ArrayList<>();
                for (String owcRefNumber : originDestinationCombination.getIndexList().split(";")) {
                    int owcFinalIndex = owcIndex;
                    Optional<ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption> originDestinationOption = pricedItineraryForOWC.getAirItinerary().getOriginDestinationOptions().getOriginDestinationOption().stream().filter(a -> a.getRefNumber().toString().equals(owcRefNumber) && a.getDirectionId() == owcFinalIndex).findFirst();
                    originDestinationOption.ifPresent(originDestinationOptions::add);
                    println("OWCIndex: " + originDestinationCombination.getIndexList() +" --- " + pricedItineraryForOWC.getSequenceNumber().toString());
                    pricingSourceTypeStream.addAll(pricedItineraryForOWC.getAirItinerary().getOriginDestinationOptions().getOriginDestinationOption().stream().filter(a -> a.getRefNumber().toString().equals(owcRefNumber) && a.getDirectionId() == owcFinalIndex).map(a -> a.getOptionPricingInfo()).collect(Collectors.toList()));
                    owcIndex += 1;
                }

                PricedItinerary newPricedItinerary = new PricedItinerary();
                newPricedItinerary.setSequenceNumber(pricedItineraryForOWC.getSequenceNumber());
                newPricedItinerary.setOWCF(true);
                newPricedItinerary.setProviderType(pricedItineraryForOWC.getProviderType());
                newPricedItinerary.setCurrency(pricedItineraryForOWC.getCurrency());
                newPricedItinerary.setIsOneWayCombinable(pricedItineraryForOWC.isIsOneWayCombinable());
                newPricedItinerary.setTicketingInfo(pricedItineraryForOWC.getTicketingInfo());
                newPricedItinerary.getNotes().addAll(pricedItineraryForOWC.getNotes());
                AirItineraryPricingInfoType airItineraryPricingInfoType = new AirItineraryPricingInfoType();

                double baseFares = 0;
                double totalFare = 0;
                String currency = "NGN";
                List<PTCFareBreakdownType> ptcFareBreakdown = new ArrayList<>();
//                println(pricingSourceTypeStream.size());
                for (AirItineraryPricingInfoType optionPricingInfo : pricingSourceTypeStream) {
                    baseFares += optionPricingInfo.getItinTotalFare().getBaseFare().getAmount().doubleValue();
                    totalFare += optionPricingInfo.getItinTotalFare().getTotalFare().getAmount().doubleValue();
                    currency = optionPricingInfo.getItinTotalFare().getTotalFare().getCurrency();
                    ptcFareBreakdown = optionPricingInfo.getPTCFareBreakdowns().getPTCFareBreakdown();
                    println(optionPricingInfo.getItinTotalFare().getTotalFare().getAmount().doubleValue());
                }

//                println(totalFare);
//                println("\n\n");
                FareType fareType = new FareType();
                FareType.BaseFare baseFare = new FareType.BaseFare();
                baseFare.setAmount(BigDecimal.valueOf(baseFares));
                fareType.setBaseFare(baseFare);

                FareType.TotalFare totalFare1 = new FareType.TotalFare();
                totalFare1.setAmount(BigDecimal.valueOf(totalFare));
                fareType.setTotalFare(totalFare1);
                airItineraryPricingInfoType.setItinTotalFare(fareType);

                ArrayOfPTCFareBreakdownType arrayOfPTCFareBreakdownType = new ArrayOfPTCFareBreakdownType();
                arrayOfPTCFareBreakdownType.getPTCFareBreakdown().addAll(ptcFareBreakdown);
                airItineraryPricingInfoType.setPTCFareBreakdowns(arrayOfPTCFareBreakdownType);

                newPricedItinerary.setAirItineraryPricingInfo(airItineraryPricingInfoType);
                AirItineraryType airItinerary = new AirItineraryType();
                ArrayOfAirItineraryTypeOriginDestinationOption arrayOfAirItineraryTypeOriginDestinationOption = new ArrayOfAirItineraryTypeOriginDestinationOption();
                arrayOfAirItineraryTypeOriginDestinationOption.setOriginDestinationOption(originDestinationOptions);
                airItinerary.setOriginDestinationOptions(arrayOfAirItineraryTypeOriginDestinationOption);
                ArrayOfOriginDestinationCombinationType arrayOfOriginDestinationCombinationType = new ArrayOfOriginDestinationCombinationType();
                arrayOfOriginDestinationCombinationType.getOriginDestinationCombination().add(originDestinationCombination);
                airItinerary.setOriginDestinationCombinations(arrayOfOriginDestinationCombinationType);
                newPricedItinerary.setAirItinerary(airItinerary);
                responseList.add(newPricedItinerary);
            }
        }
        return responseList;
    }

    public static void println(Object object) {
        System.out.println(object);
    }
}
