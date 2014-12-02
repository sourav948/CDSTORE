
package net.cd.owen.service.customer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import net.cd.owen.model.CreditCard;
import net.cd.owen.model.Customer;
import net.cd.owen.model.Order;
import net.cd.owen.vo.AccountInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.cd.owen.service.customer package. 
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

    private final static QName _GetAccountResponse_QNAME = new QName("http://customer.service.owen.cd.net/", "getAccountResponse");
    private final static QName _CreditVerifiedResponse_QNAME = new QName("http://customer.service.owen.cd.net/", "creditVerifiedResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://customer.service.owen.cd.net/", "registerResponse");
    private final static QName _GetAccount_QNAME = new QName("http://customer.service.owen.cd.net/", "getAccount");
    private final static QName _CreditVerified_QNAME = new QName("http://customer.service.owen.cd.net/", "creditVerified");
    private final static QName _Register_QNAME = new QName("http://customer.service.owen.cd.net/", "register");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.cd.owen.service.customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link CreditVerified }
     * 
     */
    public CreditVerified createCreditVerified() {
        return new CreditVerified();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link CreditVerifiedResponse }
     * 
     */
    public CreditVerifiedResponse createCreditVerifiedResponse() {
        return new CreditVerifiedResponse();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.service.owen.cd.net/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<GetAccountResponse>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditVerifiedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.service.owen.cd.net/", name = "creditVerifiedResponse")
    public JAXBElement<CreditVerifiedResponse> createCreditVerifiedResponse(CreditVerifiedResponse value) {
        return new JAXBElement<CreditVerifiedResponse>(_CreditVerifiedResponse_QNAME, CreditVerifiedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.service.owen.cd.net/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.service.owen.cd.net/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<GetAccount>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditVerified }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.service.owen.cd.net/", name = "creditVerified")
    public JAXBElement<CreditVerified> createCreditVerified(CreditVerified value) {
        return new JAXBElement<CreditVerified>(_CreditVerified_QNAME, CreditVerified.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer.service.owen.cd.net/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

}
