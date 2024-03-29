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
 * To indicate the beginning of a functional group and to provide control information
 * 
 * <p>Java class for S-GS-Functional_Group_Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-GS-Functional_Group_Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-GS01-Functional_Identifier_Code" type="{http://www.delta.org/b2b/edi/t271}E-GS01-Functional_Identifier_Code"/>
 *         &lt;element name="E-GS02-Application_Sender_s_Code" type="{http://www.delta.org/b2b/edi/t271}E-GS02-Application_Sender_s_Code"/>
 *         &lt;element name="E-GS03-Application_Receiver_s_Code" type="{http://www.delta.org/b2b/edi/t271}E-GS03-Application_Receiver_s_Code"/>
 *         &lt;element name="E-GS04-Date" type="{http://www.delta.org/b2b/edi/t271}E-GS04-Date"/>
 *         &lt;element name="E-GS05-Time" type="{http://www.delta.org/b2b/edi/t271}E-GS05-Time"/>
 *         &lt;element name="E-GS06-Group_Control_Number" type="{http://www.delta.org/b2b/edi/t271}E-GS06-Group_Control_Number"/>
 *         &lt;element name="E-GS07-Responsible_Agency_Code" type="{http://www.delta.org/b2b/edi/t271}E-GS07-Responsible_Agency_Code"/>
 *         &lt;element name="E-GS08-Version___Release___Industry_Identifier_Code" type="{http://www.delta.org/b2b/edi/t271}E-GS08-Version___Release___Industry_Identifier_Code"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="GS" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Functional Group Header" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-GS-Functional_Group_Header", propOrder = {
    "egs01FunctionalIdentifierCode",
    "egs02ApplicationSenderSCode",
    "egs03ApplicationReceiverSCode",
    "egs04Date",
    "egs05Time",
    "egs06GroupControlNumber",
    "egs07ResponsibleAgencyCode",
    "egs08VersionReleaseIndustryIdentifierCode"
})
public class SGSFunctionalGroupHeader {

    @XmlElement(name = "E-GS01-Functional_Identifier_Code", required = true)
    protected EGS01FunctionalIdentifierCode egs01FunctionalIdentifierCode;
    @XmlElement(name = "E-GS02-Application_Sender_s_Code", required = true)
    protected EGS02ApplicationSenderSCode egs02ApplicationSenderSCode;
    @XmlElement(name = "E-GS03-Application_Receiver_s_Code", required = true)
    protected EGS03ApplicationReceiverSCode egs03ApplicationReceiverSCode;
    @XmlElement(name = "E-GS04-Date", required = true)
    protected EGS04Date egs04Date;
    @XmlElement(name = "E-GS05-Time", required = true)
    protected EGS05Time egs05Time;
    @XmlElement(name = "E-GS06-Group_Control_Number", required = true)
    protected EGS06GroupControlNumber egs06GroupControlNumber;
    @XmlElement(name = "E-GS07-Responsible_Agency_Code", required = true)
    protected EGS07ResponsibleAgencyCode egs07ResponsibleAgencyCode;
    @XmlElement(name = "E-GS08-Version___Release___Industry_Identifier_Code", required = true)
    protected EGS08VersionReleaseIndustryIdentifierCode egs08VersionReleaseIndustryIdentifierCode;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the egs01FunctionalIdentifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link EGS01FunctionalIdentifierCode }
     *     
     */
    public EGS01FunctionalIdentifierCode getEGS01FunctionalIdentifierCode() {
        return egs01FunctionalIdentifierCode;
    }

    /**
     * Sets the value of the egs01FunctionalIdentifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EGS01FunctionalIdentifierCode }
     *     
     */
    public void setEGS01FunctionalIdentifierCode(EGS01FunctionalIdentifierCode value) {
        this.egs01FunctionalIdentifierCode = value;
    }

    /**
     * Gets the value of the egs02ApplicationSenderSCode property.
     * 
     * @return
     *     possible object is
     *     {@link EGS02ApplicationSenderSCode }
     *     
     */
    public EGS02ApplicationSenderSCode getEGS02ApplicationSenderSCode() {
        return egs02ApplicationSenderSCode;
    }

    /**
     * Sets the value of the egs02ApplicationSenderSCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EGS02ApplicationSenderSCode }
     *     
     */
    public void setEGS02ApplicationSenderSCode(EGS02ApplicationSenderSCode value) {
        this.egs02ApplicationSenderSCode = value;
    }

    /**
     * Gets the value of the egs03ApplicationReceiverSCode property.
     * 
     * @return
     *     possible object is
     *     {@link EGS03ApplicationReceiverSCode }
     *     
     */
    public EGS03ApplicationReceiverSCode getEGS03ApplicationReceiverSCode() {
        return egs03ApplicationReceiverSCode;
    }

    /**
     * Sets the value of the egs03ApplicationReceiverSCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EGS03ApplicationReceiverSCode }
     *     
     */
    public void setEGS03ApplicationReceiverSCode(EGS03ApplicationReceiverSCode value) {
        this.egs03ApplicationReceiverSCode = value;
    }

    /**
     * Gets the value of the egs04Date property.
     * 
     * @return
     *     possible object is
     *     {@link EGS04Date }
     *     
     */
    public EGS04Date getEGS04Date() {
        return egs04Date;
    }

    /**
     * Sets the value of the egs04Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link EGS04Date }
     *     
     */
    public void setEGS04Date(EGS04Date value) {
        this.egs04Date = value;
    }

    /**
     * Gets the value of the egs05Time property.
     * 
     * @return
     *     possible object is
     *     {@link EGS05Time }
     *     
     */
    public EGS05Time getEGS05Time() {
        return egs05Time;
    }

    /**
     * Sets the value of the egs05Time property.
     * 
     * @param value
     *     allowed object is
     *     {@link EGS05Time }
     *     
     */
    public void setEGS05Time(EGS05Time value) {
        this.egs05Time = value;
    }

    /**
     * Gets the value of the egs06GroupControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EGS06GroupControlNumber }
     *     
     */
    public EGS06GroupControlNumber getEGS06GroupControlNumber() {
        return egs06GroupControlNumber;
    }

    /**
     * Sets the value of the egs06GroupControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EGS06GroupControlNumber }
     *     
     */
    public void setEGS06GroupControlNumber(EGS06GroupControlNumber value) {
        this.egs06GroupControlNumber = value;
    }

    /**
     * Gets the value of the egs07ResponsibleAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link EGS07ResponsibleAgencyCode }
     *     
     */
    public EGS07ResponsibleAgencyCode getEGS07ResponsibleAgencyCode() {
        return egs07ResponsibleAgencyCode;
    }

    /**
     * Sets the value of the egs07ResponsibleAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EGS07ResponsibleAgencyCode }
     *     
     */
    public void setEGS07ResponsibleAgencyCode(EGS07ResponsibleAgencyCode value) {
        this.egs07ResponsibleAgencyCode = value;
    }

    /**
     * Gets the value of the egs08VersionReleaseIndustryIdentifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link EGS08VersionReleaseIndustryIdentifierCode }
     *     
     */
    public EGS08VersionReleaseIndustryIdentifierCode getEGS08VersionReleaseIndustryIdentifierCode() {
        return egs08VersionReleaseIndustryIdentifierCode;
    }

    /**
     * Sets the value of the egs08VersionReleaseIndustryIdentifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EGS08VersionReleaseIndustryIdentifierCode }
     *     
     */
    public void setEGS08VersionReleaseIndustryIdentifierCode(EGS08VersionReleaseIndustryIdentifierCode value) {
        this.egs08VersionReleaseIndustryIdentifierCode = value;
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
            return "GS";
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
            return "Functional Group Header";
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
