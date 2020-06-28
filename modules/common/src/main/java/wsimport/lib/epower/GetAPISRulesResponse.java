
package wsimport.lib.epower;

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
 *         &lt;element name="APISRulesRS" type="{http://epowerv5.amadeus.com.tr/WS}APISRulesRS" minOccurs="0"/>
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
    "apisRulesRS"
})
@XmlRootElement(name = "GetAPISRulesResponse")
public class GetAPISRulesResponse {

    @XmlElement(name = "APISRulesRS")
    protected APISRulesRS apisRulesRS;

    /**
     * Gets the value of the apisRulesRS property.
     * 
     * @return
     *     possible object is
     *     {@link APISRulesRS }
     *     
     */
    public APISRulesRS getAPISRulesRS() {
        return apisRulesRS;
    }

    /**
     * Sets the value of the apisRulesRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISRulesRS }
     *     
     */
    public void setAPISRulesRS(APISRulesRS value) {
        this.apisRulesRS = value;
    }

}
