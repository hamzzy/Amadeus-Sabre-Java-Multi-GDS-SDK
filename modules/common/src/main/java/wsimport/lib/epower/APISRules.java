
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APISRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APISRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APISRuleDocs" type="{http://epowerv5.amadeus.com.tr/WS}APISRuleDocs" minOccurs="0"/>
 *         &lt;element name="APISRuleDoco" type="{http://epowerv5.amadeus.com.tr/WS}APISRuleDoco" minOccurs="0"/>
 *         &lt;element name="APISRuleDoca" type="{http://epowerv5.amadeus.com.tr/WS}APISRuleDoca" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APISRules", propOrder = {
    "apisRuleDocs",
    "apisRuleDoco",
    "apisRuleDoca"
})
public class APISRules {

    @XmlElement(name = "APISRuleDocs")
    protected APISRuleDocs apisRuleDocs;
    @XmlElement(name = "APISRuleDoco")
    protected APISRuleDoco apisRuleDoco;
    @XmlElement(name = "APISRuleDoca")
    protected APISRuleDoca apisRuleDoca;

    /**
     * Gets the value of the apisRuleDocs property.
     * 
     * @return
     *     possible object is
     *     {@link APISRuleDocs }
     *     
     */
    public APISRuleDocs getAPISRuleDocs() {
        return apisRuleDocs;
    }

    /**
     * Sets the value of the apisRuleDocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISRuleDocs }
     *     
     */
    public void setAPISRuleDocs(APISRuleDocs value) {
        this.apisRuleDocs = value;
    }

    /**
     * Gets the value of the apisRuleDoco property.
     * 
     * @return
     *     possible object is
     *     {@link APISRuleDoco }
     *     
     */
    public APISRuleDoco getAPISRuleDoco() {
        return apisRuleDoco;
    }

    /**
     * Sets the value of the apisRuleDoco property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISRuleDoco }
     *     
     */
    public void setAPISRuleDoco(APISRuleDoco value) {
        this.apisRuleDoco = value;
    }

    /**
     * Gets the value of the apisRuleDoca property.
     * 
     * @return
     *     possible object is
     *     {@link APISRuleDoca }
     *     
     */
    public APISRuleDoca getAPISRuleDoca() {
        return apisRuleDoca;
    }

    /**
     * Sets the value of the apisRuleDoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISRuleDoca }
     *     
     */
    public void setAPISRuleDoca(APISRuleDoca value) {
        this.apisRuleDoca = value;
    }

}
