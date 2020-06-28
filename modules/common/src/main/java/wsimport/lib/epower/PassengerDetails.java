
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BaseEntity">
 *       &lt;sequence>
 *         &lt;element name="FlyerCards" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPassengerFlyerCard" minOccurs="0"/>
 *         &lt;element name="SpecialRequests" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPassengerSpecialRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerDetails", propOrder = {
    "flyerCards",
    "specialRequests"
})
public class PassengerDetails
    extends BaseEntity
{

    @XmlElement(name = "FlyerCards")
    protected ArrayOfPassengerFlyerCard flyerCards;
    @XmlElement(name = "SpecialRequests")
    protected ArrayOfPassengerSpecialRequest specialRequests;

    /**
     * Gets the value of the flyerCards property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPassengerFlyerCard }
     *     
     */
    public ArrayOfPassengerFlyerCard getFlyerCards() {
        return flyerCards;
    }

    /**
     * Sets the value of the flyerCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPassengerFlyerCard }
     *     
     */
    public void setFlyerCards(ArrayOfPassengerFlyerCard value) {
        this.flyerCards = value;
    }

    /**
     * Gets the value of the specialRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPassengerSpecialRequest }
     *     
     */
    public ArrayOfPassengerSpecialRequest getSpecialRequests() {
        return specialRequests;
    }

    /**
     * Sets the value of the specialRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPassengerSpecialRequest }
     *     
     */
    public void setSpecialRequests(ArrayOfPassengerSpecialRequest value) {
        this.specialRequests = value;
    }

}
