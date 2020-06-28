
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="RequiredParametersRS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="RequiredParametersData" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="RequiredParametersOnProcessDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCRequiredParameter" minOccurs="0"/>
 *                               &lt;element name="LCCSupportedCardList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCSupportedCard" minOccurs="0"/>
 *                               &lt;element name="LCCBaggageFeeList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
 *                               &lt;element name="OutwardLuggageOptions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
 *                               &lt;element name="ReturnLuggageOptions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
 *                               &lt;element name="LCCHandLuggageFeeList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
 *                               &lt;element name="LCCOtherFeeList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCOtherFee" minOccurs="0"/>
 *                               &lt;element name="LCCCheckInOptionList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCCheckInOption" minOccurs="0"/>
 *                               &lt;element name="LCCRuleLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="BaggageAllowanceNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ItineraryIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *                     &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *                   &lt;/choice>
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
    "requiredParametersRS"
})
@XmlRootElement(name = "GetRequiredParametersForLCCResponse")
public class GetRequiredParametersForLCCResponse {

    @XmlElement(name = "RequiredParametersRS")
    protected GetRequiredParametersForLCCResponse.RequiredParametersRS requiredParametersRS;

    /**
     * Gets the value of the requiredParametersRS property.
     * 
     * @return
     *     possible object is
     *     {@link GetRequiredParametersForLCCResponse.RequiredParametersRS }
     *     
     */
    public GetRequiredParametersForLCCResponse.RequiredParametersRS getRequiredParametersRS() {
        return requiredParametersRS;
    }

    /**
     * Sets the value of the requiredParametersRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRequiredParametersForLCCResponse.RequiredParametersRS }
     *     
     */
    public void setRequiredParametersRS(GetRequiredParametersForLCCResponse.RequiredParametersRS value) {
        this.requiredParametersRS = value;
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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="RequiredParametersData" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="RequiredParametersOnProcessDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCRequiredParameter" minOccurs="0"/>
     *                     &lt;element name="LCCSupportedCardList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCSupportedCard" minOccurs="0"/>
     *                     &lt;element name="LCCBaggageFeeList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
     *                     &lt;element name="OutwardLuggageOptions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
     *                     &lt;element name="ReturnLuggageOptions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
     *                     &lt;element name="LCCHandLuggageFeeList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
     *                     &lt;element name="LCCOtherFeeList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCOtherFee" minOccurs="0"/>
     *                     &lt;element name="LCCCheckInOptionList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCCheckInOption" minOccurs="0"/>
     *                     &lt;element name="LCCRuleLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="BaggageAllowanceNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="ItineraryIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
     *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
     *         &lt;/choice>
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
        "requiredParametersDataOrSuccessOrErrors"
    })
    public static class RequiredParametersRS {

        @XmlElements({
            @XmlElement(name = "RequiredParametersData", type = GetRequiredParametersForLCCResponse.RequiredParametersRS.RequiredParametersData.class),
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "Errors", type = ErrorsType.class)
        })
        protected List<Object> requiredParametersDataOrSuccessOrErrors;

        /**
         * Gets the value of the requiredParametersDataOrSuccessOrErrors property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requiredParametersDataOrSuccessOrErrors property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequiredParametersDataOrSuccessOrErrors().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetRequiredParametersForLCCResponse.RequiredParametersRS.RequiredParametersData }
         * {@link SuccessType }
         * {@link ErrorsType }
         * 
         * 
         */
        public List<Object> getRequiredParametersDataOrSuccessOrErrors() {
            if (requiredParametersDataOrSuccessOrErrors == null) {
                requiredParametersDataOrSuccessOrErrors = new ArrayList<Object>();
            }
            return this.requiredParametersDataOrSuccessOrErrors;
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
         *         &lt;element name="RequiredParametersOnProcessDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCRequiredParameter" minOccurs="0"/>
         *         &lt;element name="LCCSupportedCardList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCSupportedCard" minOccurs="0"/>
         *         &lt;element name="LCCBaggageFeeList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
         *         &lt;element name="OutwardLuggageOptions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
         *         &lt;element name="ReturnLuggageOptions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
         *         &lt;element name="LCCHandLuggageFeeList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCBaggageFee" minOccurs="0"/>
         *         &lt;element name="LCCOtherFeeList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCOtherFee" minOccurs="0"/>
         *         &lt;element name="LCCCheckInOptionList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLCCCheckInOption" minOccurs="0"/>
         *         &lt;element name="LCCRuleLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BaggageAllowanceNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ItineraryIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "requiredParametersOnProcessDetails",
            "lccSupportedCardList",
            "lccBaggageFeeList",
            "outwardLuggageOptions",
            "returnLuggageOptions",
            "lccHandLuggageFeeList",
            "lccOtherFeeList",
            "lccCheckInOptionList",
            "lccRuleLink",
            "baggageAllowanceNote",
            "supplierName",
            "supplierCode"
        })
        public static class RequiredParametersData {

            @XmlElement(name = "RequiredParametersOnProcessDetails")
            protected ArrayOfLCCRequiredParameter requiredParametersOnProcessDetails;
            @XmlElement(name = "LCCSupportedCardList")
            protected ArrayOfLCCSupportedCard lccSupportedCardList;
            @XmlElement(name = "LCCBaggageFeeList")
            protected ArrayOfLCCBaggageFee lccBaggageFeeList;
            @XmlElement(name = "OutwardLuggageOptions")
            protected ArrayOfLCCBaggageFee outwardLuggageOptions;
            @XmlElement(name = "ReturnLuggageOptions")
            protected ArrayOfLCCBaggageFee returnLuggageOptions;
            @XmlElement(name = "LCCHandLuggageFeeList")
            protected ArrayOfLCCBaggageFee lccHandLuggageFeeList;
            @XmlElement(name = "LCCOtherFeeList")
            protected ArrayOfLCCOtherFee lccOtherFeeList;
            @XmlElement(name = "LCCCheckInOptionList")
            protected ArrayOfLCCCheckInOption lccCheckInOptionList;
            @XmlElement(name = "LCCRuleLink")
            protected String lccRuleLink;
            @XmlElement(name = "BaggageAllowanceNote")
            protected String baggageAllowanceNote;
            @XmlElement(name = "SupplierName")
            protected String supplierName;
            @XmlElement(name = "SupplierCode")
            protected String supplierCode;
            @XmlAttribute(name = "ItineraryIndex")
            protected Integer itineraryIndex;

            /**
             * Gets the value of the requiredParametersOnProcessDetails property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfLCCRequiredParameter }
             *     
             */
            public ArrayOfLCCRequiredParameter getRequiredParametersOnProcessDetails() {
                return requiredParametersOnProcessDetails;
            }

            /**
             * Sets the value of the requiredParametersOnProcessDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfLCCRequiredParameter }
             *     
             */
            public void setRequiredParametersOnProcessDetails(ArrayOfLCCRequiredParameter value) {
                this.requiredParametersOnProcessDetails = value;
            }

            /**
             * Gets the value of the lccSupportedCardList property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfLCCSupportedCard }
             *     
             */
            public ArrayOfLCCSupportedCard getLCCSupportedCardList() {
                return lccSupportedCardList;
            }

            /**
             * Sets the value of the lccSupportedCardList property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfLCCSupportedCard }
             *     
             */
            public void setLCCSupportedCardList(ArrayOfLCCSupportedCard value) {
                this.lccSupportedCardList = value;
            }

            /**
             * Gets the value of the lccBaggageFeeList property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfLCCBaggageFee }
             *     
             */
            public ArrayOfLCCBaggageFee getLCCBaggageFeeList() {
                return lccBaggageFeeList;
            }

            /**
             * Sets the value of the lccBaggageFeeList property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfLCCBaggageFee }
             *     
             */
            public void setLCCBaggageFeeList(ArrayOfLCCBaggageFee value) {
                this.lccBaggageFeeList = value;
            }

            /**
             * Gets the value of the outwardLuggageOptions property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfLCCBaggageFee }
             *     
             */
            public ArrayOfLCCBaggageFee getOutwardLuggageOptions() {
                return outwardLuggageOptions;
            }

            /**
             * Sets the value of the outwardLuggageOptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfLCCBaggageFee }
             *     
             */
            public void setOutwardLuggageOptions(ArrayOfLCCBaggageFee value) {
                this.outwardLuggageOptions = value;
            }

            /**
             * Gets the value of the returnLuggageOptions property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfLCCBaggageFee }
             *     
             */
            public ArrayOfLCCBaggageFee getReturnLuggageOptions() {
                return returnLuggageOptions;
            }

            /**
             * Sets the value of the returnLuggageOptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfLCCBaggageFee }
             *     
             */
            public void setReturnLuggageOptions(ArrayOfLCCBaggageFee value) {
                this.returnLuggageOptions = value;
            }

            /**
             * Gets the value of the lccHandLuggageFeeList property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfLCCBaggageFee }
             *     
             */
            public ArrayOfLCCBaggageFee getLCCHandLuggageFeeList() {
                return lccHandLuggageFeeList;
            }

            /**
             * Sets the value of the lccHandLuggageFeeList property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfLCCBaggageFee }
             *     
             */
            public void setLCCHandLuggageFeeList(ArrayOfLCCBaggageFee value) {
                this.lccHandLuggageFeeList = value;
            }

            /**
             * Gets the value of the lccOtherFeeList property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfLCCOtherFee }
             *     
             */
            public ArrayOfLCCOtherFee getLCCOtherFeeList() {
                return lccOtherFeeList;
            }

            /**
             * Sets the value of the lccOtherFeeList property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfLCCOtherFee }
             *     
             */
            public void setLCCOtherFeeList(ArrayOfLCCOtherFee value) {
                this.lccOtherFeeList = value;
            }

            /**
             * Gets the value of the lccCheckInOptionList property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfLCCCheckInOption }
             *     
             */
            public ArrayOfLCCCheckInOption getLCCCheckInOptionList() {
                return lccCheckInOptionList;
            }

            /**
             * Sets the value of the lccCheckInOptionList property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfLCCCheckInOption }
             *     
             */
            public void setLCCCheckInOptionList(ArrayOfLCCCheckInOption value) {
                this.lccCheckInOptionList = value;
            }

            /**
             * Gets the value of the lccRuleLink property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLCCRuleLink() {
                return lccRuleLink;
            }

            /**
             * Sets the value of the lccRuleLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLCCRuleLink(String value) {
                this.lccRuleLink = value;
            }

            /**
             * Gets the value of the baggageAllowanceNote property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBaggageAllowanceNote() {
                return baggageAllowanceNote;
            }

            /**
             * Sets the value of the baggageAllowanceNote property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaggageAllowanceNote(String value) {
                this.baggageAllowanceNote = value;
            }

            /**
             * Gets the value of the supplierName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplierName() {
                return supplierName;
            }

            /**
             * Sets the value of the supplierName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplierName(String value) {
                this.supplierName = value;
            }

            /**
             * Gets the value of the supplierCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplierCode() {
                return supplierCode;
            }

            /**
             * Sets the value of the supplierCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplierCode(String value) {
                this.supplierCode = value;
            }

            /**
             * Gets the value of the itineraryIndex property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getItineraryIndex() {
                return itineraryIndex;
            }

            /**
             * Sets the value of the itineraryIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setItineraryIndex(Integer value) {
                this.itineraryIndex = value;
            }

        }

    }

}
