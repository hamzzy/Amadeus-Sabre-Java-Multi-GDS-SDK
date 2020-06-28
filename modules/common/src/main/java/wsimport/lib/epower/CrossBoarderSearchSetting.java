
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossBoarderSearchSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossBoarderSearchSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BaseEntity">
 *       &lt;sequence>
 *         &lt;element name="CbsLogic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeSubagencyEntityID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="CbsMarketTitle0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CbsMarketCode0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBSPMarket0" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SubAgencyOfficeID0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CbsMarketID0" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Sub0FlightCorporateFareCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub0FlightCorporateFareCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub0FlightCorporateFareCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub0FlightCorporateFareCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub0FlightCorporateFareCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub0FlightCorporateFareCode6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAgencyCode0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAgencyTitle0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CbsSubagencyEntityID1" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="CbsMarketTitle1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CbsMarketCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBSPMarket1" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SubAgencyOfficeID1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CbsMarketID1" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Sub1FlightCorporateFareCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub1FlightCorporateFareCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub1FlightCorporateFareCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub1FlightCorporateFareCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub1FlightCorporateFareCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub1FlightCorporateFareCode6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAgencyCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAgencyTitle1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CbsSubagencyEntityID2" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="CbsMarketTitle2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CbsMarketCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBSPMarket2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SubAgencyOfficeID2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CbsMarketID2" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Sub2FlightCorporateFareCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub2FlightCorporateFareCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub2FlightCorporateFareCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub2FlightCorporateFareCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub2FlightCorporateFareCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub2FlightCorporateFareCode6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAgencyCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAgencyTitle2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossBoarderSearchSetting", propOrder = {
    "cbsLogic",
    "homeSubagencyEntityID",
    "cbsMarketTitle0",
    "cbsMarketCode0",
    "isBSPMarket0",
    "subAgencyOfficeID0",
    "cbsMarketID0",
    "sub0FlightCorporateFareCode1",
    "sub0FlightCorporateFareCode2",
    "sub0FlightCorporateFareCode3",
    "sub0FlightCorporateFareCode4",
    "sub0FlightCorporateFareCode5",
    "sub0FlightCorporateFareCode6",
    "subAgencyCode0",
    "subAgencyTitle0",
    "cbsSubagencyEntityID1",
    "cbsMarketTitle1",
    "cbsMarketCode1",
    "isBSPMarket1",
    "subAgencyOfficeID1",
    "cbsMarketID1",
    "sub1FlightCorporateFareCode1",
    "sub1FlightCorporateFareCode2",
    "sub1FlightCorporateFareCode3",
    "sub1FlightCorporateFareCode4",
    "sub1FlightCorporateFareCode5",
    "sub1FlightCorporateFareCode6",
    "subAgencyCode1",
    "subAgencyTitle1",
    "cbsSubagencyEntityID2",
    "cbsMarketTitle2",
    "cbsMarketCode2",
    "isBSPMarket2",
    "subAgencyOfficeID2",
    "cbsMarketID2",
    "sub2FlightCorporateFareCode1",
    "sub2FlightCorporateFareCode2",
    "sub2FlightCorporateFareCode3",
    "sub2FlightCorporateFareCode4",
    "sub2FlightCorporateFareCode5",
    "sub2FlightCorporateFareCode6",
    "subAgencyCode2",
    "subAgencyTitle2"
})
public class CrossBoarderSearchSetting
    extends BaseEntity
{

    @XmlElement(name = "CbsLogic")
    protected String cbsLogic;
    @XmlElement(name = "HomeSubagencyEntityID", required = true, nillable = true)
    protected String homeSubagencyEntityID;
    @XmlElement(name = "CbsMarketTitle0")
    protected String cbsMarketTitle0;
    @XmlElement(name = "CbsMarketCode0")
    protected String cbsMarketCode0;
    @XmlElement(name = "IsBSPMarket0")
    protected boolean isBSPMarket0;
    @XmlElement(name = "SubAgencyOfficeID0")
    protected String subAgencyOfficeID0;
    @XmlElement(name = "CbsMarketID0", required = true, nillable = true)
    protected String cbsMarketID0;
    @XmlElement(name = "Sub0FlightCorporateFareCode1")
    protected String sub0FlightCorporateFareCode1;
    @XmlElement(name = "Sub0FlightCorporateFareCode2")
    protected String sub0FlightCorporateFareCode2;
    @XmlElement(name = "Sub0FlightCorporateFareCode3")
    protected String sub0FlightCorporateFareCode3;
    @XmlElement(name = "Sub0FlightCorporateFareCode4")
    protected String sub0FlightCorporateFareCode4;
    @XmlElement(name = "Sub0FlightCorporateFareCode5")
    protected String sub0FlightCorporateFareCode5;
    @XmlElement(name = "Sub0FlightCorporateFareCode6")
    protected String sub0FlightCorporateFareCode6;
    @XmlElement(name = "SubAgencyCode0")
    protected String subAgencyCode0;
    @XmlElement(name = "SubAgencyTitle0")
    protected String subAgencyTitle0;
    @XmlElement(name = "CbsSubagencyEntityID1", required = true, nillable = true)
    protected String cbsSubagencyEntityID1;
    @XmlElement(name = "CbsMarketTitle1")
    protected String cbsMarketTitle1;
    @XmlElement(name = "CbsMarketCode1")
    protected String cbsMarketCode1;
    @XmlElement(name = "IsBSPMarket1")
    protected boolean isBSPMarket1;
    @XmlElement(name = "SubAgencyOfficeID1")
    protected String subAgencyOfficeID1;
    @XmlElement(name = "CbsMarketID1", required = true, nillable = true)
    protected String cbsMarketID1;
    @XmlElement(name = "Sub1FlightCorporateFareCode1")
    protected String sub1FlightCorporateFareCode1;
    @XmlElement(name = "Sub1FlightCorporateFareCode2")
    protected String sub1FlightCorporateFareCode2;
    @XmlElement(name = "Sub1FlightCorporateFareCode3")
    protected String sub1FlightCorporateFareCode3;
    @XmlElement(name = "Sub1FlightCorporateFareCode4")
    protected String sub1FlightCorporateFareCode4;
    @XmlElement(name = "Sub1FlightCorporateFareCode5")
    protected String sub1FlightCorporateFareCode5;
    @XmlElement(name = "Sub1FlightCorporateFareCode6")
    protected String sub1FlightCorporateFareCode6;
    @XmlElement(name = "SubAgencyCode1")
    protected String subAgencyCode1;
    @XmlElement(name = "SubAgencyTitle1")
    protected String subAgencyTitle1;
    @XmlElement(name = "CbsSubagencyEntityID2", required = true, nillable = true)
    protected String cbsSubagencyEntityID2;
    @XmlElement(name = "CbsMarketTitle2")
    protected String cbsMarketTitle2;
    @XmlElement(name = "CbsMarketCode2")
    protected String cbsMarketCode2;
    @XmlElement(name = "IsBSPMarket2")
    protected boolean isBSPMarket2;
    @XmlElement(name = "SubAgencyOfficeID2")
    protected String subAgencyOfficeID2;
    @XmlElement(name = "CbsMarketID2", required = true, nillable = true)
    protected String cbsMarketID2;
    @XmlElement(name = "Sub2FlightCorporateFareCode1")
    protected String sub2FlightCorporateFareCode1;
    @XmlElement(name = "Sub2FlightCorporateFareCode2")
    protected String sub2FlightCorporateFareCode2;
    @XmlElement(name = "Sub2FlightCorporateFareCode3")
    protected String sub2FlightCorporateFareCode3;
    @XmlElement(name = "Sub2FlightCorporateFareCode4")
    protected String sub2FlightCorporateFareCode4;
    @XmlElement(name = "Sub2FlightCorporateFareCode5")
    protected String sub2FlightCorporateFareCode5;
    @XmlElement(name = "Sub2FlightCorporateFareCode6")
    protected String sub2FlightCorporateFareCode6;
    @XmlElement(name = "SubAgencyCode2")
    protected String subAgencyCode2;
    @XmlElement(name = "SubAgencyTitle2")
    protected String subAgencyTitle2;

    /**
     * Gets the value of the cbsLogic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsLogic() {
        return cbsLogic;
    }

    /**
     * Sets the value of the cbsLogic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsLogic(String value) {
        this.cbsLogic = value;
    }

    /**
     * Gets the value of the homeSubagencyEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeSubagencyEntityID() {
        return homeSubagencyEntityID;
    }

    /**
     * Sets the value of the homeSubagencyEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeSubagencyEntityID(String value) {
        this.homeSubagencyEntityID = value;
    }

    /**
     * Gets the value of the cbsMarketTitle0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsMarketTitle0() {
        return cbsMarketTitle0;
    }

    /**
     * Sets the value of the cbsMarketTitle0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsMarketTitle0(String value) {
        this.cbsMarketTitle0 = value;
    }

    /**
     * Gets the value of the cbsMarketCode0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsMarketCode0() {
        return cbsMarketCode0;
    }

    /**
     * Sets the value of the cbsMarketCode0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsMarketCode0(String value) {
        this.cbsMarketCode0 = value;
    }

    /**
     * Gets the value of the isBSPMarket0 property.
     * 
     */
    public boolean isIsBSPMarket0() {
        return isBSPMarket0;
    }

    /**
     * Sets the value of the isBSPMarket0 property.
     * 
     */
    public void setIsBSPMarket0(boolean value) {
        this.isBSPMarket0 = value;
    }

    /**
     * Gets the value of the subAgencyOfficeID0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAgencyOfficeID0() {
        return subAgencyOfficeID0;
    }

    /**
     * Sets the value of the subAgencyOfficeID0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAgencyOfficeID0(String value) {
        this.subAgencyOfficeID0 = value;
    }

    /**
     * Gets the value of the cbsMarketID0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsMarketID0() {
        return cbsMarketID0;
    }

    /**
     * Sets the value of the cbsMarketID0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsMarketID0(String value) {
        this.cbsMarketID0 = value;
    }

    /**
     * Gets the value of the sub0FlightCorporateFareCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub0FlightCorporateFareCode1() {
        return sub0FlightCorporateFareCode1;
    }

    /**
     * Sets the value of the sub0FlightCorporateFareCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub0FlightCorporateFareCode1(String value) {
        this.sub0FlightCorporateFareCode1 = value;
    }

    /**
     * Gets the value of the sub0FlightCorporateFareCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub0FlightCorporateFareCode2() {
        return sub0FlightCorporateFareCode2;
    }

    /**
     * Sets the value of the sub0FlightCorporateFareCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub0FlightCorporateFareCode2(String value) {
        this.sub0FlightCorporateFareCode2 = value;
    }

    /**
     * Gets the value of the sub0FlightCorporateFareCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub0FlightCorporateFareCode3() {
        return sub0FlightCorporateFareCode3;
    }

    /**
     * Sets the value of the sub0FlightCorporateFareCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub0FlightCorporateFareCode3(String value) {
        this.sub0FlightCorporateFareCode3 = value;
    }

    /**
     * Gets the value of the sub0FlightCorporateFareCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub0FlightCorporateFareCode4() {
        return sub0FlightCorporateFareCode4;
    }

    /**
     * Sets the value of the sub0FlightCorporateFareCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub0FlightCorporateFareCode4(String value) {
        this.sub0FlightCorporateFareCode4 = value;
    }

    /**
     * Gets the value of the sub0FlightCorporateFareCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub0FlightCorporateFareCode5() {
        return sub0FlightCorporateFareCode5;
    }

    /**
     * Sets the value of the sub0FlightCorporateFareCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub0FlightCorporateFareCode5(String value) {
        this.sub0FlightCorporateFareCode5 = value;
    }

    /**
     * Gets the value of the sub0FlightCorporateFareCode6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub0FlightCorporateFareCode6() {
        return sub0FlightCorporateFareCode6;
    }

    /**
     * Sets the value of the sub0FlightCorporateFareCode6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub0FlightCorporateFareCode6(String value) {
        this.sub0FlightCorporateFareCode6 = value;
    }

    /**
     * Gets the value of the subAgencyCode0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAgencyCode0() {
        return subAgencyCode0;
    }

    /**
     * Sets the value of the subAgencyCode0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAgencyCode0(String value) {
        this.subAgencyCode0 = value;
    }

    /**
     * Gets the value of the subAgencyTitle0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAgencyTitle0() {
        return subAgencyTitle0;
    }

    /**
     * Sets the value of the subAgencyTitle0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAgencyTitle0(String value) {
        this.subAgencyTitle0 = value;
    }

    /**
     * Gets the value of the cbsSubagencyEntityID1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsSubagencyEntityID1() {
        return cbsSubagencyEntityID1;
    }

    /**
     * Sets the value of the cbsSubagencyEntityID1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsSubagencyEntityID1(String value) {
        this.cbsSubagencyEntityID1 = value;
    }

    /**
     * Gets the value of the cbsMarketTitle1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsMarketTitle1() {
        return cbsMarketTitle1;
    }

    /**
     * Sets the value of the cbsMarketTitle1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsMarketTitle1(String value) {
        this.cbsMarketTitle1 = value;
    }

    /**
     * Gets the value of the cbsMarketCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsMarketCode1() {
        return cbsMarketCode1;
    }

    /**
     * Sets the value of the cbsMarketCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsMarketCode1(String value) {
        this.cbsMarketCode1 = value;
    }

    /**
     * Gets the value of the isBSPMarket1 property.
     * 
     */
    public boolean isIsBSPMarket1() {
        return isBSPMarket1;
    }

    /**
     * Sets the value of the isBSPMarket1 property.
     * 
     */
    public void setIsBSPMarket1(boolean value) {
        this.isBSPMarket1 = value;
    }

    /**
     * Gets the value of the subAgencyOfficeID1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAgencyOfficeID1() {
        return subAgencyOfficeID1;
    }

    /**
     * Sets the value of the subAgencyOfficeID1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAgencyOfficeID1(String value) {
        this.subAgencyOfficeID1 = value;
    }

    /**
     * Gets the value of the cbsMarketID1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsMarketID1() {
        return cbsMarketID1;
    }

    /**
     * Sets the value of the cbsMarketID1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsMarketID1(String value) {
        this.cbsMarketID1 = value;
    }

    /**
     * Gets the value of the sub1FlightCorporateFareCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub1FlightCorporateFareCode1() {
        return sub1FlightCorporateFareCode1;
    }

    /**
     * Sets the value of the sub1FlightCorporateFareCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub1FlightCorporateFareCode1(String value) {
        this.sub1FlightCorporateFareCode1 = value;
    }

    /**
     * Gets the value of the sub1FlightCorporateFareCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub1FlightCorporateFareCode2() {
        return sub1FlightCorporateFareCode2;
    }

    /**
     * Sets the value of the sub1FlightCorporateFareCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub1FlightCorporateFareCode2(String value) {
        this.sub1FlightCorporateFareCode2 = value;
    }

    /**
     * Gets the value of the sub1FlightCorporateFareCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub1FlightCorporateFareCode3() {
        return sub1FlightCorporateFareCode3;
    }

    /**
     * Sets the value of the sub1FlightCorporateFareCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub1FlightCorporateFareCode3(String value) {
        this.sub1FlightCorporateFareCode3 = value;
    }

    /**
     * Gets the value of the sub1FlightCorporateFareCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub1FlightCorporateFareCode4() {
        return sub1FlightCorporateFareCode4;
    }

    /**
     * Sets the value of the sub1FlightCorporateFareCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub1FlightCorporateFareCode4(String value) {
        this.sub1FlightCorporateFareCode4 = value;
    }

    /**
     * Gets the value of the sub1FlightCorporateFareCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub1FlightCorporateFareCode5() {
        return sub1FlightCorporateFareCode5;
    }

    /**
     * Sets the value of the sub1FlightCorporateFareCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub1FlightCorporateFareCode5(String value) {
        this.sub1FlightCorporateFareCode5 = value;
    }

    /**
     * Gets the value of the sub1FlightCorporateFareCode6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub1FlightCorporateFareCode6() {
        return sub1FlightCorporateFareCode6;
    }

    /**
     * Sets the value of the sub1FlightCorporateFareCode6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub1FlightCorporateFareCode6(String value) {
        this.sub1FlightCorporateFareCode6 = value;
    }

    /**
     * Gets the value of the subAgencyCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAgencyCode1() {
        return subAgencyCode1;
    }

    /**
     * Sets the value of the subAgencyCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAgencyCode1(String value) {
        this.subAgencyCode1 = value;
    }

    /**
     * Gets the value of the subAgencyTitle1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAgencyTitle1() {
        return subAgencyTitle1;
    }

    /**
     * Sets the value of the subAgencyTitle1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAgencyTitle1(String value) {
        this.subAgencyTitle1 = value;
    }

    /**
     * Gets the value of the cbsSubagencyEntityID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsSubagencyEntityID2() {
        return cbsSubagencyEntityID2;
    }

    /**
     * Sets the value of the cbsSubagencyEntityID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsSubagencyEntityID2(String value) {
        this.cbsSubagencyEntityID2 = value;
    }

    /**
     * Gets the value of the cbsMarketTitle2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsMarketTitle2() {
        return cbsMarketTitle2;
    }

    /**
     * Sets the value of the cbsMarketTitle2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsMarketTitle2(String value) {
        this.cbsMarketTitle2 = value;
    }

    /**
     * Gets the value of the cbsMarketCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsMarketCode2() {
        return cbsMarketCode2;
    }

    /**
     * Sets the value of the cbsMarketCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsMarketCode2(String value) {
        this.cbsMarketCode2 = value;
    }

    /**
     * Gets the value of the isBSPMarket2 property.
     * 
     */
    public boolean isIsBSPMarket2() {
        return isBSPMarket2;
    }

    /**
     * Sets the value of the isBSPMarket2 property.
     * 
     */
    public void setIsBSPMarket2(boolean value) {
        this.isBSPMarket2 = value;
    }

    /**
     * Gets the value of the subAgencyOfficeID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAgencyOfficeID2() {
        return subAgencyOfficeID2;
    }

    /**
     * Sets the value of the subAgencyOfficeID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAgencyOfficeID2(String value) {
        this.subAgencyOfficeID2 = value;
    }

    /**
     * Gets the value of the cbsMarketID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbsMarketID2() {
        return cbsMarketID2;
    }

    /**
     * Sets the value of the cbsMarketID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbsMarketID2(String value) {
        this.cbsMarketID2 = value;
    }

    /**
     * Gets the value of the sub2FlightCorporateFareCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub2FlightCorporateFareCode1() {
        return sub2FlightCorporateFareCode1;
    }

    /**
     * Sets the value of the sub2FlightCorporateFareCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub2FlightCorporateFareCode1(String value) {
        this.sub2FlightCorporateFareCode1 = value;
    }

    /**
     * Gets the value of the sub2FlightCorporateFareCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub2FlightCorporateFareCode2() {
        return sub2FlightCorporateFareCode2;
    }

    /**
     * Sets the value of the sub2FlightCorporateFareCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub2FlightCorporateFareCode2(String value) {
        this.sub2FlightCorporateFareCode2 = value;
    }

    /**
     * Gets the value of the sub2FlightCorporateFareCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub2FlightCorporateFareCode3() {
        return sub2FlightCorporateFareCode3;
    }

    /**
     * Sets the value of the sub2FlightCorporateFareCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub2FlightCorporateFareCode3(String value) {
        this.sub2FlightCorporateFareCode3 = value;
    }

    /**
     * Gets the value of the sub2FlightCorporateFareCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub2FlightCorporateFareCode4() {
        return sub2FlightCorporateFareCode4;
    }

    /**
     * Sets the value of the sub2FlightCorporateFareCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub2FlightCorporateFareCode4(String value) {
        this.sub2FlightCorporateFareCode4 = value;
    }

    /**
     * Gets the value of the sub2FlightCorporateFareCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub2FlightCorporateFareCode5() {
        return sub2FlightCorporateFareCode5;
    }

    /**
     * Sets the value of the sub2FlightCorporateFareCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub2FlightCorporateFareCode5(String value) {
        this.sub2FlightCorporateFareCode5 = value;
    }

    /**
     * Gets the value of the sub2FlightCorporateFareCode6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub2FlightCorporateFareCode6() {
        return sub2FlightCorporateFareCode6;
    }

    /**
     * Sets the value of the sub2FlightCorporateFareCode6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub2FlightCorporateFareCode6(String value) {
        this.sub2FlightCorporateFareCode6 = value;
    }

    /**
     * Gets the value of the subAgencyCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAgencyCode2() {
        return subAgencyCode2;
    }

    /**
     * Sets the value of the subAgencyCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAgencyCode2(String value) {
        this.subAgencyCode2 = value;
    }

    /**
     * Gets the value of the subAgencyTitle2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAgencyTitle2() {
        return subAgencyTitle2;
    }

    /**
     * Sets the value of the subAgencyTitle2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAgencyTitle2(String value) {
        this.subAgencyTitle2 = value;
    }

}
