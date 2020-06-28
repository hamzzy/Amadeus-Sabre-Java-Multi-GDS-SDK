
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerFlyerCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerFlyerCard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}DBBaseEntity">
 *       &lt;sequence>
 *         &lt;element name="PassengerID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://epowerv5.amadeus.com.tr/WS}TDESValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerFlyerCard", propOrder = {
    "passengerID",
    "airlineCode",
    "cardName",
    "cardNumber"
})
public class PassengerFlyerCard
    extends DBBaseEntity
{

    @XmlElement(name = "PassengerID", required = true, nillable = true)
    protected String passengerID;
    @XmlElement(name = "AirlineCode")
    protected String airlineCode;
    @XmlElement(name = "CardName")
    protected String cardName;
    @XmlElement(name = "CardNumber")
    protected TDESValue cardNumber;

    /**
     * Gets the value of the passengerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerID() {
        return passengerID;
    }

    /**
     * Sets the value of the passengerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerID(String value) {
        this.passengerID = value;
    }

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the cardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Sets the value of the cardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardName(String value) {
        this.cardName = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TDESValue }
     *     
     */
    public TDESValue getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDESValue }
     *     
     */
    public void setCardNumber(TDESValue value) {
        this.cardNumber = value;
    }

}
