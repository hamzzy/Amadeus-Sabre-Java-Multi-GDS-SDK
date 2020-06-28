
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNRRemarkChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRRemarkChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PNRRemark" type="{http://epowerv5.amadeus.com.tr/WS}PNRRemarkInfo" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ChangeDetailAction" use="required" type="{http://epowerv5.amadeus.com.tr/WS}ChangeDetailActionTypes" />
 *       &lt;attribute name="SegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRRemarkChange", propOrder = {
    "pnrRemark",
    "personName"
})
public class PNRRemarkChange {

    @XmlElement(name = "PNRRemark")
    protected PNRRemarkInfo pnrRemark;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlAttribute(name = "ChangeDetailAction", required = true)
    protected ChangeDetailActionTypes changeDetailAction;
    @XmlAttribute(name = "SegmentIndex")
    protected Integer segmentIndex;

    /**
     * Gets the value of the pnrRemark property.
     * 
     * @return
     *     possible object is
     *     {@link PNRRemarkInfo }
     *     
     */
    public PNRRemarkInfo getPNRRemark() {
        return pnrRemark;
    }

    /**
     * Sets the value of the pnrRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRRemarkInfo }
     *     
     */
    public void setPNRRemark(PNRRemarkInfo value) {
        this.pnrRemark = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the changeDetailAction property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeDetailActionTypes }
     *     
     */
    public ChangeDetailActionTypes getChangeDetailAction() {
        return changeDetailAction;
    }

    /**
     * Sets the value of the changeDetailAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeDetailActionTypes }
     *     
     */
    public void setChangeDetailAction(ChangeDetailActionTypes value) {
        this.changeDetailAction = value;
    }

    /**
     * Gets the value of the segmentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentIndex() {
        return segmentIndex;
    }

    /**
     * Sets the value of the segmentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentIndex(Integer value) {
        this.segmentIndex = value;
    }

}
