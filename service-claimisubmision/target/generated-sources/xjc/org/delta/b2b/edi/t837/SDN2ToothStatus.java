//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.25 at 02:23:02 PM PDT 
//


package org.delta.b2b.edi.t837;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the status of individual teeth
 * 
 * <p>Java class for S-DN2-Tooth_Status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-DN2-Tooth_Status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-DN201-Reference_Identification" type="{http://www.delta.org/b2b/edi/t837}E-DN201-Reference_Identification"/>
 *         &lt;element name="E-DN202-Tooth_Status_Code" type="{http://www.delta.org/b2b/edi/t837}E-DN202-Tooth_Status_Code"/>
 *         &lt;element name="E-DN203-Quantity" type="{http://www.delta.org/b2b/edi/t837}E-DN203-Quantity" minOccurs="0"/>
 *         &lt;element name="E-DN204-Date_Time_Period_Format_Qualifier" type="{http://www.delta.org/b2b/edi/t837}E-DN204-Date_Time_Period_Format_Qualifier" minOccurs="0"/>
 *         &lt;element name="E-DN205-Date_Time_Period" type="{http://www.delta.org/b2b/edi/t837}E-DN205-Date_Time_Period" minOccurs="0"/>
 *         &lt;element name="E-DN206-Code_List_Qualifier_Code" type="{http://www.delta.org/b2b/edi/t837}E-DN206-Code_List_Qualifier_Code"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="DN2" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Tooth Status" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-DN2-Tooth_Status", propOrder = {
    "edn201ReferenceIdentification",
    "edn202ToothStatusCode",
    "edn203Quantity",
    "edn204DateTimePeriodFormatQualifier",
    "edn205DateTimePeriod",
    "edn206CodeListQualifierCode"
})
public class SDN2ToothStatus {

    @XmlElement(name = "E-DN201-Reference_Identification", required = true)
    protected EDN201ReferenceIdentification edn201ReferenceIdentification;
    @XmlElement(name = "E-DN202-Tooth_Status_Code", required = true)
    protected EDN202ToothStatusCode edn202ToothStatusCode;
    @XmlElementRef(name = "E-DN203-Quantity", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EDN203Quantity> edn203Quantity;
    @XmlElementRef(name = "E-DN204-Date_Time_Period_Format_Qualifier", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EDN204DateTimePeriodFormatQualifier> edn204DateTimePeriodFormatQualifier;
    @XmlElementRef(name = "E-DN205-Date_Time_Period", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EDN205DateTimePeriod> edn205DateTimePeriod;
    @XmlElement(name = "E-DN206-Code_List_Qualifier_Code", required = true)
    protected EDN206CodeListQualifierCode edn206CodeListQualifierCode;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the edn201ReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EDN201ReferenceIdentification }
     *     
     */
    public EDN201ReferenceIdentification getEDN201ReferenceIdentification() {
        return edn201ReferenceIdentification;
    }

    /**
     * Sets the value of the edn201ReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDN201ReferenceIdentification }
     *     
     */
    public void setEDN201ReferenceIdentification(EDN201ReferenceIdentification value) {
        this.edn201ReferenceIdentification = value;
    }

    /**
     * Gets the value of the edn202ToothStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link EDN202ToothStatusCode }
     *     
     */
    public EDN202ToothStatusCode getEDN202ToothStatusCode() {
        return edn202ToothStatusCode;
    }

    /**
     * Sets the value of the edn202ToothStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDN202ToothStatusCode }
     *     
     */
    public void setEDN202ToothStatusCode(EDN202ToothStatusCode value) {
        this.edn202ToothStatusCode = value;
    }

    /**
     * Gets the value of the edn203Quantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EDN203Quantity }{@code >}
     *     
     */
    public JAXBElement<EDN203Quantity> getEDN203Quantity() {
        return edn203Quantity;
    }

    /**
     * Sets the value of the edn203Quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EDN203Quantity }{@code >}
     *     
     */
    public void setEDN203Quantity(JAXBElement<EDN203Quantity> value) {
        this.edn203Quantity = ((JAXBElement<EDN203Quantity> ) value);
    }

    /**
     * Gets the value of the edn204DateTimePeriodFormatQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EDN204DateTimePeriodFormatQualifier }{@code >}
     *     
     */
    public JAXBElement<EDN204DateTimePeriodFormatQualifier> getEDN204DateTimePeriodFormatQualifier() {
        return edn204DateTimePeriodFormatQualifier;
    }

    /**
     * Sets the value of the edn204DateTimePeriodFormatQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EDN204DateTimePeriodFormatQualifier }{@code >}
     *     
     */
    public void setEDN204DateTimePeriodFormatQualifier(JAXBElement<EDN204DateTimePeriodFormatQualifier> value) {
        this.edn204DateTimePeriodFormatQualifier = ((JAXBElement<EDN204DateTimePeriodFormatQualifier> ) value);
    }

    /**
     * Gets the value of the edn205DateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EDN205DateTimePeriod }{@code >}
     *     
     */
    public JAXBElement<EDN205DateTimePeriod> getEDN205DateTimePeriod() {
        return edn205DateTimePeriod;
    }

    /**
     * Sets the value of the edn205DateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EDN205DateTimePeriod }{@code >}
     *     
     */
    public void setEDN205DateTimePeriod(JAXBElement<EDN205DateTimePeriod> value) {
        this.edn205DateTimePeriod = ((JAXBElement<EDN205DateTimePeriod> ) value);
    }

    /**
     * Gets the value of the edn206CodeListQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link EDN206CodeListQualifierCode }
     *     
     */
    public EDN206CodeListQualifierCode getEDN206CodeListQualifierCode() {
        return edn206CodeListQualifierCode;
    }

    /**
     * Sets the value of the edn206CodeListQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDN206CodeListQualifierCode }
     *     
     */
    public void setEDN206CodeListQualifierCode(EDN206CodeListQualifierCode value) {
        this.edn206CodeListQualifierCode = value;
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
            return "DN2";
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
            return "Tooth Status";
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
