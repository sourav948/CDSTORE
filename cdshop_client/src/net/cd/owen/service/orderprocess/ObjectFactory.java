
package net.cd.owen.service.orderprocess;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import net.cd.owen.model.OrderDetail;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.cd.owen.service.orderprocess package. 
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

    private final static QName _SaveOrderResponse_QNAME = new QName("http://orderprocess.service.owen.cd.net/", "saveOrderResponse");
    private final static QName _SaveOrder_QNAME = new QName("http://orderprocess.service.owen.cd.net/", "saveOrder");
    private final static QName _ConfirmOrder_QNAME = new QName("http://orderprocess.service.owen.cd.net/", "confirmOrder");
    private final static QName _ConfirmOrderResponse_QNAME = new QName("http://orderprocess.service.owen.cd.net/", "confirmOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.cd.owen.service.orderprocess
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveOrderResponse }
     * 
     */
    public SaveOrderResponse createSaveOrderResponse() {
        return new SaveOrderResponse();
    }

    /**
     * Create an instance of {@link SaveOrder }
     * 
     */
    public SaveOrder createSaveOrder() {
        return new SaveOrder();
    }

    /**
     * Create an instance of {@link ConfirmOrder }
     * 
     */
    public ConfirmOrder createConfirmOrder() {
        return new ConfirmOrder();
    }

    /**
     * Create an instance of {@link ConfirmOrderResponse }
     * 
     */
    public ConfirmOrderResponse createConfirmOrderResponse() {
        return new ConfirmOrderResponse();
    }

    /**
     * Create an instance of {@link OrderDetail }
     * 
     */
    public OrderDetail createOrderDetail() {
        return new OrderDetail();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orderprocess.service.owen.cd.net/", name = "saveOrderResponse")
    public JAXBElement<SaveOrderResponse> createSaveOrderResponse(SaveOrderResponse value) {
        return new JAXBElement<SaveOrderResponse>(_SaveOrderResponse_QNAME, SaveOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orderprocess.service.owen.cd.net/", name = "saveOrder")
    public JAXBElement<SaveOrder> createSaveOrder(SaveOrder value) {
        return new JAXBElement<SaveOrder>(_SaveOrder_QNAME, SaveOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orderprocess.service.owen.cd.net/", name = "confirmOrder")
    public JAXBElement<ConfirmOrder> createConfirmOrder(ConfirmOrder value) {
        return new JAXBElement<ConfirmOrder>(_ConfirmOrder_QNAME, ConfirmOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orderprocess.service.owen.cd.net/", name = "confirmOrderResponse")
    public JAXBElement<ConfirmOrderResponse> createConfirmOrderResponse(ConfirmOrderResponse value) {
        return new JAXBElement<ConfirmOrderResponse>(_ConfirmOrderResponse_QNAME, ConfirmOrderResponse.class, null, value);
    }

}
