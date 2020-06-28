
package wsimport.lib.epower;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParagraphTypeListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParagraphTypeListItem">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
 *       &lt;attribute name="ListItem" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphTypeListItem")
public class ParagraphTypeListItem
    extends FormattedTextTextType
{

    @XmlAttribute(name = "ListItem")
    protected BigInteger listItem;

    /**
     * Gets the value of the listItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getListItem() {
        return listItem;
    }

    /**
     * Sets the value of the listItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setListItem(BigInteger value) {
        this.listItem = value;
    }

}
