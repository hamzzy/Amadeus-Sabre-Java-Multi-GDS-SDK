
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleMatchedLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleMatchedLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationDetail" type="{http://epowerv5.amadeus.com.tr/WS}VehicleLocationDetailsType" minOccurs="0"/>
 *         &lt;element name="VehLocSearchCriterion" type="{http://epowerv5.amadeus.com.tr/WS}ItemSearchCriterionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AlternateLocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMatchedLocationType", propOrder = {
    "locationDetail",
    "vehLocSearchCriterion"
})
public class VehicleMatchedLocationType {

    @XmlElement(name = "LocationDetail")
    protected VehicleLocationDetailsType locationDetail;
    @XmlElement(name = "VehLocSearchCriterion")
    protected List<ItemSearchCriterionType> vehLocSearchCriterion;
    @XmlAttribute(name = "CompanyName")
    protected String companyName;
    @XmlAttribute(name = "CompanyCode")
    protected String companyCode;
    @XmlAttribute(name = "AlternateLocInd")
    protected Boolean alternateLocInd;

    /**
     * Gets the value of the locationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationDetailsType }
     *     
     */
    public VehicleLocationDetailsType getLocationDetail() {
        return locationDetail;
    }

    /**
     * Sets the value of the locationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationDetailsType }
     *     
     */
    public void setLocationDetail(VehicleLocationDetailsType value) {
        this.locationDetail = value;
    }

    /**
     * Gets the value of the vehLocSearchCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehLocSearchCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehLocSearchCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSearchCriterionType }
     * 
     * 
     */
    public List<ItemSearchCriterionType> getVehLocSearchCriterion() {
        if (vehLocSearchCriterion == null) {
            vehLocSearchCriterion = new ArrayList<ItemSearchCriterionType>();
        }
        return this.vehLocSearchCriterion;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the alternateLocInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternateLocInd() {
        return alternateLocInd;
    }

    /**
     * Sets the value of the alternateLocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternateLocInd(Boolean value) {
        this.alternateLocInd = value;
    }

}
