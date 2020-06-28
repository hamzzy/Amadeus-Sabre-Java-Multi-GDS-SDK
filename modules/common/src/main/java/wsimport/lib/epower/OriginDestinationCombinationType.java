
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginDestinationCombinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationCombinationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ValidatingAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ForceETicket" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OriginIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IndexList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DestinationIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CombinationID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RecommendationID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="E_TicketEligibility">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Eligible"/>
 *             &lt;enumeration value="Not Eligible"/>
 *             &lt;enumeration value="Required"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ServiceFeeAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationCombinationType")
public class OriginDestinationCombinationType {

    @XmlAttribute(name = "ValidatingAirlineCode")
    protected String validatingAirlineCode;
    @XmlAttribute(name = "ForceETicket", required = true)
    protected boolean forceETicket;
    @XmlAttribute(name = "OriginIndex")
    protected Integer originIndex;
    @XmlAttribute(name = "IndexList")
    protected String indexList;
    @XmlAttribute(name = "DestinationIndex")
    protected Integer destinationIndex;
    @XmlAttribute(name = "CombinationID", required = true)
    protected int combinationID;
    @XmlAttribute(name = "RecommendationID")
    protected Integer recommendationID;
    @XmlAttribute(name = "E_TicketEligibility")
    protected String eTicketEligibility;
    @XmlAttribute(name = "ServiceFeeAmount", required = true)
    protected BigDecimal serviceFeeAmount;

    /**
     * Gets the value of the validatingAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingAirlineCode() {
        return validatingAirlineCode;
    }

    /**
     * Sets the value of the validatingAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingAirlineCode(String value) {
        this.validatingAirlineCode = value;
    }

    /**
     * Gets the value of the forceETicket property.
     * 
     */
    public boolean isForceETicket() {
        return forceETicket;
    }

    /**
     * Sets the value of the forceETicket property.
     * 
     */
    public void setForceETicket(boolean value) {
        this.forceETicket = value;
    }

    /**
     * Gets the value of the originIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginIndex() {
        return originIndex;
    }

    /**
     * Sets the value of the originIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginIndex(Integer value) {
        this.originIndex = value;
    }

    /**
     * Gets the value of the indexList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexList() {
        return indexList;
    }

    /**
     * Sets the value of the indexList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexList(String value) {
        this.indexList = value;
    }

    /**
     * Gets the value of the destinationIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    /**
     * Sets the value of the destinationIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestinationIndex(Integer value) {
        this.destinationIndex = value;
    }

    /**
     * Gets the value of the combinationID property.
     * 
     */
    public int getCombinationID() {
        return combinationID;
    }

    /**
     * Sets the value of the combinationID property.
     * 
     */
    public void setCombinationID(int value) {
        this.combinationID = value;
    }

    /**
     * Gets the value of the recommendationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecommendationID() {
        return recommendationID;
    }

    /**
     * Sets the value of the recommendationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecommendationID(Integer value) {
        this.recommendationID = value;
    }

    /**
     * Gets the value of the eTicketEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketEligibility() {
        return eTicketEligibility;
    }

    /**
     * Sets the value of the eTicketEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketEligibility(String value) {
        this.eTicketEligibility = value;
    }

    /**
     * Gets the value of the serviceFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceFeeAmount() {
        return serviceFeeAmount;
    }

    /**
     * Sets the value of the serviceFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceFeeAmount(BigDecimal value) {
        this.serviceFeeAmount = value;
    }

}
