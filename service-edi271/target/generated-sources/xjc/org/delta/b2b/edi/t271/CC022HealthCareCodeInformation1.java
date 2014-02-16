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
 * To send health care codes and their associated dates, amounts and quantities 
 * 
 * <p>Java class for C-C022-Health_Care_Code_Information_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C-C022-Health_Care_Code_Information_1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-HI01-Code_List_Qualifier_Code" type="{http://www.delta.org/b2b/edi/t271}E-HI01-Code_List_Qualifier_Code_1"/>
 *         &lt;element name="E-HI02-Industry_Code" type="{http://www.delta.org/b2b/edi/t271}E-HI02-Industry_Code"/>
 *         &lt;element name="E-HI03-Date_Time_Period_Format_Qualifier" type="{http://www.delta.org/b2b/edi/t271}E-HI03-Date_Time_Period_Format_Qualifier" minOccurs="0"/>
 *         &lt;element name="E-HI04-Date_Time_Period" type="{http://www.delta.org/b2b/edi/t271}E-HI04-Date_Time_Period" minOccurs="0"/>
 *         &lt;element name="E-HI05-Monetary_Amount" type="{http://www.delta.org/b2b/edi/t271}E-HI05-Monetary_Amount" minOccurs="0"/>
 *         &lt;element name="E-HI06-Quantity" type="{http://www.delta.org/b2b/edi/t271}E-HI06-Quantity" minOccurs="0"/>
 *         &lt;element name="E-HI07-Version_Identifier" type="{http://www.delta.org/b2b/edi/t271}E-HI07-Version_Identifier" minOccurs="0"/>
 *         &lt;element name="E-HI08-Industry_Code" type="{http://www.delta.org/b2b/edi/t271}E-HI08-Industry_Code" minOccurs="0"/>
 *         &lt;element name="E-HI09-Yes_No_Condition_or_Response_Code" type="{http://www.delta.org/b2b/edi/t271}E-HI09-Yes_No_Condition_or_Response_Code" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ApplicationInfo" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Required when it is necessary to report an additional diagnosis and the preceding HI data element has been used to report other diagnoses. If not required by this implementation guide, do not send." />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="C022" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Health Care Code Information" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C-C022-Health_Care_Code_Information_1", propOrder = {
    "ehi01CodeListQualifierCode",
    "ehi02IndustryCode",
    "ehi03DateTimePeriodFormatQualifier",
    "ehi04DateTimePeriod",
    "ehi05MonetaryAmount",
    "ehi06Quantity",
    "ehi07VersionIdentifier",
    "ehi08IndustryCode",
    "ehi09YesNoConditionOrResponseCode"
})
public class CC022HealthCareCodeInformation1 {

    @XmlElement(name = "E-HI01-Code_List_Qualifier_Code", required = true)
    protected EHI01CodeListQualifierCode1 ehi01CodeListQualifierCode;
    @XmlElement(name = "E-HI02-Industry_Code", required = true)
    protected EHI02IndustryCode ehi02IndustryCode;
    @XmlElementRef(name = "E-HI03-Date_Time_Period_Format_Qualifier", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EHI03DateTimePeriodFormatQualifier> ehi03DateTimePeriodFormatQualifier;
    @XmlElementRef(name = "E-HI04-Date_Time_Period", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EHI04DateTimePeriod> ehi04DateTimePeriod;
    @XmlElementRef(name = "E-HI05-Monetary_Amount", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EHI05MonetaryAmount> ehi05MonetaryAmount;
    @XmlElementRef(name = "E-HI06-Quantity", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EHI06Quantity> ehi06Quantity;
    @XmlElementRef(name = "E-HI07-Version_Identifier", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EHI07VersionIdentifier> ehi07VersionIdentifier;
    @XmlElementRef(name = "E-HI08-Industry_Code", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EHI08IndustryCode> ehi08IndustryCode;
    @XmlElementRef(name = "E-HI09-Yes_No_Condition_or_Response_Code", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EHI09YesNoConditionOrResponseCode> ehi09YesNoConditionOrResponseCode;
    @XmlAttribute(name = "ApplicationInfo")
    protected String applicationInfo;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the ehi01CodeListQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link EHI01CodeListQualifierCode1 }
     *     
     */
    public EHI01CodeListQualifierCode1 getEHI01CodeListQualifierCode() {
        return ehi01CodeListQualifierCode;
    }

    /**
     * Sets the value of the ehi01CodeListQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHI01CodeListQualifierCode1 }
     *     
     */
    public void setEHI01CodeListQualifierCode(EHI01CodeListQualifierCode1 value) {
        this.ehi01CodeListQualifierCode = value;
    }

    /**
     * Gets the value of the ehi02IndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link EHI02IndustryCode }
     *     
     */
    public EHI02IndustryCode getEHI02IndustryCode() {
        return ehi02IndustryCode;
    }

    /**
     * Sets the value of the ehi02IndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHI02IndustryCode }
     *     
     */
    public void setEHI02IndustryCode(EHI02IndustryCode value) {
        this.ehi02IndustryCode = value;
    }

    /**
     * Gets the value of the ehi03DateTimePeriodFormatQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EHI03DateTimePeriodFormatQualifier }{@code >}
     *     
     */
    public JAXBElement<EHI03DateTimePeriodFormatQualifier> getEHI03DateTimePeriodFormatQualifier() {
        return ehi03DateTimePeriodFormatQualifier;
    }

    /**
     * Sets the value of the ehi03DateTimePeriodFormatQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EHI03DateTimePeriodFormatQualifier }{@code >}
     *     
     */
    public void setEHI03DateTimePeriodFormatQualifier(JAXBElement<EHI03DateTimePeriodFormatQualifier> value) {
        this.ehi03DateTimePeriodFormatQualifier = ((JAXBElement<EHI03DateTimePeriodFormatQualifier> ) value);
    }

    /**
     * Gets the value of the ehi04DateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EHI04DateTimePeriod }{@code >}
     *     
     */
    public JAXBElement<EHI04DateTimePeriod> getEHI04DateTimePeriod() {
        return ehi04DateTimePeriod;
    }

    /**
     * Sets the value of the ehi04DateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EHI04DateTimePeriod }{@code >}
     *     
     */
    public void setEHI04DateTimePeriod(JAXBElement<EHI04DateTimePeriod> value) {
        this.ehi04DateTimePeriod = ((JAXBElement<EHI04DateTimePeriod> ) value);
    }

    /**
     * Gets the value of the ehi05MonetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EHI05MonetaryAmount }{@code >}
     *     
     */
    public JAXBElement<EHI05MonetaryAmount> getEHI05MonetaryAmount() {
        return ehi05MonetaryAmount;
    }

    /**
     * Sets the value of the ehi05MonetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EHI05MonetaryAmount }{@code >}
     *     
     */
    public void setEHI05MonetaryAmount(JAXBElement<EHI05MonetaryAmount> value) {
        this.ehi05MonetaryAmount = ((JAXBElement<EHI05MonetaryAmount> ) value);
    }

    /**
     * Gets the value of the ehi06Quantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EHI06Quantity }{@code >}
     *     
     */
    public JAXBElement<EHI06Quantity> getEHI06Quantity() {
        return ehi06Quantity;
    }

    /**
     * Sets the value of the ehi06Quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EHI06Quantity }{@code >}
     *     
     */
    public void setEHI06Quantity(JAXBElement<EHI06Quantity> value) {
        this.ehi06Quantity = ((JAXBElement<EHI06Quantity> ) value);
    }

    /**
     * Gets the value of the ehi07VersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EHI07VersionIdentifier }{@code >}
     *     
     */
    public JAXBElement<EHI07VersionIdentifier> getEHI07VersionIdentifier() {
        return ehi07VersionIdentifier;
    }

    /**
     * Sets the value of the ehi07VersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EHI07VersionIdentifier }{@code >}
     *     
     */
    public void setEHI07VersionIdentifier(JAXBElement<EHI07VersionIdentifier> value) {
        this.ehi07VersionIdentifier = ((JAXBElement<EHI07VersionIdentifier> ) value);
    }

    /**
     * Gets the value of the ehi08IndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EHI08IndustryCode }{@code >}
     *     
     */
    public JAXBElement<EHI08IndustryCode> getEHI08IndustryCode() {
        return ehi08IndustryCode;
    }

    /**
     * Sets the value of the ehi08IndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EHI08IndustryCode }{@code >}
     *     
     */
    public void setEHI08IndustryCode(JAXBElement<EHI08IndustryCode> value) {
        this.ehi08IndustryCode = ((JAXBElement<EHI08IndustryCode> ) value);
    }

    /**
     * Gets the value of the ehi09YesNoConditionOrResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EHI09YesNoConditionOrResponseCode }{@code >}
     *     
     */
    public JAXBElement<EHI09YesNoConditionOrResponseCode> getEHI09YesNoConditionOrResponseCode() {
        return ehi09YesNoConditionOrResponseCode;
    }

    /**
     * Sets the value of the ehi09YesNoConditionOrResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EHI09YesNoConditionOrResponseCode }{@code >}
     *     
     */
    public void setEHI09YesNoConditionOrResponseCode(JAXBElement<EHI09YesNoConditionOrResponseCode> value) {
        this.ehi09YesNoConditionOrResponseCode = ((JAXBElement<EHI09YesNoConditionOrResponseCode> ) value);
    }

    /**
     * Gets the value of the applicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationInfo() {
        if (applicationInfo == null) {
            return "Required when it is necessary to report an additional diagnosis and the preceding HI data element has been used to report other diagnoses. If not required by this implementation guide, do not send.";
        } else {
            return applicationInfo;
        }
    }

    /**
     * Sets the value of the applicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationInfo(String value) {
        this.applicationInfo = value;
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
            return "C022";
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
            return "Health Care Code Information";
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
