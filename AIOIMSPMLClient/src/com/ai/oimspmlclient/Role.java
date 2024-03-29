
package com.ai.oimspmlclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that represents a Role entity (typically backed by an
 *                 LDAP object that includes the groupOfUniqueNames or groupOfNames
 *                 objectclass).
 * 
 * <p>Java class for role complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="role">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributes" type="{http://xmlns.oracle.com/idm/identity/PSO}unboundedAttributes" minOccurs="0"/>
 *         &lt;element name="commonName" type="{http://xmlns.oracle.com/idm/identity/PSO}localizedMultiValuedString"/>
 *         &lt;element name="description" type="{http://xmlns.oracle.com/idm/identity/PSO}localizedMultiValuedString" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://xmlns.oracle.com/idm/identity/PSO}localizedSingleValuedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "role", namespace = "http://xmlns.oracle.com/idm/identity/PSO", propOrder = {
    "attributes",
    "commonName",
    "description",
    "displayName"
})
public class Role {

    protected UnboundedAttributes attributes;
    @XmlElement(required = true)
    protected LocalizedMultiValuedString commonName;
    protected LocalizedMultiValuedString description;
    protected LocalizedSingleValuedString displayName;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link UnboundedAttributes }
     *     
     */
    public UnboundedAttributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnboundedAttributes }
     *     
     */
    public void setAttributes(UnboundedAttributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public LocalizedMultiValuedString getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public void setCommonName(LocalizedMultiValuedString value) {
        this.commonName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public LocalizedMultiValuedString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMultiValuedString }
     *     
     */
    public void setDescription(LocalizedMultiValuedString value) {
        this.description = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedSingleValuedString }
     *     
     */
    public LocalizedSingleValuedString getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedSingleValuedString }
     *     
     */
    public void setDisplayName(LocalizedSingleValuedString value) {
        this.displayName = value;
    }

}
