package flight.dto.utils

/**
  * Created by Brakket on 12/2/17.
  */
object CabinGetter {

  def getCabinClass(resBookDesigCode: String, airlineCode: String = ""): String = {
    resBookDesigCode match {
      case "R" | "I" | "J" | "C" | "D" if airlineCode.equals("BA") => "BUSINESS"
      case "W" | "E" | "T" if airlineCode.equals("BA") => "PREMIUM"
      case "F" | "A" if airlineCode.equals("BA") => "FIRST"
      case "J" | "C" | "D" | "I" | "Z" if airlineCode.equals("VS") => "BUSINESS"
      case "W" | "S" | "H" | "K" if airlineCode.equals("VS") => "PREMIUM"
      case "C" | "J" | "D" | "P" if airlineCode.equals("ET") => "BUSINESS"
      case "C" | "D" | "J" | "I" | "R" if airlineCode.equals("QR") => "BUSINESS"
      case "J" | "C" | "D" | "Z" if airlineCode.equals("LH") => "BUSINESS"
      case "G" | "E" if airlineCode.equals("LH") => "PREMIUM ECONOMY"
      case "C" | "J" | "D" | "I" | "Z" if airlineCode.equals("DL") => "BUSINESS"
      case "W" if airlineCode.equals("DL") => "PREMIUM"
      case "F" | "A" if airlineCode.equals("EK") => "FIRST"
      case "J" | "C" | "I" | "O" | "P" if airlineCode.equals("EK") => "BUSINESS"
      case "C" | "D" | "Z" | "K" | "I" | "J" if airlineCode.equals("TK") => "BUSINESS"
      case "J" | "C" | "D" | "I" | "Z" if airlineCode.equals("AF") => "BUSINESS"
      case "A" if airlineCode.equals("AF") => "PREMIUM"
      case "J" | "C" | "D" | "W" | "Z" if airlineCode.equals("EY") => "BUSINESS"
      case "J" | "C" | "D" | "P" if airlineCode.equals("WB") => "BUSINESS"
      case "A" if airlineCode.equals("VR") => "ECONOMY"
      case "A" | "F" | "P" => "FIRST"
      case "E" | "U" => "PREMIUM"
      case "C" | "D" | "I" | "J" | "Z" => "BUSINESS"
      case "B" | "G" | "H" | "K" | "L" | "M" | "N" | "O" | "Q" | "R" | "S" | "T" | "V" | "W" | "X" | "Y" => "ECONOMY"
    }
  }

  def getCabinClassOnly(resBookDesigCode: String): String = {
    resBookDesigCode match {
      case "A" | "F" | "P" => "FIRST"
      case "E" | "U" => "PREMIUM ECONOMY"
      case "C" | "D" | "I" | "J" | "Z" => "BUSINESS"
      case "B" | "G" | "H" | "K" | "L" | "M" | "N" | "O" | "Q" | "R" | "S" | "T" | "V" | "W" | "X" | "Y" => "ECONOMY"
    }
  }
}
