
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ByEmail" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ByFax" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification")
public class Notification {

    @XmlAttribute(name = "ByEmail", required = true)
    protected boolean byEmail;
    @XmlAttribute(name = "ByFax", required = true)
    protected boolean byFax;

    /**
     * Gets the value of the byEmail property.
     * 
     */
    public boolean isByEmail() {
        return byEmail;
    }

    /**
     * Sets the value of the byEmail property.
     * 
     */
    public void setByEmail(boolean value) {
        this.byEmail = value;
    }

    /**
     * Gets the value of the byFax property.
     * 
     */
    public boolean isByFax() {
        return byFax;
    }

    /**
     * Sets the value of the byFax property.
     * 
     */
    public void setByFax(boolean value) {
        this.byFax = value;
    }

}
