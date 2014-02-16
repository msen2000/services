//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.25 at 02:23:02 PM PDT 
//


package org.delta.b2b.edi.t837;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * To supply the full name of an individual or organizational entity
 * 
 * <p>Java class for L-2330B complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2330B">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-NM1-Other_Payer_Name" type="{http://www.delta.org/b2b/edi/t837}S-NM1-Other_Payer_Name"/>
 *         &lt;element name="S-N3-Other_Payer_Address" type="{http://www.delta.org/b2b/edi/t837}S-N3-Other_Payer_Address" minOccurs="0"/>
 *         &lt;element name="S-N4-Other_Payer_City__State__ZIP_Code" type="{http://www.delta.org/b2b/edi/t837}S-N4-Other_Payer_City__State__ZIP_Code" minOccurs="0"/>
 *         &lt;element name="S-DTP-Claim_Check_Or_Remittance_Date" type="{http://www.delta.org/b2b/edi/t837}S-DTP-Claim_Check_Or_Remittance_Date" minOccurs="0"/>
 *         &lt;choice maxOccurs="8" minOccurs="0">
 *           &lt;element name="S-REF-Other_Payer_Secondary_Identifier" type="{http://www.delta.org/b2b/edi/t837}S-REF-Other_Payer_Secondary_Identifier" maxOccurs="3" minOccurs="0"/>
 *           &lt;element name="S-REF-Other_Payer_Prior_Authorization_Number" type="{http://www.delta.org/b2b/edi/t837}S-REF-Other_Payer_Prior_Authorization_Number" minOccurs="0"/>
 *           &lt;element name="S-REF-Other_Payer_Referral_Number" type="{http://www.delta.org/b2b/edi/t837}S-REF-Other_Payer_Referral_Number" minOccurs="0"/>
 *           &lt;element name="S-REF-Other_Payer_Claim_Adjustment_Indicator" type="{http://www.delta.org/b2b/edi/t837}S-REF-Other_Payer_Claim_Adjustment_Indicator" minOccurs="0"/>
 *           &lt;element name="S-REF-Other_Payer_Predetermination_Identification" type="{http://www.delta.org/b2b/edi/t837}S-REF-Other_Payer_Predetermination_Identification" minOccurs="0"/>
 *           &lt;element name="S-REF-Other_Payer_Claim_Control_Number" type="{http://www.delta.org/b2b/edi/t837}S-REF-Other_Payer_Claim_Control_Number" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2330B" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Other Payer Name" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2330B", propOrder = {
    "snm1OtherPayerName",
    "sn3OtherPayerAddress",
    "sn4OtherPayerCityStateZIPCode",
    "sdtpClaimCheckOrRemittanceDate",
    "srefOtherPayerSecondaryIdentifierOrSREFOtherPayerPriorAuthorizationNumberOrSREFOtherPayerReferralNumber"
})
public class L2330B {

    @XmlElement(name = "S-NM1-Other_Payer_Name", required = true)
    protected SNM1OtherPayerName snm1OtherPayerName;
    @XmlElementRef(name = "S-N3-Other_Payer_Address", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SN3OtherPayerAddress> sn3OtherPayerAddress;
    @XmlElementRef(name = "S-N4-Other_Payer_City__State__ZIP_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SN4OtherPayerCityStateZIPCode> sn4OtherPayerCityStateZIPCode;
    @XmlElementRef(name = "S-DTP-Claim_Check_Or_Remittance_Date", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SDTPClaimCheckOrRemittanceDate> sdtpClaimCheckOrRemittanceDate;
    @XmlElements({
        @XmlElement(name = "S-REF-Other_Payer_Claim_Control_Number", type = SREFOtherPayerClaimControlNumber.class, nillable = true),
        @XmlElement(name = "S-REF-Other_Payer_Claim_Adjustment_Indicator", type = SREFOtherPayerClaimAdjustmentIndicator.class, nillable = true),
        @XmlElement(name = "S-REF-Other_Payer_Referral_Number", type = SREFOtherPayerReferralNumber.class, nillable = true),
        @XmlElement(name = "S-REF-Other_Payer_Secondary_Identifier", type = SREFOtherPayerSecondaryIdentifier.class, nillable = true),
        @XmlElement(name = "S-REF-Other_Payer_Prior_Authorization_Number", type = SREFOtherPayerPriorAuthorizationNumber.class, nillable = true),
        @XmlElement(name = "S-REF-Other_Payer_Predetermination_Identification", type = SREFOtherPayerPredeterminationIdentification.class, nillable = true)
    })
    protected List<Object> srefOtherPayerSecondaryIdentifierOrSREFOtherPayerPriorAuthorizationNumberOrSREFOtherPayerReferralNumber;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the snm1OtherPayerName property.
     * 
     * @return
     *     possible object is
     *     {@link SNM1OtherPayerName }
     *     
     */
    public SNM1OtherPayerName getSNM1OtherPayerName() {
        return snm1OtherPayerName;
    }

    /**
     * Sets the value of the snm1OtherPayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNM1OtherPayerName }
     *     
     */
    public void setSNM1OtherPayerName(SNM1OtherPayerName value) {
        this.snm1OtherPayerName = value;
    }

    /**
     * Gets the value of the sn3OtherPayerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SN3OtherPayerAddress }{@code >}
     *     
     */
    public JAXBElement<SN3OtherPayerAddress> getSN3OtherPayerAddress() {
        return sn3OtherPayerAddress;
    }

    /**
     * Sets the value of the sn3OtherPayerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SN3OtherPayerAddress }{@code >}
     *     
     */
    public void setSN3OtherPayerAddress(JAXBElement<SN3OtherPayerAddress> value) {
        this.sn3OtherPayerAddress = ((JAXBElement<SN3OtherPayerAddress> ) value);
    }

    /**
     * Gets the value of the sn4OtherPayerCityStateZIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SN4OtherPayerCityStateZIPCode }{@code >}
     *     
     */
    public JAXBElement<SN4OtherPayerCityStateZIPCode> getSN4OtherPayerCityStateZIPCode() {
        return sn4OtherPayerCityStateZIPCode;
    }

    /**
     * Sets the value of the sn4OtherPayerCityStateZIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SN4OtherPayerCityStateZIPCode }{@code >}
     *     
     */
    public void setSN4OtherPayerCityStateZIPCode(JAXBElement<SN4OtherPayerCityStateZIPCode> value) {
        this.sn4OtherPayerCityStateZIPCode = ((JAXBElement<SN4OtherPayerCityStateZIPCode> ) value);
    }

    /**
     * Gets the value of the sdtpClaimCheckOrRemittanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SDTPClaimCheckOrRemittanceDate }{@code >}
     *     
     */
    public JAXBElement<SDTPClaimCheckOrRemittanceDate> getSDTPClaimCheckOrRemittanceDate() {
        return sdtpClaimCheckOrRemittanceDate;
    }

    /**
     * Sets the value of the sdtpClaimCheckOrRemittanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SDTPClaimCheckOrRemittanceDate }{@code >}
     *     
     */
    public void setSDTPClaimCheckOrRemittanceDate(JAXBElement<SDTPClaimCheckOrRemittanceDate> value) {
        this.sdtpClaimCheckOrRemittanceDate = ((JAXBElement<SDTPClaimCheckOrRemittanceDate> ) value);
    }

    /**
     * Gets the value of the srefOtherPayerSecondaryIdentifierOrSREFOtherPayerPriorAuthorizationNumberOrSREFOtherPayerReferralNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srefOtherPayerSecondaryIdentifierOrSREFOtherPayerPriorAuthorizationNumberOrSREFOtherPayerReferralNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSREFOtherPayerSecondaryIdentifierOrSREFOtherPayerPriorAuthorizationNumberOrSREFOtherPayerReferralNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SREFOtherPayerClaimControlNumber }
     * {@link SREFOtherPayerClaimAdjustmentIndicator }
     * {@link SREFOtherPayerReferralNumber }
     * {@link SREFOtherPayerSecondaryIdentifier }
     * {@link SREFOtherPayerPriorAuthorizationNumber }
     * {@link SREFOtherPayerPredeterminationIdentification }
     * 
     * 
     */
    public List<Object> getSREFOtherPayerSecondaryIdentifierOrSREFOtherPayerPriorAuthorizationNumberOrSREFOtherPayerReferralNumber() {
        if (srefOtherPayerSecondaryIdentifierOrSREFOtherPayerPriorAuthorizationNumberOrSREFOtherPayerReferralNumber == null) {
            srefOtherPayerSecondaryIdentifierOrSREFOtherPayerPriorAuthorizationNumberOrSREFOtherPayerReferralNumber = new ArrayList<Object>();
        }
        return this.srefOtherPayerSecondaryIdentifierOrSREFOtherPayerPriorAuthorizationNumberOrSREFOtherPayerReferralNumber;
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
            return "2330B";
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
            return "Other Payer Name";
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