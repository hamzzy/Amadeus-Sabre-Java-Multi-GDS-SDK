
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailbackIndicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailbackIndicator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FailbackStatus" type="{http://epowerv5.amadeus.com.tr/WS}FailbackExceptionErrorType"/>
 *         &lt;element name="FailbackParameter" type="{http://epowerv5.amadeus.com.tr/WS}FailbackParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScheduleChangeParameter" type="{http://epowerv5.amadeus.com.tr/WS}ScheduleChangeParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatTakenParameter" type="{http://epowerv5.amadeus.com.tr/WS}SeatTakenParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FarebasisChangesParameter" type="{http://epowerv5.amadeus.com.tr/WS}FarebasisChangesParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AncillaryChangeParameter" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryChangeParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FailbackFlightRules" type="{http://epowerv5.amadeus.com.tr/WS}FailbackFlightRules" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailbackIndicator", propOrder = {
    "failbackStatus",
    "failbackParameter",
    "scheduleChangeParameter",
    "seatTakenParameter",
    "farebasisChangesParameter",
    "ancillaryChangeParameter",
    "failbackFlightRules"
})
public class FailbackIndicator {

    @XmlElement(name = "FailbackStatus", required = true)
    @XmlSchemaType(name = "string")
    protected FailbackExceptionErrorType failbackStatus;
    @XmlElement(name = "FailbackParameter")
    protected List<FailbackParameter> failbackParameter;
    @XmlElement(name = "ScheduleChangeParameter")
    protected List<ScheduleChangeParameter> scheduleChangeParameter;
    @XmlElement(name = "SeatTakenParameter")
    protected List<SeatTakenParameter> seatTakenParameter;
    @XmlElement(name = "FarebasisChangesParameter")
    protected List<FarebasisChangesParameter> farebasisChangesParameter;
    @XmlElement(name = "AncillaryChangeParameter")
    protected List<AncillaryChangeParameter> ancillaryChangeParameter;
    @XmlElement(name = "FailbackFlightRules")
    protected FailbackFlightRules failbackFlightRules;

    /**
     * Gets the value of the failbackStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FailbackExceptionErrorType }
     *     
     */
    public FailbackExceptionErrorType getFailbackStatus() {
        return failbackStatus;
    }

    /**
     * Sets the value of the failbackStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailbackExceptionErrorType }
     *     
     */
    public void setFailbackStatus(FailbackExceptionErrorType value) {
        this.failbackStatus = value;
    }

    /**
     * Gets the value of the failbackParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failbackParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailbackParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailbackParameter }
     * 
     * 
     */
    public List<FailbackParameter> getFailbackParameter() {
        if (failbackParameter == null) {
            failbackParameter = new ArrayList<FailbackParameter>();
        }
        return this.failbackParameter;
    }

    /**
     * Gets the value of the scheduleChangeParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleChangeParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleChangeParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleChangeParameter }
     * 
     * 
     */
    public List<ScheduleChangeParameter> getScheduleChangeParameter() {
        if (scheduleChangeParameter == null) {
            scheduleChangeParameter = new ArrayList<ScheduleChangeParameter>();
        }
        return this.scheduleChangeParameter;
    }

    /**
     * Gets the value of the seatTakenParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatTakenParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatTakenParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatTakenParameter }
     * 
     * 
     */
    public List<SeatTakenParameter> getSeatTakenParameter() {
        if (seatTakenParameter == null) {
            seatTakenParameter = new ArrayList<SeatTakenParameter>();
        }
        return this.seatTakenParameter;
    }

    /**
     * Gets the value of the farebasisChangesParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farebasisChangesParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarebasisChangesParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarebasisChangesParameter }
     * 
     * 
     */
    public List<FarebasisChangesParameter> getFarebasisChangesParameter() {
        if (farebasisChangesParameter == null) {
            farebasisChangesParameter = new ArrayList<FarebasisChangesParameter>();
        }
        return this.farebasisChangesParameter;
    }

    /**
     * Gets the value of the ancillaryChangeParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryChangeParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryChangeParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryChangeParameter }
     * 
     * 
     */
    public List<AncillaryChangeParameter> getAncillaryChangeParameter() {
        if (ancillaryChangeParameter == null) {
            ancillaryChangeParameter = new ArrayList<AncillaryChangeParameter>();
        }
        return this.ancillaryChangeParameter;
    }

    /**
     * Gets the value of the failbackFlightRules property.
     * 
     * @return
     *     possible object is
     *     {@link FailbackFlightRules }
     *     
     */
    public FailbackFlightRules getFailbackFlightRules() {
        return failbackFlightRules;
    }

    /**
     * Sets the value of the failbackFlightRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailbackFlightRules }
     *     
     */
    public void setFailbackFlightRules(FailbackFlightRules value) {
        this.failbackFlightRules = value;
    }

}
