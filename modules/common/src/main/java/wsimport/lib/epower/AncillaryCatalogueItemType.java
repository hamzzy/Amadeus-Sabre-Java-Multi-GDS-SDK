
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryCatalogueItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryCatalogueItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AncillaryFares" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryFaresType" minOccurs="0"/>
 *         &lt;element name="RequiredParameters" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfRequiredParameter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryCatalogueItemType", propOrder = {
    "ssrCode",
    "airlineCode",
    "ancillaryFares",
    "requiredParameters"
})
public class AncillaryCatalogueItemType {

    @XmlElement(name = "SSRCode")
    protected String ssrCode;
    @XmlElement(name = "AirlineCode")
    protected String airlineCode;
    @XmlElement(name = "AncillaryFares")
    protected AncillaryFaresType ancillaryFares;
    @XmlElement(name = "RequiredParameters")
    protected ArrayOfRequiredParameter requiredParameters;

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the ancillaryFares property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryFaresType }
     *     
     */
    public AncillaryFaresType getAncillaryFares() {
        return ancillaryFares;
    }

    /**
     * Sets the value of the ancillaryFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryFaresType }
     *     
     */
    public void setAncillaryFares(AncillaryFaresType value) {
        this.ancillaryFares = value;
    }

    /**
     * Gets the value of the requiredParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequiredParameter }
     *     
     */
    public ArrayOfRequiredParameter getRequiredParameters() {
        return requiredParameters;
    }

    /**
     * Sets the value of the requiredParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequiredParameter }
     *     
     */
    public void setRequiredParameters(ArrayOfRequiredParameter value) {
        this.requiredParameters = value;
    }

}
