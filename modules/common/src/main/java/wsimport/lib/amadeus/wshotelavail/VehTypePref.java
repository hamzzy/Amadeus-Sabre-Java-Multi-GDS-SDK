
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehTypePref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehTypePref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehType" type="{http://traveltalk.com/wsHotelAvail}VehType" minOccurs="0"/>
 *         &lt;element name="VehClass" type="{http://traveltalk.com/wsHotelAvail}VehClass" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AirConditionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TransmissionType" type="{http://traveltalk.com/wsHotelAvail}VehTypePrefTransmissionType" />
 *       &lt;attribute name="TypePref" type="{http://traveltalk.com/wsHotelAvail}VehTypePrefTypePref" />
 *       &lt;attribute name="ClassPref" type="{http://traveltalk.com/wsHotelAvail}VehTypePrefClassPref" />
 *       &lt;attribute name="AirConditionPref" type="{http://traveltalk.com/wsHotelAvail}VehTypePrefAirConditionPref" />
 *       &lt;attribute name="TransmissionPref" type="{http://traveltalk.com/wsHotelAvail}VehTypePrefTransmissionPref" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehTypePref", propOrder = {
    "vehType",
    "vehClass"
})
public class VehTypePref {

    @XmlElement(name = "VehType")
    protected VehType vehType;
    @XmlElement(name = "VehClass")
    protected VehClass vehClass;
    @XmlAttribute(name = "AirConditionInd")
    protected Boolean airConditionInd;
    @XmlAttribute(name = "TransmissionType")
    protected VehTypePrefTransmissionType transmissionType;
    @XmlAttribute(name = "TypePref")
    protected VehTypePrefTypePref typePref;
    @XmlAttribute(name = "ClassPref")
    protected VehTypePrefClassPref classPref;
    @XmlAttribute(name = "AirConditionPref")
    protected VehTypePrefAirConditionPref airConditionPref;
    @XmlAttribute(name = "TransmissionPref")
    protected VehTypePrefTransmissionPref transmissionPref;

    /**
     * Gets the value of the vehType property.
     * 
     * @return
     *     possible object is
     *     {@link VehType }
     *     
     */
    public VehType getVehType() {
        return vehType;
    }

    /**
     * Sets the value of the vehType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehType }
     *     
     */
    public void setVehType(VehType value) {
        this.vehType = value;
    }

    /**
     * Gets the value of the vehClass property.
     * 
     * @return
     *     possible object is
     *     {@link VehClass }
     *     
     */
    public VehClass getVehClass() {
        return vehClass;
    }

    /**
     * Sets the value of the vehClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehClass }
     *     
     */
    public void setVehClass(VehClass value) {
        this.vehClass = value;
    }

    /**
     * Gets the value of the airConditionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirConditionInd() {
        return airConditionInd;
    }

    /**
     * Sets the value of the airConditionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirConditionInd(Boolean value) {
        this.airConditionInd = value;
    }

    /**
     * Gets the value of the transmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link VehTypePrefTransmissionType }
     *     
     */
    public VehTypePrefTransmissionType getTransmissionType() {
        return transmissionType;
    }

    /**
     * Sets the value of the transmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehTypePrefTransmissionType }
     *     
     */
    public void setTransmissionType(VehTypePrefTransmissionType value) {
        this.transmissionType = value;
    }

    /**
     * Gets the value of the typePref property.
     * 
     * @return
     *     possible object is
     *     {@link VehTypePrefTypePref }
     *     
     */
    public VehTypePrefTypePref getTypePref() {
        return typePref;
    }

    /**
     * Sets the value of the typePref property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehTypePrefTypePref }
     *     
     */
    public void setTypePref(VehTypePrefTypePref value) {
        this.typePref = value;
    }

    /**
     * Gets the value of the classPref property.
     * 
     * @return
     *     possible object is
     *     {@link VehTypePrefClassPref }
     *     
     */
    public VehTypePrefClassPref getClassPref() {
        return classPref;
    }

    /**
     * Sets the value of the classPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehTypePrefClassPref }
     *     
     */
    public void setClassPref(VehTypePrefClassPref value) {
        this.classPref = value;
    }

    /**
     * Gets the value of the airConditionPref property.
     * 
     * @return
     *     possible object is
     *     {@link VehTypePrefAirConditionPref }
     *     
     */
    public VehTypePrefAirConditionPref getAirConditionPref() {
        return airConditionPref;
    }

    /**
     * Sets the value of the airConditionPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehTypePrefAirConditionPref }
     *     
     */
    public void setAirConditionPref(VehTypePrefAirConditionPref value) {
        this.airConditionPref = value;
    }

    /**
     * Gets the value of the transmissionPref property.
     * 
     * @return
     *     possible object is
     *     {@link VehTypePrefTransmissionPref }
     *     
     */
    public VehTypePrefTransmissionPref getTransmissionPref() {
        return transmissionPref;
    }

    /**
     * Sets the value of the transmissionPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehTypePrefTransmissionPref }
     *     
     */
    public void setTransmissionPref(VehTypePrefTransmissionPref value) {
        this.transmissionPref = value;
    }

}
