//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.24 at 03:57:26 PM PDT 
//


package org.delta.b2b.edi.t277;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To report the status, required action, and paid information of a claim or service line
 * 
 * <p>Java class for S-STC-Provider_Status_Information complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-STC-Provider_Status_Information">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="C-C043-Health_Care_Claim_Status" type="{http://www.delta.org/b2b/edi/t277}C-C043-Health_Care_Claim_Status_3"/>
 *         &lt;element name="E-STC02-Date" type="{http://www.delta.org/b2b/edi/t277}E-STC02-Date"/>
 *         &lt;element name="E-STC03-Action_Code" type="{http://www.delta.org/b2b/edi/t277}E-STC03-Action_Code" minOccurs="0"/>
 *         &lt;element name="E-STC04-Monetary_Amount" type="{http://www.delta.org/b2b/edi/t277}E-STC04-Monetary_Amount" minOccurs="0"/>
 *         &lt;element name="E-STC05-Monetary_Amount" type="{http://www.delta.org/b2b/edi/t277}E-STC05-Monetary_Amount" minOccurs="0"/>
 *         &lt;element name="E-STC06-Date" type="{http://www.delta.org/b2b/edi/t277}E-STC06-Date" minOccurs="0"/>
 *         &lt;element name="E-STC07-Payment_Method_Code" type="{http://www.delta.org/b2b/edi/t277}E-STC07-Payment_Method_Code" minOccurs="0"/>
 *         &lt;element name="E-STC08-Date" type="{http://www.delta.org/b2b/edi/t277}E-STC08-Date" minOccurs="0"/>
 *         &lt;element name="E-STC09-Check_Number" type="{http://www.delta.org/b2b/edi/t277}E-STC09-Check_Number" minOccurs="0"/>
 *         &lt;element name="C-C043-Health_Care_Claim_Status_1" type="{http://www.delta.org/b2b/edi/t277}C-C043-Health_Care_Claim_Status_4" minOccurs="0"/>
 *         &lt;element name="C-C043-Health_Care_Claim_Status_2" type="{http://www.delta.org/b2b/edi/t277}C-C043-Health_Care_Claim_Status_5" minOccurs="0"/>
 *         &lt;element name="E-STC12-Free-form_Message_Text" type="{http://www.delta.org/b2b/edi/t277}E-STC12-Free-form_Message_Text" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="STC" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Provider Status Information" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-STC-Provider_Status_Information", propOrder = {
    "cc043HealthCareClaimStatus",
    "estc02Date",
    "estc03ActionCode",
    "estc04MonetaryAmount",
    "estc05MonetaryAmount",
    "estc06Date",
    "estc07PaymentMethodCode",
    "estc08Date",
    "estc09CheckNumber",
    "cc043HealthCareClaimStatus1",
    "cc043HealthCareClaimStatus2",
    "estc12FreeFormMessageText"
})
public class SSTCProviderStatusInformation {

    @XmlElement(name = "C-C043-Health_Care_Claim_Status", required = true)
    protected CC043HealthCareClaimStatus3 cc043HealthCareClaimStatus;
    @XmlElement(name = "E-STC02-Date", required = true)
    protected ESTC02Date estc02Date;
    @XmlElementRef(name = "E-STC03-Action_Code", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<ESTC03ActionCode> estc03ActionCode;
    @XmlElementRef(name = "E-STC04-Monetary_Amount", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<ESTC04MonetaryAmount> estc04MonetaryAmount;
    @XmlElementRef(name = "E-STC05-Monetary_Amount", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<ESTC05MonetaryAmount> estc05MonetaryAmount;
    @XmlElementRef(name = "E-STC06-Date", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<ESTC06Date> estc06Date;
    @XmlElementRef(name = "E-STC07-Payment_Method_Code", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<ESTC07PaymentMethodCode> estc07PaymentMethodCode;
    @XmlElementRef(name = "E-STC08-Date", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<ESTC08Date> estc08Date;
    @XmlElementRef(name = "E-STC09-Check_Number", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<ESTC09CheckNumber> estc09CheckNumber;
    @XmlElementRef(name = "C-C043-Health_Care_Claim_Status_1", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<CC043HealthCareClaimStatus4> cc043HealthCareClaimStatus1;
    @XmlElementRef(name = "C-C043-Health_Care_Claim_Status_2", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<CC043HealthCareClaimStatus5> cc043HealthCareClaimStatus2;
    @XmlElementRef(name = "E-STC12-Free-form_Message_Text", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<ESTC12FreeFormMessageText> estc12FreeFormMessageText;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the cc043HealthCareClaimStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CC043HealthCareClaimStatus3 }
     *     
     */
    public CC043HealthCareClaimStatus3 getCC043HealthCareClaimStatus() {
        return cc043HealthCareClaimStatus;
    }

    /**
     * Sets the value of the cc043HealthCareClaimStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CC043HealthCareClaimStatus3 }
     *     
     */
    public void setCC043HealthCareClaimStatus(CC043HealthCareClaimStatus3 value) {
        this.cc043HealthCareClaimStatus = value;
    }

    /**
     * Gets the value of the estc02Date property.
     * 
     * @return
     *     possible object is
     *     {@link ESTC02Date }
     *     
     */
    public ESTC02Date getESTC02Date() {
        return estc02Date;
    }

    /**
     * Sets the value of the estc02Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESTC02Date }
     *     
     */
    public void setESTC02Date(ESTC02Date value) {
        this.estc02Date = value;
    }

    /**
     * Gets the value of the estc03ActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESTC03ActionCode }{@code >}
     *     
     */
    public JAXBElement<ESTC03ActionCode> getESTC03ActionCode() {
        return estc03ActionCode;
    }

    /**
     * Sets the value of the estc03ActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESTC03ActionCode }{@code >}
     *     
     */
    public void setESTC03ActionCode(JAXBElement<ESTC03ActionCode> value) {
        this.estc03ActionCode = ((JAXBElement<ESTC03ActionCode> ) value);
    }

    /**
     * Gets the value of the estc04MonetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESTC04MonetaryAmount }{@code >}
     *     
     */
    public JAXBElement<ESTC04MonetaryAmount> getESTC04MonetaryAmount() {
        return estc04MonetaryAmount;
    }

    /**
     * Sets the value of the estc04MonetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESTC04MonetaryAmount }{@code >}
     *     
     */
    public void setESTC04MonetaryAmount(JAXBElement<ESTC04MonetaryAmount> value) {
        this.estc04MonetaryAmount = ((JAXBElement<ESTC04MonetaryAmount> ) value);
    }

    /**
     * Gets the value of the estc05MonetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESTC05MonetaryAmount }{@code >}
     *     
     */
    public JAXBElement<ESTC05MonetaryAmount> getESTC05MonetaryAmount() {
        return estc05MonetaryAmount;
    }

    /**
     * Sets the value of the estc05MonetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESTC05MonetaryAmount }{@code >}
     *     
     */
    public void setESTC05MonetaryAmount(JAXBElement<ESTC05MonetaryAmount> value) {
        this.estc05MonetaryAmount = ((JAXBElement<ESTC05MonetaryAmount> ) value);
    }

    /**
     * Gets the value of the estc06Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESTC06Date }{@code >}
     *     
     */
    public JAXBElement<ESTC06Date> getESTC06Date() {
        return estc06Date;
    }

    /**
     * Sets the value of the estc06Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESTC06Date }{@code >}
     *     
     */
    public void setESTC06Date(JAXBElement<ESTC06Date> value) {
        this.estc06Date = ((JAXBElement<ESTC06Date> ) value);
    }

    /**
     * Gets the value of the estc07PaymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESTC07PaymentMethodCode }{@code >}
     *     
     */
    public JAXBElement<ESTC07PaymentMethodCode> getESTC07PaymentMethodCode() {
        return estc07PaymentMethodCode;
    }

    /**
     * Sets the value of the estc07PaymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESTC07PaymentMethodCode }{@code >}
     *     
     */
    public void setESTC07PaymentMethodCode(JAXBElement<ESTC07PaymentMethodCode> value) {
        this.estc07PaymentMethodCode = ((JAXBElement<ESTC07PaymentMethodCode> ) value);
    }

    /**
     * Gets the value of the estc08Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESTC08Date }{@code >}
     *     
     */
    public JAXBElement<ESTC08Date> getESTC08Date() {
        return estc08Date;
    }

    /**
     * Sets the value of the estc08Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESTC08Date }{@code >}
     *     
     */
    public void setESTC08Date(JAXBElement<ESTC08Date> value) {
        this.estc08Date = ((JAXBElement<ESTC08Date> ) value);
    }

    /**
     * Gets the value of the estc09CheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESTC09CheckNumber }{@code >}
     *     
     */
    public JAXBElement<ESTC09CheckNumber> getESTC09CheckNumber() {
        return estc09CheckNumber;
    }

    /**
     * Sets the value of the estc09CheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESTC09CheckNumber }{@code >}
     *     
     */
    public void setESTC09CheckNumber(JAXBElement<ESTC09CheckNumber> value) {
        this.estc09CheckNumber = ((JAXBElement<ESTC09CheckNumber> ) value);
    }

    /**
     * Gets the value of the cc043HealthCareClaimStatus1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CC043HealthCareClaimStatus4 }{@code >}
     *     
     */
    public JAXBElement<CC043HealthCareClaimStatus4> getCC043HealthCareClaimStatus1() {
        return cc043HealthCareClaimStatus1;
    }

    /**
     * Sets the value of the cc043HealthCareClaimStatus1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CC043HealthCareClaimStatus4 }{@code >}
     *     
     */
    public void setCC043HealthCareClaimStatus1(JAXBElement<CC043HealthCareClaimStatus4> value) {
        this.cc043HealthCareClaimStatus1 = ((JAXBElement<CC043HealthCareClaimStatus4> ) value);
    }

    /**
     * Gets the value of the cc043HealthCareClaimStatus2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CC043HealthCareClaimStatus5 }{@code >}
     *     
     */
    public JAXBElement<CC043HealthCareClaimStatus5> getCC043HealthCareClaimStatus2() {
        return cc043HealthCareClaimStatus2;
    }

    /**
     * Sets the value of the cc043HealthCareClaimStatus2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CC043HealthCareClaimStatus5 }{@code >}
     *     
     */
    public void setCC043HealthCareClaimStatus2(JAXBElement<CC043HealthCareClaimStatus5> value) {
        this.cc043HealthCareClaimStatus2 = ((JAXBElement<CC043HealthCareClaimStatus5> ) value);
    }

    /**
     * Gets the value of the estc12FreeFormMessageText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESTC12FreeFormMessageText }{@code >}
     *     
     */
    public JAXBElement<ESTC12FreeFormMessageText> getESTC12FreeFormMessageText() {
        return estc12FreeFormMessageText;
    }

    /**
     * Sets the value of the estc12FreeFormMessageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESTC12FreeFormMessageText }{@code >}
     *     
     */
    public void setESTC12FreeFormMessageText(JAXBElement<ESTC12FreeFormMessageText> value) {
        this.estc12FreeFormMessageText = ((JAXBElement<ESTC12FreeFormMessageText> ) value);
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
            return "STC";
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
            return "Provider Status Information";
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
