
package net.cd.owen.service.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import net.cd.owen.vo.AccountInfo;


/**
 * <p>Java class for getAccountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAccountResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://customer.service.owen.cd.net/}accountInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountResponse", propOrder = {
    "_return"
})
public class GetAccountResponse {

    @XmlElement(name = "return")
    protected AccountInfo _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfo }
     *     
     */
    public AccountInfo getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfo }
     *     
     */
    public void setReturn(AccountInfo value) {
        this._return = value;
    }

}
