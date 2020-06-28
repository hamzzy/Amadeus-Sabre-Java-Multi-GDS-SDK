
package wsimport.lib.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargesRulesRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargesRulesRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoluntaryChanges" type="{http://traveltalk.com/wsTravelBuild}VoluntaryChangesRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesRulesRS", propOrder = {
    "voluntaryChanges"
})
public class ChargesRulesRS {

    @XmlElement(name = "VoluntaryChanges")
    protected VoluntaryChangesRS voluntaryChanges;

    /**
     * Gets the value of the voluntaryChanges property.
     * 
     * @return
     *     possible object is
     *     {@link VoluntaryChangesRS }
     *     
     */
    public VoluntaryChangesRS getVoluntaryChanges() {
        return voluntaryChanges;
    }

    /**
     * Sets the value of the voluntaryChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoluntaryChangesRS }
     *     
     */
    public void setVoluntaryChanges(VoluntaryChangesRS value) {
        this.voluntaryChanges = value;
    }

}
