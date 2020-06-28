
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="AmadeusAPICommandRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Command" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Server" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PortNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "amadeusAPICommandRQ"
})
@XmlRootElement(name = "ExecuteCommand")
public class ExecuteCommand {

    @XmlElement(name = "AmadeusAPICommandRQ")
    protected ExecuteCommand.AmadeusAPICommandRQ amadeusAPICommandRQ;

    /**
     * Gets the value of the amadeusAPICommandRQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteCommand.AmadeusAPICommandRQ }
     *     
     */
    public ExecuteCommand.AmadeusAPICommandRQ getAmadeusAPICommandRQ() {
        return amadeusAPICommandRQ;
    }

    /**
     * Sets the value of the amadeusAPICommandRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteCommand.AmadeusAPICommandRQ }
     *     
     */
    public void setAmadeusAPICommandRQ(ExecuteCommand.AmadeusAPICommandRQ value) {
        this.amadeusAPICommandRQ = value;
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
     *       &lt;attribute name="Command" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Server" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PortNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AmadeusAPICommandRQ {

        @XmlAttribute(name = "Command")
        protected String command;
        @XmlAttribute(name = "Server")
        protected String server;
        @XmlAttribute(name = "PortNumber")
        protected String portNumber;
        @XmlAttribute(name = "CorporateId")
        protected String corporateId;
        @XmlAttribute(name = "UserId")
        protected String userId;
        @XmlAttribute(name = "Password")
        protected String password;

        /**
         * Gets the value of the command property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommand() {
            return command;
        }

        /**
         * Sets the value of the command property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommand(String value) {
            this.command = value;
        }

        /**
         * Gets the value of the server property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServer() {
            return server;
        }

        /**
         * Sets the value of the server property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServer(String value) {
            this.server = value;
        }

        /**
         * Gets the value of the portNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPortNumber() {
            return portNumber;
        }

        /**
         * Sets the value of the portNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPortNumber(String value) {
            this.portNumber = value;
        }

        /**
         * Gets the value of the corporateId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorporateId() {
            return corporateId;
        }

        /**
         * Sets the value of the corporateId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorporateId(String value) {
            this.corporateId = value;
        }

        /**
         * Gets the value of the userId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserId() {
            return userId;
        }

        /**
         * Sets the value of the userId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserId(String value) {
            this.userId = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

    }

}
