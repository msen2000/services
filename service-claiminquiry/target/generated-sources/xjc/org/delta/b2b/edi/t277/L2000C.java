//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.24 at 03:57:26 PM PDT 
//


package org.delta.b2b.edi.t277;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify dependencies among and the content of hierarchically related groups of data segments
 * 
 * <p>Java class for L-2000C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2000C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-HL-Service_Provider_Level" type="{http://www.delta.org/b2b/edi/t277}S-HL-Service_Provider_Level"/>
 *         &lt;element name="L-2100C" type="{http://www.delta.org/b2b/edi/t277}L-2100C" maxOccurs="2"/>
 *         &lt;element name="L-2200C" type="{http://www.delta.org/b2b/edi/t277}L-2200C" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2000C" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Service Provider Level" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2000C", propOrder = {
    "shlServiceProviderLevel",
    "l2100C",
    "l2200C"
})
public class L2000C {

    @XmlElement(name = "S-HL-Service_Provider_Level", required = true)
    protected SHLServiceProviderLevel shlServiceProviderLevel;
    @XmlElement(name = "L-2100C", required = true)
    protected List<L2100C> l2100C;
    @XmlElementRef(name = "L-2200C", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<L2200C> l2200C;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the shlServiceProviderLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SHLServiceProviderLevel }
     *     
     */
    public SHLServiceProviderLevel getSHLServiceProviderLevel() {
        return shlServiceProviderLevel;
    }

    /**
     * Sets the value of the shlServiceProviderLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHLServiceProviderLevel }
     *     
     */
    public void setSHLServiceProviderLevel(SHLServiceProviderLevel value) {
        this.shlServiceProviderLevel = value;
    }

    /**
     * Gets the value of the l2100C property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l2100C property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL2100C().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L2100C }
     * 
     * 
     */
    public List<L2100C> getL2100C() {
        if (l2100C == null) {
            l2100C = new ArrayList<L2100C>();
        }
        return this.l2100C;
    }

    /**
     * Gets the value of the l2200C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link L2200C }{@code >}
     *     
     */
    public JAXBElement<L2200C> getL2200C() {
        return l2200C;
    }

    /**
     * Sets the value of the l2200C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link L2200C }{@code >}
     *     
     */
    public void setL2200C(JAXBElement<L2200C> value) {
        this.l2200C = ((JAXBElement<L2200C> ) value);
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
            return "2000C";
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
            return "Service Provider Level";
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
            return "Loop";
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
