
package wsimport.lib.epower;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ArrayOfAirItineraryTypeOriginDestinationOption complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfAirItineraryTypeOriginDestinationOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestinationOption" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}OriginDestinationOptionType">
 *                 &lt;sequence>
 *                   &lt;element name="OptionPricingInfo" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
 *                   &lt;element name="ItinBaseFare" type="{http://epowerv5.amadeus.com.tr/WS}FareType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RefNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="DirectionInd" type="{http://epowerv5.amadeus.com.tr/WS}AirTripType" />
 *                 &lt;attribute name="DirectionId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAirItineraryTypeOriginDestinationOption", propOrder = {
        "originDestinationOption"
})
public class ArrayOfAirItineraryTypeOriginDestinationOption {

    @XmlElement(name = "OriginDestinationOption")
    protected List<ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption> originDestinationOption;

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
     * {@link ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption }
     */
    public List<ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption> getOriginDestinationOption() {
        if (originDestinationOption == null) {
            originDestinationOption = new ArrayList<>();
        }
        return this.originDestinationOption;
    }

    public void setOriginDestinationOption(List<OriginDestinationOption> originDestinationOption) {
        this.originDestinationOption = originDestinationOption;
    }



    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}OriginDestinationOptionType">
     *       &lt;sequence>
     *         &lt;element name="OptionPricingInfo" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
     *         &lt;element name="ItinBaseFare" type="{http://epowerv5.amadeus.com.tr/WS}FareType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="RefNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="DirectionInd" type="{http://epowerv5.amadeus.com.tr/WS}AirTripType" />
     *       &lt;attribute name="DirectionId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "optionPricingInfo",
            "itinBaseFare"
    })
    public static class OriginDestinationOption extends OriginDestinationOptionType implements Comparable<OriginDestinationOption> {

        @XmlElement(name = "OptionPricingInfo")
        protected AirItineraryPricingInfoType optionPricingInfo;
        @XmlElement(name = "ItinBaseFare")
        protected FareType itinBaseFare;
        @XmlAttribute(name = "RefNumber")
        protected BigInteger refNumber;
        @XmlAttribute(name = "DirectionInd")
        protected AirTripType directionInd;
        @XmlAttribute(name = "DirectionId", required = true)
        protected int directionId;
        @XmlAttribute(name = "ElapsedTime")
        protected String elapsedTime;
        @XmlAttribute(name = "ProviderType")
        protected String providerType;

        /**
         * Gets the value of the optionPricingInfo property.
         *
         * @return possible object is
         * {@link AirItineraryPricingInfoType }
         */
        public AirItineraryPricingInfoType getOptionPricingInfo() {
            return optionPricingInfo;
        }

        /**
         * Sets the value of the optionPricingInfo property.
         *
         * @param value allowed object is
         *              {@link AirItineraryPricingInfoType }
         */
        public void setOptionPricingInfo(AirItineraryPricingInfoType value) {
            this.optionPricingInfo = value;
        }

        /**
         * Gets the value of the itinBaseFare property.
         *
         * @return possible object is
         * {@link FareType }
         */
        public FareType getItinBaseFare() {
            return itinBaseFare;
        }

        /**
         * Sets the value of the itinBaseFare property.
         *
         * @param value allowed object is
         *              {@link FareType }
         */
        public void setItinBaseFare(FareType value) {
            this.itinBaseFare = value;
        }

        /**
         * Gets the value of the refNumber property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getRefNumber() {
            return refNumber;
        }

        /**
         * Sets the value of the refNumber property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setRefNumber(BigInteger value) {
            this.refNumber = value;
        }

        /**
         * Gets the value of the directionInd property.
         *
         * @return possible object is
         * {@link AirTripType }
         */
        public AirTripType getDirectionInd() {
            return directionInd;
        }

        /**
         * Sets the value of the directionInd property.
         *
         * @param value allowed object is
         *              {@link AirTripType }
         */
        public void setDirectionInd(AirTripType value) {
            this.directionInd = value;
        }

        /**
         * Gets the value of the directionId property.
         */
        public int getDirectionId() {
            return directionId;
        }

        /**
         * Sets the value of the directionId property.
         */
        public void setDirectionId(int value) {
            this.directionId = value;
        }

        /**
         * Gets the value of the elapsedTime property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getElapsedTime() {
            return elapsedTime;
        }

        /**
         * Sets the value of the elapsedTime property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setElapsedTime(String value) {
            this.elapsedTime = value;
        }

        /**
         * Gets the value of the providerType property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getProviderType() {
            return providerType;
        }

        /**
         * Sets the value of the providerType property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProviderType(String value) {
            this.providerType = value;
        }

        @Override
        public int compareTo(OriginDestinationOption o) {
            if (this.refNumber.intValue() == o.refNumber.intValue()) {
                return 0;
            } else if (this.refNumber.intValue() < o.refNumber.intValue()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

}
