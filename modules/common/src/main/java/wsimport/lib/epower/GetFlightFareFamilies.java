
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
 *         &lt;element name="FareFamilyInfoRQ" type="{http://epowerv5.amadeus.com.tr/WS}FareFamilyInfoRQ" minOccurs="0"/>
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
    "fareFamilyInfoRQ"
})
@XmlRootElement(name = "GetFlightFareFamilies")
public class GetFlightFareFamilies {

    @XmlElement(name = "FareFamilyInfoRQ")
    protected FareFamilyInfoRQ fareFamilyInfoRQ;

    /**
     * Gets the value of the fareFamilyInfoRQ property.
     * 
     * @return
     *     possible object is
     *     {@link FareFamilyInfoRQ }
     *     
     */
    public FareFamilyInfoRQ getFareFamilyInfoRQ() {
        return fareFamilyInfoRQ;
    }

    /**
     * Sets the value of the fareFamilyInfoRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFamilyInfoRQ }
     *     
     */
    public void setFareFamilyInfoRQ(FareFamilyInfoRQ value) {
        this.fareFamilyInfoRQ = value;
    }

}
