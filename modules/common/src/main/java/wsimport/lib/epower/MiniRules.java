
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MiniRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiniRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TermsAndCondition" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfFlightTermsAndCondition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiniRules", propOrder = {
    "termsAndCondition"
})
public class MiniRules {

    @XmlElement(name = "TermsAndCondition")
    protected ArrayOfFlightTermsAndCondition termsAndCondition;

    /**
     * Gets the value of the termsAndCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFlightTermsAndCondition }
     *     
     */
    public ArrayOfFlightTermsAndCondition getTermsAndCondition() {
        return termsAndCondition;
    }

    /**
     * Sets the value of the termsAndCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFlightTermsAndCondition }
     *     
     */
    public void setTermsAndCondition(ArrayOfFlightTermsAndCondition value) {
        this.termsAndCondition = value;
    }

}
