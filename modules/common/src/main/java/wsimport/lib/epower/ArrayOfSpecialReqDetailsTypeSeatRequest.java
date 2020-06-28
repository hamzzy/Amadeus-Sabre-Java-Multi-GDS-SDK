
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSpecialReqDetailsTypeSeatRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSpecialReqDetailsTypeSeatRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatRequest" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}SeatRequestType">
 *                 &lt;attribute name="TravelerRefNumberRPHList">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="FlightRefNumberRPHList">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PartialSeatingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSpecialReqDetailsTypeSeatRequest", propOrder = {
    "seatRequest"
})
public class ArrayOfSpecialReqDetailsTypeSeatRequest {

    @XmlElement(name = "SeatRequest")
    protected List<ArrayOfSpecialReqDetailsTypeSeatRequest.SeatRequest> seatRequest;

    /**
     * Gets the value of the seatRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSpecialReqDetailsTypeSeatRequest.SeatRequest }
     * 
     * 
     */
    public List<ArrayOfSpecialReqDetailsTypeSeatRequest.SeatRequest> getSeatRequest() {
        if (seatRequest == null) {
            seatRequest = new ArrayList<ArrayOfSpecialReqDetailsTypeSeatRequest.SeatRequest>();
        }
        return this.seatRequest;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}SeatRequestType">
     *       &lt;attribute name="TravelerRefNumberRPHList">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="FlightRefNumberRPHList">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PartialSeatingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SeatRequest
        extends SeatRequestType
    {

        @XmlAttribute(name = "TravelerRefNumberRPHList")
        protected List<String> travelerRefNumberRPHList;
        @XmlAttribute(name = "FlightRefNumberRPHList")
        protected List<String> flightRefNumberRPHList;
        @XmlAttribute(name = "PartialSeatingInd")
        protected Boolean partialSeatingInd;

        /**
         * Gets the value of the travelerRefNumberRPHList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerRefNumberRPHList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerRefNumberRPHList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTravelerRefNumberRPHList() {
            if (travelerRefNumberRPHList == null) {
                travelerRefNumberRPHList = new ArrayList<String>();
            }
            return this.travelerRefNumberRPHList;
        }

        /**
         * Gets the value of the flightRefNumberRPHList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightRefNumberRPHList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightRefNumberRPHList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFlightRefNumberRPHList() {
            if (flightRefNumberRPHList == null) {
                flightRefNumberRPHList = new ArrayList<String>();
            }
            return this.flightRefNumberRPHList;
        }

        /**
         * Gets the value of the partialSeatingInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPartialSeatingInd() {
            return partialSeatingInd;
        }

        /**
         * Sets the value of the partialSeatingInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPartialSeatingInd(Boolean value) {
            this.partialSeatingInd = value;
        }

    }

}
