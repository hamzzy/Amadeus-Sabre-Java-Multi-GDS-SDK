
package wsimport.lib.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenaltyRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PenaltyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DepartureStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyRS")
public class PenaltyRS {

    @XmlAttribute(name = "PenaltyType")
    protected String penaltyType;
    @XmlAttribute(name = "DepartureStatus")
    protected String departureStatus;
    @XmlAttribute(name = "Amount")
    protected Double amount;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    protected Integer decimalPlaces;
    @XmlAttribute(name = "Percent")
    protected Double percent;

    /**
     * Gets the value of the penaltyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyType() {
        return penaltyType;
    }

    /**
     * Sets the value of the penaltyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyType(String value) {
        this.penaltyType = value;
    }

    /**
     * Gets the value of the departureStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureStatus() {
        return departureStatus;
    }

    /**
     * Sets the value of the departureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureStatus(String value) {
        this.departureStatus = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecimalPlaces(Integer value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent(Double value) {
        this.percent = value;
    }

}
