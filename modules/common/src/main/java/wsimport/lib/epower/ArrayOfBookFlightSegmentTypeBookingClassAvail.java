
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBookFlightSegmentTypeBookingClassAvail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBookFlightSegmentTypeBookingClassAvail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingClassAvail" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ResBookDesigQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ResBookDesigStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AvailablePTC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ResBookDesigCabinCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfBookFlightSegmentTypeBookingClassAvail", propOrder = {
    "bookingClassAvail"
})
public class ArrayOfBookFlightSegmentTypeBookingClassAvail {

    @XmlElement(name = "BookingClassAvail")
    protected List<ArrayOfBookFlightSegmentTypeBookingClassAvail.BookingClassAvail> bookingClassAvail;

    /**
     * Gets the value of the bookingClassAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfBookFlightSegmentTypeBookingClassAvail.BookingClassAvail }
     * 
     * 
     */
    public List<ArrayOfBookFlightSegmentTypeBookingClassAvail.BookingClassAvail> getBookingClassAvail() {
        if (bookingClassAvail == null) {
            bookingClassAvail = new ArrayList<ArrayOfBookFlightSegmentTypeBookingClassAvail.BookingClassAvail>();
        }
        return this.bookingClassAvail;
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
     *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResBookDesigQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResBookDesigStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AvailablePTC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResBookDesigCabinCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BookingClassAvail {

        @XmlAttribute(name = "ResBookDesigCode")
        protected String resBookDesigCode;
        @XmlAttribute(name = "ResBookDesigQuantity")
        protected String resBookDesigQuantity;
        @XmlAttribute(name = "ResBookDesigStatusCode")
        protected String resBookDesigStatusCode;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "AvailablePTC")
        protected String availablePTC;
        @XmlAttribute(name = "ResBookDesigCabinCode")
        protected String resBookDesigCabinCode;
        @XmlAttribute(name = "FareBasis")
        protected String fareBasis;

        /**
         * Gets the value of the resBookDesigCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigCode() {
            return resBookDesigCode;
        }

        /**
         * Sets the value of the resBookDesigCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigCode(String value) {
            this.resBookDesigCode = value;
        }

        /**
         * Gets the value of the resBookDesigQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigQuantity() {
            return resBookDesigQuantity;
        }

        /**
         * Sets the value of the resBookDesigQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigQuantity(String value) {
            this.resBookDesigQuantity = value;
        }

        /**
         * Gets the value of the resBookDesigStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigStatusCode() {
            return resBookDesigStatusCode;
        }

        /**
         * Sets the value of the resBookDesigStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigStatusCode(String value) {
            this.resBookDesigStatusCode = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the availablePTC property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvailablePTC() {
            return availablePTC;
        }

        /**
         * Sets the value of the availablePTC property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvailablePTC(String value) {
            this.availablePTC = value;
        }

        /**
         * Gets the value of the resBookDesigCabinCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigCabinCode() {
            return resBookDesigCabinCode;
        }

        /**
         * Sets the value of the resBookDesigCabinCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigCabinCode(String value) {
            this.resBookDesigCabinCode = value;
        }

        /**
         * Gets the value of the fareBasis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareBasis() {
            return fareBasis;
        }

        /**
         * Sets the value of the fareBasis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareBasis(String value) {
            this.fareBasis = value;
        }

    }

}
