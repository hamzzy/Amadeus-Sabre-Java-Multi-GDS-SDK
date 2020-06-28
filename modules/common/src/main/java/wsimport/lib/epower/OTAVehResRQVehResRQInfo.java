
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_VehResRQVehResRQInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_VehResRQVehResRQInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}VehicleReservationRQAdditionalInfoType">
 *       &lt;attribute name="ResStatus" type="{http://epowerv5.amadeus.com.tr/WS}TransactionActionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_VehResRQVehResRQInfo")
public class OTAVehResRQVehResRQInfo
    extends VehicleReservationRQAdditionalInfoType
{

    @XmlAttribute(name = "ResStatus")
    protected TransactionActionType resStatus;

    /**
     * Gets the value of the resStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionActionType }
     *     
     */
    public TransactionActionType getResStatus() {
        return resStatus;
    }

    /**
     * Sets the value of the resStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionActionType }
     *     
     */
    public void setResStatus(TransactionActionType value) {
        this.resStatus = value;
    }

}
