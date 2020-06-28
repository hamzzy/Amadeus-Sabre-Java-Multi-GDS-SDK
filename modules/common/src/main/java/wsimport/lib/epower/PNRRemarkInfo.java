
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNRRemarkInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRRemarkInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RemarkType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RemarkCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Note" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassengerOrderId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SegmentsOrderId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRRemarkInfo")
public class PNRRemarkInfo {

    @XmlAttribute(name = "RemarkType")
    protected String remarkType;
    @XmlAttribute(name = "RemarkCategory")
    protected String remarkCategory;
    @XmlAttribute(name = "Note")
    protected String note;
    @XmlAttribute(name = "PassengerOrderId")
    protected Integer passengerOrderId;
    @XmlAttribute(name = "SegmentsOrderId")
    protected String segmentsOrderId;

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
     * Gets the value of the remarkCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkCategory() {
        return remarkCategory;
    }

    /**
     * Sets the value of the remarkCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkCategory(String value) {
        this.remarkCategory = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the passengerOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerOrderId() {
        return passengerOrderId;
    }

    /**
     * Sets the value of the passengerOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerOrderId(Integer value) {
        this.passengerOrderId = value;
    }

    /**
     * Gets the value of the segmentsOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentsOrderId() {
        return segmentsOrderId;
    }

    /**
     * Sets the value of the segmentsOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentsOrderId(String value) {
        this.segmentsOrderId = value;
    }

}
