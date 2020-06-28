
package wsimport.lib.amadeus.wstravelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryModification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryModification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FlightRefNumberRPHList" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Allowed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryModification")
public class ItineraryModification {

    @XmlAttribute(name = "FlightRefNumberRPHList", required = true)
    protected int flightRefNumberRPHList;
    @XmlAttribute(name = "Allowed", required = true)
    protected boolean allowed;

    /**
     * Gets the value of the flightRefNumberRPHList property.
     * 
     */
    public int getFlightRefNumberRPHList() {
        return flightRefNumberRPHList;
    }

    /**
     * Sets the value of the flightRefNumberRPHList property.
     * 
     */
    public void setFlightRefNumberRPHList(int value) {
        this.flightRefNumberRPHList = value;
    }

    /**
     * Gets the value of the allowed property.
     * 
     */
    public boolean isAllowed() {
        return allowed;
    }

    /**
     * Sets the value of the allowed property.
     * 
     */
    public void setAllowed(boolean value) {
        this.allowed = value;
    }

}
