
package wsimport.lib.sabre.bfm.altdate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the origin and destination of the traveler. Attributes: DirectionInd - A directional indicator that identifies a type of air booking, either one-way, round-trip, or open-jaw with the enumeration of (OneWay | RT | OpenJaw) respectively. ActionCode - Indicates the status of the booking, such as OK or Wait-List. NumberInParty - Indicates the traveler count.
 * 
 * <p>Java class for AirItineraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestinationOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginDestinationOption" type="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="DirectionInd" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryType", propOrder = {
    "originDestinationOptions"
})
public class AirItineraryType {

    @XmlElement(name = "OriginDestinationOptions")
    protected OriginDestinationOptions originDestinationOptions;
    @XmlAttribute(name = "DirectionInd")
    protected AirTripType directionInd;

    /**
     * Gets the value of the originDestinationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationOptions }
     *     
     */
    public OriginDestinationOptions getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    /**
     * Sets the value of the originDestinationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationOptions }
     *     
     */
    public void setOriginDestinationOptions(OriginDestinationOptions value) {
        this.originDestinationOptions = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OriginDestinationOption" type="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType" maxOccurs="99"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originDestinationOption"
    })
    public static class OriginDestinationOptions {

        @XmlElement(name = "OriginDestinationOption", required = true)
        protected List<OriginDestinationOptionType> originDestinationOption;

        /**
         * Gets the value of the originDestinationOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OriginDestinationOptionType }
         * 
         * 
         */
        public List<OriginDestinationOptionType> getOriginDestinationOption() {
            if (originDestinationOption == null) {
                originDestinationOption = new ArrayList<OriginDestinationOptionType>();
            }
            return this.originDestinationOption;
        }

    }

}
