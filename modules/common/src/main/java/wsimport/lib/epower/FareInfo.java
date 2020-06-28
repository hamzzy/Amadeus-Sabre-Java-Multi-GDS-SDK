
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ExtraFare" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceFee" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInfo")
public class FareInfo {

    @XmlAttribute(name = "ExtraFare")
    protected String extraFare;
    @XmlAttribute(name = "ServiceFee")
    protected String serviceFee;
    @XmlAttribute(name = "Currency")
    protected String currency;

    /**
     * Gets the value of the extraFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraFare() {
        return extraFare;
    }

    /**
     * Sets the value of the extraFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraFare(String value) {
        this.extraFare = value;
    }

    /**
     * Gets the value of the serviceFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFee() {
        return serviceFee;
    }

    /**
     * Sets the value of the serviceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFee(String value) {
        this.serviceFee = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
