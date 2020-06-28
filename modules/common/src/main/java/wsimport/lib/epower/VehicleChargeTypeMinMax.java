
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleChargeTypeMinMax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleChargeTypeMinMax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MaxCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MinCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MaxChargeDays" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleChargeTypeMinMax")
public class VehicleChargeTypeMinMax {

    @XmlAttribute(name = "MaxCharge")
    protected BigDecimal maxCharge;
    @XmlAttribute(name = "MinCharge")
    protected BigDecimal minCharge;
    @XmlAttribute(name = "MaxChargeDays")
    protected BigInteger maxChargeDays;

    /**
     * Gets the value of the maxCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxCharge() {
        return maxCharge;
    }

    /**
     * Sets the value of the maxCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxCharge(BigDecimal value) {
        this.maxCharge = value;
    }

    /**
     * Gets the value of the minCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinCharge() {
        return minCharge;
    }

    /**
     * Sets the value of the minCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinCharge(BigDecimal value) {
        this.minCharge = value;
    }

    /**
     * Gets the value of the maxChargeDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxChargeDays() {
        return maxChargeDays;
    }

    /**
     * Sets the value of the maxChargeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxChargeDays(BigInteger value) {
        this.maxChargeDays = value;
    }

}
