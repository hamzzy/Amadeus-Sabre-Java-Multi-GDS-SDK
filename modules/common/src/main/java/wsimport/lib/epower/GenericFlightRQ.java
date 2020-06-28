
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericFlightRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericFlightRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RecommendationID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CombinationID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IsOneWayCombinable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FareFamilyPackageID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericFlightRQ")
@XmlSeeAlso({
    wsimport.lib.epower.Book.BookBasketRQ.FlightReservation.class,
    wsimport.lib.epower.CreateTicket.OTAAirBookRQ.class,
    wsimport.lib.epower.BookFlightWithRecommendation.OTAAirBookRQ.class,
    OTAAirRulesRQ.class,
    OTAAirCheckETicketRQ.class,
    ServiceFeeInfoRQ.class,
    wsimport.lib.epower.BookFlight.OTAAirBookRQ.class,
    FlightOptionRQ.class,
    FareFamilyInfoRQ.class,
    OTAInsurancePlanSearchRQSearchFlightInfo.class
})
public class GenericFlightRQ {

    @XmlAttribute(name = "RecommendationID", required = true)
    protected int recommendationID;
    @XmlAttribute(name = "CombinationID", required = true)
    protected int combinationID;
    @XmlAttribute(name = "IsOneWayCombinable")
    protected Boolean isOneWayCombinable;
    @XmlAttribute(name = "FareFamilyPackageID", required = true)
    protected int fareFamilyPackageID;

    /**
     * Gets the value of the recommendationID property.
     * 
     */
    public int getRecommendationID() {
        return recommendationID;
    }

    /**
     * Sets the value of the recommendationID property.
     * 
     */
    public void setRecommendationID(int value) {
        this.recommendationID = value;
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
     * Gets the value of the isOneWayCombinable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOneWayCombinable() {
        return isOneWayCombinable;
    }

    /**
     * Sets the value of the isOneWayCombinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOneWayCombinable(Boolean value) {
        this.isOneWayCombinable = value;
    }

    /**
     * Gets the value of the fareFamilyPackageID property.
     * 
     */
    public int getFareFamilyPackageID() {
        return fareFamilyPackageID;
    }

    /**
     * Sets the value of the fareFamilyPackageID property.
     * 
     */
    public void setFareFamilyPackageID(int value) {
        this.fareFamilyPackageID = value;
    }

}
