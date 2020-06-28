
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirItineraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestinationOptions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfAirItineraryTypeOriginDestinationOption" minOccurs="0"/>
 *         &lt;element name="OriginDestinationCombinations" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOriginDestinationCombinationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ValidatingAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DirectionInd" type="{http://epowerv5.amadeus.com.tr/WS}AirTripType" />
 *       &lt;attribute name="CalculateSF" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryType", propOrder = {
    "originDestinationOptions",
    "originDestinationCombinations"
})
public class AirItineraryType {

    @XmlElement(name = "OriginDestinationOptions")
    protected ArrayOfAirItineraryTypeOriginDestinationOption originDestinationOptions;
    @XmlElement(name = "OriginDestinationCombinations")
    protected ArrayOfOriginDestinationCombinationType originDestinationCombinations;
    @XmlAttribute(name = "ValidatingAirlineCode")
    protected String validatingAirlineCode;
    @XmlAttribute(name = "DirectionInd")
    protected AirTripType directionInd;
    @XmlAttribute(name = "CalculateSF")
    protected Boolean calculateSF;

    /**
     * Gets the value of the originDestinationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirItineraryTypeOriginDestinationOption }
     *     
     */
    public ArrayOfAirItineraryTypeOriginDestinationOption getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    /**
     * Sets the value of the originDestinationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirItineraryTypeOriginDestinationOption }
     *     
     */
    public void setOriginDestinationOptions(ArrayOfAirItineraryTypeOriginDestinationOption value) {
        this.originDestinationOptions = value;
    }

    /**
     * Gets the value of the originDestinationCombinations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOriginDestinationCombinationType }
     *     
     */
    public ArrayOfOriginDestinationCombinationType getOriginDestinationCombinations() {
        return originDestinationCombinations;
    }

    /**
     * Sets the value of the originDestinationCombinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOriginDestinationCombinationType }
     *     
     */
    public void setOriginDestinationCombinations(ArrayOfOriginDestinationCombinationType value) {
        this.originDestinationCombinations = value;
    }

    /**
     * Gets the value of the validatingAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingAirlineCode() {
        return validatingAirlineCode;
    }

    /**
     * Sets the value of the validatingAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingAirlineCode(String value) {
        this.validatingAirlineCode = value;
    }

    /**
     * Gets the value of the directionInd property.
     * 
     * @return
     *     possible object is
     *     {@link AirTripType }
     *     
     */
    public AirTripType getDirectionInd() {
        return directionInd;
    }

    /**
     * Sets the value of the directionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTripType }
     *     
     */
    public void setDirectionInd(AirTripType value) {
        this.directionInd = value;
    }

    /**
     * Gets the value of the calculateSF property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateSF() {
        return calculateSF;
    }

    /**
     * Sets the value of the calculateSF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateSF(Boolean value) {
        this.calculateSF = value;
    }

}
