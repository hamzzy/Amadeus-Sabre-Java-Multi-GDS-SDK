
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
 *         &lt;element name="ServiceFeeInfoRQ" type="{http://epowerv5.amadeus.com.tr/WS}ServiceFeeInfoRQ" minOccurs="0"/>
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
    "serviceFeeInfoRQ"
})
@XmlRootElement(name = "GetServiceFee")
public class GetServiceFee {

    @XmlElement(name = "ServiceFeeInfoRQ")
    protected ServiceFeeInfoRQ serviceFeeInfoRQ;

    /**
     * Gets the value of the serviceFeeInfoRQ property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeInfoRQ }
     *     
     */
    public ServiceFeeInfoRQ getServiceFeeInfoRQ() {
        return serviceFeeInfoRQ;
    }

    /**
     * Sets the value of the serviceFeeInfoRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeInfoRQ }
     *     
     */
    public void setServiceFeeInfoRQ(ServiceFeeInfoRQ value) {
        this.serviceFeeInfoRQ = value;
    }

}
