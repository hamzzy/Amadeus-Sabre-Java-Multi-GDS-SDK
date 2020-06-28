
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_HotelAvailRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_HotelAvailRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="HotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_HotelAvailRQ")
public class OTAHotelAvailRQ {

    @XmlAttribute(name = "HotelID", required = true)
    protected int hotelID;

    /**
     * Gets the value of the hotelID property.
     * 
     */
    public int getHotelID() {
        return hotelID;
    }

    /**
     * Sets the value of the hotelID property.
     * 
     */
    public void setHotelID(int value) {
        this.hotelID = value;
    }

}
