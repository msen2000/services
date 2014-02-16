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
 * To supply the full name of an individual or organizational entity
 * 
 * <p>Java class for S-NM1-Referring_Provider_Name complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-NM1-Referring_Provider_Name">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-NM101-Entity_Identifier_Code" type="{http://www.delta.org/b2b/edi/t837}E-NM101-Entity_Identifier_Code_7"/>
 *         &lt;element name="E-NM102-Entity_Type_Qualifier" type="{http://www.delta.org/b2b/edi/t837}E-NM102-Entity_Type_Qualifier_2"/>
 *         &lt;element name="E-NM103-Name_Last_or_Organization_Name" type="{http://www.delta.org/b2b/edi/t837}E-NM103-Name_Last_or_Organization_Name"/>
 *         &lt;element name="E-NM104-Name_First" type="{http://www.delta.org/b2b/edi/t837}E-NM104-Name_First" minOccurs="0"/>
 *         &lt;element name="E-NM105-Name_Middle" type="{http://www.delta.org/b2b/edi/t837}E-NM105-Name_Middle" minOccurs="0"/>
 *         &lt;element name="E-NM106-Name_Prefix" type="{http://www.delta.org/b2b/edi/t837}E-NM106-Name_Prefix" minOccurs="0"/>
 *         &lt;element name="E-NM107-Name_Suffix" type="{http://www.delta.org/b2b/edi/t837}E-NM107-Name_Suffix_1" minOccurs="0"/>
 *         &lt;element name="E-NM108-Identification_Code_Qualifier" type="{http://www.delta.org/b2b/edi/t837}E-NM108-Identification_Code_Qualifier_1" minOccurs="0"/>
 *         &lt;element name="E-NM109-Identification_Code" type="{http://www.delta.org/b2b/edi/t837}E-NM109-Identification_Code" minOccurs="0"/>
 *         &lt;element name="E-NM110-Entity_Relationship_Code" type="{http://www.delta.org/b2b/edi/t837}E-NM110-Entity_Relationship_Code" minOccurs="0"/>
 *         &lt;element name="E-NM111-Entity_Identifier_Code" type="{http://www.delta.org/b2b/edi/t837}E-NM111-Entity_Identifier_Code" minOccurs="0"/>
 *         &lt;element name="E-NM112-Name_Last_or_Organization_Name" type="{http://www.delta.org/b2b/edi/t837}E-NM112-Name_Last_or_Organization_Name" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="NM1" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Referring Provider Name" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-NM1-Referring_Provider_Name", propOrder = {
    "enm101EntityIdentifierCode",
    "enm102EntityTypeQualifier",
    "enm103NameLastOrOrganizationName",
    "enm104NameFirst",
    "enm105NameMiddle",
    "enm106NamePrefix",
    "enm107NameSuffix",
    "enm108IdentificationCodeQualifier",
    "enm109IdentificationCode",
    "enm110EntityRelationshipCode",
    "enm111EntityIdentifierCode",
    "enm112NameLastOrOrganizationName"
})
public class SNM1ReferringProviderName {

    @XmlElement(name = "E-NM101-Entity_Identifier_Code", required = true)
    protected ENM101EntityIdentifierCode7 enm101EntityIdentifierCode;
    @XmlElement(name = "E-NM102-Entity_Type_Qualifier", required = true)
    protected ENM102EntityTypeQualifier2 enm102EntityTypeQualifier;
    @XmlElement(name = "E-NM103-Name_Last_or_Organization_Name", required = true)
    protected ENM103NameLastOrOrganizationName enm103NameLastOrOrganizationName;
    @XmlElementRef(name = "E-NM104-Name_First", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ENM104NameFirst> enm104NameFirst;
    @XmlElementRef(name = "E-NM105-Name_Middle", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ENM105NameMiddle> enm105NameMiddle;
    @XmlElementRef(name = "E-NM106-Name_Prefix", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ENM106NamePrefix> enm106NamePrefix;
    @XmlElementRef(name = "E-NM107-Name_Suffix", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ENM107NameSuffix1> enm107NameSuffix;
    @XmlElementRef(name = "E-NM108-Identification_Code_Qualifier", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ENM108IdentificationCodeQualifier1> enm108IdentificationCodeQualifier;
    @XmlElementRef(name = "E-NM109-Identification_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ENM109IdentificationCode> enm109IdentificationCode;
    @XmlElementRef(name = "E-NM110-Entity_Relationship_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ENM110EntityRelationshipCode> enm110EntityRelationshipCode;
    @XmlElementRef(name = "E-NM111-Entity_Identifier_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ENM111EntityIdentifierCode> enm111EntityIdentifierCode;
    @XmlElementRef(name = "E-NM112-Name_Last_or_Organization_Name", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ENM112NameLastOrOrganizationName> enm112NameLastOrOrganizationName;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the enm101EntityIdentifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link ENM101EntityIdentifierCode7 }
     *     
     */
    public ENM101EntityIdentifierCode7 getENM101EntityIdentifierCode() {
        return enm101EntityIdentifierCode;
    }

    /**
     * Sets the value of the enm101EntityIdentifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENM101EntityIdentifierCode7 }
     *     
     */
    public void setENM101EntityIdentifierCode(ENM101EntityIdentifierCode7 value) {
        this.enm101EntityIdentifierCode = value;
    }

    /**
     * Gets the value of the enm102EntityTypeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ENM102EntityTypeQualifier2 }
     *     
     */
    public ENM102EntityTypeQualifier2 getENM102EntityTypeQualifier() {
        return enm102EntityTypeQualifier;
    }

    /**
     * Sets the value of the enm102EntityTypeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENM102EntityTypeQualifier2 }
     *     
     */
    public void setENM102EntityTypeQualifier(ENM102EntityTypeQualifier2 value) {
        this.enm102EntityTypeQualifier = value;
    }

    /**
     * Gets the value of the enm103NameLastOrOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link ENM103NameLastOrOrganizationName }
     *     
     */
    public ENM103NameLastOrOrganizationName getENM103NameLastOrOrganizationName() {
        return enm103NameLastOrOrganizationName;
    }

    /**
     * Sets the value of the enm103NameLastOrOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENM103NameLastOrOrganizationName }
     *     
     */
    public void setENM103NameLastOrOrganizationName(ENM103NameLastOrOrganizationName value) {
        this.enm103NameLastOrOrganizationName = value;
    }

    /**
     * Gets the value of the enm104NameFirst property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ENM104NameFirst }{@code >}
     *     
     */
    public JAXBElement<ENM104NameFirst> getENM104NameFirst() {
        return enm104NameFirst;
    }

    /**
     * Sets the value of the enm104NameFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ENM104NameFirst }{@code >}
     *     
     */
    public void setENM104NameFirst(JAXBElement<ENM104NameFirst> value) {
        this.enm104NameFirst = ((JAXBElement<ENM104NameFirst> ) value);
    }

    /**
     * Gets the value of the enm105NameMiddle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ENM105NameMiddle }{@code >}
     *     
     */
    public JAXBElement<ENM105NameMiddle> getENM105NameMiddle() {
        return enm105NameMiddle;
    }

    /**
     * Sets the value of the enm105NameMiddle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ENM105NameMiddle }{@code >}
     *     
     */
    public void setENM105NameMiddle(JAXBElement<ENM105NameMiddle> value) {
        this.enm105NameMiddle = ((JAXBElement<ENM105NameMiddle> ) value);
    }

    /**
     * Gets the value of the enm106NamePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ENM106NamePrefix }{@code >}
     *     
     */
    public JAXBElement<ENM106NamePrefix> getENM106NamePrefix() {
        return enm106NamePrefix;
    }

    /**
     * Sets the value of the enm106NamePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ENM106NamePrefix }{@code >}
     *     
     */
    public void setENM106NamePrefix(JAXBElement<ENM106NamePrefix> value) {
        this.enm106NamePrefix = ((JAXBElement<ENM106NamePrefix> ) value);
    }

    /**
     * Gets the value of the enm107NameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ENM107NameSuffix1 }{@code >}
     *     
     */
    public JAXBElement<ENM107NameSuffix1> getENM107NameSuffix() {
        return enm107NameSuffix;
    }

    /**
     * Sets the value of the enm107NameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ENM107NameSuffix1 }{@code >}
     *     
     */
    public void setENM107NameSuffix(JAXBElement<ENM107NameSuffix1> value) {
        this.enm107NameSuffix = ((JAXBElement<ENM107NameSuffix1> ) value);
    }

    /**
     * Gets the value of the enm108IdentificationCodeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ENM108IdentificationCodeQualifier1 }{@code >}
     *     
     */
    public JAXBElement<ENM108IdentificationCodeQualifier1> getENM108IdentificationCodeQualifier() {
        return enm108IdentificationCodeQualifier;
    }

    /**
     * Sets the value of the enm108IdentificationCodeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ENM108IdentificationCodeQualifier1 }{@code >}
     *     
     */
    public void setENM108IdentificationCodeQualifier(JAXBElement<ENM108IdentificationCodeQualifier1> value) {
        this.enm108IdentificationCodeQualifier = ((JAXBElement<ENM108IdentificationCodeQualifier1> ) value);
    }

    /**
     * Gets the value of the enm109IdentificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ENM109IdentificationCode }{@code >}
     *     
     */
    public JAXBElement<ENM109IdentificationCode> getENM109IdentificationCode() {
        return enm109IdentificationCode;
    }

    /**
     * Sets the value of the enm109IdentificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ENM109IdentificationCode }{@code >}
     *     
     */
    public void setENM109IdentificationCode(JAXBElement<ENM109IdentificationCode> value) {
        this.enm109IdentificationCode = ((JAXBElement<ENM109IdentificationCode> ) value);
    }

    /**
     * Gets the value of the enm110EntityRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ENM110EntityRelationshipCode }{@code >}
     *     
     */
    public JAXBElement<ENM110EntityRelationshipCode> getENM110EntityRelationshipCode() {
        return enm110EntityRelationshipCode;
    }

    /**
     * Sets the value of the enm110EntityRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ENM110EntityRelationshipCode }{@code >}
     *     
     */
    public void setENM110EntityRelationshipCode(JAXBElement<ENM110EntityRelationshipCode> value) {
        this.enm110EntityRelationshipCode = ((JAXBElement<ENM110EntityRelationshipCode> ) value);
    }

    /**
     * Gets the value of the enm111EntityIdentifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ENM111EntityIdentifierCode }{@code >}
     *     
     */
    public JAXBElement<ENM111EntityIdentifierCode> getENM111EntityIdentifierCode() {
        return enm111EntityIdentifierCode;
    }

    /**
     * Sets the value of the enm111EntityIdentifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ENM111EntityIdentifierCode }{@code >}
     *     
     */
    public void setENM111EntityIdentifierCode(JAXBElement<ENM111EntityIdentifierCode> value) {
        this.enm111EntityIdentifierCode = ((JAXBElement<ENM111EntityIdentifierCode> ) value);
    }

    /**
     * Gets the value of the enm112NameLastOrOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ENM112NameLastOrOrganizationName }{@code >}
     *     
     */
    public JAXBElement<ENM112NameLastOrOrganizationName> getENM112NameLastOrOrganizationName() {
        return enm112NameLastOrOrganizationName;
    }

    /**
     * Sets the value of the enm112NameLastOrOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ENM112NameLastOrOrganizationName }{@code >}
     *     
     */
    public void setENM112NameLastOrOrganizationName(JAXBElement<ENM112NameLastOrOrganizationName> value) {
        this.enm112NameLastOrOrganizationName = ((JAXBElement<ENM112NameLastOrOrganizationName> ) value);
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
            return "NM1";
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
            return "Referring Provider Name";
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
