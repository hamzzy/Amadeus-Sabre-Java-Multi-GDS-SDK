
package wsimport.lib.axamansard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CarValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "policyCode",
    "carType",
    "carValue"
})
@XmlRootElement(name = "GetComprehensiveMotorPremium")
public class GetComprehensiveMotorPremium {

    protected String token;
    @XmlElement(name = "PolicyCode")
    protected String policyCode;
    @XmlElement(name = "CarType")
    protected int carType;
    @XmlElement(name = "CarValue", required = true)
    protected BigDecimal carValue;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the policyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyCode() {
        return policyCode;
    }

    /**
     * Sets the value of the policyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyCode(String value) {
        this.policyCode = value;
    }

    /**
     * Gets the value of the carType property.
     * 
     */
    public int getCarType() {
        return carType;
    }

    /**
     * Sets the value of the carType property.
     * 
     */
    public void setCarType(int value) {
        this.carType = value;
    }

    /**
     * Gets the value of the carValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarValue() {
        return carValue;
    }

    /**
     * Sets the value of the carValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarValue(BigDecimal value) {
        this.carValue = value;
    }

}
