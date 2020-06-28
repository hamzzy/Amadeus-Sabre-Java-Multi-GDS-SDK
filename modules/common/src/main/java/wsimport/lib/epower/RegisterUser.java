
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
 *         &lt;element name="UserOperationsRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CultureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="User" type="{http://epowerv5.amadeus.com.tr/WS}User" minOccurs="0"/>
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
    "userOperationsRQ"
})
@XmlRootElement(name = "RegisterUser")
public class RegisterUser {

    @XmlElement(name = "UserOperationsRQ")
    protected RegisterUser.UserOperationsRQ userOperationsRQ;

    /**
     * Gets the value of the userOperationsRQ property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterUser.UserOperationsRQ }
     *     
     */
    public RegisterUser.UserOperationsRQ getUserOperationsRQ() {
        return userOperationsRQ;
    }

    /**
     * Sets the value of the userOperationsRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterUser.UserOperationsRQ }
     *     
     */
    public void setUserOperationsRQ(RegisterUser.UserOperationsRQ value) {
        this.userOperationsRQ = value;
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
     *         &lt;element name="User" type="{http://epowerv5.amadeus.com.tr/WS}User" minOccurs="0"/>
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
        "user"
    })
    public static class UserOperationsRQ {

        @XmlElement(name = "CultureCode")
        protected String cultureCode;
        @XmlElement(name = "User")
        protected User user;

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
         * Gets the value of the user property.
         * 
         * @return
         *     possible object is
         *     {@link User }
         *     
         */
        public User getUser() {
            return user;
        }

        /**
         * Sets the value of the user property.
         * 
         * @param value
         *     allowed object is
         *     {@link User }
         *     
         */
        public void setUser(User value) {
            this.user = value;
        }

    }

}
