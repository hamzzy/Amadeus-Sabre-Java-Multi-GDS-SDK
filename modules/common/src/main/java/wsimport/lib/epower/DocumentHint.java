
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentHint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentHint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}DBBaseEntity">
 *       &lt;sequence>
 *         &lt;element name="EntityID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="CauseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferedDocumentID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentHint", propOrder = {
    "entityID",
    "causeCode",
    "preferedDocumentID"
})
public class DocumentHint
    extends DBBaseEntity
{

    @XmlElement(name = "EntityID", required = true, nillable = true)
    protected String entityID;
    @XmlElement(name = "CauseCode")
    protected String causeCode;
    @XmlElement(name = "PreferedDocumentID", required = true, nillable = true)
    protected String preferedDocumentID;

    /**
     * Gets the value of the entityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityID() {
        return entityID;
    }

    /**
     * Sets the value of the entityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityID(String value) {
        this.entityID = value;
    }

    /**
     * Gets the value of the causeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseCode() {
        return causeCode;
    }

    /**
     * Sets the value of the causeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseCode(String value) {
        this.causeCode = value;
    }

    /**
     * Gets the value of the preferedDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferedDocumentID() {
        return preferedDocumentID;
    }

    /**
     * Sets the value of the preferedDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferedDocumentID(String value) {
        this.preferedDocumentID = value;
    }

}
