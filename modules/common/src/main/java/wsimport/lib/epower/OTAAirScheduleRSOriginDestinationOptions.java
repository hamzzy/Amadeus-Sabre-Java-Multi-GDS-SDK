
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirScheduleRSOriginDestinationOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirScheduleRSOriginDestinationOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestinationOption" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRSOriginDestinationOptionsOriginDestinationOption" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OriginCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirScheduleRSOriginDestinationOptions", propOrder = {
    "originDestinationOption"
})
public class OTAAirScheduleRSOriginDestinationOptions {

    @XmlElement(name = "OriginDestinationOption")
    protected List<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOption> originDestinationOption;
    @XmlAttribute(name = "OriginCode")
    protected String originCode;
    @XmlAttribute(name = "DestinationCode")
    protected String destinationCode;

    /**
     * Gets the value of the originDestinationOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOption }
     * 
     * 
     */
    public List<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOption> getOriginDestinationOption() {
        if (originDestinationOption == null) {
            originDestinationOption = new ArrayList<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOption>();
        }
        return this.originDestinationOption;
    }

    /**
     * Gets the value of the originCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCode() {
        return originCode;
    }

    /**
     * Sets the value of the originCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCode(String value) {
        this.originCode = value;
    }

    /**
     * Gets the value of the destinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCode() {
        return destinationCode;
    }

    /**
     * Sets the value of the destinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCode(String value) {
        this.destinationCode = value;
    }

}
