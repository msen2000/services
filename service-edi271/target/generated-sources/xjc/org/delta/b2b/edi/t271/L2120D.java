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
 * <p>Java class for L-2120D complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2120D">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-NM1-Dependent_Benefit_Related_Entity_Name" type="{http://www.delta.org/b2b/edi/t271}S-NM1-Dependent_Benefit_Related_Entity_Name"/>
 *         &lt;element name="S-N3-Dependent_Benefit_Related_Entity_Address" type="{http://www.delta.org/b2b/edi/t271}S-N3-Dependent_Benefit_Related_Entity_Address" minOccurs="0"/>
 *         &lt;element name="S-N4-Dependent_Benefit_Related_Entity_City__State__ZIP_Code" type="{http://www.delta.org/b2b/edi/t271}S-N4-Dependent_Benefit_Related_Entity_City__State__ZIP_Code" minOccurs="0"/>
 *         &lt;element name="S-PER-Dependent_Benefit_Related_Entity_Contact_Information" type="{http://www.delta.org/b2b/edi/t271}S-PER-Dependent_Benefit_Related_Entity_Contact_Information" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="S-PRV-Dependent_Benefit_Related_Provider_Information" type="{http://www.delta.org/b2b/edi/t271}S-PRV-Dependent_Benefit_Related_Provider_Information" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2120D" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Dependent Benefit Related Entity Name" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2120D", propOrder = {
    "snm1DependentBenefitRelatedEntityName",
    "sn3DependentBenefitRelatedEntityAddress",
    "sn4DependentBenefitRelatedEntityCityStateZIPCode",
    "sperDependentBenefitRelatedEntityContactInformation",
    "sprvDependentBenefitRelatedProviderInformation"
})
public class L2120D {

    @XmlElement(name = "S-NM1-Dependent_Benefit_Related_Entity_Name", required = true)
    protected SNM1DependentBenefitRelatedEntityName snm1DependentBenefitRelatedEntityName;
    @XmlElementRef(name = "S-N3-Dependent_Benefit_Related_Entity_Address", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<SN3DependentBenefitRelatedEntityAddress> sn3DependentBenefitRelatedEntityAddress;
    @XmlElementRef(name = "S-N4-Dependent_Benefit_Related_Entity_City__State__ZIP_Code", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<SN4DependentBenefitRelatedEntityCityStateZIPCode> sn4DependentBenefitRelatedEntityCityStateZIPCode;
    @XmlElement(name = "S-PER-Dependent_Benefit_Related_Entity_Contact_Information", nillable = true)
    protected List<SPERDependentBenefitRelatedEntityContactInformation> sperDependentBenefitRelatedEntityContactInformation;
    @XmlElementRef(name = "S-PRV-Dependent_Benefit_Related_Provider_Information", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<SPRVDependentBenefitRelatedProviderInformation> sprvDependentBenefitRelatedProviderInformation;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the snm1DependentBenefitRelatedEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link SNM1DependentBenefitRelatedEntityName }
     *     
     */
    public SNM1DependentBenefitRelatedEntityName getSNM1DependentBenefitRelatedEntityName() {
        return snm1DependentBenefitRelatedEntityName;
    }

    /**
     * Sets the value of the snm1DependentBenefitRelatedEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNM1DependentBenefitRelatedEntityName }
     *     
     */
    public void setSNM1DependentBenefitRelatedEntityName(SNM1DependentBenefitRelatedEntityName value) {
        this.snm1DependentBenefitRelatedEntityName = value;
    }

    /**
     * Gets the value of the sn3DependentBenefitRelatedEntityAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SN3DependentBenefitRelatedEntityAddress }{@code >}
     *     
     */
    public JAXBElement<SN3DependentBenefitRelatedEntityAddress> getSN3DependentBenefitRelatedEntityAddress() {
        return sn3DependentBenefitRelatedEntityAddress;
    }

    /**
     * Sets the value of the sn3DependentBenefitRelatedEntityAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SN3DependentBenefitRelatedEntityAddress }{@code >}
     *     
     */
    public void setSN3DependentBenefitRelatedEntityAddress(JAXBElement<SN3DependentBenefitRelatedEntityAddress> value) {
        this.sn3DependentBenefitRelatedEntityAddress = ((JAXBElement<SN3DependentBenefitRelatedEntityAddress> ) value);
    }

    /**
     * Gets the value of the sn4DependentBenefitRelatedEntityCityStateZIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SN4DependentBenefitRelatedEntityCityStateZIPCode }{@code >}
     *     
     */
    public JAXBElement<SN4DependentBenefitRelatedEntityCityStateZIPCode> getSN4DependentBenefitRelatedEntityCityStateZIPCode() {
        return sn4DependentBenefitRelatedEntityCityStateZIPCode;
    }

    /**
     * Sets the value of the sn4DependentBenefitRelatedEntityCityStateZIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SN4DependentBenefitRelatedEntityCityStateZIPCode }{@code >}
     *     
     */
    public void setSN4DependentBenefitRelatedEntityCityStateZIPCode(JAXBElement<SN4DependentBenefitRelatedEntityCityStateZIPCode> value) {
        this.sn4DependentBenefitRelatedEntityCityStateZIPCode = ((JAXBElement<SN4DependentBenefitRelatedEntityCityStateZIPCode> ) value);
    }

    /**
     * Gets the value of the sperDependentBenefitRelatedEntityContactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sperDependentBenefitRelatedEntityContactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPERDependentBenefitRelatedEntityContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SPERDependentBenefitRelatedEntityContactInformation }
     * 
     * 
     */
    public List<SPERDependentBenefitRelatedEntityContactInformation> getSPERDependentBenefitRelatedEntityContactInformation() {
        if (sperDependentBenefitRelatedEntityContactInformation == null) {
            sperDependentBenefitRelatedEntityContactInformation = new ArrayList<SPERDependentBenefitRelatedEntityContactInformation>();
        }
        return this.sperDependentBenefitRelatedEntityContactInformation;
    }

    /**
     * Gets the value of the sprvDependentBenefitRelatedProviderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SPRVDependentBenefitRelatedProviderInformation }{@code >}
     *     
     */
    public JAXBElement<SPRVDependentBenefitRelatedProviderInformation> getSPRVDependentBenefitRelatedProviderInformation() {
        return sprvDependentBenefitRelatedProviderInformation;
    }

    /**
     * Sets the value of the sprvDependentBenefitRelatedProviderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SPRVDependentBenefitRelatedProviderInformation }{@code >}
     *     
     */
    public void setSPRVDependentBenefitRelatedProviderInformation(JAXBElement<SPRVDependentBenefitRelatedProviderInformation> value) {
        this.sprvDependentBenefitRelatedProviderInformation = ((JAXBElement<SPRVDependentBenefitRelatedProviderInformation> ) value);
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
            return "2120D";
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
            return "Dependent Benefit Related Entity Name";
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
