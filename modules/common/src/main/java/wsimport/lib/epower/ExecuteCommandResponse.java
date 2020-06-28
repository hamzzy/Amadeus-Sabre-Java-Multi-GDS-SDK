
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
 *         &lt;element name="AmadeusAPICommandRS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *                     &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
 *                     &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Result" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "amadeusAPICommandRS"
})
@XmlRootElement(name = "ExecuteCommandResponse")
public class ExecuteCommandResponse {

    @XmlElement(name = "AmadeusAPICommandRS")
    protected ExecuteCommandResponse.AmadeusAPICommandRS amadeusAPICommandRS;

    /**
     * Gets the value of the amadeusAPICommandRS property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteCommandResponse.AmadeusAPICommandRS }
     *     
     */
    public ExecuteCommandResponse.AmadeusAPICommandRS getAmadeusAPICommandRS() {
        return amadeusAPICommandRS;
    }

    /**
     * Sets the value of the amadeusAPICommandRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteCommandResponse.AmadeusAPICommandRS }
     *     
     */
    public void setAmadeusAPICommandRS(ExecuteCommandResponse.AmadeusAPICommandRS value) {
        this.amadeusAPICommandRS = value;
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
     *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
     *           &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
     *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="Result" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "errorsOrWarningsOrSuccess"
    })
    public static class AmadeusAPICommandRS {

        @XmlElements({
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "Warnings", type = WarningsType.class),
            @XmlElement(name = "Success", type = SuccessType.class)
        })
        protected List<Object> errorsOrWarningsOrSuccess;
        @XmlAttribute(name = "Result")
        protected String result;

        /**
         * Gets the value of the errorsOrWarningsOrSuccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the errorsOrWarningsOrSuccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErrorsOrWarningsOrSuccess().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ErrorsType }
         * {@link WarningsType }
         * {@link SuccessType }
         * 
         * 
         */
        public List<Object> getErrorsOrWarningsOrSuccess() {
            if (errorsOrWarningsOrSuccess == null) {
                errorsOrWarningsOrSuccess = new ArrayList<Object>();
            }
            return this.errorsOrWarningsOrSuccess;
        }

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResult(String value) {
            this.result = value;
        }

    }

}
