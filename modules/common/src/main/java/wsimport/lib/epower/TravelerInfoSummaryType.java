
package wsimport.lib.epower;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelerInfoSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerInfoSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatsRequested" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirTravelerAvail" type="{http://epowerv5.amadeus.com.tr/WS}TravelerInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PriceRequestInformation" type="{http://epowerv5.amadeus.com.tr/WS}PriceRequestInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerInfoSummaryType", propOrder = {
    "seatsRequested",
    "airTravelerAvail",
    "priceRequestInformation"
})
@XmlSeeAlso({
    wsimport.lib.epower.SearchFlight.OTAAirLowFareSearchRQ.TravelerInfoSummary.class,
    wsimport.lib.epower.SearchFlightCalendar.OTAAirLowFareSearchRQ.TravelerInfoSummary.class
})
public class TravelerInfoSummaryType {

    @XmlElement(name = "SeatsRequested")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected List<BigInteger> seatsRequested;
    @XmlElement(name = "AirTravelerAvail")
    protected List<TravelerInformationType> airTravelerAvail;
    @XmlElement(name = "PriceRequestInformation")
    protected PriceRequestInformationType priceRequestInformation;

    /**
     * Gets the value of the seatsRequested property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatsRequested property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatsRequested().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getSeatsRequested() {
        if (seatsRequested == null) {
            seatsRequested = new ArrayList<BigInteger>();
        }
        return this.seatsRequested;
    }

    /**
     * Gets the value of the airTravelerAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTravelerAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirTravelerAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInformationType }
     * 
     * 
     */
    public List<TravelerInformationType> getAirTravelerAvail() {
        if (airTravelerAvail == null) {
            airTravelerAvail = new ArrayList<TravelerInformationType>();
        }
        return this.airTravelerAvail;
    }

    /**
     * Gets the value of the priceRequestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRequestInformationType }
     *     
     */
    public PriceRequestInformationType getPriceRequestInformation() {
        return priceRequestInformation;
    }

    /**
     * Sets the value of the priceRequestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRequestInformationType }
     *     
     */
    public void setPriceRequestInformation(PriceRequestInformationType value) {
        this.priceRequestInformation = value;
    }

}
