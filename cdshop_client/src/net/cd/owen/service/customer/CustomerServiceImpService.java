
package net.cd.owen.service.customer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CustomerServiceImpService", targetNamespace = "http://customer.service.owen.cd.net/", wsdlLocation = "http://127.0.0.1:8080/cdshop_server/CustomerWs?wsdl")
public class CustomerServiceImpService
    extends Service
{

    private final static URL CUSTOMERSERVICEIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERSERVICEIMPSERVICE_EXCEPTION;
    private final static QName CUSTOMERSERVICEIMPSERVICE_QNAME = new QName("http://customer.service.owen.cd.net/", "CustomerServiceImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8080/cdshop_server/CustomerWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERSERVICEIMPSERVICE_WSDL_LOCATION = url;
        CUSTOMERSERVICEIMPSERVICE_EXCEPTION = e;
    }

    public CustomerServiceImpService() {
        super(__getWsdlLocation(), CUSTOMERSERVICEIMPSERVICE_QNAME);
    }

    public CustomerServiceImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSTOMERSERVICEIMPSERVICE_QNAME, features);
    }

    public CustomerServiceImpService(URL wsdlLocation) {
        super(wsdlLocation, CUSTOMERSERVICEIMPSERVICE_QNAME);
    }

    public CustomerServiceImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSTOMERSERVICEIMPSERVICE_QNAME, features);
    }

    public CustomerServiceImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerServiceImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CustomerService
     */
    @WebEndpoint(name = "CustomerServiceImpPort")
    public CustomerService getCustomerServiceImpPort() {
        return super.getPort(new QName("http://customer.service.owen.cd.net/", "CustomerServiceImpPort"), CustomerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerService
     */
    @WebEndpoint(name = "CustomerServiceImpPort")
    public CustomerService getCustomerServiceImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://customer.service.owen.cd.net/", "CustomerServiceImpPort"), CustomerService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERSERVICEIMPSERVICE_EXCEPTION!= null) {
            throw CUSTOMERSERVICEIMPSERVICE_EXCEPTION;
        }
        return CUSTOMERSERVICEIMPSERVICE_WSDL_LOCATION;
    }

}
