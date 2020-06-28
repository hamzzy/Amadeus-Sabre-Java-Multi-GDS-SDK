
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetUserRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CultureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "", propOrder = {
    "getUserRQ"
})
@XmlRootElement(name = "GetUser")
public class GetUser {

    @XmlElement(name = "GetUserRQ")
    protected GetUser.GetUserRQ getUserRQ;

    /**
     * Gets the value of the getUserRQ property.
     * 
     * @return
     *     possible object is
     *     {@link GetUser.GetUserRQ }
     *     
     */
    public GetUser.GetUserRQ getGetUserRQ() {
        return getUserRQ;
    }

    /**
     * Sets the value of the getUserRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUser.GetUserRQ }
     *     
     */
    public void setGetUserRQ(GetUser.GetUserRQ value) {
        this.getUserRQ = value;
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
     *       &lt;sequence>
     *         &lt;element name="CultureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cultureCode",
        "userName",
        "userPassword",
        "userID"
    })
    public static class GetUserRQ {

        @XmlElement(name = "CultureCode")
        protected String cultureCode;
        @XmlElement(name = "UserName")
        protected String userName;
        @XmlElement(name = "UserPassword")
        protected String userPassword;
        @XmlElement(name = "UserID")
        protected String userID;

        /**
         * Gets the value of the cultureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCultureCode() {
            return cultureCode;
        }

        /**
         * Sets the value of the cultureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCultureCode(String value) {
            this.cultureCode = value;
        }

        /**
         * Gets the value of the userName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserName() {
            return userName;
        }

        /**
         * Sets the value of the userName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserName(String value) {
            this.userName = value;
        }

        /**
         * Gets the value of the userPassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserPassword() {
            return userPassword;
        }

        /**
         * Sets the value of the userPassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserPassword(String value) {
            this.userPassword = value;
        }

        /**
         * Gets the value of the userID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserID() {
            return userID;
        }

        /**
         * Sets the value of the userID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserID(String value) {
            this.userID = value;
        }

    }

}
