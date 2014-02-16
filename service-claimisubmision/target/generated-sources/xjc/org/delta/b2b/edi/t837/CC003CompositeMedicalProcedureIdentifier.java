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
 * To identify a medical procedure by its standardized codes and applicable modifiers 
 * 
 * <p>Java class for C-C003-Composite_Medical_Procedure_Identifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C-C003-Composite_Medical_Procedure_Identifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-SV301-Product_Service_ID_Qualifier" type="{http://www.delta.org/b2b/edi/t837}E-SV301-Product_Service_ID_Qualifier"/>
 *         &lt;element name="E-SV302-Product_Service_ID" type="{http://www.delta.org/b2b/edi/t837}E-SV302-Product_Service_ID"/>
 *         &lt;element name="E-SV303-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t837}E-SV303-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-SV304-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t837}E-SV304-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-SV305-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t837}E-SV305-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-SV306-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t837}E-SV306-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-SV307-Description" type="{http://www.delta.org/b2b/edi/t837}E-SV307-Description" minOccurs="0"/>
 *         &lt;element name="E-SV308-Product_Service_ID" type="{http://www.delta.org/b2b/edi/t837}E-SV308-Product_Service_ID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="C003" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite Medical Procedure Identifier" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C-C003-Composite_Medical_Procedure_Identifier", propOrder = {
    "esv301ProductServiceIDQualifier",
    "esv302ProductServiceID",
    "esv303ProcedureModifier",
    "esv304ProcedureModifier",
    "esv305ProcedureModifier",
    "esv306ProcedureModifier",
    "esv307Description",
    "esv308ProductServiceID"
})
public class CC003CompositeMedicalProcedureIdentifier {

    @XmlElement(name = "E-SV301-Product_Service_ID_Qualifier", required = true)
    protected ESV301ProductServiceIDQualifier esv301ProductServiceIDQualifier;
    @XmlElement(name = "E-SV302-Product_Service_ID", required = true)
    protected ESV302ProductServiceID esv302ProductServiceID;
    @XmlElementRef(name = "E-SV303-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV303ProcedureModifier> esv303ProcedureModifier;
    @XmlElementRef(name = "E-SV304-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV304ProcedureModifier> esv304ProcedureModifier;
    @XmlElementRef(name = "E-SV305-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV305ProcedureModifier> esv305ProcedureModifier;
    @XmlElementRef(name = "E-SV306-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV306ProcedureModifier> esv306ProcedureModifier;
    @XmlElementRef(name = "E-SV307-Description", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV307Description> esv307Description;
    @XmlElementRef(name = "E-SV308-Product_Service_ID", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV308ProductServiceID> esv308ProductServiceID;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the esv301ProductServiceIDQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ESV301ProductServiceIDQualifier }
     *     
     */
    public ESV301ProductServiceIDQualifier getESV301ProductServiceIDQualifier() {
        return esv301ProductServiceIDQualifier;
    }

    /**
     * Sets the value of the esv301ProductServiceIDQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESV301ProductServiceIDQualifier }
     *     
     */
    public void setESV301ProductServiceIDQualifier(ESV301ProductServiceIDQualifier value) {
        this.esv301ProductServiceIDQualifier = value;
    }

    /**
     * Gets the value of the esv302ProductServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link ESV302ProductServiceID }
     *     
     */
    public ESV302ProductServiceID getESV302ProductServiceID() {
        return esv302ProductServiceID;
    }

    /**
     * Sets the value of the esv302ProductServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESV302ProductServiceID }
     *     
     */
    public void setESV302ProductServiceID(ESV302ProductServiceID value) {
        this.esv302ProductServiceID = value;
    }

    /**
     * Gets the value of the esv303ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV303ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<ESV303ProcedureModifier> getESV303ProcedureModifier() {
        return esv303ProcedureModifier;
    }

    /**
     * Sets the value of the esv303ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV303ProcedureModifier }{@code >}
     *     
     */
    public void setESV303ProcedureModifier(JAXBElement<ESV303ProcedureModifier> value) {
        this.esv303ProcedureModifier = ((JAXBElement<ESV303ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the esv304ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV304ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<ESV304ProcedureModifier> getESV304ProcedureModifier() {
        return esv304ProcedureModifier;
    }

    /**
     * Sets the value of the esv304ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV304ProcedureModifier }{@code >}
     *     
     */
    public void setESV304ProcedureModifier(JAXBElement<ESV304ProcedureModifier> value) {
        this.esv304ProcedureModifier = ((JAXBElement<ESV304ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the esv305ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV305ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<ESV305ProcedureModifier> getESV305ProcedureModifier() {
        return esv305ProcedureModifier;
    }

    /**
     * Sets the value of the esv305ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV305ProcedureModifier }{@code >}
     *     
     */
    public void setESV305ProcedureModifier(JAXBElement<ESV305ProcedureModifier> value) {
        this.esv305ProcedureModifier = ((JAXBElement<ESV305ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the esv306ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV306ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<ESV306ProcedureModifier> getESV306ProcedureModifier() {
        return esv306ProcedureModifier;
    }

    /**
     * Sets the value of the esv306ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV306ProcedureModifier }{@code >}
     *     
     */
    public void setESV306ProcedureModifier(JAXBElement<ESV306ProcedureModifier> value) {
        this.esv306ProcedureModifier = ((JAXBElement<ESV306ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the esv307Description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV307Description }{@code >}
     *     
     */
    public JAXBElement<ESV307Description> getESV307Description() {
        return esv307Description;
    }

    /**
     * Sets the value of the esv307Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV307Description }{@code >}
     *     
     */
    public void setESV307Description(JAXBElement<ESV307Description> value) {
        this.esv307Description = ((JAXBElement<ESV307Description> ) value);
    }

    /**
     * Gets the value of the esv308ProductServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV308ProductServiceID }{@code >}
     *     
     */
    public JAXBElement<ESV308ProductServiceID> getESV308ProductServiceID() {
        return esv308ProductServiceID;
    }

    /**
     * Sets the value of the esv308ProductServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV308ProductServiceID }{@code >}
     *     
     */
    public void setESV308ProductServiceID(JAXBElement<ESV308ProductServiceID> value) {
        this.esv308ProductServiceID = ((JAXBElement<ESV308ProductServiceID> ) value);
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
            return "C003";
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
            return "Composite Medical Procedure Identifier";
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