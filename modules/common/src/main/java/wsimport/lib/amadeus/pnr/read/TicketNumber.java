
package wsimport.lib.amadeus.pnr.read;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TicketNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketAdvisory" type="{http://traveltalk.com/wsPNRRead}TicketAdvisory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TicketTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="TicketType" use="required" type="{http://traveltalk.com/wsPNRRead}TicketNumberTicketType" />
 *       &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketNumber", propOrder = {
    "ticketAdvisory"
})
public class TicketNumber {

    @XmlElement(name = "TicketAdvisory")
    protected List<TicketAdvisory> ticketAdvisory;
    @XmlAttribute(name = "TicketTimeLimit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ticketTimeLimit;
    @XmlAttribute(name = "TicketType", required = true)
    protected TicketNumberTicketType ticketType;
    @XmlAttribute(name = "eTicketNumber")
    protected String eTicketNumber;

    /**
     * Gets the value of the ticketAdvisory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketAdvisory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketAdvisory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketAdvisory }
     * 
     * 
     */
    public List<TicketAdvisory> getTicketAdvisory() {
        if (ticketAdvisory == null) {
            ticketAdvisory = new ArrayList<TicketAdvisory>();
        }
        return this.ticketAdvisory;
    }

    /**
     * Gets the value of the ticketTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketTimeLimit() {
        return ticketTimeLimit;
    }

    /**
     * Sets the value of the ticketTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketTimeLimit(XMLGregorianCalendar value) {
        this.ticketTimeLimit = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link TicketNumberTicketType }
     *     
     */
    public TicketNumberTicketType getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketNumberTicketType }
     *     
     */
    public void setTicketType(TicketNumberTicketType value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the eTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketNumber() {
        return eTicketNumber;
    }

    /**
     * Sets the value of the eTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketNumber(String value) {
        this.eTicketNumber = value;
    }

}
