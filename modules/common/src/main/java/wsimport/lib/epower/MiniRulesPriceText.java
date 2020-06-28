
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MiniRulesPriceText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiniRulesPriceText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PriceMessageValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PriceDataList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiniRulesPriceText")
public class MiniRulesPriceText {

    @XmlAttribute(name = "PriceMessageValue")
    protected String priceMessageValue;
    @XmlAttribute(name = "PriceDataList")
    protected String priceDataList;

    /**
     * Gets the value of the priceMessageValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceMessageValue() {
        return priceMessageValue;
    }

    /**
     * Sets the value of the priceMessageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceMessageValue(String value) {
        this.priceMessageValue = value;
    }

    /**
     * Gets the value of the priceDataList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceDataList() {
        return priceDataList;
    }

    /**
     * Sets the value of the priceDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceDataList(String value) {
        this.priceDataList = value;
    }

}
