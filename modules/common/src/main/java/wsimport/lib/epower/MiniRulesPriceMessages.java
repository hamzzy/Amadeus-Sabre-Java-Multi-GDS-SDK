
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MiniRulesPriceMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiniRulesPriceMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfMiniRulesPriceText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiniRulesPriceMessages", propOrder = {
    "text"
})
public class MiniRulesPriceMessages {

    @XmlElement(name = "Text")
    protected ArrayOfMiniRulesPriceText text;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMiniRulesPriceText }
     *     
     */
    public ArrayOfMiniRulesPriceText getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMiniRulesPriceText }
     *     
     */
    public void setText(ArrayOfMiniRulesPriceText value) {
        this.text = value;
    }

}
