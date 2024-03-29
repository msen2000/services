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
 * To specify basic data about the claim
 * 
 * <p>Java class for L-2300 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2300">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-CLM-Claim_Information" type="{http://www.delta.org/b2b/edi/t837}S-CLM-Claim_Information"/>
 *         &lt;choice maxOccurs="4" minOccurs="0">
 *           &lt;element name="S-DTP-Date_-_Accident" type="{http://www.delta.org/b2b/edi/t837}S-DTP-Date_-_Accident" minOccurs="0"/>
 *           &lt;element name="S-DTP-Date_-_Appliance_Placement" type="{http://www.delta.org/b2b/edi/t837}S-DTP-Date_-_Appliance_Placement" minOccurs="0"/>
 *           &lt;element name="S-DTP-Date_-_Service_Date" type="{http://www.delta.org/b2b/edi/t837}S-DTP-Date_-_Service_Date" minOccurs="0"/>
 *           &lt;element name="S-DTP-Date_-_Repricer_Received_Date" type="{http://www.delta.org/b2b/edi/t837}S-DTP-Date_-_Repricer_Received_Date" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="S-DN1-Orthodontic_Total_Months_of_Treatment" type="{http://www.delta.org/b2b/edi/t837}S-DN1-Orthodontic_Total_Months_of_Treatment" minOccurs="0"/>
 *         &lt;element name="S-DN2-Tooth_Status" type="{http://www.delta.org/b2b/edi/t837}S-DN2-Tooth_Status" maxOccurs="35" minOccurs="0"/>
 *         &lt;element name="S-PWK-Claim_Supplemental_Information" type="{http://www.delta.org/b2b/edi/t837}S-PWK-Claim_Supplemental_Information" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="S-CN1-Contract_Information" type="{http://www.delta.org/b2b/edi/t837}S-CN1-Contract_Information" minOccurs="0"/>
 *         &lt;element name="S-AMT-Patient_Amount_Paid" type="{http://www.delta.org/b2b/edi/t837}S-AMT-Patient_Amount_Paid" minOccurs="0"/>
 *         &lt;choice maxOccurs="8" minOccurs="0">
 *           &lt;element name="S-REF-Predetermination_Identification" type="{http://www.delta.org/b2b/edi/t837}S-REF-Predetermination_Identification" minOccurs="0"/>
 *           &lt;element name="S-REF-Service_Authorization_Exception_Code" type="{http://www.delta.org/b2b/edi/t837}S-REF-Service_Authorization_Exception_Code" minOccurs="0"/>
 *           &lt;element name="S-REF-Payer_Claim_Control_Number" type="{http://www.delta.org/b2b/edi/t837}S-REF-Payer_Claim_Control_Number" minOccurs="0"/>
 *           &lt;element name="S-REF-Referral_Number" type="{http://www.delta.org/b2b/edi/t837}S-REF-Referral_Number" minOccurs="0"/>
 *           &lt;element name="S-REF-Prior_Authorization" type="{http://www.delta.org/b2b/edi/t837}S-REF-Prior_Authorization" minOccurs="0"/>
 *           &lt;element name="S-REF-Repriced_Claim_Number" type="{http://www.delta.org/b2b/edi/t837}S-REF-Repriced_Claim_Number" minOccurs="0"/>
 *           &lt;element name="S-REF-Adjusted_Repriced_Claim_Number" type="{http://www.delta.org/b2b/edi/t837}S-REF-Adjusted_Repriced_Claim_Number" minOccurs="0"/>
 *           &lt;element name="S-REF-Claim_Identifier_For_Transmission_Intermediaries" type="{http://www.delta.org/b2b/edi/t837}S-REF-Claim_Identifier_For_Transmission_Intermediaries" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="S-K3-File_Information" type="{http://www.delta.org/b2b/edi/t837}S-K3-File_Information" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="S-NTE-Claim_Note" type="{http://www.delta.org/b2b/edi/t837}S-NTE-Claim_Note" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="S-HI-Health_Care_Diagnosis_Code" type="{http://www.delta.org/b2b/edi/t837}S-HI-Health_Care_Diagnosis_Code" minOccurs="0"/>
 *         &lt;element name="S-HCP-Claim_Pricing_Repricing_Information" type="{http://www.delta.org/b2b/edi/t837}S-HCP-Claim_Pricing_Repricing_Information" minOccurs="0"/>
 *         &lt;choice maxOccurs="6" minOccurs="0">
 *           &lt;element name="L-2310A" type="{http://www.delta.org/b2b/edi/t837}L-2310A" maxOccurs="2" minOccurs="0"/>
 *           &lt;element name="L-2310B" type="{http://www.delta.org/b2b/edi/t837}L-2310B" minOccurs="0"/>
 *           &lt;element name="L-2310C" type="{http://www.delta.org/b2b/edi/t837}L-2310C" minOccurs="0"/>
 *           &lt;element name="L-2310D" type="{http://www.delta.org/b2b/edi/t837}L-2310D" minOccurs="0"/>
 *           &lt;element name="L-2310E" type="{http://www.delta.org/b2b/edi/t837}L-2310E" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="L-2320" type="{http://www.delta.org/b2b/edi/t837}L-2320" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="L-2400" type="{http://www.delta.org/b2b/edi/t837}L-2400" maxOccurs="50"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2300" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Claim Information" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2300", propOrder = {
    "sclmClaimInformation",
    "sdtpDateAccidentOrSDTPDateAppliancePlacementOrSDTPDateServiceDate",
    "sdn1OrthodonticTotalMonthsOfTreatment",
    "sdn2ToothStatus",
    "spwkClaimSupplementalInformation",
    "scn1ContractInformation",
    "samtPatientAmountPaid",
    "srefPredeterminationIdentificationOrSREFServiceAuthorizationExceptionCodeOrSREFPayerClaimControlNumber",
    "sk3FileInformation",
    "snteClaimNote",
    "shiHealthCareDiagnosisCode",
    "shcpClaimPricingRepricingInformation",
    "l2310AOrL2310BOrL2310C",
    "l2320",
    "l2400"
})
public class L2300 {

    @XmlElement(name = "S-CLM-Claim_Information", required = true)
    protected SCLMClaimInformation sclmClaimInformation;
    @XmlElements({
        @XmlElement(name = "S-DTP-Date_-_Service_Date", type = SDTPDateServiceDate.class, nillable = true),
        @XmlElement(name = "S-DTP-Date_-_Appliance_Placement", type = SDTPDateAppliancePlacement.class, nillable = true),
        @XmlElement(name = "S-DTP-Date_-_Repricer_Received_Date", type = SDTPDateRepricerReceivedDate.class, nillable = true),
        @XmlElement(name = "S-DTP-Date_-_Accident", type = SDTPDateAccident.class, nillable = true)
    })
    protected List<Object> sdtpDateAccidentOrSDTPDateAppliancePlacementOrSDTPDateServiceDate;
    @XmlElementRef(name = "S-DN1-Orthodontic_Total_Months_of_Treatment", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SDN1OrthodonticTotalMonthsOfTreatment> sdn1OrthodonticTotalMonthsOfTreatment;
    @XmlElement(name = "S-DN2-Tooth_Status", nillable = true)
    protected List<SDN2ToothStatus> sdn2ToothStatus;
    @XmlElement(name = "S-PWK-Claim_Supplemental_Information", nillable = true)
    protected List<SPWKClaimSupplementalInformation> spwkClaimSupplementalInformation;
    @XmlElementRef(name = "S-CN1-Contract_Information", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SCN1ContractInformation> scn1ContractInformation;
    @XmlElementRef(name = "S-AMT-Patient_Amount_Paid", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SAMTPatientAmountPaid> samtPatientAmountPaid;
    @XmlElements({
        @XmlElement(name = "S-REF-Repriced_Claim_Number", type = SREFRepricedClaimNumber.class, nillable = true),
        @XmlElement(name = "S-REF-Claim_Identifier_For_Transmission_Intermediaries", type = SREFClaimIdentifierForTransmissionIntermediaries.class, nillable = true),
        @XmlElement(name = "S-REF-Prior_Authorization", type = SREFPriorAuthorization.class, nillable = true),
        @XmlElement(name = "S-REF-Referral_Number", type = SREFReferralNumber.class, nillable = true),
        @XmlElement(name = "S-REF-Payer_Claim_Control_Number", type = SREFPayerClaimControlNumber.class, nillable = true),
        @XmlElement(name = "S-REF-Service_Authorization_Exception_Code", type = SREFServiceAuthorizationExceptionCode.class, nillable = true),
        @XmlElement(name = "S-REF-Adjusted_Repriced_Claim_Number", type = SREFAdjustedRepricedClaimNumber.class, nillable = true),
        @XmlElement(name = "S-REF-Predetermination_Identification", type = SREFPredeterminationIdentification.class, nillable = true)
    })
    protected List<Object> srefPredeterminationIdentificationOrSREFServiceAuthorizationExceptionCodeOrSREFPayerClaimControlNumber;
    @XmlElement(name = "S-K3-File_Information", nillable = true)
    protected List<SK3FileInformation> sk3FileInformation;
    @XmlElement(name = "S-NTE-Claim_Note", nillable = true)
    protected List<SNTEClaimNote> snteClaimNote;
    @XmlElementRef(name = "S-HI-Health_Care_Diagnosis_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SHIHealthCareDiagnosisCode> shiHealthCareDiagnosisCode;
    @XmlElementRef(name = "S-HCP-Claim_Pricing_Repricing_Information", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SHCPClaimPricingRepricingInformation> shcpClaimPricingRepricingInformation;
    @XmlElements({
        @XmlElement(name = "L-2310D", type = L2310D.class, nillable = true),
        @XmlElement(name = "L-2310E", type = L2310E.class, nillable = true),
        @XmlElement(name = "L-2310C", type = L2310C.class, nillable = true),
        @XmlElement(name = "L-2310A", type = L2310A.class, nillable = true),
        @XmlElement(name = "L-2310B", type = L2310B.class, nillable = true)
    })
    protected List<Object> l2310AOrL2310BOrL2310C;
    @XmlElement(name = "L-2320", nillable = true)
    protected List<L2320> l2320;
    @XmlElement(name = "L-2400", required = true)
    protected List<L2400> l2400;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the sclmClaimInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SCLMClaimInformation }
     *     
     */
    public SCLMClaimInformation getSCLMClaimInformation() {
        return sclmClaimInformation;
    }

    /**
     * Sets the value of the sclmClaimInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCLMClaimInformation }
     *     
     */
    public void setSCLMClaimInformation(SCLMClaimInformation value) {
        this.sclmClaimInformation = value;
    }

    /**
     * Gets the value of the sdtpDateAccidentOrSDTPDateAppliancePlacementOrSDTPDateServiceDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtpDateAccidentOrSDTPDateAppliancePlacementOrSDTPDateServiceDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSDTPDateAccidentOrSDTPDateAppliancePlacementOrSDTPDateServiceDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SDTPDateServiceDate }
     * {@link SDTPDateAppliancePlacement }
     * {@link SDTPDateRepricerReceivedDate }
     * {@link SDTPDateAccident }
     * 
     * 
     */
    public List<Object> getSDTPDateAccidentOrSDTPDateAppliancePlacementOrSDTPDateServiceDate() {
        if (sdtpDateAccidentOrSDTPDateAppliancePlacementOrSDTPDateServiceDate == null) {
            sdtpDateAccidentOrSDTPDateAppliancePlacementOrSDTPDateServiceDate = new ArrayList<Object>();
        }
        return this.sdtpDateAccidentOrSDTPDateAppliancePlacementOrSDTPDateServiceDate;
    }

    /**
     * Gets the value of the sdn1OrthodonticTotalMonthsOfTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SDN1OrthodonticTotalMonthsOfTreatment }{@code >}
     *     
     */
    public JAXBElement<SDN1OrthodonticTotalMonthsOfTreatment> getSDN1OrthodonticTotalMonthsOfTreatment() {
        return sdn1OrthodonticTotalMonthsOfTreatment;
    }

    /**
     * Sets the value of the sdn1OrthodonticTotalMonthsOfTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SDN1OrthodonticTotalMonthsOfTreatment }{@code >}
     *     
     */
    public void setSDN1OrthodonticTotalMonthsOfTreatment(JAXBElement<SDN1OrthodonticTotalMonthsOfTreatment> value) {
        this.sdn1OrthodonticTotalMonthsOfTreatment = ((JAXBElement<SDN1OrthodonticTotalMonthsOfTreatment> ) value);
    }

    /**
     * Gets the value of the sdn2ToothStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdn2ToothStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSDN2ToothStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SDN2ToothStatus }
     * 
     * 
     */
    public List<SDN2ToothStatus> getSDN2ToothStatus() {
        if (sdn2ToothStatus == null) {
            sdn2ToothStatus = new ArrayList<SDN2ToothStatus>();
        }
        return this.sdn2ToothStatus;
    }

    /**
     * Gets the value of the spwkClaimSupplementalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spwkClaimSupplementalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPWKClaimSupplementalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SPWKClaimSupplementalInformation }
     * 
     * 
     */
    public List<SPWKClaimSupplementalInformation> getSPWKClaimSupplementalInformation() {
        if (spwkClaimSupplementalInformation == null) {
            spwkClaimSupplementalInformation = new ArrayList<SPWKClaimSupplementalInformation>();
        }
        return this.spwkClaimSupplementalInformation;
    }

    /**
     * Gets the value of the scn1ContractInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SCN1ContractInformation }{@code >}
     *     
     */
    public JAXBElement<SCN1ContractInformation> getSCN1ContractInformation() {
        return scn1ContractInformation;
    }

    /**
     * Sets the value of the scn1ContractInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SCN1ContractInformation }{@code >}
     *     
     */
    public void setSCN1ContractInformation(JAXBElement<SCN1ContractInformation> value) {
        this.scn1ContractInformation = ((JAXBElement<SCN1ContractInformation> ) value);
    }

    /**
     * Gets the value of the samtPatientAmountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SAMTPatientAmountPaid }{@code >}
     *     
     */
    public JAXBElement<SAMTPatientAmountPaid> getSAMTPatientAmountPaid() {
        return samtPatientAmountPaid;
    }

    /**
     * Sets the value of the samtPatientAmountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SAMTPatientAmountPaid }{@code >}
     *     
     */
    public void setSAMTPatientAmountPaid(JAXBElement<SAMTPatientAmountPaid> value) {
        this.samtPatientAmountPaid = ((JAXBElement<SAMTPatientAmountPaid> ) value);
    }

    /**
     * Gets the value of the srefPredeterminationIdentificationOrSREFServiceAuthorizationExceptionCodeOrSREFPayerClaimControlNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srefPredeterminationIdentificationOrSREFServiceAuthorizationExceptionCodeOrSREFPayerClaimControlNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSREFPredeterminationIdentificationOrSREFServiceAuthorizationExceptionCodeOrSREFPayerClaimControlNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SREFRepricedClaimNumber }
     * {@link SREFClaimIdentifierForTransmissionIntermediaries }
     * {@link SREFPriorAuthorization }
     * {@link SREFReferralNumber }
     * {@link SREFPayerClaimControlNumber }
     * {@link SREFServiceAuthorizationExceptionCode }
     * {@link SREFAdjustedRepricedClaimNumber }
     * {@link SREFPredeterminationIdentification }
     * 
     * 
     */
    public List<Object> getSREFPredeterminationIdentificationOrSREFServiceAuthorizationExceptionCodeOrSREFPayerClaimControlNumber() {
        if (srefPredeterminationIdentificationOrSREFServiceAuthorizationExceptionCodeOrSREFPayerClaimControlNumber == null) {
            srefPredeterminationIdentificationOrSREFServiceAuthorizationExceptionCodeOrSREFPayerClaimControlNumber = new ArrayList<Object>();
        }
        return this.srefPredeterminationIdentificationOrSREFServiceAuthorizationExceptionCodeOrSREFPayerClaimControlNumber;
    }

    /**
     * Gets the value of the sk3FileInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sk3FileInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSK3FileInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SK3FileInformation }
     * 
     * 
     */
    public List<SK3FileInformation> getSK3FileInformation() {
        if (sk3FileInformation == null) {
            sk3FileInformation = new ArrayList<SK3FileInformation>();
        }
        return this.sk3FileInformation;
    }

    /**
     * Gets the value of the snteClaimNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snteClaimNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSNTEClaimNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SNTEClaimNote }
     * 
     * 
     */
    public List<SNTEClaimNote> getSNTEClaimNote() {
        if (snteClaimNote == null) {
            snteClaimNote = new ArrayList<SNTEClaimNote>();
        }
        return this.snteClaimNote;
    }

    /**
     * Gets the value of the shiHealthCareDiagnosisCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SHIHealthCareDiagnosisCode }{@code >}
     *     
     */
    public JAXBElement<SHIHealthCareDiagnosisCode> getSHIHealthCareDiagnosisCode() {
        return shiHealthCareDiagnosisCode;
    }

    /**
     * Sets the value of the shiHealthCareDiagnosisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SHIHealthCareDiagnosisCode }{@code >}
     *     
     */
    public void setSHIHealthCareDiagnosisCode(JAXBElement<SHIHealthCareDiagnosisCode> value) {
        this.shiHealthCareDiagnosisCode = ((JAXBElement<SHIHealthCareDiagnosisCode> ) value);
    }

    /**
     * Gets the value of the shcpClaimPricingRepricingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SHCPClaimPricingRepricingInformation }{@code >}
     *     
     */
    public JAXBElement<SHCPClaimPricingRepricingInformation> getSHCPClaimPricingRepricingInformation() {
        return shcpClaimPricingRepricingInformation;
    }

    /**
     * Sets the value of the shcpClaimPricingRepricingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SHCPClaimPricingRepricingInformation }{@code >}
     *     
     */
    public void setSHCPClaimPricingRepricingInformation(JAXBElement<SHCPClaimPricingRepricingInformation> value) {
        this.shcpClaimPricingRepricingInformation = ((JAXBElement<SHCPClaimPricingRepricingInformation> ) value);
    }

    /**
     * Gets the value of the l2310AOrL2310BOrL2310C property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l2310AOrL2310BOrL2310C property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL2310AOrL2310BOrL2310C().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L2310D }
     * {@link L2310E }
     * {@link L2310C }
     * {@link L2310A }
     * {@link L2310B }
     * 
     * 
     */
    public List<Object> getL2310AOrL2310BOrL2310C() {
        if (l2310AOrL2310BOrL2310C == null) {
            l2310AOrL2310BOrL2310C = new ArrayList<Object>();
        }
        return this.l2310AOrL2310BOrL2310C;
    }

    /**
     * Gets the value of the l2320 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l2320 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL2320().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L2320 }
     * 
     * 
     */
    public List<L2320> getL2320() {
        if (l2320 == null) {
            l2320 = new ArrayList<L2320>();
        }
        return this.l2320;
    }

    /**
     * Gets the value of the l2400 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l2400 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL2400().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L2400 }
     * 
     * 
     */
    public List<L2400> getL2400() {
        if (l2400 == null) {
            l2400 = new ArrayList<L2400>();
        }
        return this.l2400;
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
            return "2300";
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
            return "Claim Information";
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
