
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndCoverageReqsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndCoverageReqsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndTripCost" type="{http://epowerv5.amadeus.com.tr/WS}IndCoverageReqsTypeIndTripCost" minOccurs="0"/>
 *         &lt;element name="FlightAccidentAmount" type="{http://epowerv5.amadeus.com.tr/WS}IndCoverageReqsTypeFlightAccidentAmount" minOccurs="0"/>
 *         &lt;element name="CoveredLuggage" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfIndCoverageReqsTypeLuggageItem" minOccurs="0"/>
 *         &lt;element name="PreexistingConditions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfIndCoverageReqsTypePreexistingCondition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndCoverageReqsType", propOrder = {
    "indTripCost",
    "flightAccidentAmount",
    "coveredLuggage",
    "preexistingConditions"
})
public class IndCoverageReqsType {

    @XmlElement(name = "IndTripCost")
    protected IndCoverageReqsTypeIndTripCost indTripCost;
    @XmlElement(name = "FlightAccidentAmount")
    protected IndCoverageReqsTypeFlightAccidentAmount flightAccidentAmount;
    @XmlElement(name = "CoveredLuggage")
    protected ArrayOfIndCoverageReqsTypeLuggageItem coveredLuggage;
    @XmlElement(name = "PreexistingConditions")
    protected ArrayOfIndCoverageReqsTypePreexistingCondition preexistingConditions;

    /**
     * Gets the value of the indTripCost property.
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsTypeIndTripCost }
     *     
     */
    public IndCoverageReqsTypeIndTripCost getIndTripCost() {
        return indTripCost;
    }

    /**
     * Sets the value of the indTripCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsTypeIndTripCost }
     *     
     */
    public void setIndTripCost(IndCoverageReqsTypeIndTripCost value) {
        this.indTripCost = value;
    }

    /**
     * Gets the value of the flightAccidentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsTypeFlightAccidentAmount }
     *     
     */
    public IndCoverageReqsTypeFlightAccidentAmount getFlightAccidentAmount() {
        return flightAccidentAmount;
    }

    /**
     * Sets the value of the flightAccidentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsTypeFlightAccidentAmount }
     *     
     */
    public void setFlightAccidentAmount(IndCoverageReqsTypeFlightAccidentAmount value) {
        this.flightAccidentAmount = value;
    }

    /**
     * Gets the value of the coveredLuggage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndCoverageReqsTypeLuggageItem }
     *     
     */
    public ArrayOfIndCoverageReqsTypeLuggageItem getCoveredLuggage() {
        return coveredLuggage;
    }

    /**
     * Sets the value of the coveredLuggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndCoverageReqsTypeLuggageItem }
     *     
     */
    public void setCoveredLuggage(ArrayOfIndCoverageReqsTypeLuggageItem value) {
        this.coveredLuggage = value;
    }

    /**
     * Gets the value of the preexistingConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndCoverageReqsTypePreexistingCondition }
     *     
     */
    public ArrayOfIndCoverageReqsTypePreexistingCondition getPreexistingConditions() {
        return preexistingConditions;
    }

    /**
     * Sets the value of the preexistingConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndCoverageReqsTypePreexistingCondition }
     *     
     */
    public void setPreexistingConditions(ArrayOfIndCoverageReqsTypePreexistingCondition value) {
        this.preexistingConditions = value;
    }

}
