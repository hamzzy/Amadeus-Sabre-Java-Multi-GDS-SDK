
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPTCFareBreakdownTypeTicketDesignator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPTCFareBreakdownTypeTicketDesignator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketDesignator" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FlightRefRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TicketDesignatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TicketDesignatorExtension" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfPTCFareBreakdownTypeTicketDesignator", propOrder = {
    "ticketDesignator"
})
public class ArrayOfPTCFareBreakdownTypeTicketDesignator {

    @XmlElement(name = "TicketDesignator")
    protected List<ArrayOfPTCFareBreakdownTypeTicketDesignator.TicketDesignator> ticketDesignator;

    /**
     * Gets the value of the ticketDesignator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDesignator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDesignator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfPTCFareBreakdownTypeTicketDesignator.TicketDesignator }
     * 
     * 
     */
    public List<ArrayOfPTCFareBreakdownTypeTicketDesignator.TicketDesignator> getTicketDesignator() {
        if (ticketDesignator == null) {
            ticketDesignator = new ArrayList<ArrayOfPTCFareBreakdownTypeTicketDesignator.TicketDesignator>();
        }
        return this.ticketDesignator;
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
     *       &lt;attribute name="FlightRefRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TicketDesignatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TicketDesignatorExtension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TicketDesignator {

        @XmlAttribute(name = "FlightRefRPH")
        protected String flightRefRPH;
        @XmlAttribute(name = "TicketDesignatorCode")
        protected String ticketDesignatorCode;
        @XmlAttribute(name = "TicketDesignatorExtension")
        protected String ticketDesignatorExtension;

        /**
         * Gets the value of the flightRefRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightRefRPH() {
            return flightRefRPH;
        }

        /**
         * Sets the value of the flightRefRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightRefRPH(String value) {
            this.flightRefRPH = value;
        }

        /**
         * Gets the value of the ticketDesignatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDesignatorCode() {
            return ticketDesignatorCode;
        }

        /**
         * Sets the value of the ticketDesignatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDesignatorCode(String value) {
            this.ticketDesignatorCode = value;
        }

        /**
         * Gets the value of the ticketDesignatorExtension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDesignatorExtension() {
            return ticketDesignatorExtension;
        }

        /**
         * Sets the value of the ticketDesignatorExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDesignatorExtension(String value) {
            this.ticketDesignatorExtension = value;
        }

    }

}
