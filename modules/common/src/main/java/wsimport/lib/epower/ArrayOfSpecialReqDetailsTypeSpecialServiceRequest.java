
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSpecialReqDetailsTypeSpecialServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSpecialReqDetailsTypeSpecialServiceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialServiceRequest" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}SpecialServiceRequestType">
 *                 &lt;sequence>
 *                   &lt;element name="AnimalBoxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FlightLeg" type="{http://epowerv5.amadeus.com.tr/WS}FlightLegType" minOccurs="0"/>
 *                   &lt;element name="RequiredParameters" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSSRRequiredParameterRQ" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Weight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="OtherEquipment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BaggageName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DisabledPassenger" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OtherAnimalType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SSRType" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="None"/>
 *                       &lt;enumeration value="MeetAndAssist"/>
 *                       &lt;enumeration value="WheelChair"/>
 *                       &lt;enumeration value="Bicycle"/>
 *                       &lt;enumeration value="Surfboard"/>
 *                       &lt;enumeration value="Windsurf"/>
 *                       &lt;enumeration value="Snowboard"/>
 *                       &lt;enumeration value="Animal"/>
 *                       &lt;enumeration value="Golf"/>
 *                       &lt;enumeration value="FishingEquipment"/>
 *                       &lt;enumeration value="ExstraSeat"/>
 *                       &lt;enumeration value="OtherEquipment"/>
 *                       &lt;enumeration value="Baggage"/>
 *                       &lt;enumeration value="BabyBasket"/>
 *                       &lt;enumeration value="CabinBaggage"/>
 *                       &lt;enumeration value="AncillaryService"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="TravelerRefNumberRPHList">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="FlightRefNumberRPHList">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="WithDog" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="WithDogSpecified" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
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
@XmlType(name = "ArrayOfSpecialReqDetailsTypeSpecialServiceRequest", propOrder = {
    "specialServiceRequest"
})
public class ArrayOfSpecialReqDetailsTypeSpecialServiceRequest {

    @XmlElement(name = "SpecialServiceRequest")
    protected List<ArrayOfSpecialReqDetailsTypeSpecialServiceRequest.SpecialServiceRequest> specialServiceRequest;

    /**
     * Gets the value of the specialServiceRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialServiceRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSpecialReqDetailsTypeSpecialServiceRequest.SpecialServiceRequest }
     * 
     * 
     */
    public List<ArrayOfSpecialReqDetailsTypeSpecialServiceRequest.SpecialServiceRequest> getSpecialServiceRequest() {
        if (specialServiceRequest == null) {
            specialServiceRequest = new ArrayList<ArrayOfSpecialReqDetailsTypeSpecialServiceRequest.SpecialServiceRequest>();
        }
        return this.specialServiceRequest;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}SpecialServiceRequestType">
     *       &lt;sequence>
     *         &lt;element name="AnimalBoxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FlightLeg" type="{http://epowerv5.amadeus.com.tr/WS}FlightLegType" minOccurs="0"/>
     *         &lt;element name="RequiredParameters" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSSRRequiredParameterRQ" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Weight" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="OtherEquipment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BaggageName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DisabledPassenger" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OtherAnimalType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SSRType" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="None"/>
     *             &lt;enumeration value="MeetAndAssist"/>
     *             &lt;enumeration value="WheelChair"/>
     *             &lt;enumeration value="Bicycle"/>
     *             &lt;enumeration value="Surfboard"/>
     *             &lt;enumeration value="Windsurf"/>
     *             &lt;enumeration value="Snowboard"/>
     *             &lt;enumeration value="Animal"/>
     *             &lt;enumeration value="Golf"/>
     *             &lt;enumeration value="FishingEquipment"/>
     *             &lt;enumeration value="ExstraSeat"/>
     *             &lt;enumeration value="OtherEquipment"/>
     *             &lt;enumeration value="Baggage"/>
     *             &lt;enumeration value="BabyBasket"/>
     *             &lt;enumeration value="CabinBaggage"/>
     *             &lt;enumeration value="AncillaryService"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="TravelerRefNumberRPHList">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="FlightRefNumberRPHList">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="WithDog" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="WithDogSpecified" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "animalBoxType",
        "flightLeg",
        "requiredParameters"
    })
    public static class SpecialServiceRequest
        extends SpecialServiceRequestType
    {

        @XmlElement(name = "AnimalBoxType")
        protected String animalBoxType;
        @XmlElement(name = "FlightLeg")
        protected FlightLegType flightLeg;
        @XmlElement(name = "RequiredParameters")
        protected ArrayOfSSRRequiredParameterRQ requiredParameters;
        @XmlAttribute(name = "Height")
        protected Integer height;
        @XmlAttribute(name = "Width")
        protected Integer width;
        @XmlAttribute(name = "Length")
        protected Integer length;
        @XmlAttribute(name = "Weight")
        protected Integer weight;
        @XmlAttribute(name = "OtherEquipment")
        protected String otherEquipment;
        @XmlAttribute(name = "BaggageName")
        protected String baggageName;
        @XmlAttribute(name = "DisabledPassenger")
        protected String disabledPassenger;
        @XmlAttribute(name = "OtherAnimalType")
        protected String otherAnimalType;
        @XmlAttribute(name = "SSRType", required = true)
        protected String ssrType;
        @XmlAttribute(name = "TravelerRefNumberRPHList")
        protected List<String> travelerRefNumberRPHList;
        @XmlAttribute(name = "FlightRefNumberRPHList")
        protected List<String> flightRefNumberRPHList;
        @XmlAttribute(name = "Notes")
        protected String notes;
        @XmlAttribute(name = "WithDog")
        protected Boolean withDog;
        @XmlAttribute(name = "WithDogSpecified", required = true)
        protected boolean withDogSpecified;
        @XmlAttribute(name = "AirlineCode")
        protected String airlineCode;

        /**
         * Gets the value of the animalBoxType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnimalBoxType() {
            return animalBoxType;
        }

        /**
         * Sets the value of the animalBoxType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnimalBoxType(String value) {
            this.animalBoxType = value;
        }

        /**
         * Gets the value of the flightLeg property.
         * 
         * @return
         *     possible object is
         *     {@link FlightLegType }
         *     
         */
        public FlightLegType getFlightLeg() {
            return flightLeg;
        }

        /**
         * Sets the value of the flightLeg property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightLegType }
         *     
         */
        public void setFlightLeg(FlightLegType value) {
            this.flightLeg = value;
        }

        /**
         * Gets the value of the requiredParameters property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSSRRequiredParameterRQ }
         *     
         */
        public ArrayOfSSRRequiredParameterRQ getRequiredParameters() {
            return requiredParameters;
        }

        /**
         * Sets the value of the requiredParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSSRRequiredParameterRQ }
         *     
         */
        public void setRequiredParameters(ArrayOfSSRRequiredParameterRQ value) {
            this.requiredParameters = value;
        }

        /**
         * Gets the value of the height property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getHeight() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setHeight(Integer value) {
            this.height = value;
        }

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getWidth() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setWidth(Integer value) {
            this.width = value;
        }

        /**
         * Gets the value of the length property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLength() {
            return length;
        }

        /**
         * Sets the value of the length property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLength(Integer value) {
            this.length = value;
        }

        /**
         * Gets the value of the weight property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getWeight() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setWeight(Integer value) {
            this.weight = value;
        }

        /**
         * Gets the value of the otherEquipment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherEquipment() {
            return otherEquipment;
        }

        /**
         * Sets the value of the otherEquipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherEquipment(String value) {
            this.otherEquipment = value;
        }

        /**
         * Gets the value of the baggageName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBaggageName() {
            return baggageName;
        }

        /**
         * Sets the value of the baggageName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBaggageName(String value) {
            this.baggageName = value;
        }

        /**
         * Gets the value of the disabledPassenger property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisabledPassenger() {
            return disabledPassenger;
        }

        /**
         * Sets the value of the disabledPassenger property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisabledPassenger(String value) {
            this.disabledPassenger = value;
        }

        /**
         * Gets the value of the otherAnimalType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherAnimalType() {
            return otherAnimalType;
        }

        /**
         * Sets the value of the otherAnimalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherAnimalType(String value) {
            this.otherAnimalType = value;
        }

        /**
         * Gets the value of the ssrType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSSRType() {
            return ssrType;
        }

        /**
         * Sets the value of the ssrType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSSRType(String value) {
            this.ssrType = value;
        }

        /**
         * Gets the value of the travelerRefNumberRPHList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerRefNumberRPHList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerRefNumberRPHList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTravelerRefNumberRPHList() {
            if (travelerRefNumberRPHList == null) {
                travelerRefNumberRPHList = new ArrayList<String>();
            }
            return this.travelerRefNumberRPHList;
        }

        /**
         * Gets the value of the flightRefNumberRPHList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightRefNumberRPHList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightRefNumberRPHList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFlightRefNumberRPHList() {
            if (flightRefNumberRPHList == null) {
                flightRefNumberRPHList = new ArrayList<String>();
            }
            return this.flightRefNumberRPHList;
        }

        /**
         * Gets the value of the notes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotes() {
            return notes;
        }

        /**
         * Sets the value of the notes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotes(String value) {
            this.notes = value;
        }

        /**
         * Gets the value of the withDog property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWithDog() {
            return withDog;
        }

        /**
         * Sets the value of the withDog property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWithDog(Boolean value) {
            this.withDog = value;
        }

        /**
         * Gets the value of the withDogSpecified property.
         * 
         */
        public boolean isWithDogSpecified() {
            return withDogSpecified;
        }

        /**
         * Sets the value of the withDogSpecified property.
         * 
         */
        public void setWithDogSpecified(boolean value) {
            this.withDogSpecified = value;
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

    }

}
