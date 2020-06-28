
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QueCategoryNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OfficeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueSetting", propOrder = {
    "queNo",
    "queCategoryNo",
    "officeID"
})
public class QueSetting {

    @XmlElement(name = "QueNo", required = true, type = Integer.class, nillable = true)
    protected Integer queNo;
    @XmlElement(name = "QueCategoryNo", required = true, type = Integer.class, nillable = true)
    protected Integer queCategoryNo;
    @XmlElement(name = "OfficeID")
    protected String officeID;

    /**
     * Gets the value of the queNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueNo() {
        return queNo;
    }

    /**
     * Sets the value of the queNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueNo(Integer value) {
        this.queNo = value;
    }

    /**
     * Gets the value of the queCategoryNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueCategoryNo() {
        return queCategoryNo;
    }

    /**
     * Sets the value of the queCategoryNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueCategoryNo(Integer value) {
        this.queCategoryNo = value;
    }

    /**
     * Gets the value of the officeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeID() {
        return officeID;
    }

    /**
     * Sets the value of the officeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeID(String value) {
        this.officeID = value;
    }

}
