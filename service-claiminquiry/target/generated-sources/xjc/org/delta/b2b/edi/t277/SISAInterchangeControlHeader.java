//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.24 at 03:57:26 PM PDT 
//


package org.delta.b2b.edi.t277;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To start and identify an interchange of zero or more functional groups and interchange-related control segments
 * 
 * <p>Java class for S-ISA-Interchange_Control_Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-ISA-Interchange_Control_Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-ISA01-Authorization_Information_Qualifier" type="{http://www.delta.org/b2b/edi/t277}E-ISA01-Authorization_Information_Qualifier"/>
 *         &lt;element name="E-ISA02-Authorization_Information" type="{http://www.delta.org/b2b/edi/t277}E-ISA02-Authorization_Information"/>
 *         &lt;element name="E-ISA03-Security_Information_Qualifier" type="{http://www.delta.org/b2b/edi/t277}E-ISA03-Security_Information_Qualifier"/>
 *         &lt;element name="E-ISA04-Security_Information" type="{http://www.delta.org/b2b/edi/t277}E-ISA04-Security_Information"/>
 *         &lt;element name="E-ISA05-Interchange_ID_Qualifier" type="{http://www.delta.org/b2b/edi/t277}E-ISA05-Interchange_ID_Qualifier"/>
 *         &lt;element name="E-ISA06-Interchange_Sender_ID" type="{http://www.delta.org/b2b/edi/t277}E-ISA06-Interchange_Sender_ID"/>
 *         &lt;element name="E-ISA07-Interchange_ID_Qualifier" type="{http://www.delta.org/b2b/edi/t277}E-ISA07-Interchange_ID_Qualifier"/>
 *         &lt;element name="E-ISA08-Interchange_Receiver_ID" type="{http://www.delta.org/b2b/edi/t277}E-ISA08-Interchange_Receiver_ID"/>
 *         &lt;element name="E-ISA09-Interchange_Date" type="{http://www.delta.org/b2b/edi/t277}E-ISA09-Interchange_Date"/>
 *         &lt;element name="E-ISA10-Interchange_Time" type="{http://www.delta.org/b2b/edi/t277}E-ISA10-Interchange_Time"/>
 *         &lt;element name="E-ISA11-Repetition_Separator" type="{http://www.delta.org/b2b/edi/t277}E-ISA11-Repetition_Separator"/>
 *         &lt;element name="E-ISA12-Interchange_Control_Version_Number" type="{http://www.delta.org/b2b/edi/t277}E-ISA12-Interchange_Control_Version_Number"/>
 *         &lt;element name="E-ISA13-Interchange_Control_Number" type="{http://www.delta.org/b2b/edi/t277}E-ISA13-Interchange_Control_Number"/>
 *         &lt;element name="E-ISA14-Acknowledgment_Requested" type="{http://www.delta.org/b2b/edi/t277}E-ISA14-Acknowledgment_Requested"/>
 *         &lt;element name="E-ISA15-Interchange_Usage_Indicator" type="{http://www.delta.org/b2b/edi/t277}E-ISA15-Interchange_Usage_Indicator"/>
 *         &lt;element name="E-ISA16-Component_Element_Separator" type="{http://www.delta.org/b2b/edi/t277}E-ISA16-Component_Element_Separator"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="ISA" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Interchange Control Header" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-ISA-Interchange_Control_Header", propOrder = {
    "eisa01AuthorizationInformationQualifier",
    "eisa02AuthorizationInformation",
    "eisa03SecurityInformationQualifier",
    "eisa04SecurityInformation",
    "eisa05InterchangeIDQualifier",
    "eisa06InterchangeSenderID",
    "eisa07InterchangeIDQualifier",
    "eisa08InterchangeReceiverID",
    "eisa09InterchangeDate",
    "eisa10InterchangeTime",
    "eisa11RepetitionSeparator",
    "eisa12InterchangeControlVersionNumber",
    "eisa13InterchangeControlNumber",
    "eisa14AcknowledgmentRequested",
    "eisa15InterchangeUsageIndicator",
    "eisa16ComponentElementSeparator"
})
public class SISAInterchangeControlHeader {

    @XmlElement(name = "E-ISA01-Authorization_Information_Qualifier", required = true)
    protected EISA01AuthorizationInformationQualifier eisa01AuthorizationInformationQualifier;
    @XmlElement(name = "E-ISA02-Authorization_Information", required = true)
    protected EISA02AuthorizationInformation eisa02AuthorizationInformation;
    @XmlElement(name = "E-ISA03-Security_Information_Qualifier", required = true)
    protected EISA03SecurityInformationQualifier eisa03SecurityInformationQualifier;
    @XmlElement(name = "E-ISA04-Security_Information", required = true)
    protected EISA04SecurityInformation eisa04SecurityInformation;
    @XmlElement(name = "E-ISA05-Interchange_ID_Qualifier", required = true)
    protected EISA05InterchangeIDQualifier eisa05InterchangeIDQualifier;
    @XmlElement(name = "E-ISA06-Interchange_Sender_ID", required = true)
    protected EISA06InterchangeSenderID eisa06InterchangeSenderID;
    @XmlElement(name = "E-ISA07-Interchange_ID_Qualifier", required = true)
    protected EISA07InterchangeIDQualifier eisa07InterchangeIDQualifier;
    @XmlElement(name = "E-ISA08-Interchange_Receiver_ID", required = true)
    protected EISA08InterchangeReceiverID eisa08InterchangeReceiverID;
    @XmlElement(name = "E-ISA09-Interchange_Date", required = true)
    protected EISA09InterchangeDate eisa09InterchangeDate;
    @XmlElement(name = "E-ISA10-Interchange_Time", required = true)
    protected EISA10InterchangeTime eisa10InterchangeTime;
    @XmlElement(name = "E-ISA11-Repetition_Separator", required = true)
    protected EISA11RepetitionSeparator eisa11RepetitionSeparator;
    @XmlElement(name = "E-ISA12-Interchange_Control_Version_Number", required = true)
    protected EISA12InterchangeControlVersionNumber eisa12InterchangeControlVersionNumber;
    @XmlElement(name = "E-ISA13-Interchange_Control_Number", required = true)
    protected EISA13InterchangeControlNumber eisa13InterchangeControlNumber;
    @XmlElement(name = "E-ISA14-Acknowledgment_Requested", required = true)
    protected EISA14AcknowledgmentRequested eisa14AcknowledgmentRequested;
    @XmlElement(name = "E-ISA15-Interchange_Usage_Indicator", required = true)
    protected EISA15InterchangeUsageIndicator eisa15InterchangeUsageIndicator;
    @XmlElement(name = "E-ISA16-Component_Element_Separator", required = true)
    protected EISA16ComponentElementSeparator eisa16ComponentElementSeparator;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the eisa01AuthorizationInformationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EISA01AuthorizationInformationQualifier }
     *     
     */
    public EISA01AuthorizationInformationQualifier getEISA01AuthorizationInformationQualifier() {
        return eisa01AuthorizationInformationQualifier;
    }

    /**
     * Sets the value of the eisa01AuthorizationInformationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA01AuthorizationInformationQualifier }
     *     
     */
    public void setEISA01AuthorizationInformationQualifier(EISA01AuthorizationInformationQualifier value) {
        this.eisa01AuthorizationInformationQualifier = value;
    }

    /**
     * Gets the value of the eisa02AuthorizationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EISA02AuthorizationInformation }
     *     
     */
    public EISA02AuthorizationInformation getEISA02AuthorizationInformation() {
        return eisa02AuthorizationInformation;
    }

    /**
     * Sets the value of the eisa02AuthorizationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA02AuthorizationInformation }
     *     
     */
    public void setEISA02AuthorizationInformation(EISA02AuthorizationInformation value) {
        this.eisa02AuthorizationInformation = value;
    }

    /**
     * Gets the value of the eisa03SecurityInformationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EISA03SecurityInformationQualifier }
     *     
     */
    public EISA03SecurityInformationQualifier getEISA03SecurityInformationQualifier() {
        return eisa03SecurityInformationQualifier;
    }

    /**
     * Sets the value of the eisa03SecurityInformationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA03SecurityInformationQualifier }
     *     
     */
    public void setEISA03SecurityInformationQualifier(EISA03SecurityInformationQualifier value) {
        this.eisa03SecurityInformationQualifier = value;
    }

    /**
     * Gets the value of the eisa04SecurityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EISA04SecurityInformation }
     *     
     */
    public EISA04SecurityInformation getEISA04SecurityInformation() {
        return eisa04SecurityInformation;
    }

    /**
     * Sets the value of the eisa04SecurityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA04SecurityInformation }
     *     
     */
    public void setEISA04SecurityInformation(EISA04SecurityInformation value) {
        this.eisa04SecurityInformation = value;
    }

    /**
     * Gets the value of the eisa05InterchangeIDQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EISA05InterchangeIDQualifier }
     *     
     */
    public EISA05InterchangeIDQualifier getEISA05InterchangeIDQualifier() {
        return eisa05InterchangeIDQualifier;
    }

    /**
     * Sets the value of the eisa05InterchangeIDQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA05InterchangeIDQualifier }
     *     
     */
    public void setEISA05InterchangeIDQualifier(EISA05InterchangeIDQualifier value) {
        this.eisa05InterchangeIDQualifier = value;
    }

    /**
     * Gets the value of the eisa06InterchangeSenderID property.
     * 
     * @return
     *     possible object is
     *     {@link EISA06InterchangeSenderID }
     *     
     */
    public EISA06InterchangeSenderID getEISA06InterchangeSenderID() {
        return eisa06InterchangeSenderID;
    }

    /**
     * Sets the value of the eisa06InterchangeSenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA06InterchangeSenderID }
     *     
     */
    public void setEISA06InterchangeSenderID(EISA06InterchangeSenderID value) {
        this.eisa06InterchangeSenderID = value;
    }

    /**
     * Gets the value of the eisa07InterchangeIDQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EISA07InterchangeIDQualifier }
     *     
     */
    public EISA07InterchangeIDQualifier getEISA07InterchangeIDQualifier() {
        return eisa07InterchangeIDQualifier;
    }

    /**
     * Sets the value of the eisa07InterchangeIDQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA07InterchangeIDQualifier }
     *     
     */
    public void setEISA07InterchangeIDQualifier(EISA07InterchangeIDQualifier value) {
        this.eisa07InterchangeIDQualifier = value;
    }

    /**
     * Gets the value of the eisa08InterchangeReceiverID property.
     * 
     * @return
     *     possible object is
     *     {@link EISA08InterchangeReceiverID }
     *     
     */
    public EISA08InterchangeReceiverID getEISA08InterchangeReceiverID() {
        return eisa08InterchangeReceiverID;
    }

    /**
     * Sets the value of the eisa08InterchangeReceiverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA08InterchangeReceiverID }
     *     
     */
    public void setEISA08InterchangeReceiverID(EISA08InterchangeReceiverID value) {
        this.eisa08InterchangeReceiverID = value;
    }

    /**
     * Gets the value of the eisa09InterchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link EISA09InterchangeDate }
     *     
     */
    public EISA09InterchangeDate getEISA09InterchangeDate() {
        return eisa09InterchangeDate;
    }

    /**
     * Sets the value of the eisa09InterchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA09InterchangeDate }
     *     
     */
    public void setEISA09InterchangeDate(EISA09InterchangeDate value) {
        this.eisa09InterchangeDate = value;
    }

    /**
     * Gets the value of the eisa10InterchangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link EISA10InterchangeTime }
     *     
     */
    public EISA10InterchangeTime getEISA10InterchangeTime() {
        return eisa10InterchangeTime;
    }

    /**
     * Sets the value of the eisa10InterchangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA10InterchangeTime }
     *     
     */
    public void setEISA10InterchangeTime(EISA10InterchangeTime value) {
        this.eisa10InterchangeTime = value;
    }

    /**
     * Gets the value of the eisa11RepetitionSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link EISA11RepetitionSeparator }
     *     
     */
    public EISA11RepetitionSeparator getEISA11RepetitionSeparator() {
        return eisa11RepetitionSeparator;
    }

    /**
     * Sets the value of the eisa11RepetitionSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA11RepetitionSeparator }
     *     
     */
    public void setEISA11RepetitionSeparator(EISA11RepetitionSeparator value) {
        this.eisa11RepetitionSeparator = value;
    }

    /**
     * Gets the value of the eisa12InterchangeControlVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EISA12InterchangeControlVersionNumber }
     *     
     */
    public EISA12InterchangeControlVersionNumber getEISA12InterchangeControlVersionNumber() {
        return eisa12InterchangeControlVersionNumber;
    }

    /**
     * Sets the value of the eisa12InterchangeControlVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA12InterchangeControlVersionNumber }
     *     
     */
    public void setEISA12InterchangeControlVersionNumber(EISA12InterchangeControlVersionNumber value) {
        this.eisa12InterchangeControlVersionNumber = value;
    }

    /**
     * Gets the value of the eisa13InterchangeControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EISA13InterchangeControlNumber }
     *     
     */
    public EISA13InterchangeControlNumber getEISA13InterchangeControlNumber() {
        return eisa13InterchangeControlNumber;
    }

    /**
     * Sets the value of the eisa13InterchangeControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA13InterchangeControlNumber }
     *     
     */
    public void setEISA13InterchangeControlNumber(EISA13InterchangeControlNumber value) {
        this.eisa13InterchangeControlNumber = value;
    }

    /**
     * Gets the value of the eisa14AcknowledgmentRequested property.
     * 
     * @return
     *     possible object is
     *     {@link EISA14AcknowledgmentRequested }
     *     
     */
    public EISA14AcknowledgmentRequested getEISA14AcknowledgmentRequested() {
        return eisa14AcknowledgmentRequested;
    }

    /**
     * Sets the value of the eisa14AcknowledgmentRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA14AcknowledgmentRequested }
     *     
     */
    public void setEISA14AcknowledgmentRequested(EISA14AcknowledgmentRequested value) {
        this.eisa14AcknowledgmentRequested = value;
    }

    /**
     * Gets the value of the eisa15InterchangeUsageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link EISA15InterchangeUsageIndicator }
     *     
     */
    public EISA15InterchangeUsageIndicator getEISA15InterchangeUsageIndicator() {
        return eisa15InterchangeUsageIndicator;
    }

    /**
     * Sets the value of the eisa15InterchangeUsageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA15InterchangeUsageIndicator }
     *     
     */
    public void setEISA15InterchangeUsageIndicator(EISA15InterchangeUsageIndicator value) {
        this.eisa15InterchangeUsageIndicator = value;
    }

    /**
     * Gets the value of the eisa16ComponentElementSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link EISA16ComponentElementSeparator }
     *     
     */
    public EISA16ComponentElementSeparator getEISA16ComponentElementSeparator() {
        return eisa16ComponentElementSeparator;
    }

    /**
     * Sets the value of the eisa16ComponentElementSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EISA16ComponentElementSeparator }
     *     
     */
    public void setEISA16ComponentElementSeparator(EISA16ComponentElementSeparator value) {
        this.eisa16ComponentElementSeparator = value;
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
            return "ISA";
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
            return "Interchange Control Header";
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
