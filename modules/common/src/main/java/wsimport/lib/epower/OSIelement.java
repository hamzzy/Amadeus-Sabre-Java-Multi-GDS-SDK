
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OSIelement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OSIelement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfAssociatedPassenger" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfAssociatedSegments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSIelement", propOrder = {
    "airlineID",
    "text",
    "subjectQualifier",
    "type",
    "numberOfAssociatedPassenger",
    "numberOfAssociatedSegments",
    "lineNumber"
})
public class OSIelement {

    @XmlElement(name = "AirlineID")
    protected String airlineID;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "SubjectQualifier")
    protected String subjectQualifier;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "NumberOfAssociatedPassenger", required = true, type = Integer.class, nillable = true)
    protected Integer numberOfAssociatedPassenger;
    @XmlElement(name = "NumberOfAssociatedSegments")
    protected String numberOfAssociatedSegments;
    @XmlElement(name = "LineNumber")
    protected int lineNumber;

    /**
     * Gets the value of the airlineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineID() {
        return airlineID;
    }

    /**
     * Sets the value of the airlineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineID(String value) {
        this.airlineID = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the subjectQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectQualifier() {
        return subjectQualifier;
    }

    /**
     * Sets the value of the subjectQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectQualifier(String value) {
        this.subjectQualifier = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the numberOfAssociatedPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfAssociatedPassenger() {
        return numberOfAssociatedPassenger;
    }

    /**
     * Sets the value of the numberOfAssociatedPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfAssociatedPassenger(Integer value) {
        this.numberOfAssociatedPassenger = value;
    }

    /**
     * Gets the value of the numberOfAssociatedSegments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfAssociatedSegments() {
        return numberOfAssociatedSegments;
    }

    /**
     * Sets the value of the numberOfAssociatedSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfAssociatedSegments(String value) {
        this.numberOfAssociatedSegments = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(int value) {
        this.lineNumber = value;
    }

}
