
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequentFlyerCardsWithPassengerForSeatMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentFlyerCardsWithPassengerForSeatMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SeatRowNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlyerCards" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfFlayerCardForSeatMap" minOccurs="0"/>
 *         &lt;element name="ItineraryNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentFlyerCardsWithPassengerForSeatMap", propOrder = {
    "surName",
    "segmentNo",
    "passengerType",
    "seatPrice",
    "seatRowNumber",
    "seatColumn",
    "flyerCards",
    "itineraryNo"
})
public class FrequentFlyerCardsWithPassengerForSeatMap {

    @XmlElement(name = "SurName")
    protected String surName;
    @XmlElement(name = "SegmentNo")
    protected int segmentNo;
    @XmlElement(name = "PassengerType")
    protected String passengerType;
    @XmlElement(name = "SeatPrice", required = true, nillable = true)
    protected BigDecimal seatPrice;
    @XmlElement(name = "SeatRowNumber")
    protected String seatRowNumber;
    @XmlElement(name = "SeatColumn")
    protected String seatColumn;
    @XmlElement(name = "FlyerCards")
    protected ArrayOfFlayerCardForSeatMap flyerCards;
    @XmlElement(name = "ItineraryNo")
    protected int itineraryNo;

    /**
     * Gets the value of the surName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Sets the value of the surName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurName(String value) {
        this.surName = value;
    }

    /**
     * Gets the value of the segmentNo property.
     * 
     */
    public int getSegmentNo() {
        return segmentNo;
    }

    /**
     * Sets the value of the segmentNo property.
     * 
     */
    public void setSegmentNo(int value) {
        this.segmentNo = value;
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
     * Gets the value of the seatPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatPrice() {
        return seatPrice;
    }

    /**
     * Sets the value of the seatPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatPrice(BigDecimal value) {
        this.seatPrice = value;
    }

    /**
     * Gets the value of the seatRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatRowNumber() {
        return seatRowNumber;
    }

    /**
     * Sets the value of the seatRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatRowNumber(String value) {
        this.seatRowNumber = value;
    }

    /**
     * Gets the value of the seatColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatColumn() {
        return seatColumn;
    }

    /**
     * Sets the value of the seatColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatColumn(String value) {
        this.seatColumn = value;
    }

    /**
     * Gets the value of the flyerCards property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFlayerCardForSeatMap }
     *     
     */
    public ArrayOfFlayerCardForSeatMap getFlyerCards() {
        return flyerCards;
    }

    /**
     * Sets the value of the flyerCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFlayerCardForSeatMap }
     *     
     */
    public void setFlyerCards(ArrayOfFlayerCardForSeatMap value) {
        this.flyerCards = value;
    }

    /**
     * Gets the value of the itineraryNo property.
     * 
     */
    public int getItineraryNo() {
        return itineraryNo;
    }

    /**
     * Sets the value of the itineraryNo property.
     * 
     */
    public void setItineraryNo(int value) {
        this.itineraryNo = value;
    }

}
