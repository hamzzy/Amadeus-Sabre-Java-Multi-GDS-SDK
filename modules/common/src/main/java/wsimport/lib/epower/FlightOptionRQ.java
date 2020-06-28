
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightOptionRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightOptionRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}GenericFlightRQ">
 *       &lt;attribute name="DirectionId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightOptionRQ")
public class FlightOptionRQ
    extends GenericFlightRQ
{

    @XmlAttribute(name = "DirectionId", required = true)
    protected int directionId;

    /**
     * Gets the value of the directionId property.
     * 
     */
    public int getDirectionId() {
        return directionId;
    }

    /**
     * Sets the value of the directionId property.
     * 
     */
    public void setDirectionId(int value) {
        this.directionId = value;
    }

}
