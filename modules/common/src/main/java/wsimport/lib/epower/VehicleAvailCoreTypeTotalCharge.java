
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleAvailCoreTypeTotalCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailCoreTypeTotalCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RateTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="EstimatedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="RateConvertInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailCoreTypeTotalCharge")
public class VehicleAvailCoreTypeTotalCharge {

    @XmlAttribute(name = "RateTotalAmount")
    protected BigDecimal rateTotalAmount;
    @XmlAttribute(name = "EstimatedTotalAmount")
    protected BigDecimal estimatedTotalAmount;
    @XmlAttribute(name = "RateConvertInd")
    protected Boolean rateConvertInd;

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

    /**
     * Gets the value of the rateConvertInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateConvertInd() {
        return rateConvertInd;
    }

    /**
     * Sets the value of the rateConvertInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateConvertInd(Boolean value) {
        this.rateConvertInd = value;
    }

}
