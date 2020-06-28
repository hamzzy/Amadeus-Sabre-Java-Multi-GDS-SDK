
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndCoverageReqsTypeLuggageItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndCoverageReqsTypeLuggageItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LuggageDescription" type="{http://epowerv5.amadeus.com.tr/WS}FreeTextType" minOccurs="0"/>
 *         &lt;element name="ItemDeclaredValue" type="{http://epowerv5.amadeus.com.tr/WS}IndCoverageReqsTypeLuggageItemItemDeclaredValue" minOccurs="0"/>
 *         &lt;element name="LuggagePremium" type="{http://epowerv5.amadeus.com.tr/WS}IndCoverageReqsTypeLuggageItemLuggagePremium" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LuggageType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndCoverageReqsTypeLuggageItem", propOrder = {
    "luggageDescription",
    "itemDeclaredValue",
    "luggagePremium"
})
public class IndCoverageReqsTypeLuggageItem {

    @XmlElement(name = "LuggageDescription")
    protected FreeTextType luggageDescription;
    @XmlElement(name = "ItemDeclaredValue")
    protected IndCoverageReqsTypeLuggageItemItemDeclaredValue itemDeclaredValue;
    @XmlElement(name = "LuggagePremium")
    protected IndCoverageReqsTypeLuggageItemLuggagePremium luggagePremium;
    @XmlAttribute(name = "LuggageType")
    protected String luggageType;

    /**
     * Gets the value of the luggageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getLuggageDescription() {
        return luggageDescription;
    }

    /**
     * Sets the value of the luggageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setLuggageDescription(FreeTextType value) {
        this.luggageDescription = value;
    }

    /**
     * Gets the value of the itemDeclaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsTypeLuggageItemItemDeclaredValue }
     *     
     */
    public IndCoverageReqsTypeLuggageItemItemDeclaredValue getItemDeclaredValue() {
        return itemDeclaredValue;
    }

    /**
     * Sets the value of the itemDeclaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsTypeLuggageItemItemDeclaredValue }
     *     
     */
    public void setItemDeclaredValue(IndCoverageReqsTypeLuggageItemItemDeclaredValue value) {
        this.itemDeclaredValue = value;
    }

    /**
     * Gets the value of the luggagePremium property.
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsTypeLuggageItemLuggagePremium }
     *     
     */
    public IndCoverageReqsTypeLuggageItemLuggagePremium getLuggagePremium() {
        return luggagePremium;
    }

    /**
     * Sets the value of the luggagePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsTypeLuggageItemLuggagePremium }
     *     
     */
    public void setLuggagePremium(IndCoverageReqsTypeLuggageItemLuggagePremium value) {
        this.luggagePremium = value;
    }

    /**
     * Gets the value of the luggageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuggageType() {
        return luggageType;
    }

    /**
     * Sets the value of the luggageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuggageType(String value) {
        this.luggageType = value;
    }

}
