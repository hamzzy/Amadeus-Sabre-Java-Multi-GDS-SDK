
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IndCoverageReqsTypePreexistingCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndCoverageReqsTypePreexistingCondition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FreeTextType">
 *       &lt;attribute name="DiagnosisDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="LastTreatmentDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndCoverageReqsTypePreexistingCondition")
public class IndCoverageReqsTypePreexistingCondition
    extends FreeTextType
{

    @XmlAttribute(name = "DiagnosisDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar diagnosisDate;
    @XmlAttribute(name = "LastTreatmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastTreatmentDate;

    /**
     * Gets the value of the diagnosisDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiagnosisDate() {
        return diagnosisDate;
    }

    /**
     * Sets the value of the diagnosisDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiagnosisDate(XMLGregorianCalendar value) {
        this.diagnosisDate = value;
    }

    /**
     * Gets the value of the lastTreatmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTreatmentDate() {
        return lastTreatmentDate;
    }

    /**
     * Sets the value of the lastTreatmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTreatmentDate(XMLGregorianCalendar value) {
        this.lastTreatmentDate = value;
    }

}
