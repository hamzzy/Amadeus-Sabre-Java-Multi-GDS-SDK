
package wsimport.lib.amadeus.wstravelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarResGroupRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarResGroupRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OTA_VehResRQ" type="{http://traveltalk.com/wsTravelBuild}OTA_VehResRQ" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarResGroupRQ", propOrder = {
    "otaVehResRQ"
})
public class CarResGroupRQ {

    @XmlElement(name = "OTA_VehResRQ")
    protected List<OTAVehResRQ> otaVehResRQ;

    /**
     * Gets the value of the otaVehResRQ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otaVehResRQ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOTAVehResRQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAVehResRQ }
     * 
     * 
     */
    public List<OTAVehResRQ> getOTAVehResRQ() {
        if (otaVehResRQ == null) {
            otaVehResRQ = new ArrayList<OTAVehResRQ>();
        }
        return this.otaVehResRQ;
    }

}
