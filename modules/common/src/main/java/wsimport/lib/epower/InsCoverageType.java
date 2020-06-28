
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsCoverageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsCoverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoveredTravelers" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfCoveredTravelerType" minOccurs="0"/>
 *         &lt;element name="InsCoverageDetail" type="{http://epowerv5.amadeus.com.tr/WS}InsCoverageDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TypeID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsCoverageType", propOrder = {
    "coveredTravelers",
    "insCoverageDetail"
})
@XmlSeeAlso({
    OTAInsuranceBookRQPlanForBookRQ.class
})
public class InsCoverageType {

    @XmlElement(name = "CoveredTravelers")
    protected ArrayOfCoveredTravelerType coveredTravelers;
    @XmlElement(name = "InsCoverageDetail")
    protected InsCoverageDetailType insCoverageDetail;
    @XmlAttribute(name = "PlanCode")
    protected String planCode;
    @XmlAttribute(name = "PlanID")
    protected String planID;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "TypeID")
    protected String typeID;

    /**
     * Gets the value of the coveredTravelers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoveredTravelerType }
     *     
     */
    public ArrayOfCoveredTravelerType getCoveredTravelers() {
        return coveredTravelers;
    }

    /**
     * Sets the value of the coveredTravelers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoveredTravelerType }
     *     
     */
    public void setCoveredTravelers(ArrayOfCoveredTravelerType value) {
        this.coveredTravelers = value;
    }

    /**
     * Gets the value of the insCoverageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageDetailType }
     *     
     */
    public InsCoverageDetailType getInsCoverageDetail() {
        return insCoverageDetail;
    }

    /**
     * Sets the value of the insCoverageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageDetailType }
     *     
     */
    public void setInsCoverageDetail(InsCoverageDetailType value) {
        this.insCoverageDetail = value;
    }

    /**
     * Gets the value of the planCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanCode() {
        return planCode;
    }

    /**
     * Sets the value of the planCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanCode(String value) {
        this.planCode = value;
    }

    /**
     * Gets the value of the planID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanID() {
        return planID;
    }

    /**
     * Sets the value of the planID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanID(String value) {
        this.planID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * Sets the value of the typeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeID(String value) {
        this.typeID = value;
    }

}
