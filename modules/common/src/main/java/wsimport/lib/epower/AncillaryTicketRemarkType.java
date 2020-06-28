
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryTicketRemarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryTicketRemarkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemarkTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemarkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryTicketRemarkType", propOrder = {
    "remarkTypeCode",
    "remarkType",
    "remark"
})
public class AncillaryTicketRemarkType {

    @XmlElement(name = "RemarkTypeCode")
    protected String remarkTypeCode;
    @XmlElement(name = "RemarkType")
    protected String remarkType;
    @XmlElement(name = "Remark")
    protected String remark;

    /**
     * Gets the value of the remarkTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkTypeCode() {
        return remarkTypeCode;
    }

    /**
     * Sets the value of the remarkTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkTypeCode(String value) {
        this.remarkTypeCode = value;
    }

    /**
     * Gets the value of the remarkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkType() {
        return remarkType;
    }

    /**
     * Sets the value of the remarkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkType(String value) {
        this.remarkType = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
