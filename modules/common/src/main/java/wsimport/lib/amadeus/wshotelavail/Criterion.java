
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Criterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Criterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position" type="{http://traveltalk.com/wsHotelAvail}Position" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://traveltalk.com/wsHotelAvail}Address" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://traveltalk.com/wsHotelAvail}Telephone" minOccurs="0"/>
 *         &lt;element name="RefPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeRef" type="{http://traveltalk.com/wsHotelAvail}CodeRef" minOccurs="0"/>
 *         &lt;element name="HotelRef" type="{http://traveltalk.com/wsHotelAvail}HotelRef" minOccurs="0"/>
 *         &lt;element name="Radius" type="{http://traveltalk.com/wsHotelAvail}Radius" minOccurs="0"/>
 *         &lt;element name="HotelAmenity" type="{http://traveltalk.com/wsHotelAvail}HotelAmenity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Award" type="{http://traveltalk.com/wsHotelAvail}Award" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ExactMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ImportanceType" type="{http://traveltalk.com/wsHotelAvail}CriterionImportanceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Criterion", propOrder = {
    "position",
    "address",
    "telephone",
    "refPoint",
    "codeRef",
    "hotelRef",
    "radius",
    "hotelAmenity",
    "award"
})
public class Criterion {

    @XmlElement(name = "Position")
    protected Position position;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "Telephone")
    protected Telephone telephone;
    @XmlElement(name = "RefPoint")
    protected String refPoint;
    @XmlElement(name = "CodeRef")
    protected CodeRef codeRef;
    @XmlElement(name = "HotelRef")
    protected HotelRef hotelRef;
    @XmlElement(name = "Radius")
    protected Radius radius;
    @XmlElement(name = "HotelAmenity")
    protected List<HotelAmenity> hotelAmenity;
    @XmlElement(name = "Award")
    protected List<Award> award;
    @XmlAttribute(name = "ExactMatch")
    protected Boolean exactMatch;
    @XmlAttribute(name = "ImportanceType")
    protected CriterionImportanceType importanceType;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link Telephone }
     *     
     */
    public Telephone getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telephone }
     *     
     */
    public void setTelephone(Telephone value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the refPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPoint() {
        return refPoint;
    }

    /**
     * Sets the value of the refPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefPoint(String value) {
        this.refPoint = value;
    }

    /**
     * Gets the value of the codeRef property.
     * 
     * @return
     *     possible object is
     *     {@link CodeRef }
     *     
     */
    public CodeRef getCodeRef() {
        return codeRef;
    }

    /**
     * Sets the value of the codeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeRef }
     *     
     */
    public void setCodeRef(CodeRef value) {
        this.codeRef = value;
    }

    /**
     * Gets the value of the hotelRef property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRef }
     *     
     */
    public HotelRef getHotelRef() {
        return hotelRef;
    }

    /**
     * Sets the value of the hotelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRef }
     *     
     */
    public void setHotelRef(HotelRef value) {
        this.hotelRef = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Radius }
     *     
     */
    public Radius getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Radius }
     *     
     */
    public void setRadius(Radius value) {
        this.radius = value;
    }

    /**
     * Gets the value of the hotelAmenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelAmenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelAmenity }
     * 
     * 
     */
    public List<HotelAmenity> getHotelAmenity() {
        if (hotelAmenity == null) {
            hotelAmenity = new ArrayList<HotelAmenity>();
        }
        return this.hotelAmenity;
    }

    /**
     * Gets the value of the award property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Award }
     * 
     * 
     */
    public List<Award> getAward() {
        if (award == null) {
            award = new ArrayList<Award>();
        }
        return this.award;
    }

    /**
     * Gets the value of the exactMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExactMatch() {
        return exactMatch;
    }

    /**
     * Sets the value of the exactMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExactMatch(Boolean value) {
        this.exactMatch = value;
    }

    /**
     * Gets the value of the importanceType property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionImportanceType }
     *     
     */
    public CriterionImportanceType getImportanceType() {
        return importanceType;
    }

    /**
     * Sets the value of the importanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionImportanceType }
     *     
     */
    public void setImportanceType(CriterionImportanceType value) {
        this.importanceType = value;
    }

}
