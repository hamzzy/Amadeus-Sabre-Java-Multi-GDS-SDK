
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingPriceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingPriceInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType">
 *       &lt;sequence>
 *         &lt;element name="PriceRequestInformation" type="{http://epowerv5.amadeus.com.tr/WS}PriceRequestInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RepriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingPriceInfoType", propOrder = {
    "priceRequestInformation"
})
@XmlSeeAlso({
    wsimport.lib.epower.CreateTicket.OTAAirBookRQ.PriceInfo.class,
    wsimport.lib.epower.BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo.class,
    wsimport.lib.epower.BookFlight.OTAAirBookRQ.PriceInfo.class
})
public class BookingPriceInfoType
    extends AirItineraryPricingInfoType
{

    @XmlElement(name = "PriceRequestInformation")
    protected PriceRequestInformationType priceRequestInformation;
    @XmlAttribute(name = "RepriceRequired")
    protected Boolean repriceRequired;

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

    /**
     * Gets the value of the repriceRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRepriceRequired() {
        if (repriceRequired == null) {
            return false;
        } else {
            return repriceRequired;
        }
    }

    /**
     * Sets the value of the repriceRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepriceRequired(Boolean value) {
        this.repriceRequired = value;
    }

}
