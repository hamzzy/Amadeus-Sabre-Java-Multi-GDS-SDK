
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSpecialReqDetailsTypeSpecialRemark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSpecialReqDetailsTypeSpecialRemark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialRemark" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}SpecialRemarkType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightLeg" type="{http://epowerv5.amadeus.com.tr/WS}FlightLegType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
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
@XmlType(name = "ArrayOfSpecialReqDetailsTypeSpecialRemark", propOrder = {
    "specialRemark"
})
public class ArrayOfSpecialReqDetailsTypeSpecialRemark {

    @XmlElement(name = "SpecialRemark")
    protected List<ArrayOfSpecialReqDetailsTypeSpecialRemark.SpecialRemark> specialRemark;

    /**
     * Gets the value of the specialRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSpecialReqDetailsTypeSpecialRemark.SpecialRemark }
     * 
     * 
     */
    public List<ArrayOfSpecialReqDetailsTypeSpecialRemark.SpecialRemark> getSpecialRemark() {
        if (specialRemark == null) {
            specialRemark = new ArrayList<ArrayOfSpecialReqDetailsTypeSpecialRemark.SpecialRemark>();
        }
        return this.specialRemark;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}SpecialRemarkType">
     *       &lt;sequence>
     *         &lt;element name="FlightLeg" type="{http://epowerv5.amadeus.com.tr/WS}FlightLegType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightLeg"
    })
    public static class SpecialRemark
        extends SpecialRemarkType
    {

        @XmlElement(name = "FlightLeg")
        protected FlightLegType flightLeg;
        @XmlAttribute(name = "Operation")
        protected ActionType operation;
        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Gets the value of the flightLeg property.
         * 
         * @return
         *     possible object is
         *     {@link FlightLegType }
         *     
         */
        public FlightLegType getFlightLeg() {
            return flightLeg;
        }

        /**
         * Sets the value of the flightLeg property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightLegType }
         *     
         */
        public void setFlightLeg(FlightLegType value) {
            this.flightLeg = value;
        }

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

    }

}
