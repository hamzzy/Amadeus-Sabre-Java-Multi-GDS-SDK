
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSpecialRemarkTypeAuthorizedViewer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSpecialRemarkTypeAuthorizedViewer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthorizedViewer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ViewerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ViewerCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSpecialRemarkTypeAuthorizedViewer", propOrder = {
    "authorizedViewer"
})
public class ArrayOfSpecialRemarkTypeAuthorizedViewer {

    @XmlElement(name = "AuthorizedViewer")
    protected List<ArrayOfSpecialRemarkTypeAuthorizedViewer.AuthorizedViewer> authorizedViewer;

    /**
     * Gets the value of the authorizedViewer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizedViewer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizedViewer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSpecialRemarkTypeAuthorizedViewer.AuthorizedViewer }
     * 
     * 
     */
    public List<ArrayOfSpecialRemarkTypeAuthorizedViewer.AuthorizedViewer> getAuthorizedViewer() {
        if (authorizedViewer == null) {
            authorizedViewer = new ArrayList<ArrayOfSpecialRemarkTypeAuthorizedViewer.AuthorizedViewer>();
        }
        return this.authorizedViewer;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ViewerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ViewerCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AuthorizedViewer {

        @XmlAttribute(name = "ViewerCode")
        protected String viewerCode;
        @XmlAttribute(name = "ViewerCarrierCode")
        protected String viewerCarrierCode;

        /**
         * Gets the value of the viewerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getViewerCode() {
            return viewerCode;
        }

        /**
         * Sets the value of the viewerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setViewerCode(String value) {
            this.viewerCode = value;
        }

        /**
         * Gets the value of the viewerCarrierCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getViewerCarrierCode() {
            return viewerCarrierCode;
        }

        /**
         * Sets the value of the viewerCarrierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setViewerCarrierCode(String value) {
            this.viewerCarrierCode = value;
        }

    }

}
