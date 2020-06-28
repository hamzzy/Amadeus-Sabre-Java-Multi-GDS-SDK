
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirTraveler" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirTravelerType">
 *                 &lt;sequence>
 *                   &lt;element name="OSIMessage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Comment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="eTicketDocument" type="{http://epowerv5.amadeus.com.tr/WS}ETicketInfo" minOccurs="0"/>
 *                   &lt;element name="eTicketDocuments" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfETicketInfo" minOccurs="0"/>
 *                   &lt;element name="ETicketURLs" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ETicketURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AncillaryProducts" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryProductsType" minOccurs="0"/>
 *                   &lt;element name="FreeBaggageAllowance" type="{http://epowerv5.amadeus.com.tr/WS}FreeBaggageAllowancesTypes" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialReqDetails" type="{http://epowerv5.amadeus.com.tr/WS}SpecialReqDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerInfoType", propOrder = {
    "airTraveler",
    "specialReqDetails"
})
public class TravelerInfoType {

    @XmlElement(name = "AirTraveler")
    protected List<TravelerInfoType.AirTraveler> airTraveler;
    @XmlElement(name = "SpecialReqDetails")
    protected List<SpecialReqDetailsType> specialReqDetails;

    /**
     * Gets the value of the airTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInfoType.AirTraveler }
     * 
     * 
     */
    public List<TravelerInfoType.AirTraveler> getAirTraveler() {
        if (airTraveler == null) {
            airTraveler = new ArrayList<TravelerInfoType.AirTraveler>();
        }
        return this.airTraveler;
    }

    /**
     * Gets the value of the specialReqDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialReqDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialReqDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialReqDetailsType }
     * 
     * 
     */
    public List<SpecialReqDetailsType> getSpecialReqDetails() {
        if (specialReqDetails == null) {
            specialReqDetails = new ArrayList<SpecialReqDetailsType>();
        }
        return this.specialReqDetails;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirTravelerType">
     *       &lt;sequence>
     *         &lt;element name="OSIMessage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Comment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="eTicketDocument" type="{http://epowerv5.amadeus.com.tr/WS}ETicketInfo" minOccurs="0"/>
     *         &lt;element name="eTicketDocuments" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfETicketInfo" minOccurs="0"/>
     *         &lt;element name="ETicketURLs" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ETicketURL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AncillaryProducts" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryProductsType" minOccurs="0"/>
     *         &lt;element name="FreeBaggageAllowance" type="{http://epowerv5.amadeus.com.tr/WS}FreeBaggageAllowancesTypes" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "osiMessage",
        "comment",
        "eTicketDocument",
        "eTicketDocuments",
        "eTicketURLs",
        "ancillaryProducts",
        "freeBaggageAllowance"
    })
    public static class AirTraveler
        extends AirTravelerType
    {

        @XmlElement(name = "OSIMessage")
        protected List<String> osiMessage;
        @XmlElement(name = "Comment")
        protected List<TravelerInfoType.AirTraveler.Comment> comment;
        protected ETicketInfo eTicketDocument;
        protected ArrayOfETicketInfo eTicketDocuments;
        @XmlElement(name = "ETicketURLs")
        protected List<TravelerInfoType.AirTraveler.ETicketURLs> eTicketURLs;
        @XmlElement(name = "AncillaryProducts")
        protected AncillaryProductsType ancillaryProducts;
        @XmlElement(name = "FreeBaggageAllowance")
        protected FreeBaggageAllowancesTypes freeBaggageAllowance;
        @XmlAttribute(name = "eTicketNumber")
        protected String eTicketNumber;

        /**
         * Gets the value of the osiMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the osiMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOSIMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOSIMessage() {
            if (osiMessage == null) {
                osiMessage = new ArrayList<String>();
            }
            return this.osiMessage;
        }

        /**
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelerInfoType.AirTraveler.Comment }
         * 
         * 
         */
        public List<TravelerInfoType.AirTraveler.Comment> getComment() {
            if (comment == null) {
                comment = new ArrayList<TravelerInfoType.AirTraveler.Comment>();
            }
            return this.comment;
        }

        /**
         * Gets the value of the eTicketDocument property.
         * 
         * @return
         *     possible object is
         *     {@link ETicketInfo }
         *     
         */
        public ETicketInfo getETicketDocument() {
            return eTicketDocument;
        }

        /**
         * Sets the value of the eTicketDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link ETicketInfo }
         *     
         */
        public void setETicketDocument(ETicketInfo value) {
            this.eTicketDocument = value;
        }

        /**
         * Gets the value of the eTicketDocuments property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfETicketInfo }
         *     
         */
        public ArrayOfETicketInfo getETicketDocuments() {
            return eTicketDocuments;
        }

        /**
         * Sets the value of the eTicketDocuments property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfETicketInfo }
         *     
         */
        public void setETicketDocuments(ArrayOfETicketInfo value) {
            this.eTicketDocuments = value;
        }

        /**
         * Gets the value of the eTicketURLs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eTicketURLs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETicketURLs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelerInfoType.AirTraveler.ETicketURLs }
         * 
         * 
         */
        public List<TravelerInfoType.AirTraveler.ETicketURLs> getETicketURLs() {
            if (eTicketURLs == null) {
                eTicketURLs = new ArrayList<TravelerInfoType.AirTraveler.ETicketURLs>();
            }
            return this.eTicketURLs;
        }

        /**
         * Gets the value of the ancillaryProducts property.
         * 
         * @return
         *     possible object is
         *     {@link AncillaryProductsType }
         *     
         */
        public AncillaryProductsType getAncillaryProducts() {
            return ancillaryProducts;
        }

        /**
         * Sets the value of the ancillaryProducts property.
         * 
         * @param value
         *     allowed object is
         *     {@link AncillaryProductsType }
         *     
         */
        public void setAncillaryProducts(AncillaryProductsType value) {
            this.ancillaryProducts = value;
        }

        /**
         * Gets the value of the freeBaggageAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link FreeBaggageAllowancesTypes }
         *     
         */
        public FreeBaggageAllowancesTypes getFreeBaggageAllowance() {
            return freeBaggageAllowance;
        }

        /**
         * Sets the value of the freeBaggageAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeBaggageAllowancesTypes }
         *     
         */
        public void setFreeBaggageAllowance(FreeBaggageAllowancesTypes value) {
            this.freeBaggageAllowance = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Comment
            extends FormattedTextTextType
        {

            @XmlAttribute(name = "Name")
            protected String name;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

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
         *       &lt;attribute name="ETicketURL" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ETicketURLs {

            @XmlAttribute(name = "ETicketURL")
            protected String eTicketURL;
            @XmlAttribute(name = "ProviderType")
            protected String providerType;

            /**
             * Gets the value of the eTicketURL property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getETicketURL() {
                return eTicketURL;
            }

            /**
             * Sets the value of the eTicketURL property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setETicketURL(String value) {
                this.eTicketURL = value;
            }

            /**
             * Gets the value of the providerType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderType() {
                return providerType;
            }

            /**
             * Sets the value of the providerType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderType(String value) {
                this.providerType = value;
            }

        }

    }

}
