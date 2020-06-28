
package wsimport.lib.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResTicketingRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResTicketingRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdvResTicketing" type="{http://traveltalk.com/wsTravelBuild}AdvResTicketing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResTicketingRules", propOrder = {
    "advResTicketing"
})
public class ResTicketingRules {

    @XmlElement(name = "AdvResTicketing")
    protected AdvResTicketing advResTicketing;

    /**
     * Gets the value of the advResTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link AdvResTicketing }
     *     
     */
    public AdvResTicketing getAdvResTicketing() {
        return advResTicketing;
    }

    /**
     * Sets the value of the advResTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvResTicketing }
     *     
     */
    public void setAdvResTicketing(AdvResTicketing value) {
        this.advResTicketing = value;
    }

}
