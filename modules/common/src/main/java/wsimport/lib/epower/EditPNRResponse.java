
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
 *         &lt;element name="EditPnrRS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AirReservation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirReservationType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *                     &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *                     &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
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
    "editPnrRS"
})
@XmlRootElement(name = "EditPNRResponse")
public class EditPNRResponse {

    @XmlElement(name = "EditPnrRS")
    protected EditPNRResponse.EditPnrRS editPnrRS;

    /**
     * Gets the value of the editPnrRS property.
     * 
     * @return
     *     possible object is
     *     {@link EditPNRResponse.EditPnrRS }
     *     
     */
    public EditPNRResponse.EditPnrRS getEditPnrRS() {
        return editPnrRS;
    }

    /**
     * Sets the value of the editPnrRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditPNRResponse.EditPnrRS }
     *     
     */
    public void setEditPnrRS(EditPNRResponse.EditPnrRS value) {
        this.editPnrRS = value;
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
     *         &lt;element name="AirReservation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirReservationType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
     *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
     *           &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
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
        "airReservation",
        "successOrErrorsOrWarnings"
    })
    public static class EditPnrRS {

        @XmlElement(name = "AirReservation")
        protected EditPNRResponse.EditPnrRS.AirReservation airReservation;
        @XmlElements({
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "Warnings", type = WarningsType.class)
        })
        protected List<Object> successOrErrorsOrWarnings;

        /**
         * Gets the value of the airReservation property.
         * 
         * @return
         *     possible object is
         *     {@link EditPNRResponse.EditPnrRS.AirReservation }
         *     
         */
        public EditPNRResponse.EditPnrRS.AirReservation getAirReservation() {
            return airReservation;
        }

        /**
         * Sets the value of the airReservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link EditPNRResponse.EditPnrRS.AirReservation }
         *     
         */
        public void setAirReservation(EditPNRResponse.EditPnrRS.AirReservation value) {
            this.airReservation = value;
        }

        /**
         * Gets the value of the successOrErrorsOrWarnings property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the successOrErrorsOrWarnings property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuccessOrErrorsOrWarnings().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuccessType }
         * {@link ErrorsType }
         * {@link WarningsType }
         * 
         * 
         */
        public List<Object> getSuccessOrErrorsOrWarnings() {
            if (successOrErrorsOrWarnings == null) {
                successOrErrorsOrWarnings = new ArrayList<Object>();
            }
            return this.successOrErrorsOrWarnings;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirReservationType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AirReservation
            extends AirReservationType
        {


        }

    }

}
