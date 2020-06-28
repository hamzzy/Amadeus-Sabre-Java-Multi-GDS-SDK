
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrequentFlyerCard" type="{http://epowerv5.amadeus.com.tr/WS}FrequentFlyerCardType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassengerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerInfo", propOrder = {
    "frequentFlyerCard"
})
public class PassengerInfo {

    @XmlElement(name = "FrequentFlyerCard")
    protected List<FrequentFlyerCardType> frequentFlyerCard;
    @XmlAttribute(name = "PassengerType")
    protected String passengerType;
    @XmlAttribute(name = "PassengerIndex", required = true)
    protected int passengerIndex;

    /**
     * Gets the value of the frequentFlyerCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequentFlyerCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequentFlyerCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentFlyerCardType }
     * 
     * 
     */
    public List<FrequentFlyerCardType> getFrequentFlyerCard() {
        if (frequentFlyerCard == null) {
            frequentFlyerCard = new ArrayList<FrequentFlyerCardType>();
        }
        return this.frequentFlyerCard;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the passengerIndex property.
     * 
     */
    public int getPassengerIndex() {
        return passengerIndex;
    }

    /**
     * Sets the value of the passengerIndex property.
     * 
     */
    public void setPassengerIndex(int value) {
        this.passengerIndex = value;
    }

}
