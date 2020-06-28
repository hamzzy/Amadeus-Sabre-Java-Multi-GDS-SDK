
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareFamily complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamily">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="FlightInfo" type="{http://epowerv5.amadeus.com.tr/WS}FlightInfo" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *           &lt;element name="FareFamilyDescriptions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfFareFamilyDescription" minOccurs="0"/>
 *           &lt;element name="FareInfo" type="{http://epowerv5.amadeus.com.tr/WS}FareInfo" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="PackageId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResBookDesigCabinCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamily", propOrder = {
    "flightInfoOrErrorsOrFareFamilyDescriptions"
})
public class FareFamily {

    @XmlElements({
        @XmlElement(name = "FlightInfo", type = FlightInfo.class),
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "FareFamilyDescriptions", type = ArrayOfFareFamilyDescription.class),
        @XmlElement(name = "FareInfo", type = FareInfo.class)
    })
    protected List<Object> flightInfoOrErrorsOrFareFamilyDescriptions;
    @XmlAttribute(name = "PackageId")
    protected String packageId;
    @XmlAttribute(name = "FareFamilyName")
    protected String fareFamilyName;
    @XmlAttribute(name = "ResBookDesigCabinCode")
    protected String resBookDesigCabinCode;
    @XmlAttribute(name = "FareBasis")
    protected String fareBasis;
    @XmlAttribute(name = "Class")
    protected String clazz;

    /**
     * Gets the value of the flightInfoOrErrorsOrFareFamilyDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInfoOrErrorsOrFareFamilyDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInfoOrErrorsOrFareFamilyDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInfo }
     * {@link ErrorsType }
     * {@link ArrayOfFareFamilyDescription }
     * {@link FareInfo }
     * 
     * 
     */
    public List<Object> getFlightInfoOrErrorsOrFareFamilyDescriptions() {
        if (flightInfoOrErrorsOrFareFamilyDescriptions == null) {
            flightInfoOrErrorsOrFareFamilyDescriptions = new ArrayList<Object>();
        }
        return this.flightInfoOrErrorsOrFareFamilyDescriptions;
    }

    /**
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageId(String value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the fareFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareFamilyName() {
        return fareFamilyName;
    }

    /**
     * Sets the value of the fareFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareFamilyName(String value) {
        this.fareFamilyName = value;
    }

    /**
     * Gets the value of the resBookDesigCabinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigCabinCode() {
        return resBookDesigCabinCode;
    }

    /**
     * Sets the value of the resBookDesigCabinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigCabinCode(String value) {
        this.resBookDesigCabinCode = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

}
