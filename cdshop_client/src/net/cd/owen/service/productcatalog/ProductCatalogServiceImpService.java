
package net.cd.owen.service.productcatalog;

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
@WebServiceClient(name = "ProductCatalogServiceImpService", targetNamespace = "http://productcatalog.service.owen.cd.net/", wsdlLocation = "http://127.0.0.1:8080/cdshop_server/ProductCatalogWs?wsdl")
public class ProductCatalogServiceImpService
    extends Service
{

    private final static URL PRODUCTCATALOGSERVICEIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTCATALOGSERVICEIMPSERVICE_EXCEPTION;
    private final static QName PRODUCTCATALOGSERVICEIMPSERVICE_QNAME = new QName("http://productcatalog.service.owen.cd.net/", "ProductCatalogServiceImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8080/cdshop_server/ProductCatalogWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTCATALOGSERVICEIMPSERVICE_WSDL_LOCATION = url;
        PRODUCTCATALOGSERVICEIMPSERVICE_EXCEPTION = e;
    }

    public ProductCatalogServiceImpService() {
        super(__getWsdlLocation(), PRODUCTCATALOGSERVICEIMPSERVICE_QNAME);
    }

    public ProductCatalogServiceImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTCATALOGSERVICEIMPSERVICE_QNAME, features);
    }

    public ProductCatalogServiceImpService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTCATALOGSERVICEIMPSERVICE_QNAME);
    }

    public ProductCatalogServiceImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTCATALOGSERVICEIMPSERVICE_QNAME, features);
    }

    public ProductCatalogServiceImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductCatalogServiceImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductCatalogService
     */
    @WebEndpoint(name = "ProductCatalogServiceImpPort")
    public ProductCatalogService getProductCatalogServiceImpPort() {
        return super.getPort(new QName("http://productcatalog.service.owen.cd.net/", "ProductCatalogServiceImpPort"), ProductCatalogService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductCatalogService
     */
    @WebEndpoint(name = "ProductCatalogServiceImpPort")
    public ProductCatalogService getProductCatalogServiceImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://productcatalog.service.owen.cd.net/", "ProductCatalogServiceImpPort"), ProductCatalogService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTCATALOGSERVICEIMPSERVICE_EXCEPTION!= null) {
            throw PRODUCTCATALOGSERVICEIMPSERVICE_EXCEPTION;
        }
        return PRODUCTCATALOGSERVICEIMPSERVICE_WSDL_LOCATION;
    }

}
