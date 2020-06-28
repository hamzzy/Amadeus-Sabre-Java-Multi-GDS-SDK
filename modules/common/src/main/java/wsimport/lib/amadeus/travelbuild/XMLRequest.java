package wsimport.lib.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlElement;

public class XMLRequest {

  private OTATravelItineraryRQ otaTravelItineraryRQ;

  public OTATravelItineraryRQ getOtaTravelItineraryRQ() {
    return otaTravelItineraryRQ;
  }

  @XmlElement(name="OTA_TravelItineraryRQ", namespace="http://traveltalk.com/wsTravelBuild")
  public void setOtaTravelItineraryRQ(OTATravelItineraryRQ otaTravelItineraryRQ) {
    this.otaTravelItineraryRQ = otaTravelItineraryRQ;
  }
}
