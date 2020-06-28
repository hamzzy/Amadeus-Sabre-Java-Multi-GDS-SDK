
package wsimport.lib.epower;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for PricedItinerariesType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="PricedItinerariesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricedItinerary" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}PricedItineraryType">
 *                 &lt;attribute name="OriginDestinationRefNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PricedItineraryForOWC" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}PricedItineraryType">
 *                 &lt;attribute name="OriginDestinationRefNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MyProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreeBaggages" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfFreeBaggageLegendItem" minOccurs="0"/>
 *         &lt;element name="ConnectedOperatingAirlines" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfConnectedOperatingAirline" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedItinerariesType", propOrder = {
        "pricedItinerary",
        "pricedItineraryForOWC",
        "myProperty",
        "freeBaggages",
        "connectedOperatingAirlines"
})
public class PricedItinerariesType {

    @XmlElement(name = "PricedItinerary")
    protected List<PricedItinerariesType.PricedItinerary> pricedItinerary;
    @XmlElement(name = "PricedItineraryForOWC")
    protected List<PricedItinerariesType.PricedItineraryForOWC> pricedItineraryForOWC;
    @XmlElement(name = "MyProperty")
    protected String myProperty;
    @XmlElement(name = "FreeBaggages")
    protected ArrayOfFreeBaggageLegendItem freeBaggages;
    @XmlElement(name = "ConnectedOperatingAirlines")
    protected ArrayOfConnectedOperatingAirline connectedOperatingAirlines;

    /**
     * Gets the value of the pricedItinerary property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedItinerary().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedItinerariesType.PricedItinerary }
     */
    public List<PricedItinerariesType.PricedItinerary> getPricedItinerary() {
        if (pricedItinerary == null) {
            pricedItinerary = new ArrayList<PricedItinerariesType.PricedItinerary>();
        }
        return this.pricedItinerary;
    }

    /**
     * Gets the value of the pricedItineraryForOWC property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedItineraryForOWC property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedItineraryForOWC().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedItinerariesType.PricedItineraryForOWC }
     */
    public List<PricedItinerariesType.PricedItineraryForOWC> getPricedItineraryForOWC() {
        if (pricedItineraryForOWC == null) {
            pricedItineraryForOWC = new ArrayList<PricedItinerariesType.PricedItineraryForOWC>();
        }
        return this.pricedItineraryForOWC;
    }

    /**
     * Gets the value of the myProperty property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMyProperty() {
        return myProperty;
    }

    /**
     * Sets the value of the myProperty property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMyProperty(String value) {
        this.myProperty = value;
    }

    /**
     * Gets the value of the freeBaggages property.
     *
     * @return possible object is
     * {@link ArrayOfFreeBaggageLegendItem }
     */
    public ArrayOfFreeBaggageLegendItem getFreeBaggages() {
        return freeBaggages;
    }

    /**
     * Sets the value of the freeBaggages property.
     *
     * @param value allowed object is
     *              {@link ArrayOfFreeBaggageLegendItem }
     */
    public void setFreeBaggages(ArrayOfFreeBaggageLegendItem value) {
        this.freeBaggages = value;
    }

    /**
     * Gets the value of the connectedOperatingAirlines property.
     *
     * @return possible object is
     * {@link ArrayOfConnectedOperatingAirline }
     */
    public ArrayOfConnectedOperatingAirline getConnectedOperatingAirlines() {
        return connectedOperatingAirlines;
    }

    /**
     * Sets the value of the connectedOperatingAirlines property.
     *
     * @param value allowed object is
     *              {@link ArrayOfConnectedOperatingAirline }
     */
    public void setConnectedOperatingAirlines(ArrayOfConnectedOperatingAirline value) {
        this.connectedOperatingAirlines = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}PricedItineraryType">
     *       &lt;attribute name="OriginDestinationRefNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PricedItinerary extends PricedItineraryType implements Cloneable {

        @XmlAttribute(name = "OriginDestinationRefNumber")
        protected BigInteger originDestinationRefNumber;

        @XmlTransient
        protected boolean isOWCF;

        /**
         * Gets the value of the originDestinationRefNumber property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getOriginDestinationRefNumber() {
            return originDestinationRefNumber;
        }

        /**
         * Sets the value of the originDestinationRefNumber property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setOriginDestinationRefNumber(BigInteger value) {
            this.originDestinationRefNumber = value;
        }


        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public boolean isOWCF() {
            return isOWCF;
        }

        public void setOWCF(boolean OWCF) {
            isOWCF = OWCF;
        }
    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}PricedItineraryType">
     *       &lt;attribute name="OriginDestinationRefNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PricedItineraryForOWC
            extends PricedItineraryType {

        @XmlAttribute(name = "OriginDestinationRefNumber")
        protected BigInteger originDestinationRefNumber;

        /**
         * Gets the value of the originDestinationRefNumber property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getOriginDestinationRefNumber() {
            return originDestinationRefNumber;
        }

        /**
         * Sets the value of the originDestinationRefNumber property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setOriginDestinationRefNumber(BigInteger value) {
            this.originDestinationRefNumber = value;
        }

    }

}
