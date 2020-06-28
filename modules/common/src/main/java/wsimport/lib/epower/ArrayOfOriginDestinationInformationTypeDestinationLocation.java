
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOriginDestinationInformationTypeDestinationLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOriginDestinationInformationTypeDestinationLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationLocation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>LocationType">
 *                 &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOriginDestinationInformationTypeDestinationLocation", propOrder = {
    "destinationLocation"
})
public class ArrayOfOriginDestinationInformationTypeDestinationLocation {

    @XmlElement(name = "DestinationLocation")
    protected List<ArrayOfOriginDestinationInformationTypeDestinationLocation.DestinationLocation> destinationLocation;

    /**
     * Gets the value of the destinationLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOriginDestinationInformationTypeDestinationLocation.DestinationLocation }
     * 
     * 
     */
    public List<ArrayOfOriginDestinationInformationTypeDestinationLocation.DestinationLocation> getDestinationLocation() {
        if (destinationLocation == null) {
            destinationLocation = new ArrayList<ArrayOfOriginDestinationInformationTypeDestinationLocation.DestinationLocation>();
        }
        return this.destinationLocation;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>LocationType">
     *       &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DestinationLocation
        extends LocationType
    {

        @XmlAttribute(name = "MultiAirportCityInd")
        protected Boolean multiAirportCityInd;
        @XmlAttribute(name = "AlternateLocationInd")
        protected Boolean alternateLocationInd;

        /**
         * Gets the value of the multiAirportCityInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMultiAirportCityInd() {
            return multiAirportCityInd;
        }

        /**
         * Sets the value of the multiAirportCityInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMultiAirportCityInd(Boolean value) {
            this.multiAirportCityInd = value;
        }

        /**
         * Gets the value of the alternateLocationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAlternateLocationInd() {
            return alternateLocationInd;
        }

        /**
         * Sets the value of the alternateLocationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAlternateLocationInd(Boolean value) {
            this.alternateLocationInd = value;
        }

    }

}
