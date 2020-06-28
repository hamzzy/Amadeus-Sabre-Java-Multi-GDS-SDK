
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.traveltalk.wsissueticket package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TripXML_QNAME = new QName("http://traveltalk.com/wsIssueTicket", "TripXML");
    private final static QName _String_QNAME = new QName("http://traveltalk.com/wsIssueTicket", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.traveltalk.wsissueticket
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WmIssueTicket }
     * 
     */
    public WmIssueTicket createWmIssueTicket() {
        return new WmIssueTicket();
    }

    /**
     * Create an instance of {@link TTIssueTicketRQ }
     * 
     */
    public TTIssueTicketRQ createTTIssueTicketRQ() {
        return new TTIssueTicketRQ();
    }

    /**
     * Create an instance of {@link WmIssueTicketResponse }
     * 
     */
    public WmIssueTicketResponse createWmIssueTicketResponse() {
        return new WmIssueTicketResponse();
    }

    /**
     * Create an instance of {@link TTIssueTicketRS }
     * 
     */
    public TTIssueTicketRS createTTIssueTicketRS() {
        return new TTIssueTicketRS();
    }

    /**
     * Create an instance of {@link WmIssueTicketXmlResponse }
     * 
     */
    public WmIssueTicketXmlResponse createWmIssueTicketXmlResponse() {
        return new WmIssueTicketXmlResponse();
    }

    /**
     * Create an instance of {@link TripXML }
     * 
     */
    public TripXML createTripXML() {
        return new TripXML();
    }

    /**
     * Create an instance of {@link WmIssueTicketXml }
     * 
     */
    public WmIssueTicketXml createWmIssueTicketXml() {
        return new WmIssueTicketXml();
    }

    /**
     * Create an instance of {@link UniqueID }
     * 
     */
    public UniqueID createUniqueID() {
        return new UniqueID();
    }

    /**
     * Create an instance of {@link Ticketing }
     * 
     */
    public Ticketing createTicketing() {
        return new Ticketing();
    }

    /**
     * Create an instance of {@link TPAExtensions }
     * 
     */
    public TPAExtensions createTPAExtensions() {
        return new TPAExtensions();
    }

    /**
     * Create an instance of {@link PaymentCard }
     * 
     */
    public PaymentCard createPaymentCard() {
        return new PaymentCard();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link CardHolderName }
     * 
     */
    public CardHolderName createCardHolderName() {
        return new CardHolderName();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link Success }
     * 
     */
    public Success createSuccess() {
        return new Success();
    }

    /**
     * Create an instance of {@link DirectBill }
     * 
     */
    public DirectBill createDirectBill() {
        return new DirectBill();
    }

    /**
     * Create an instance of {@link UniqueIDRS }
     * 
     */
    public UniqueIDRS createUniqueIDRS() {
        return new UniqueIDRS();
    }

    /**
     * Create an instance of {@link PaymentDetail }
     * 
     */
    public PaymentDetail createPaymentDetail() {
        return new PaymentDetail();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link TicketingControl }
     * 
     */
    public TicketingControl createTicketingControl() {
        return new TicketingControl();
    }

    /**
     * Create an instance of {@link RequestorID }
     * 
     */
    public RequestorID createRequestorID() {
        return new RequestorID();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link Fare }
     * 
     */
    public Fare createFare() {
        return new Fare();
    }

    /**
     * Create an instance of {@link Fulfillment }
     * 
     */
    public Fulfillment createFulfillment() {
        return new Fulfillment();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentDetail }
     * 
     */
    public ArrayOfPaymentDetail createArrayOfPaymentDetail() {
        return new ArrayOfPaymentDetail();
    }

    /**
     * Create an instance of {@link POS }
     * 
     */
    public POS createPOS() {
        return new POS();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfString1 }
     * 
     */
    public ArrayOfString1 createArrayOfString1() {
        return new ArrayOfString1();
    }

    /**
     * Create an instance of {@link MiscChargeOrder }
     * 
     */
    public MiscChargeOrder createMiscChargeOrder() {
        return new MiscChargeOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsIssueTicket", name = "TripXML")
    public JAXBElement<TripXML> createTripXML(TripXML value) {
        return new JAXBElement<TripXML>(_TripXML_QNAME, TripXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsIssueTicket", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
