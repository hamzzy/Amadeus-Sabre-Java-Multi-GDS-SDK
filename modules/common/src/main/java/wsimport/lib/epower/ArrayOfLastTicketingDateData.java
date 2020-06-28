
package wsimport.lib.epower;

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
 * <p>Java class for ArrayOfLastTicketingDateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLastTicketingDateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastTicketingDateData" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="PnrNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OldLastTicketingDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="LastTicketingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
@XmlType(name = "ArrayOfLastTicketingDateData", propOrder = {
    "lastTicketingDateData"
})
public class ArrayOfLastTicketingDateData {

    @XmlElement(name = "LastTicketingDateData", nillable = true)
    protected List<ArrayOfLastTicketingDateData.LastTicketingDateData> lastTicketingDateData;

    /**
     * Gets the value of the lastTicketingDateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastTicketingDateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastTicketingDateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfLastTicketingDateData.LastTicketingDateData }
     * 
     * 
     */
    public List<ArrayOfLastTicketingDateData.LastTicketingDateData> getLastTicketingDateData() {
        if (lastTicketingDateData == null) {
            lastTicketingDateData = new ArrayList<ArrayOfLastTicketingDateData.LastTicketingDateData>();
        }
        return this.lastTicketingDateData;
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
     *       &lt;attribute name="PnrNo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OldLastTicketingDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="LastTicketingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LastTicketingDateData {

        @XmlAttribute(name = "PnrNo")
        protected String pnrNo;
        @XmlAttribute(name = "OldLastTicketingDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar oldLastTicketingDate;
        @XmlAttribute(name = "LastTicketingDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastTicketingDate;

        /**
         * Gets the value of the pnrNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPnrNo() {
            return pnrNo;
        }

        /**
         * Sets the value of the pnrNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPnrNo(String value) {
            this.pnrNo = value;
        }

        /**
         * Gets the value of the oldLastTicketingDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOldLastTicketingDate() {
            return oldLastTicketingDate;
        }

        /**
         * Sets the value of the oldLastTicketingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOldLastTicketingDate(XMLGregorianCalendar value) {
            this.oldLastTicketingDate = value;
        }

        /**
         * Gets the value of the lastTicketingDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastTicketingDate() {
            return lastTicketingDate;
        }

        /**
         * Sets the value of the lastTicketingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastTicketingDate(XMLGregorianCalendar value) {
            this.lastTicketingDate = value;
        }

    }

}
