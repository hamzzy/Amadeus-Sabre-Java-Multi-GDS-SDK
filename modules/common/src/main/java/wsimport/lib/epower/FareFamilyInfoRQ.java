
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareFamilyInfoRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamilyInfoRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}GenericFlightRQ">
 *       &lt;sequence>
 *         &lt;element name="TravelerInfo" type="{http://epowerv5.amadeus.com.tr/WS}TravelerInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamilyInfoRQ", propOrder = {
    "travelerInfo"
})
public class FareFamilyInfoRQ
    extends GenericFlightRQ
{

    @XmlElement(name = "TravelerInfo")
    protected TravelerInfoType travelerInfo;

    /**
     * Gets the value of the travelerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfoType }
     *     
     */
    public TravelerInfoType getTravelerInfo() {
        return travelerInfo;
    }

    /**
     * Sets the value of the travelerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfoType }
     *     
     */
    public void setTravelerInfo(TravelerInfoType value) {
        this.travelerInfo = value;
    }

}
