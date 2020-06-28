
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="LastTicketingDateRS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *                     &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *                     &lt;element name="LastTicketingDateData" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLastTicketingDateData" minOccurs="0"/>
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
    "lastTicketingDateRS"
})
@XmlRootElement(name = "GetLastTicketingDateResponse")
public class GetLastTicketingDateResponse {

    @XmlElement(name = "LastTicketingDateRS")
    protected GetLastTicketingDateResponse.LastTicketingDateRS lastTicketingDateRS;

    /**
     * Gets the value of the lastTicketingDateRS property.
     * 
     * @return
     *     possible object is
     *     {@link GetLastTicketingDateResponse.LastTicketingDateRS }
     *     
     */
    public GetLastTicketingDateResponse.LastTicketingDateRS getLastTicketingDateRS() {
        return lastTicketingDateRS;
    }

    /**
     * Sets the value of the lastTicketingDateRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLastTicketingDateResponse.LastTicketingDateRS }
     *     
     */
    public void setLastTicketingDateRS(GetLastTicketingDateResponse.LastTicketingDateRS value) {
        this.lastTicketingDateRS = value;
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
     *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
     *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
     *           &lt;element name="LastTicketingDateData" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfLastTicketingDateData" minOccurs="0"/>
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
        "successOrErrorsOrLastTicketingDateData"
    })
    public static class LastTicketingDateRS {

        @XmlElements({
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "LastTicketingDateData", type = ArrayOfLastTicketingDateData.class)
        })
        protected List<Object> successOrErrorsOrLastTicketingDateData;

        /**
         * Gets the value of the successOrErrorsOrLastTicketingDateData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the successOrErrorsOrLastTicketingDateData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuccessOrErrorsOrLastTicketingDateData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuccessType }
         * {@link ErrorsType }
         * {@link ArrayOfLastTicketingDateData }
         * 
         * 
         */
        public List<Object> getSuccessOrErrorsOrLastTicketingDateData() {
            if (successOrErrorsOrLastTicketingDateData == null) {
                successOrErrorsOrLastTicketingDateData = new ArrayList<Object>();
            }
            return this.successOrErrorsOrLastTicketingDateData;
        }

    }

}
