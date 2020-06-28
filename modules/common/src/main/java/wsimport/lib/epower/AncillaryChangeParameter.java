
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryChangeParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryChangeParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AncillaryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewAncillaryFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OldAncillaryFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryChangeParameter", propOrder = {
    "segmentRef",
    "ancillaryType",
    "newAncillaryFee",
    "oldAncillaryFee"
})
public class AncillaryChangeParameter {

    @XmlElement(name = "SegmentRef")
    protected int segmentRef;
    @XmlElement(name = "AncillaryType")
    protected String ancillaryType;
    @XmlElement(name = "NewAncillaryFee", required = true)
    protected BigDecimal newAncillaryFee;
    @XmlElement(name = "OldAncillaryFee", required = true)
    protected BigDecimal oldAncillaryFee;

    /**
     * Gets the value of the segmentRef property.
     * 
     */
    public int getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     */
    public void setSegmentRef(int value) {
        this.segmentRef = value;
    }

    /**
     * Gets the value of the ancillaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncillaryType() {
        return ancillaryType;
    }

    /**
     * Sets the value of the ancillaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncillaryType(String value) {
        this.ancillaryType = value;
    }

    /**
     * Gets the value of the newAncillaryFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewAncillaryFee() {
        return newAncillaryFee;
    }

    /**
     * Sets the value of the newAncillaryFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewAncillaryFee(BigDecimal value) {
        this.newAncillaryFee = value;
    }

    /**
     * Gets the value of the oldAncillaryFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOldAncillaryFee() {
        return oldAncillaryFee;
    }

    /**
     * Sets the value of the oldAncillaryFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOldAncillaryFee(BigDecimal value) {
        this.oldAncillaryFee = value;
    }

}
