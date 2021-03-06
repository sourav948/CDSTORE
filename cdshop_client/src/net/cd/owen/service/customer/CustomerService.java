
package net.cd.owen.service.customer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import net.cd.owen.model.CreditCard;
import net.cd.owen.model.Customer;
import net.cd.owen.vo.AccountInfo;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CustomerService", targetNamespace = "http://customer.service.owen.cd.net/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerService {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://customer.service.owen.cd.net/", className = "net.cd.owen.service.customer.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://customer.service.owen.cd.net/", className = "net.cd.owen.service.customer.RegisterResponse")
    @Action(input = "http://customer.service.owen.cd.net/CustomerService/registerRequest", output = "http://customer.service.owen.cd.net/CustomerService/registerResponse")
    public int register(
        @WebParam(name = "arg0", targetNamespace = "")
        Customer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns net.cd.owen.service.customer.AccountInfo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccount", targetNamespace = "http://customer.service.owen.cd.net/", className = "net.cd.owen.service.customer.GetAccount")
    @ResponseWrapper(localName = "getAccountResponse", targetNamespace = "http://customer.service.owen.cd.net/", className = "net.cd.owen.service.customer.GetAccountResponse")
    @Action(input = "http://customer.service.owen.cd.net/CustomerService/getAccountRequest", output = "http://customer.service.owen.cd.net/CustomerService/getAccountResponse")
    public AccountInfo getAccount(
        @WebParam(name = "arg0", targetNamespace = "")
        Customer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "creditVerified", targetNamespace = "http://customer.service.owen.cd.net/", className = "net.cd.owen.service.customer.CreditVerified")
    @ResponseWrapper(localName = "creditVerifiedResponse", targetNamespace = "http://customer.service.owen.cd.net/", className = "net.cd.owen.service.customer.CreditVerifiedResponse")
    @Action(input = "http://customer.service.owen.cd.net/CustomerService/creditVerifiedRequest", output = "http://customer.service.owen.cd.net/CustomerService/creditVerifiedResponse")
    public boolean creditVerified(
        @WebParam(name = "arg0", targetNamespace = "")
        CreditCard arg0);

}
