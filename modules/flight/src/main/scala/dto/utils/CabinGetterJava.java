package flight.dto.utils;

/*
 * Igbalajobi Jamiu for ota-ws-integrate
 * 08/01/2019 5:46 AM
 *
 */

import java.util.Arrays;
import java.util.List;

public class CabinGetterJava {

  private static final String ECONOMY = "ECONOMY";
  private static final String PREMIUM = "PREMIUM";
  private static final String PREMIUM_ECONOMY = "PREMIUM ECONOMY";
  private static final String FIRST = "FIRST";
  private static final String BUSINESS = "BUSINESS";

  private static List<String> economyClasses = Arrays.asList("B", "G", "H", "K", "L", "M", "N", "O", "Q", "R", "S", "T", "V", "W", "X", "Y", "U");
  private static List<String> businessClasses = Arrays.asList("C", "D", "I", "J", "Z");
  private static List<String> premiumClasses = Arrays.asList("E");
  private static List<String> firstClasses = Arrays.asList("A", "F", "P");

  public static String get(String resBookDesigCode, String airlineCode) {
    switch (airlineCode) {
      case "BA":
        if (Arrays.asList("R", "I", "J", "C", "D").contains(resBookDesigCode)) return ECONOMY;
        if (Arrays.asList("W", "E", "T").contains(resBookDesigCode)) return PREMIUM;
        if (Arrays.asList("F", "A").contains(resBookDesigCode)) return FIRST;
        break;
      case "VS":
        if (Arrays.asList("J", "C", "D", "I", "Z").contains(resBookDesigCode)) return BUSINESS;
        if (Arrays.asList("W", "S", "H", "K").contains(resBookDesigCode)) return PREMIUM;
        break;
      case "ET":
        if (Arrays.asList("C", "J", "D", "P").contains(resBookDesigCode)) return BUSINESS;
        break;
      case "QR":
        if (Arrays.asList("C", "D", "J", "I", "R").contains(resBookDesigCode)) return BUSINESS;
        break;
      case "LH":
        if (Arrays.asList("J", "C", "D", "Z").contains(resBookDesigCode)) return BUSINESS;
        if (Arrays.asList("G", "E",  "N").contains(resBookDesigCode)) return PREMIUM_ECONOMY;
        break;
      case "DL":
        if (Arrays.asList("C", "J", "D", "I", "Z").contains(resBookDesigCode)) return BUSINESS;
        if (resBookDesigCode.equals("W")) return PREMIUM;
        break;
      case "EK":
        if (Arrays.asList("F", "A").contains(resBookDesigCode)) return FIRST;
        if (Arrays.asList("J", "C", "I", "O", "P").contains(resBookDesigCode)) return BUSINESS;
        break;
      case "TK":
        if (Arrays.asList("C", "D", "Z", "K", "I", "J").contains(resBookDesigCode)) return BUSINESS;
        break;
      case "AF":
        if (Arrays.asList("J", "C", "D", "I", "Z").contains(resBookDesigCode)) return BUSINESS;
        if ("A".contains(resBookDesigCode)) return PREMIUM;
        break;
      case "EY":
        if (Arrays.asList("J", "C", "D", "W", "Z").contains(resBookDesigCode)) return BUSINESS;
        break;
      case "WB":
        if (Arrays.asList("J", "C", "D", "P").contains(resBookDesigCode)) return BUSINESS;
        break;
      default:
        if (economyClasses.contains(resBookDesigCode)) return ECONOMY;
        if (businessClasses.contains(resBookDesigCode)) return BUSINESS;
        if (premiumClasses.contains(resBookDesigCode)) return PREMIUM;
        if (firstClasses.contains(resBookDesigCode)) return FIRST;
        break;
    }
    return ECONOMY;
  }
}
