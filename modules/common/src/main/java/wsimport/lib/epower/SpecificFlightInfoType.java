
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecificFlightInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificFlightInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Airline" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExcludedAirline" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Alliance" type="{http://epowerv5.amadeus.com.tr/WS}AllianceCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExcludedAlliance" type="{http://epowerv5.amadeus.com.tr/WS}AllianceCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BookingClassPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ResBookDesigCodeType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Displayable"/>
 *                       &lt;enumeration value="NonDisplayable"/>
 *                       &lt;enumeration value="All"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
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
@XmlType(name = "SpecificFlightInfoType", propOrder = {
    "flightNumber",
    "airline",
    "excludedAirline",
    "alliance",
    "excludedAlliance",
    "bookingClassPref"
})
public class SpecificFlightInfoType {

    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "Airline")
    protected List<CompanyNameType> airline;
    @XmlElement(name = "ExcludedAirline")
    protected List<CompanyNameType> excludedAirline;
    @XmlElement(name = "Alliance")
    @XmlSchemaType(name = "string")
    protected List<AllianceCode> alliance;
    @XmlElement(name = "ExcludedAlliance")
    @XmlSchemaType(name = "string")
    protected List<AllianceCode> excludedAlliance;
    @XmlElement(name = "BookingClassPref")
    protected List<SpecificFlightInfoType.BookingClassPref> bookingClassPref;

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNameType }
     * 
     * 
     */
    public List<CompanyNameType> getAirline() {
        if (airline == null) {
            airline = new ArrayList<CompanyNameType>();
        }
        return this.airline;
    }

    /**
     * Gets the value of the excludedAirline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedAirline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedAirline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNameType }
     * 
     * 
     */
    public List<CompanyNameType> getExcludedAirline() {
        if (excludedAirline == null) {
            excludedAirline = new ArrayList<CompanyNameType>();
        }
        return this.excludedAirline;
    }

    /**
     * Gets the value of the alliance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alliance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllianceCode }
     * 
     * 
     */
    public List<AllianceCode> getAlliance() {
        if (alliance == null) {
            alliance = new ArrayList<AllianceCode>();
        }
        return this.alliance;
    }

    /**
     * Gets the value of the excludedAlliance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedAlliance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedAlliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllianceCode }
     * 
     * 
     */
    public List<AllianceCode> getExcludedAlliance() {
        if (excludedAlliance == null) {
            excludedAlliance = new ArrayList<AllianceCode>();
        }
        return this.excludedAlliance;
    }

    /**
     * Gets the value of the bookingClassPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificFlightInfoType.BookingClassPref }
     * 
     * 
     */
    public List<SpecificFlightInfoType.BookingClassPref> getBookingClassPref() {
        if (bookingClassPref == null) {
            bookingClassPref = new ArrayList<SpecificFlightInfoType.BookingClassPref>();
        }
        return this.bookingClassPref;
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
     *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResBookDesigCodeType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Displayable"/>
     *             &lt;enumeration value="NonDisplayable"/>
     *             &lt;enumeration value="All"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BookingClassPref {

        @XmlAttribute(name = "ResBookDesigCode")
        protected String resBookDesigCode;
        @XmlAttribute(name = "ResBookDesigCodeType")
        protected String resBookDesigCodeType;

        /**
         * Gets the value of the resBookDesigCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigCode() {
            return resBookDesigCode;
        }

        /**
         * Sets the value of the resBookDesigCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigCode(String value) {
            this.resBookDesigCode = value;
        }

        /**
         * Gets the value of the resBookDesigCodeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigCodeType() {
            return resBookDesigCodeType;
        }

        /**
         * Sets the value of the resBookDesigCodeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigCodeType(String value) {
            this.resBookDesigCodeType = value;
        }

    }

}
