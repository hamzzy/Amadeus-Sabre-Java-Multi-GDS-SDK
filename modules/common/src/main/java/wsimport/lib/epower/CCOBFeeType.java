
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCOBFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCOBFeeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BookingFeeType">
 *       &lt;attribute name="MinOBFee" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MaxOBFee" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCOBFeeType")
public class CCOBFeeType
    extends BookingFeeType
{

    @XmlAttribute(name = "MinOBFee", required = true)
    protected BigDecimal minOBFee;
    @XmlAttribute(name = "MaxOBFee", required = true)
    protected BigDecimal maxOBFee;

    /**
     * Gets the value of the minOBFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinOBFee() {
        return minOBFee;
    }

    /**
     * Sets the value of the minOBFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinOBFee(BigDecimal value) {
        this.minOBFee = value;
    }

    /**
     * Gets the value of the maxOBFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxOBFee() {
        return maxOBFee;
    }

    /**
     * Sets the value of the maxOBFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxOBFee(BigDecimal value) {
        this.maxOBFee = value;
    }

}
