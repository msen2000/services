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
 * To specify basic data about the claim
 * 
 * <p>Java class for S-CLM-Claim_Information complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-CLM-Claim_Information">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-CLM01-Claim_Submitter_s_Identifier" type="{http://www.delta.org/b2b/edi/t837}E-CLM01-Claim_Submitter_s_Identifier"/>
 *         &lt;element name="E-CLM02-Monetary_Amount" type="{http://www.delta.org/b2b/edi/t837}E-CLM02-Monetary_Amount"/>
 *         &lt;element name="E-CLM03-Claim_Filing_Indicator_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM03-Claim_Filing_Indicator_Code" minOccurs="0"/>
 *         &lt;element name="E-CLM04-Non-Institutional_Claim_Type_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM04-Non-Institutional_Claim_Type_Code" minOccurs="0"/>
 *         &lt;element name="C-C023-Health_Care_Service_Location_Information" type="{http://www.delta.org/b2b/edi/t837}C-C023-Health_Care_Service_Location_Information"/>
 *         &lt;element name="E-CLM06-Yes_No_Condition_or_Response_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM06-Yes_No_Condition_or_Response_Code"/>
 *         &lt;element name="E-CLM07-Provider_Accept_Assignment_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM07-Provider_Accept_Assignment_Code"/>
 *         &lt;element name="E-CLM08-Yes_No_Condition_or_Response_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM08-Yes_No_Condition_or_Response_Code"/>
 *         &lt;element name="E-CLM09-Release_of_Information_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM09-Release_of_Information_Code"/>
 *         &lt;element name="E-CLM10-Patient_Signature_Source_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM10-Patient_Signature_Source_Code" minOccurs="0"/>
 *         &lt;element name="C-C024-Related_Causes_Information" type="{http://www.delta.org/b2b/edi/t837}C-C024-Related_Causes_Information" minOccurs="0"/>
 *         &lt;element name="E-CLM12-Special_Program_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM12-Special_Program_Code" minOccurs="0"/>
 *         &lt;element name="E-CLM13-Yes_No_Condition_or_Response_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM13-Yes_No_Condition_or_Response_Code" minOccurs="0"/>
 *         &lt;element name="E-CLM14-Level_of_Service_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM14-Level_of_Service_Code" minOccurs="0"/>
 *         &lt;element name="E-CLM15-Yes_No_Condition_or_Response_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM15-Yes_No_Condition_or_Response_Code" minOccurs="0"/>
 *         &lt;element name="E-CLM16-Provider_Agreement_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM16-Provider_Agreement_Code" minOccurs="0"/>
 *         &lt;element name="E-CLM17-Claim_Status_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM17-Claim_Status_Code" minOccurs="0"/>
 *         &lt;element name="E-CLM18-Yes_No_Condition_or_Response_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM18-Yes_No_Condition_or_Response_Code" minOccurs="0"/>
 *         &lt;element name="E-CLM19-Claim_Submission_Reason_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM19-Claim_Submission_Reason_Code" minOccurs="0"/>
 *         &lt;element name="E-CLM20-Delay_Reason_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM20-Delay_Reason_Code" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="CLM" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Claim Information" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-CLM-Claim_Information", propOrder = {
    "eclm01ClaimSubmitterSIdentifier",
    "eclm02MonetaryAmount",
    "eclm03ClaimFilingIndicatorCode",
    "eclm04NonInstitutionalClaimTypeCode",
    "cc023HealthCareServiceLocationInformation",
    "eclm06YesNoConditionOrResponseCode",
    "eclm07ProviderAcceptAssignmentCode",
    "eclm08YesNoConditionOrResponseCode",
    "eclm09ReleaseOfInformationCode",
    "eclm10PatientSignatureSourceCode",
    "cc024RelatedCausesInformation",
    "eclm12SpecialProgramCode",
    "eclm13YesNoConditionOrResponseCode",
    "eclm14LevelOfServiceCode",
    "eclm15YesNoConditionOrResponseCode",
    "eclm16ProviderAgreementCode",
    "eclm17ClaimStatusCode",
    "eclm18YesNoConditionOrResponseCode",
    "eclm19ClaimSubmissionReasonCode",
    "eclm20DelayReasonCode"
})
public class SCLMClaimInformation {

    @XmlElement(name = "E-CLM01-Claim_Submitter_s_Identifier", required = true)
    protected ECLM01ClaimSubmitterSIdentifier eclm01ClaimSubmitterSIdentifier;
    @XmlElement(name = "E-CLM02-Monetary_Amount", required = true)
    protected ECLM02MonetaryAmount eclm02MonetaryAmount;
    @XmlElementRef(name = "E-CLM03-Claim_Filing_Indicator_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM03ClaimFilingIndicatorCode> eclm03ClaimFilingIndicatorCode;
    @XmlElementRef(name = "E-CLM04-Non-Institutional_Claim_Type_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM04NonInstitutionalClaimTypeCode> eclm04NonInstitutionalClaimTypeCode;
    @XmlElement(name = "C-C023-Health_Care_Service_Location_Information", required = true)
    protected CC023HealthCareServiceLocationInformation cc023HealthCareServiceLocationInformation;
    @XmlElement(name = "E-CLM06-Yes_No_Condition_or_Response_Code", required = true)
    protected ECLM06YesNoConditionOrResponseCode eclm06YesNoConditionOrResponseCode;
    @XmlElement(name = "E-CLM07-Provider_Accept_Assignment_Code", required = true)
    protected ECLM07ProviderAcceptAssignmentCode eclm07ProviderAcceptAssignmentCode;
    @XmlElement(name = "E-CLM08-Yes_No_Condition_or_Response_Code", required = true)
    protected ECLM08YesNoConditionOrResponseCode eclm08YesNoConditionOrResponseCode;
    @XmlElement(name = "E-CLM09-Release_of_Information_Code", required = true)
    protected ECLM09ReleaseOfInformationCode eclm09ReleaseOfInformationCode;
    @XmlElementRef(name = "E-CLM10-Patient_Signature_Source_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM10PatientSignatureSourceCode> eclm10PatientSignatureSourceCode;
    @XmlElementRef(name = "C-C024-Related_Causes_Information", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<CC024RelatedCausesInformation> cc024RelatedCausesInformation;
    @XmlElementRef(name = "E-CLM12-Special_Program_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM12SpecialProgramCode> eclm12SpecialProgramCode;
    @XmlElementRef(name = "E-CLM13-Yes_No_Condition_or_Response_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM13YesNoConditionOrResponseCode> eclm13YesNoConditionOrResponseCode;
    @XmlElementRef(name = "E-CLM14-Level_of_Service_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM14LevelOfServiceCode> eclm14LevelOfServiceCode;
    @XmlElementRef(name = "E-CLM15-Yes_No_Condition_or_Response_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM15YesNoConditionOrResponseCode> eclm15YesNoConditionOrResponseCode;
    @XmlElementRef(name = "E-CLM16-Provider_Agreement_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM16ProviderAgreementCode> eclm16ProviderAgreementCode;
    @XmlElementRef(name = "E-CLM17-Claim_Status_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM17ClaimStatusCode> eclm17ClaimStatusCode;
    @XmlElementRef(name = "E-CLM18-Yes_No_Condition_or_Response_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM18YesNoConditionOrResponseCode> eclm18YesNoConditionOrResponseCode;
    @XmlElementRef(name = "E-CLM19-Claim_Submission_Reason_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM19ClaimSubmissionReasonCode> eclm19ClaimSubmissionReasonCode;
    @XmlElementRef(name = "E-CLM20-Delay_Reason_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ECLM20DelayReasonCode> eclm20DelayReasonCode;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the eclm01ClaimSubmitterSIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ECLM01ClaimSubmitterSIdentifier }
     *     
     */
    public ECLM01ClaimSubmitterSIdentifier getECLM01ClaimSubmitterSIdentifier() {
        return eclm01ClaimSubmitterSIdentifier;
    }

    /**
     * Sets the value of the eclm01ClaimSubmitterSIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECLM01ClaimSubmitterSIdentifier }
     *     
     */
    public void setECLM01ClaimSubmitterSIdentifier(ECLM01ClaimSubmitterSIdentifier value) {
        this.eclm01ClaimSubmitterSIdentifier = value;
    }

    /**
     * Gets the value of the eclm02MonetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ECLM02MonetaryAmount }
     *     
     */
    public ECLM02MonetaryAmount getECLM02MonetaryAmount() {
        return eclm02MonetaryAmount;
    }

    /**
     * Sets the value of the eclm02MonetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECLM02MonetaryAmount }
     *     
     */
    public void setECLM02MonetaryAmount(ECLM02MonetaryAmount value) {
        this.eclm02MonetaryAmount = value;
    }

    /**
     * Gets the value of the eclm03ClaimFilingIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM03ClaimFilingIndicatorCode }{@code >}
     *     
     */
    public JAXBElement<ECLM03ClaimFilingIndicatorCode> getECLM03ClaimFilingIndicatorCode() {
        return eclm03ClaimFilingIndicatorCode;
    }

    /**
     * Sets the value of the eclm03ClaimFilingIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM03ClaimFilingIndicatorCode }{@code >}
     *     
     */
    public void setECLM03ClaimFilingIndicatorCode(JAXBElement<ECLM03ClaimFilingIndicatorCode> value) {
        this.eclm03ClaimFilingIndicatorCode = ((JAXBElement<ECLM03ClaimFilingIndicatorCode> ) value);
    }

    /**
     * Gets the value of the eclm04NonInstitutionalClaimTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM04NonInstitutionalClaimTypeCode }{@code >}
     *     
     */
    public JAXBElement<ECLM04NonInstitutionalClaimTypeCode> getECLM04NonInstitutionalClaimTypeCode() {
        return eclm04NonInstitutionalClaimTypeCode;
    }

    /**
     * Sets the value of the eclm04NonInstitutionalClaimTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM04NonInstitutionalClaimTypeCode }{@code >}
     *     
     */
    public void setECLM04NonInstitutionalClaimTypeCode(JAXBElement<ECLM04NonInstitutionalClaimTypeCode> value) {
        this.eclm04NonInstitutionalClaimTypeCode = ((JAXBElement<ECLM04NonInstitutionalClaimTypeCode> ) value);
    }

    /**
     * Gets the value of the cc023HealthCareServiceLocationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CC023HealthCareServiceLocationInformation }
     *     
     */
    public CC023HealthCareServiceLocationInformation getCC023HealthCareServiceLocationInformation() {
        return cc023HealthCareServiceLocationInformation;
    }

    /**
     * Sets the value of the cc023HealthCareServiceLocationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CC023HealthCareServiceLocationInformation }
     *     
     */
    public void setCC023HealthCareServiceLocationInformation(CC023HealthCareServiceLocationInformation value) {
        this.cc023HealthCareServiceLocationInformation = value;
    }

    /**
     * Gets the value of the eclm06YesNoConditionOrResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link ECLM06YesNoConditionOrResponseCode }
     *     
     */
    public ECLM06YesNoConditionOrResponseCode getECLM06YesNoConditionOrResponseCode() {
        return eclm06YesNoConditionOrResponseCode;
    }

    /**
     * Sets the value of the eclm06YesNoConditionOrResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECLM06YesNoConditionOrResponseCode }
     *     
     */
    public void setECLM06YesNoConditionOrResponseCode(ECLM06YesNoConditionOrResponseCode value) {
        this.eclm06YesNoConditionOrResponseCode = value;
    }

    /**
     * Gets the value of the eclm07ProviderAcceptAssignmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link ECLM07ProviderAcceptAssignmentCode }
     *     
     */
    public ECLM07ProviderAcceptAssignmentCode getECLM07ProviderAcceptAssignmentCode() {
        return eclm07ProviderAcceptAssignmentCode;
    }

    /**
     * Sets the value of the eclm07ProviderAcceptAssignmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECLM07ProviderAcceptAssignmentCode }
     *     
     */
    public void setECLM07ProviderAcceptAssignmentCode(ECLM07ProviderAcceptAssignmentCode value) {
        this.eclm07ProviderAcceptAssignmentCode = value;
    }

    /**
     * Gets the value of the eclm08YesNoConditionOrResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link ECLM08YesNoConditionOrResponseCode }
     *     
     */
    public ECLM08YesNoConditionOrResponseCode getECLM08YesNoConditionOrResponseCode() {
        return eclm08YesNoConditionOrResponseCode;
    }

    /**
     * Sets the value of the eclm08YesNoConditionOrResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECLM08YesNoConditionOrResponseCode }
     *     
     */
    public void setECLM08YesNoConditionOrResponseCode(ECLM08YesNoConditionOrResponseCode value) {
        this.eclm08YesNoConditionOrResponseCode = value;
    }

    /**
     * Gets the value of the eclm09ReleaseOfInformationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ECLM09ReleaseOfInformationCode }
     *     
     */
    public ECLM09ReleaseOfInformationCode getECLM09ReleaseOfInformationCode() {
        return eclm09ReleaseOfInformationCode;
    }

    /**
     * Sets the value of the eclm09ReleaseOfInformationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECLM09ReleaseOfInformationCode }
     *     
     */
    public void setECLM09ReleaseOfInformationCode(ECLM09ReleaseOfInformationCode value) {
        this.eclm09ReleaseOfInformationCode = value;
    }

    /**
     * Gets the value of the eclm10PatientSignatureSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM10PatientSignatureSourceCode }{@code >}
     *     
     */
    public JAXBElement<ECLM10PatientSignatureSourceCode> getECLM10PatientSignatureSourceCode() {
        return eclm10PatientSignatureSourceCode;
    }

    /**
     * Sets the value of the eclm10PatientSignatureSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM10PatientSignatureSourceCode }{@code >}
     *     
     */
    public void setECLM10PatientSignatureSourceCode(JAXBElement<ECLM10PatientSignatureSourceCode> value) {
        this.eclm10PatientSignatureSourceCode = ((JAXBElement<ECLM10PatientSignatureSourceCode> ) value);
    }

    /**
     * Gets the value of the cc024RelatedCausesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CC024RelatedCausesInformation }{@code >}
     *     
     */
    public JAXBElement<CC024RelatedCausesInformation> getCC024RelatedCausesInformation() {
        return cc024RelatedCausesInformation;
    }

    /**
     * Sets the value of the cc024RelatedCausesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CC024RelatedCausesInformation }{@code >}
     *     
     */
    public void setCC024RelatedCausesInformation(JAXBElement<CC024RelatedCausesInformation> value) {
        this.cc024RelatedCausesInformation = ((JAXBElement<CC024RelatedCausesInformation> ) value);
    }

    /**
     * Gets the value of the eclm12SpecialProgramCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM12SpecialProgramCode }{@code >}
     *     
     */
    public JAXBElement<ECLM12SpecialProgramCode> getECLM12SpecialProgramCode() {
        return eclm12SpecialProgramCode;
    }

    /**
     * Sets the value of the eclm12SpecialProgramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM12SpecialProgramCode }{@code >}
     *     
     */
    public void setECLM12SpecialProgramCode(JAXBElement<ECLM12SpecialProgramCode> value) {
        this.eclm12SpecialProgramCode = ((JAXBElement<ECLM12SpecialProgramCode> ) value);
    }

    /**
     * Gets the value of the eclm13YesNoConditionOrResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM13YesNoConditionOrResponseCode }{@code >}
     *     
     */
    public JAXBElement<ECLM13YesNoConditionOrResponseCode> getECLM13YesNoConditionOrResponseCode() {
        return eclm13YesNoConditionOrResponseCode;
    }

    /**
     * Sets the value of the eclm13YesNoConditionOrResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM13YesNoConditionOrResponseCode }{@code >}
     *     
     */
    public void setECLM13YesNoConditionOrResponseCode(JAXBElement<ECLM13YesNoConditionOrResponseCode> value) {
        this.eclm13YesNoConditionOrResponseCode = ((JAXBElement<ECLM13YesNoConditionOrResponseCode> ) value);
    }

    /**
     * Gets the value of the eclm14LevelOfServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM14LevelOfServiceCode }{@code >}
     *     
     */
    public JAXBElement<ECLM14LevelOfServiceCode> getECLM14LevelOfServiceCode() {
        return eclm14LevelOfServiceCode;
    }

    /**
     * Sets the value of the eclm14LevelOfServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM14LevelOfServiceCode }{@code >}
     *     
     */
    public void setECLM14LevelOfServiceCode(JAXBElement<ECLM14LevelOfServiceCode> value) {
        this.eclm14LevelOfServiceCode = ((JAXBElement<ECLM14LevelOfServiceCode> ) value);
    }

    /**
     * Gets the value of the eclm15YesNoConditionOrResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM15YesNoConditionOrResponseCode }{@code >}
     *     
     */
    public JAXBElement<ECLM15YesNoConditionOrResponseCode> getECLM15YesNoConditionOrResponseCode() {
        return eclm15YesNoConditionOrResponseCode;
    }

    /**
     * Sets the value of the eclm15YesNoConditionOrResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM15YesNoConditionOrResponseCode }{@code >}
     *     
     */
    public void setECLM15YesNoConditionOrResponseCode(JAXBElement<ECLM15YesNoConditionOrResponseCode> value) {
        this.eclm15YesNoConditionOrResponseCode = ((JAXBElement<ECLM15YesNoConditionOrResponseCode> ) value);
    }

    /**
     * Gets the value of the eclm16ProviderAgreementCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM16ProviderAgreementCode }{@code >}
     *     
     */
    public JAXBElement<ECLM16ProviderAgreementCode> getECLM16ProviderAgreementCode() {
        return eclm16ProviderAgreementCode;
    }

    /**
     * Sets the value of the eclm16ProviderAgreementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM16ProviderAgreementCode }{@code >}
     *     
     */
    public void setECLM16ProviderAgreementCode(JAXBElement<ECLM16ProviderAgreementCode> value) {
        this.eclm16ProviderAgreementCode = ((JAXBElement<ECLM16ProviderAgreementCode> ) value);
    }

    /**
     * Gets the value of the eclm17ClaimStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM17ClaimStatusCode }{@code >}
     *     
     */
    public JAXBElement<ECLM17ClaimStatusCode> getECLM17ClaimStatusCode() {
        return eclm17ClaimStatusCode;
    }

    /**
     * Sets the value of the eclm17ClaimStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM17ClaimStatusCode }{@code >}
     *     
     */
    public void setECLM17ClaimStatusCode(JAXBElement<ECLM17ClaimStatusCode> value) {
        this.eclm17ClaimStatusCode = ((JAXBElement<ECLM17ClaimStatusCode> ) value);
    }

    /**
     * Gets the value of the eclm18YesNoConditionOrResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM18YesNoConditionOrResponseCode }{@code >}
     *     
     */
    public JAXBElement<ECLM18YesNoConditionOrResponseCode> getECLM18YesNoConditionOrResponseCode() {
        return eclm18YesNoConditionOrResponseCode;
    }

    /**
     * Sets the value of the eclm18YesNoConditionOrResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM18YesNoConditionOrResponseCode }{@code >}
     *     
     */
    public void setECLM18YesNoConditionOrResponseCode(JAXBElement<ECLM18YesNoConditionOrResponseCode> value) {
        this.eclm18YesNoConditionOrResponseCode = ((JAXBElement<ECLM18YesNoConditionOrResponseCode> ) value);
    }

    /**
     * Gets the value of the eclm19ClaimSubmissionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM19ClaimSubmissionReasonCode }{@code >}
     *     
     */
    public JAXBElement<ECLM19ClaimSubmissionReasonCode> getECLM19ClaimSubmissionReasonCode() {
        return eclm19ClaimSubmissionReasonCode;
    }

    /**
     * Sets the value of the eclm19ClaimSubmissionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM19ClaimSubmissionReasonCode }{@code >}
     *     
     */
    public void setECLM19ClaimSubmissionReasonCode(JAXBElement<ECLM19ClaimSubmissionReasonCode> value) {
        this.eclm19ClaimSubmissionReasonCode = ((JAXBElement<ECLM19ClaimSubmissionReasonCode> ) value);
    }

    /**
     * Gets the value of the eclm20DelayReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECLM20DelayReasonCode }{@code >}
     *     
     */
    public JAXBElement<ECLM20DelayReasonCode> getECLM20DelayReasonCode() {
        return eclm20DelayReasonCode;
    }

    /**
     * Sets the value of the eclm20DelayReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECLM20DelayReasonCode }{@code >}
     *     
     */
    public void setECLM20DelayReasonCode(JAXBElement<ECLM20DelayReasonCode> value) {
        this.eclm20DelayReasonCode = ((JAXBElement<ECLM20DelayReasonCode> ) value);
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
            return "CLM";
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
