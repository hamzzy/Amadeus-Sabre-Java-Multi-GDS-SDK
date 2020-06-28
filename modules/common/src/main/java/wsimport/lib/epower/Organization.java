
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}Entity">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JudicalRecordNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogoFileID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="MarketID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="IATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAgencyOID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferOfficeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Branches" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOrganization" minOccurs="0"/>
 *         &lt;element name="IsBSPMarket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "code",
    "title",
    "judicalRecordNo",
    "typeCode",
    "shortName",
    "logoFileID",
    "marketID",
    "iata",
    "officeID",
    "subAgencyOID",
    "offerOfficeID",
    "branches",
    "isBSPMarket"
})
@XmlSeeAlso({
    Corporate.class
})
public class Organization
    extends Entity
{

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "JudicalRecordNo")
    protected String judicalRecordNo;
    @XmlElement(name = "TypeCode")
    protected String typeCode;
    @XmlElement(name = "ShortName")
    protected String shortName;
    @XmlElement(name = "LogoFileID", required = true, nillable = true)
    protected String logoFileID;
    @XmlElement(name = "MarketID", required = true, nillable = true)
    protected String marketID;
    @XmlElement(name = "IATA")
    protected String iata;
    @XmlElement(name = "OfficeID")
    protected String officeID;
    @XmlElement(name = "SubAgencyOID")
    protected String subAgencyOID;
    @XmlElement(name = "OfferOfficeID")
    protected String offerOfficeID;
    @XmlElement(name = "Branches")
    protected ArrayOfOrganization branches;
    @XmlElement(name = "IsBSPMarket", required = true, type = Boolean.class, nillable = true)
    protected Boolean isBSPMarket;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the judicalRecordNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudicalRecordNo() {
        return judicalRecordNo;
    }

    /**
     * Sets the value of the judicalRecordNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJudicalRecordNo(String value) {
        this.judicalRecordNo = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the logoFileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoFileID() {
        return logoFileID;
    }

    /**
     * Sets the value of the logoFileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoFileID(String value) {
        this.logoFileID = value;
    }

    /**
     * Gets the value of the marketID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketID() {
        return marketID;
    }

    /**
     * Sets the value of the marketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketID(String value) {
        this.marketID = value;
    }

    /**
     * Gets the value of the iata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATA() {
        return iata;
    }

    /**
     * Sets the value of the iata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATA(String value) {
        this.iata = value;
    }

    /**
     * Gets the value of the officeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeID() {
        return officeID;
    }

    /**
     * Sets the value of the officeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeID(String value) {
        this.officeID = value;
    }

    /**
     * Gets the value of the subAgencyOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAgencyOID() {
        return subAgencyOID;
    }

    /**
     * Sets the value of the subAgencyOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAgencyOID(String value) {
        this.subAgencyOID = value;
    }

    /**
     * Gets the value of the offerOfficeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferOfficeID() {
        return offerOfficeID;
    }

    /**
     * Sets the value of the offerOfficeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferOfficeID(String value) {
        this.offerOfficeID = value;
    }

    /**
     * Gets the value of the branches property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrganization }
     *     
     */
    public ArrayOfOrganization getBranches() {
        return branches;
    }

    /**
     * Sets the value of the branches property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrganization }
     *     
     */
    public void setBranches(ArrayOfOrganization value) {
        this.branches = value;
    }

    /**
     * Gets the value of the isBSPMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBSPMarket() {
        return isBSPMarket;
    }

    /**
     * Sets the value of the isBSPMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBSPMarket(Boolean value) {
        this.isBSPMarket = value;
    }

}
