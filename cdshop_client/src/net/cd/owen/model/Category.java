
package net.cd.owen.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "category", propOrder = {
    "categoryDescription",
    "categoryId",
    "categoryName",
    "description"
})
public class Category {

    protected String categoryDescription;
    protected long categoryId;
    protected String categoryName;
    protected String description;

    /**
     * Gets the value of the categoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * Sets the value of the categoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryDescription(String value) {
        this.categoryDescription = value;
    }

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
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
