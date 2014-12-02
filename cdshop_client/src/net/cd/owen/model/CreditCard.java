
package net.cd.owen.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="creditCardPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upperLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCard", propOrder = {
    "bankName",
    "creditCardNumber",
    "creditCardPassword",
    "customerName",
    "upperLimit"
})
public class CreditCard {

    protected String bankName;
    protected long creditCardNumber;
    protected String creditCardPassword;
    protected String customerName;
    protected double upperLimit;

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     */
    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     */
    public void setCreditCardNumber(long value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardPassword() {
        return creditCardPassword;
    }

    /**
     * Sets the value of the creditCardPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardPassword(String value) {
        this.creditCardPassword = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the upperLimit property.
     * 
     */
    public double getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     */
    public void setUpperLimit(double value) {
        this.upperLimit = value;
    }

}
