
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
 *         &lt;element name="EditPNRRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AgentSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PassengerDetailChanges" type="{http://epowerv5.amadeus.com.tr/WS}PassengerDetailChanges" minOccurs="0"/>
 *                   &lt;element name="PNRRemarkChanges" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPNRRemarkChange" minOccurs="0"/>
 *                   &lt;element name="OSIElementChanges" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOSIElementChange" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "", propOrder = {
    "editPNRRQ"
})
@XmlRootElement(name = "EditPNR")
public class EditPNR {

    @XmlElement(name = "EditPNRRQ")
    protected EditPNR.EditPNRRQ editPNRRQ;

    /**
     * Gets the value of the editPNRRQ property.
     * 
     * @return
     *     possible object is
     *     {@link EditPNR.EditPNRRQ }
     *     
     */
    public EditPNR.EditPNRRQ getEditPNRRQ() {
        return editPNRRQ;
    }

    /**
     * Sets the value of the editPNRRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditPNR.EditPNRRQ }
     *     
     */
    public void setEditPNRRQ(EditPNR.EditPNRRQ value) {
        this.editPNRRQ = value;
    }


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
     *         &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
     *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AgentSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PassengerDetailChanges" type="{http://epowerv5.amadeus.com.tr/WS}PassengerDetailChanges" minOccurs="0"/>
     *         &lt;element name="PNRRemarkChanges" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPNRRemarkChange" minOccurs="0"/>
     *         &lt;element name="OSIElementChanges" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOSIElementChange" minOccurs="0"/>
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
        "bookingReferenceID",
        "surName",
        "agentSignature",
        "passengerDetailChanges",
        "pnrRemarkChanges",
        "osiElementChanges"
    })
    public static class EditPNRRQ {

        @XmlElement(name = "BookingReferenceID")
        protected UniqueIDType bookingReferenceID;
        @XmlElement(name = "SurName")
        protected String surName;
        @XmlElement(name = "AgentSignature")
        protected String agentSignature;
        @XmlElement(name = "PassengerDetailChanges")
        protected PassengerDetailChanges passengerDetailChanges;
        @XmlElement(name = "PNRRemarkChanges")
        protected ArrayOfPNRRemarkChange pnrRemarkChanges;
        @XmlElement(name = "OSIElementChanges")
        protected ArrayOfOSIElementChange osiElementChanges;

        /**
         * Gets the value of the bookingReferenceID property.
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getBookingReferenceID() {
            return bookingReferenceID;
        }

        /**
         * Sets the value of the bookingReferenceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setBookingReferenceID(UniqueIDType value) {
            this.bookingReferenceID = value;
        }

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
         * Gets the value of the agentSignature property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentSignature() {
            return agentSignature;
        }

        /**
         * Sets the value of the agentSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentSignature(String value) {
            this.agentSignature = value;
        }

        /**
         * Gets the value of the passengerDetailChanges property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerDetailChanges }
         *     
         */
        public PassengerDetailChanges getPassengerDetailChanges() {
            return passengerDetailChanges;
        }

        /**
         * Sets the value of the passengerDetailChanges property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerDetailChanges }
         *     
         */
        public void setPassengerDetailChanges(PassengerDetailChanges value) {
            this.passengerDetailChanges = value;
        }

        /**
         * Gets the value of the pnrRemarkChanges property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPNRRemarkChange }
         *     
         */
        public ArrayOfPNRRemarkChange getPNRRemarkChanges() {
            return pnrRemarkChanges;
        }

        /**
         * Sets the value of the pnrRemarkChanges property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPNRRemarkChange }
         *     
         */
        public void setPNRRemarkChanges(ArrayOfPNRRemarkChange value) {
            this.pnrRemarkChanges = value;
        }

        /**
         * Gets the value of the osiElementChanges property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOSIElementChange }
         *     
         */
        public ArrayOfOSIElementChange getOSIElementChanges() {
            return osiElementChanges;
        }

        /**
         * Sets the value of the osiElementChanges property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOSIElementChange }
         *     
         */
        public void setOSIElementChanges(ArrayOfOSIElementChange value) {
            this.osiElementChanges = value;
        }

    }

}
