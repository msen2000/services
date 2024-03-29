//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.30 at 07:43:57 PM PDT 
//


package org.delta.b2b.edi.t271;

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
 * To supply the full name of an individual or organizational entity
 * 
 * <p>Java class for L-2100C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2100C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-NM1-Subscriber_Name" type="{http://www.delta.org/b2b/edi/t271}S-NM1-Subscriber_Name"/>
 *         &lt;element name="S-REF-Subscriber_Additional_Identification" type="{http://www.delta.org/b2b/edi/t271}S-REF-Subscriber_Additional_Identification" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="S-N3-Subscriber_Address" type="{http://www.delta.org/b2b/edi/t271}S-N3-Subscriber_Address" minOccurs="0"/>
 *         &lt;element name="S-N4-Subscriber_City__State__ZIP_Code" type="{http://www.delta.org/b2b/edi/t271}S-N4-Subscriber_City__State__ZIP_Code" minOccurs="0"/>
 *         &lt;element name="S-AAA-Subscriber_Request_Validation" type="{http://www.delta.org/b2b/edi/t271}S-AAA-Subscriber_Request_Validation" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="S-PRV-Provider_Information" type="{http://www.delta.org/b2b/edi/t271}S-PRV-Provider_Information" minOccurs="0"/>
 *         &lt;element name="S-DMG-Subscriber_Demographic_Information" type="{http://www.delta.org/b2b/edi/t271}S-DMG-Subscriber_Demographic_Information" minOccurs="0"/>
 *         &lt;element name="S-INS-Subscriber_Relationship" type="{http://www.delta.org/b2b/edi/t271}S-INS-Subscriber_Relationship" minOccurs="0"/>
 *         &lt;element name="S-HI-Subscriber_Health_Care_Diagnosis_Code" type="{http://www.delta.org/b2b/edi/t271}S-HI-Subscriber_Health_Care_Diagnosis_Code" minOccurs="0"/>
 *         &lt;element name="S-DTP-Subscriber_Date" type="{http://www.delta.org/b2b/edi/t271}S-DTP-Subscriber_Date" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="S-MPI-Subscriber_Military_Personnel_Information" type="{http://www.delta.org/b2b/edi/t271}S-MPI-Subscriber_Military_Personnel_Information" minOccurs="0"/>
 *         &lt;element name="L-2110C" type="{http://www.delta.org/b2b/edi/t271}L-2110C" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2100C" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Subscriber Name" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2100C", propOrder = {
    "snm1SubscriberName",
    "srefSubscriberAdditionalIdentification",
    "sn3SubscriberAddress",
    "sn4SubscriberCityStateZIPCode",
    "saaaSubscriberRequestValidation",
    "sprvProviderInformation",
    "sdmgSubscriberDemographicInformation",
    "sinsSubscriberRelationship",
    "shiSubscriberHealthCareDiagnosisCode",
    "sdtpSubscriberDate",
    "smpiSubscriberMilitaryPersonnelInformation",
    "l2110C"
})
public class L2100C {

    @XmlElement(name = "S-NM1-Subscriber_Name", required = true)
    protected SNM1SubscriberName snm1SubscriberName;
    @XmlElement(name = "S-REF-Subscriber_Additional_Identification", nillable = true)
    protected List<SREFSubscriberAdditionalIdentification> srefSubscriberAdditionalIdentification;
    @XmlElementRef(name = "S-N3-Subscriber_Address", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<SN3SubscriberAddress> sn3SubscriberAddress;
    @XmlElementRef(name = "S-N4-Subscriber_City__State__ZIP_Code", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<SN4SubscriberCityStateZIPCode> sn4SubscriberCityStateZIPCode;
    @XmlElement(name = "S-AAA-Subscriber_Request_Validation", nillable = true)
    protected List<SAAASubscriberRequestValidation> saaaSubscriberRequestValidation;
    @XmlElementRef(name = "S-PRV-Provider_Information", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<SPRVProviderInformation> sprvProviderInformation;
    @XmlElementRef(name = "S-DMG-Subscriber_Demographic_Information", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<SDMGSubscriberDemographicInformation> sdmgSubscriberDemographicInformation;
    @XmlElementRef(name = "S-INS-Subscriber_Relationship", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<SINSSubscriberRelationship> sinsSubscriberRelationship;
    @XmlElementRef(name = "S-HI-Subscriber_Health_Care_Diagnosis_Code", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<SHISubscriberHealthCareDiagnosisCode> shiSubscriberHealthCareDiagnosisCode;
    @XmlElement(name = "S-DTP-Subscriber_Date", nillable = true)
    protected List<SDTPSubscriberDate> sdtpSubscriberDate;
    @XmlElementRef(name = "S-MPI-Subscriber_Military_Personnel_Information", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<SMPISubscriberMilitaryPersonnelInformation> smpiSubscriberMilitaryPersonnelInformation;
    @XmlElement(name = "L-2110C", nillable = true)
    protected List<L2110C> l2110C;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the snm1SubscriberName property.
     * 
     * @return
     *     possible object is
     *     {@link SNM1SubscriberName }
     *     
     */
    public SNM1SubscriberName getSNM1SubscriberName() {
        return snm1SubscriberName;
    }

    /**
     * Sets the value of the snm1SubscriberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNM1SubscriberName }
     *     
     */
    public void setSNM1SubscriberName(SNM1SubscriberName value) {
        this.snm1SubscriberName = value;
    }

    /**
     * Gets the value of the srefSubscriberAdditionalIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srefSubscriberAdditionalIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSREFSubscriberAdditionalIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SREFSubscriberAdditionalIdentification }
     * 
     * 
     */
    public List<SREFSubscriberAdditionalIdentification> getSREFSubscriberAdditionalIdentification() {
        if (srefSubscriberAdditionalIdentification == null) {
            srefSubscriberAdditionalIdentification = new ArrayList<SREFSubscriberAdditionalIdentification>();
        }
        return this.srefSubscriberAdditionalIdentification;
    }

    /**
     * Gets the value of the sn3SubscriberAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SN3SubscriberAddress }{@code >}
     *     
     */
    public JAXBElement<SN3SubscriberAddress> getSN3SubscriberAddress() {
        return sn3SubscriberAddress;
    }

    /**
     * Sets the value of the sn3SubscriberAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SN3SubscriberAddress }{@code >}
     *     
     */
    public void setSN3SubscriberAddress(JAXBElement<SN3SubscriberAddress> value) {
        this.sn3SubscriberAddress = ((JAXBElement<SN3SubscriberAddress> ) value);
    }

    /**
     * Gets the value of the sn4SubscriberCityStateZIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SN4SubscriberCityStateZIPCode }{@code >}
     *     
     */
    public JAXBElement<SN4SubscriberCityStateZIPCode> getSN4SubscriberCityStateZIPCode() {
        return sn4SubscriberCityStateZIPCode;
    }

    /**
     * Sets the value of the sn4SubscriberCityStateZIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SN4SubscriberCityStateZIPCode }{@code >}
     *     
     */
    public void setSN4SubscriberCityStateZIPCode(JAXBElement<SN4SubscriberCityStateZIPCode> value) {
        this.sn4SubscriberCityStateZIPCode = ((JAXBElement<SN4SubscriberCityStateZIPCode> ) value);
    }

    /**
     * Gets the value of the saaaSubscriberRequestValidation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saaaSubscriberRequestValidation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSAAASubscriberRequestValidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SAAASubscriberRequestValidation }
     * 
     * 
     */
    public List<SAAASubscriberRequestValidation> getSAAASubscriberRequestValidation() {
        if (saaaSubscriberRequestValidation == null) {
            saaaSubscriberRequestValidation = new ArrayList<SAAASubscriberRequestValidation>();
        }
        return this.saaaSubscriberRequestValidation;
    }

    /**
     * Gets the value of the sprvProviderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SPRVProviderInformation }{@code >}
     *     
     */
    public JAXBElement<SPRVProviderInformation> getSPRVProviderInformation() {
        return sprvProviderInformation;
    }

    /**
     * Sets the value of the sprvProviderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SPRVProviderInformation }{@code >}
     *     
     */
    public void setSPRVProviderInformation(JAXBElement<SPRVProviderInformation> value) {
        this.sprvProviderInformation = ((JAXBElement<SPRVProviderInformation> ) value);
    }

    /**
     * Gets the value of the sdmgSubscriberDemographicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SDMGSubscriberDemographicInformation }{@code >}
     *     
     */
    public JAXBElement<SDMGSubscriberDemographicInformation> getSDMGSubscriberDemographicInformation() {
        return sdmgSubscriberDemographicInformation;
    }

    /**
     * Sets the value of the sdmgSubscriberDemographicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SDMGSubscriberDemographicInformation }{@code >}
     *     
     */
    public void setSDMGSubscriberDemographicInformation(JAXBElement<SDMGSubscriberDemographicInformation> value) {
        this.sdmgSubscriberDemographicInformation = ((JAXBElement<SDMGSubscriberDemographicInformation> ) value);
    }

    /**
     * Gets the value of the sinsSubscriberRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SINSSubscriberRelationship }{@code >}
     *     
     */
    public JAXBElement<SINSSubscriberRelationship> getSINSSubscriberRelationship() {
        return sinsSubscriberRelationship;
    }

    /**
     * Sets the value of the sinsSubscriberRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SINSSubscriberRelationship }{@code >}
     *     
     */
    public void setSINSSubscriberRelationship(JAXBElement<SINSSubscriberRelationship> value) {
        this.sinsSubscriberRelationship = ((JAXBElement<SINSSubscriberRelationship> ) value);
    }

    /**
     * Gets the value of the shiSubscriberHealthCareDiagnosisCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SHISubscriberHealthCareDiagnosisCode }{@code >}
     *     
     */
    public JAXBElement<SHISubscriberHealthCareDiagnosisCode> getSHISubscriberHealthCareDiagnosisCode() {
        return shiSubscriberHealthCareDiagnosisCode;
    }

    /**
     * Sets the value of the shiSubscriberHealthCareDiagnosisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SHISubscriberHealthCareDiagnosisCode }{@code >}
     *     
     */
    public void setSHISubscriberHealthCareDiagnosisCode(JAXBElement<SHISubscriberHealthCareDiagnosisCode> value) {
        this.shiSubscriberHealthCareDiagnosisCode = ((JAXBElement<SHISubscriberHealthCareDiagnosisCode> ) value);
    }

    /**
     * Gets the value of the sdtpSubscriberDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtpSubscriberDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSDTPSubscriberDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SDTPSubscriberDate }
     * 
     * 
     */
    public List<SDTPSubscriberDate> getSDTPSubscriberDate() {
        if (sdtpSubscriberDate == null) {
            sdtpSubscriberDate = new ArrayList<SDTPSubscriberDate>();
        }
        return this.sdtpSubscriberDate;
    }

    /**
     * Gets the value of the smpiSubscriberMilitaryPersonnelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SMPISubscriberMilitaryPersonnelInformation }{@code >}
     *     
     */
    public JAXBElement<SMPISubscriberMilitaryPersonnelInformation> getSMPISubscriberMilitaryPersonnelInformation() {
        return smpiSubscriberMilitaryPersonnelInformation;
    }

    /**
     * Sets the value of the smpiSubscriberMilitaryPersonnelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SMPISubscriberMilitaryPersonnelInformation }{@code >}
     *     
     */
    public void setSMPISubscriberMilitaryPersonnelInformation(JAXBElement<SMPISubscriberMilitaryPersonnelInformation> value) {
        this.smpiSubscriberMilitaryPersonnelInformation = ((JAXBElement<SMPISubscriberMilitaryPersonnelInformation> ) value);
    }

    /**
     * Gets the value of the l2110C property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l2110C property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL2110C().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L2110C }
     * 
     * 
     */
    public List<L2110C> getL2110C() {
        if (l2110C == null) {
            l2110C = new ArrayList<L2110C>();
        }
        return this.l2110C;
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
            return "2100C";
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
            return "Subscriber Name";
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
