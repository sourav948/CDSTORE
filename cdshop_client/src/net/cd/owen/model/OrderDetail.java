
package net.cd.owen.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cdid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderDetailId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderDetail", propOrder = {
    "categoryId",
    "cdid",
    "number",
    "orderDetailId",
    "orderId",
    "price"
})
public class OrderDetail {

    protected long categoryId;
    protected long cdid;
    protected int number;
    protected long orderDetailId;
    protected long orderId;
    protected double price;

    /**
     * Gets the value of the categoryId property.
     * 
     */
    public long getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     */
    public void setCategoryId(long value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the cdid property.
     * 
     */
    public long getCdid() {
        return cdid;
    }

    /**
     * Sets the value of the cdid property.
     * 
     */
    public void setCdid(long value) {
        this.cdid = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the orderDetailId property.
     * 
     */
    public long getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * Sets the value of the orderDetailId property.
     * 
     */
    public void setOrderDetailId(long value) {
        this.orderDetailId = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

}
