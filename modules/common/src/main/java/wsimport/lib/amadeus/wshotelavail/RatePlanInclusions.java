
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatePlanInclusions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlanInclusions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlanInclusionDesciption" type="{http://traveltalk.com/wsHotelAvail}RatePlanInclusionDesciption" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanInclusions", propOrder = {
    "ratePlanInclusionDesciption"
})
public class RatePlanInclusions {

    @XmlElement(name = "RatePlanInclusionDesciption")
    protected RatePlanInclusionDesciption ratePlanInclusionDesciption;
    @XmlAttribute(name = "TaxInclusive")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "ServiceFeeInclusive")
    protected Boolean serviceFeeInclusive;

    /**
     * Gets the value of the ratePlanInclusionDesciption property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanInclusionDesciption }
     *     
     */
    public RatePlanInclusionDesciption getRatePlanInclusionDesciption() {
        return ratePlanInclusionDesciption;
    }

    /**
     * Sets the value of the ratePlanInclusionDesciption property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanInclusionDesciption }
     *     
     */
    public void setRatePlanInclusionDesciption(RatePlanInclusionDesciption value) {
        this.ratePlanInclusionDesciption = value;
    }

    /**
     * Gets the value of the taxInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInclusive() {
        return taxInclusive;
    }

    /**
     * Sets the value of the taxInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInclusive(Boolean value) {
        this.taxInclusive = value;
    }

    /**
     * Gets the value of the serviceFeeInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceFeeInclusive() {
        return serviceFeeInclusive;
    }

    /**
     * Sets the value of the serviceFeeInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceFeeInclusive(Boolean value) {
        this.serviceFeeInclusive = value;
    }

}
