
package wsimport.lib.amadeus.pnr.read;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleReadRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleReadRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://traveltalk.com/wsPNRRead}UniqueIDRQ" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://traveltalk.com/wsPNRRead}PersonName" minOccurs="0"/>
 *         &lt;element name="CustLoyalty" type="{http://traveltalk.com/wsPNRRead}CustLoyalty" minOccurs="0"/>
 *         &lt;element name="VehRetResRQInfo" type="{http://traveltalk.com/wsPNRRead}VehRetResRQInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReadRequest", propOrder = {
    "uniqueID",
    "personName",
    "custLoyalty",
    "vehRetResRQInfo"
})
public class VehicleReadRequest {

    @XmlElement(name = "UniqueID")
    protected UniqueIDRQ uniqueID;
    @XmlElement(name = "PersonName")
    protected PersonName personName;
    @XmlElement(name = "CustLoyalty")
    protected CustLoyalty custLoyalty;
    @XmlElement(name = "VehRetResRQInfo")
    protected VehRetResRQInfo vehRetResRQInfo;

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDRQ }
     *     
     */
    public UniqueIDRQ getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDRQ }
     *     
     */
    public void setUniqueID(UniqueIDRQ value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * @return
     *     possible object is
     *     {@link CustLoyalty }
     *     
     */
    public CustLoyalty getCustLoyalty() {
        return custLoyalty;
    }

    /**
     * Sets the value of the custLoyalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustLoyalty }
     *     
     */
    public void setCustLoyalty(CustLoyalty value) {
        this.custLoyalty = value;
    }

    /**
     * Gets the value of the vehRetResRQInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehRetResRQInfo }
     *     
     */
    public VehRetResRQInfo getVehRetResRQInfo() {
        return vehRetResRQInfo;
    }

    /**
     * Sets the value of the vehRetResRQInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehRetResRQInfo }
     *     
     */
    public void setVehRetResRQInfo(VehRetResRQInfo value) {
        this.vehRetResRQInfo = value;
    }

}
