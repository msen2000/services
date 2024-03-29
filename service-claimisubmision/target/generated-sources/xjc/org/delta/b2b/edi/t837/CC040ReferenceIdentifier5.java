//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.25 at 02:23:02 PM PDT 
//


package org.delta.b2b.edi.t837;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify one or more reference numbers or identification numbers as specified by the Reference Qualifier 
 * 
 * <p>Java class for C-C040-Reference_Identifier_5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C-C040-Reference_Identifier_5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-REF-Reference_Identification_Qualifier" type="{http://www.delta.org/b2b/edi/t837}E-REF-Reference_Identification_Qualifier"/>
 *         &lt;element name="E-REF-Reference_Identification" type="{http://www.delta.org/b2b/edi/t837}E-REF-Reference_Identification"/>
 *         &lt;element name="E-REF-Reference_Identification_Qualifier_1" type="{http://www.delta.org/b2b/edi/t837}E-REF-Reference_Identification_Qualifier"/>
 *         &lt;element name="E-REF-Reference_Identification_1" type="{http://www.delta.org/b2b/edi/t837}E-REF-Reference_Identification"/>
 *         &lt;element name="E-REF-Reference_Identification_Qualifier_2" type="{http://www.delta.org/b2b/edi/t837}E-REF-Reference_Identification_Qualifier"/>
 *         &lt;element name="E-REF-Reference_Identification_2" type="{http://www.delta.org/b2b/edi/t837}E-REF-Reference_Identification"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="C040" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Reference Identifier" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C-C040-Reference_Identifier_5", propOrder = {
    "erefReferenceIdentificationQualifier",
    "erefReferenceIdentification",
    "erefReferenceIdentificationQualifier1",
    "erefReferenceIdentification1",
    "erefReferenceIdentificationQualifier2",
    "erefReferenceIdentification2"
})
public class CC040ReferenceIdentifier5 {

    @XmlElement(name = "E-REF-Reference_Identification_Qualifier", required = true)
    protected EREFReferenceIdentificationQualifier erefReferenceIdentificationQualifier;
    @XmlElement(name = "E-REF-Reference_Identification", required = true)
    protected EREFReferenceIdentification erefReferenceIdentification;
    @XmlElement(name = "E-REF-Reference_Identification_Qualifier_1", required = true)
    protected EREFReferenceIdentificationQualifier erefReferenceIdentificationQualifier1;
    @XmlElement(name = "E-REF-Reference_Identification_1", required = true)
    protected EREFReferenceIdentification erefReferenceIdentification1;
    @XmlElement(name = "E-REF-Reference_Identification_Qualifier_2", required = true)
    protected EREFReferenceIdentificationQualifier erefReferenceIdentificationQualifier2;
    @XmlElement(name = "E-REF-Reference_Identification_2", required = true)
    protected EREFReferenceIdentification erefReferenceIdentification2;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the erefReferenceIdentificationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EREFReferenceIdentificationQualifier }
     *     
     */
    public EREFReferenceIdentificationQualifier getEREFReferenceIdentificationQualifier() {
        return erefReferenceIdentificationQualifier;
    }

    /**
     * Sets the value of the erefReferenceIdentificationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREFReferenceIdentificationQualifier }
     *     
     */
    public void setEREFReferenceIdentificationQualifier(EREFReferenceIdentificationQualifier value) {
        this.erefReferenceIdentificationQualifier = value;
    }

    /**
     * Gets the value of the erefReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EREFReferenceIdentification }
     *     
     */
    public EREFReferenceIdentification getEREFReferenceIdentification() {
        return erefReferenceIdentification;
    }

    /**
     * Sets the value of the erefReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREFReferenceIdentification }
     *     
     */
    public void setEREFReferenceIdentification(EREFReferenceIdentification value) {
        this.erefReferenceIdentification = value;
    }

    /**
     * Gets the value of the erefReferenceIdentificationQualifier1 property.
     * 
     * @return
     *     possible object is
     *     {@link EREFReferenceIdentificationQualifier }
     *     
     */
    public EREFReferenceIdentificationQualifier getEREFReferenceIdentificationQualifier1() {
        return erefReferenceIdentificationQualifier1;
    }

    /**
     * Sets the value of the erefReferenceIdentificationQualifier1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREFReferenceIdentificationQualifier }
     *     
     */
    public void setEREFReferenceIdentificationQualifier1(EREFReferenceIdentificationQualifier value) {
        this.erefReferenceIdentificationQualifier1 = value;
    }

    /**
     * Gets the value of the erefReferenceIdentification1 property.
     * 
     * @return
     *     possible object is
     *     {@link EREFReferenceIdentification }
     *     
     */
    public EREFReferenceIdentification getEREFReferenceIdentification1() {
        return erefReferenceIdentification1;
    }

    /**
     * Sets the value of the erefReferenceIdentification1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREFReferenceIdentification }
     *     
     */
    public void setEREFReferenceIdentification1(EREFReferenceIdentification value) {
        this.erefReferenceIdentification1 = value;
    }

    /**
     * Gets the value of the erefReferenceIdentificationQualifier2 property.
     * 
     * @return
     *     possible object is
     *     {@link EREFReferenceIdentificationQualifier }
     *     
     */
    public EREFReferenceIdentificationQualifier getEREFReferenceIdentificationQualifier2() {
        return erefReferenceIdentificationQualifier2;
    }

    /**
     * Sets the value of the erefReferenceIdentificationQualifier2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREFReferenceIdentificationQualifier }
     *     
     */
    public void setEREFReferenceIdentificationQualifier2(EREFReferenceIdentificationQualifier value) {
        this.erefReferenceIdentificationQualifier2 = value;
    }

    /**
     * Gets the value of the erefReferenceIdentification2 property.
     * 
     * @return
     *     possible object is
     *     {@link EREFReferenceIdentification }
     *     
     */
    public EREFReferenceIdentification getEREFReferenceIdentification2() {
        return erefReferenceIdentification2;
    }

    /**
     * Sets the value of the erefReferenceIdentification2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREFReferenceIdentification }
     *     
     */
    public void setEREFReferenceIdentification2(EREFReferenceIdentification value) {
        this.erefReferenceIdentification2 = value;
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
            return "C040";
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
            return "Reference Identifier";
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
            return "Composite";
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
