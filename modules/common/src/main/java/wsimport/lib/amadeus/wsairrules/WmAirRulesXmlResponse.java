
package wsimport.lib.amadeus.wsairrules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="wmAirRulesXmlResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wmAirRulesXmlResult"
})
@XmlRootElement(name = "wmAirRulesXmlResponse")
public class WmAirRulesXmlResponse {

    protected String wmAirRulesXmlResult;

    /**
     * Gets the value of the wmAirRulesXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWmAirRulesXmlResult() {
        return wmAirRulesXmlResult;
    }

    /**
     * Sets the value of the wmAirRulesXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWmAirRulesXmlResult(String value) {
        this.wmAirRulesXmlResult = value;
    }

}
