
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOTA_AirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOTA_AirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResBookDesignation" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOTA_AirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation", propOrder = {
    "resBookDesignation"
})
public class ArrayOfOTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation {

    @XmlElement(name = "ResBookDesignation")
    protected List<OTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation> resBookDesignation;

    /**
     * Gets the value of the resBookDesignation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resBookDesignation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResBookDesignation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation }
     * 
     * 
     */
    public List<OTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation> getResBookDesignation() {
        if (resBookDesignation == null) {
            resBookDesignation = new ArrayList<OTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation>();
        }
        return this.resBookDesignation;
    }

}
