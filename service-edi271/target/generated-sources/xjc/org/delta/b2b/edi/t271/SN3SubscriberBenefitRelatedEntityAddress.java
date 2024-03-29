//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.30 at 07:43:57 PM PDT 
//


package org.delta.b2b.edi.t271;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the location of the named party
 * 
 * <p>Java class for S-N3-Subscriber_Benefit_Related_Entity_Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-N3-Subscriber_Benefit_Related_Entity_Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-N301-Address_Information" type="{http://www.delta.org/b2b/edi/t271}E-N301-Address_Information"/>
 *         &lt;element name="E-N302-Address_Information" type="{http://www.delta.org/b2b/edi/t271}E-N302-Address_Information" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="N3" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Subscriber Benefit Related Entity Address" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-N3-Subscriber_Benefit_Related_Entity_Address", propOrder = {
    "en301AddressInformation",
    "en302AddressInformation"
})
public class SN3SubscriberBenefitRelatedEntityAddress {

    @XmlElement(name = "E-N301-Address_Information", required = true)
    protected EN301AddressInformation en301AddressInformation;
    @XmlElementRef(name = "E-N302-Address_Information", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EN302AddressInformation> en302AddressInformation;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the en301AddressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EN301AddressInformation }
     *     
     */
    public EN301AddressInformation getEN301AddressInformation() {
        return en301AddressInformation;
    }

    /**
     * Sets the value of the en301AddressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EN301AddressInformation }
     *     
     */
    public void setEN301AddressInformation(EN301AddressInformation value) {
        this.en301AddressInformation = value;
    }

    /**
     * Gets the value of the en302AddressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EN302AddressInformation }{@code >}
     *     
     */
    public JAXBElement<EN302AddressInformation> getEN302AddressInformation() {
        return en302AddressInformation;
    }

    /**
     * Sets the value of the en302AddressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EN302AddressInformation }{@code >}
     *     
     */
    public void setEN302AddressInformation(JAXBElement<EN302AddressInformation> value) {
        this.en302AddressInformation = ((JAXBElement<EN302AddressInformation> ) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        if (id == null) {
            return "N3";
        } else {
            return id;
        }
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "Subscriber Benefit Related Entity Address";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "Segment";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
