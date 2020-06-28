
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultimediaDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultimediaDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="TextItems" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfTextItemsTypeTextItem" minOccurs="0"/>
 *           &lt;element name="ImageItems" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfImageItemsTypeImageItem" minOccurs="0"/>
 *           &lt;element name="VideoItems" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVideoItemsTypeVideoItem" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaDescriptionType", propOrder = {
    "textItems",
    "imageItems",
    "videoItems"
})
public class MultimediaDescriptionType {

    @XmlElement(name = "TextItems")
    protected ArrayOfTextItemsTypeTextItem textItems;
    @XmlElement(name = "ImageItems")
    protected ArrayOfImageItemsTypeImageItem imageItems;
    @XmlElement(name = "VideoItems")
    protected ArrayOfVideoItemsTypeVideoItem videoItems;
    @XmlAttribute(name = "InfoCode")
    protected String infoCode;
    @XmlAttribute(name = "AdditionalDetailCode")
    protected String additionalDetailCode;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * Gets the value of the textItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTextItemsTypeTextItem }
     *     
     */
    public ArrayOfTextItemsTypeTextItem getTextItems() {
        return textItems;
    }

    /**
     * Sets the value of the textItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTextItemsTypeTextItem }
     *     
     */
    public void setTextItems(ArrayOfTextItemsTypeTextItem value) {
        this.textItems = value;
    }

    /**
     * Gets the value of the imageItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImageItemsTypeImageItem }
     *     
     */
    public ArrayOfImageItemsTypeImageItem getImageItems() {
        return imageItems;
    }

    /**
     * Sets the value of the imageItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImageItemsTypeImageItem }
     *     
     */
    public void setImageItems(ArrayOfImageItemsTypeImageItem value) {
        this.imageItems = value;
    }

    /**
     * Gets the value of the videoItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoItemsTypeVideoItem }
     *     
     */
    public ArrayOfVideoItemsTypeVideoItem getVideoItems() {
        return videoItems;
    }

    /**
     * Sets the value of the videoItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoItemsTypeVideoItem }
     *     
     */
    public void setVideoItems(ArrayOfVideoItemsTypeVideoItem value) {
        this.videoItems = value;
    }

    /**
     * Gets the value of the infoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoCode() {
        return infoCode;
    }

    /**
     * Sets the value of the infoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoCode(String value) {
        this.infoCode = value;
    }

    /**
     * Gets the value of the additionalDetailCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDetailCode() {
        return additionalDetailCode;
    }

    /**
     * Sets the value of the additionalDetailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDetailCode(String value) {
        this.additionalDetailCode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
