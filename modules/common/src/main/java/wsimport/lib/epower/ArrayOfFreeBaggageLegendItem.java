
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFreeBaggageLegendItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFreeBaggageLegendItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Baggage" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfFreeBaggageLegendItem", propOrder = {
    "baggage"
})
public class ArrayOfFreeBaggageLegendItem {

    @XmlElement(name = "Baggage")
    protected List<ArrayOfFreeBaggageLegendItem.Baggage> baggage;

    /**
     * Gets the value of the baggage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfFreeBaggageLegendItem.Baggage }
     * 
     * 
     */
    public List<ArrayOfFreeBaggageLegendItem.Baggage> getBaggage() {
        if (baggage == null) {
            baggage = new ArrayList<ArrayOfFreeBaggageLegendItem.Baggage>();
        }
        return this.baggage;
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
     *       &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Baggage {

        @XmlAttribute(name = "Index", required = true)
        protected int index;
        @XmlAttribute(name = "Quantity")
        protected String quantity;
        @XmlAttribute(name = "Unit")
        protected String unit;

        /**
         * Gets the value of the index property.
         * 
         */
        public int getIndex() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         */
        public void setIndex(int value) {
            this.index = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantity(String value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

    }

}
