
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareRuleResponseInfoTypeAdvisoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRuleResponseInfoTypeAdvisoryInfo">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FreeTextType">
 *       &lt;attribute name="AdvisoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRuleResponseInfoTypeAdvisoryInfo")
public class FareRuleResponseInfoTypeAdvisoryInfo
    extends FreeTextType
{

    @XmlAttribute(name = "AdvisoryCode")
    protected String advisoryCode;

    /**
     * Gets the value of the advisoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisoryCode() {
        return advisoryCode;
    }

    /**
     * Sets the value of the advisoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisoryCode(String value) {
        this.advisoryCode = value;
    }

}
