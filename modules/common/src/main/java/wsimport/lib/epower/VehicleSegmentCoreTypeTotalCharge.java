
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleSegmentCoreTypeTotalCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleSegmentCoreTypeTotalCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RateTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="EstimatedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSegmentCoreTypeTotalCharge")
public class VehicleSegmentCoreTypeTotalCharge {

    @XmlAttribute(name = "RateTotalAmount")
    protected BigDecimal rateTotalAmount;
    @XmlAttribute(name = "EstimatedTotalAmount")
    protected BigDecimal estimatedTotalAmount;

    /**
     * Gets the value of the rateTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateTotalAmount() {
        return rateTotalAmount;
    }

    /**
     * Sets the value of the rateTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateTotalAmount(BigDecimal value) {
        this.rateTotalAmount = value;
    }

    /**
     * Gets the value of the estimatedTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimatedTotalAmount() {
        return estimatedTotalAmount;
    }

    /**
     * Sets the value of the estimatedTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimatedTotalAmount(BigDecimal value) {
        this.estimatedTotalAmount = value;
    }

}
