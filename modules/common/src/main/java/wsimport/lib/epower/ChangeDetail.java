
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialRequests" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSpecialRequestChange" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *         &lt;element name="Document" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}DocumentType">
 *                 &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ChangeDetailAction" use="required" type="{http://epowerv5.amadeus.com.tr/WS}ChangeDetailActionTypes" />
 *       &lt;attribute name="SegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeDetail", propOrder = {
    "specialRequests",
    "personName",
    "document"
})
public class ChangeDetail {

    @XmlElement(name = "SpecialRequests")
    protected ArrayOfSpecialRequestChange specialRequests;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "Document")
    protected ChangeDetail.Document document;
    @XmlAttribute(name = "ChangeDetailAction", required = true)
    protected ChangeDetailActionTypes changeDetailAction;
    @XmlAttribute(name = "SegmentIndex")
    protected Integer segmentIndex;

    /**
     * Gets the value of the specialRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialRequestChange }
     *     
     */
    public ArrayOfSpecialRequestChange getSpecialRequests() {
        return specialRequests;
    }

    /**
     * Sets the value of the specialRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialRequestChange }
     *     
     */
    public void setSpecialRequests(ArrayOfSpecialRequestChange value) {
        this.specialRequests = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeDetail.Document }
     *     
     */
    public ChangeDetail.Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeDetail.Document }
     *     
     */
    public void setDocument(ChangeDetail.Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the changeDetailAction property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeDetailActionTypes }
     *     
     */
    public ChangeDetailActionTypes getChangeDetailAction() {
        return changeDetailAction;
    }

    /**
     * Sets the value of the changeDetailAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeDetailActionTypes }
     *     
     */
    public void setChangeDetailAction(ChangeDetailActionTypes value) {
        this.changeDetailAction = value;
    }

    /**
     * Gets the value of the segmentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentIndex() {
        return segmentIndex;
    }

    /**
     * Sets the value of the segmentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentIndex(Integer value) {
        this.segmentIndex = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}DocumentType">
     *       &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Document
        extends DocumentType
    {

        @XmlAttribute(name = "Operation")
        protected ActionType operation;

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setOperation(ActionType value) {
            this.operation = value;
        }

    }

}
