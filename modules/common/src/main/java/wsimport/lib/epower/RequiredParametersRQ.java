
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredParametersRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredParametersRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RecommendationID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CombinationID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IsOneWayCombinable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CCType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredParametersRQ")
public class RequiredParametersRQ {

    @XmlAttribute(name = "RecommendationID", required = true)
    protected int recommendationID;
    @XmlAttribute(name = "CombinationID", required = true)
    protected int combinationID;
    @XmlAttribute(name = "IsOneWayCombinable")
    protected Boolean isOneWayCombinable;
    @XmlAttribute(name = "CCType")
    protected String ccType;

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
     * Gets the value of the ccType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCType() {
        return ccType;
    }

    /**
     * Sets the value of the ccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCType(String value) {
        this.ccType = value;
    }

}
