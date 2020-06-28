
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APISRulesRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APISRulesRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RecommendationID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CombinationID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APISRulesRQ")
public class APISRulesRQ {

    @XmlAttribute(name = "RecommendationID", required = true)
    protected int recommendationID;
    @XmlAttribute(name = "CombinationID", required = true)
    protected int combinationID;

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

}
