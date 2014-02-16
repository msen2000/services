//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.30 at 07:43:57 PM PDT 
//


package org.delta.b2b.edi.t271;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To send health care codes and their associated dates, amounts and quantities 
 * 
 * <p>Java class for C-C022-Health_Care_Code_Information_3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C-C022-Health_Care_Code_Information_3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-HI01-Code_List_Qualifier_Code" type="{http://www.delta.org/b2b/edi/t271}E-HI01-Code_List_Qualifier_Code_2"/>
 *         &lt;element name="E-HI02-Industry_Code" type="{http://www.delta.org/b2b/edi/t271}E-HI02-Industry_Code_1"/>
 *         &lt;element name="E-HI03-Date_Time_Period_Format_Qualifier" type="{http://www.delta.org/b2b/edi/t271}E-HI03-Date_Time_Period_Format_Qualifier_1"/>
 *         &lt;element name="E-HI04-Date_Time_Period" type="{http://www.delta.org/b2b/edi/t271}E-HI04-Date_Time_Period_1"/>
 *         &lt;element name="E-HI05-Monetary_Amount" type="{http://www.delta.org/b2b/edi/t271}E-HI05-Monetary_Amount_1"/>
 *         &lt;element name="E-HI06-Quantity" type="{http://www.delta.org/b2b/edi/t271}E-HI06-Quantity_1"/>
 *         &lt;element name="E-HI07-Version_Identifier" type="{http://www.delta.org/b2b/edi/t271}E-HI07-Version_Identifier_1"/>
 *         &lt;element name="E-HI08-Industry_Code" type="{http://www.delta.org/b2b/edi/t271}E-HI08-Industry_Code_1"/>
 *         &lt;element name="E-HI09-Yes_No_Condition_or_Response_Code" type="{http://www.delta.org/b2b/edi/t271}E-HI09-Yes_No_Condition_or_Response_Code_1"/>
 *       &lt;/sequence>
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
@XmlType(name = "C-C022-Health_Care_Code_Information_3", propOrder = {
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
public class CC022HealthCareCodeInformation3 {

    @XmlElement(name = "E-HI01-Code_List_Qualifier_Code", required = true)
    protected EHI01CodeListQualifierCode2 ehi01CodeListQualifierCode;
    @XmlElement(name = "E-HI02-Industry_Code", required = true)
    protected EHI02IndustryCode1 ehi02IndustryCode;
    @XmlElement(name = "E-HI03-Date_Time_Period_Format_Qualifier", required = true)
    protected EHI03DateTimePeriodFormatQualifier1 ehi03DateTimePeriodFormatQualifier;
    @XmlElement(name = "E-HI04-Date_Time_Period", required = true)
    protected EHI04DateTimePeriod1 ehi04DateTimePeriod;
    @XmlElement(name = "E-HI05-Monetary_Amount", required = true)
    protected EHI05MonetaryAmount1 ehi05MonetaryAmount;
    @XmlElement(name = "E-HI06-Quantity", required = true)
    protected EHI06Quantity1 ehi06Quantity;
    @XmlElement(name = "E-HI07-Version_Identifier", required = true)
    protected EHI07VersionIdentifier1 ehi07VersionIdentifier;
    @XmlElement(name = "E-HI08-Industry_Code", required = true)
    protected EHI08IndustryCode1 ehi08IndustryCode;
    @XmlElement(name = "E-HI09-Yes_No_Condition_or_Response_Code", required = true)
    protected EHI09YesNoConditionOrResponseCode1 ehi09YesNoConditionOrResponseCode;
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
     *     {@link EHI01CodeListQualifierCode2 }
     *     
     */
    public EHI01CodeListQualifierCode2 getEHI01CodeListQualifierCode() {
        return ehi01CodeListQualifierCode;
    }

    /**
     * Sets the value of the ehi01CodeListQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHI01CodeListQualifierCode2 }
     *     
     */
    public void setEHI01CodeListQualifierCode(EHI01CodeListQualifierCode2 value) {
        this.ehi01CodeListQualifierCode = value;
    }

    /**
     * Gets the value of the ehi02IndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link EHI02IndustryCode1 }
     *     
     */
    public EHI02IndustryCode1 getEHI02IndustryCode() {
        return ehi02IndustryCode;
    }

    /**
     * Sets the value of the ehi02IndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHI02IndustryCode1 }
     *     
     */
    public void setEHI02IndustryCode(EHI02IndustryCode1 value) {
        this.ehi02IndustryCode = value;
    }

    /**
     * Gets the value of the ehi03DateTimePeriodFormatQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EHI03DateTimePeriodFormatQualifier1 }
     *     
     */
    public EHI03DateTimePeriodFormatQualifier1 getEHI03DateTimePeriodFormatQualifier() {
        return ehi03DateTimePeriodFormatQualifier;
    }

    /**
     * Sets the value of the ehi03DateTimePeriodFormatQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHI03DateTimePeriodFormatQualifier1 }
     *     
     */
    public void setEHI03DateTimePeriodFormatQualifier(EHI03DateTimePeriodFormatQualifier1 value) {
        this.ehi03DateTimePeriodFormatQualifier = value;
    }

    /**
     * Gets the value of the ehi04DateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EHI04DateTimePeriod1 }
     *     
     */
    public EHI04DateTimePeriod1 getEHI04DateTimePeriod() {
        return ehi04DateTimePeriod;
    }

    /**
     * Sets the value of the ehi04DateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHI04DateTimePeriod1 }
     *     
     */
    public void setEHI04DateTimePeriod(EHI04DateTimePeriod1 value) {
        this.ehi04DateTimePeriod = value;
    }

    /**
     * Gets the value of the ehi05MonetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link EHI05MonetaryAmount1 }
     *     
     */
    public EHI05MonetaryAmount1 getEHI05MonetaryAmount() {
        return ehi05MonetaryAmount;
    }

    /**
     * Sets the value of the ehi05MonetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHI05MonetaryAmount1 }
     *     
     */
    public void setEHI05MonetaryAmount(EHI05MonetaryAmount1 value) {
        this.ehi05MonetaryAmount = value;
    }

    /**
     * Gets the value of the ehi06Quantity property.
     * 
     * @return
     *     possible object is
     *     {@link EHI06Quantity1 }
     *     
     */
    public EHI06Quantity1 getEHI06Quantity() {
        return ehi06Quantity;
    }

    /**
     * Sets the value of the ehi06Quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHI06Quantity1 }
     *     
     */
    public void setEHI06Quantity(EHI06Quantity1 value) {
        this.ehi06Quantity = value;
    }

    /**
     * Gets the value of the ehi07VersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link EHI07VersionIdentifier1 }
     *     
     */
    public EHI07VersionIdentifier1 getEHI07VersionIdentifier() {
        return ehi07VersionIdentifier;
    }

    /**
     * Sets the value of the ehi07VersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHI07VersionIdentifier1 }
     *     
     */
    public void setEHI07VersionIdentifier(EHI07VersionIdentifier1 value) {
        this.ehi07VersionIdentifier = value;
    }

    /**
     * Gets the value of the ehi08IndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link EHI08IndustryCode1 }
     *     
     */
    public EHI08IndustryCode1 getEHI08IndustryCode() {
        return ehi08IndustryCode;
    }

    /**
     * Sets the value of the ehi08IndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHI08IndustryCode1 }
     *     
     */
    public void setEHI08IndustryCode(EHI08IndustryCode1 value) {
        this.ehi08IndustryCode = value;
    }

    /**
     * Gets the value of the ehi09YesNoConditionOrResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link EHI09YesNoConditionOrResponseCode1 }
     *     
     */
    public EHI09YesNoConditionOrResponseCode1 getEHI09YesNoConditionOrResponseCode() {
        return ehi09YesNoConditionOrResponseCode;
    }

    /**
     * Sets the value of the ehi09YesNoConditionOrResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHI09YesNoConditionOrResponseCode1 }
     *     
     */
    public void setEHI09YesNoConditionOrResponseCode(EHI09YesNoConditionOrResponseCode1 value) {
        this.ehi09YesNoConditionOrResponseCode = value;
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
