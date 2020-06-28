
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BaseEntity">
 *       &lt;sequence>
 *         &lt;element name="Documents" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfDocument" minOccurs="0"/>
 *         &lt;element name="DocumentHints" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfDocumentHint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentDetails", propOrder = {
    "documents",
    "documentHints"
})
public class DocumentDetails
    extends BaseEntity
{

    @XmlElement(name = "Documents")
    protected ArrayOfDocument documents;
    @XmlElement(name = "DocumentHints")
    protected ArrayOfDocumentHint documentHints;

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocument }
     *     
     */
    public ArrayOfDocument getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocument }
     *     
     */
    public void setDocuments(ArrayOfDocument value) {
        this.documents = value;
    }

    /**
     * Gets the value of the documentHints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentHint }
     *     
     */
    public ArrayOfDocumentHint getDocumentHints() {
        return documentHints;
    }

    /**
     * Sets the value of the documentHints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentHint }
     *     
     */
    public void setDocumentHints(ArrayOfDocumentHint value) {
        this.documentHints = value;
    }

}
