//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.30 at 07:43:57 PM PDT 
//


package org.delta.b2b.edi.t271;

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
 *         &lt;element name="E-EB01-Product_Service_ID_Qualifier" type="{http://www.delta.org/b2b/edi/t271}E-EB01-Product_Service_ID_Qualifier"/>
 *         &lt;element name="E-EB02-Product_Service_ID" type="{http://www.delta.org/b2b/edi/t271}E-EB02-Product_Service_ID"/>
 *         &lt;element name="E-EB03-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t271}E-EB03-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-EB04-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t271}E-EB04-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-EB05-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t271}E-EB05-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-EB06-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t271}E-EB06-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-EB07-Description" type="{http://www.delta.org/b2b/edi/t271}E-EB07-Description" minOccurs="0"/>
 *         &lt;element name="E-EB08-Product_Service_ID" type="{http://www.delta.org/b2b/edi/t271}E-EB08-Product_Service_ID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ApplicationInfo" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Required when a Medical Procedure Code was used from the 270 to determine the response being identified in the 2110C loop; OR Required when the Information Source supports Medical Procedure Code based 271 transactions and a Medical Procedure Code is available and appropriate for the eligibility or benefits being identified in the 2110C loop. If not required by this implementation guide or if EB03 is used, do not send." />
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
    "eeb01ProductServiceIDQualifier",
    "eeb02ProductServiceID",
    "eeb03ProcedureModifier",
    "eeb04ProcedureModifier",
    "eeb05ProcedureModifier",
    "eeb06ProcedureModifier",
    "eeb07Description",
    "eeb08ProductServiceID"
})
public class CC003CompositeMedicalProcedureIdentifier {

    @XmlElement(name = "E-EB01-Product_Service_ID_Qualifier", required = true)
    protected EEB01ProductServiceIDQualifier eeb01ProductServiceIDQualifier;
    @XmlElement(name = "E-EB02-Product_Service_ID", required = true)
    protected EEB02ProductServiceID eeb02ProductServiceID;
    @XmlElementRef(name = "E-EB03-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EEB03ProcedureModifier> eeb03ProcedureModifier;
    @XmlElementRef(name = "E-EB04-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EEB04ProcedureModifier> eeb04ProcedureModifier;
    @XmlElementRef(name = "E-EB05-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EEB05ProcedureModifier> eeb05ProcedureModifier;
    @XmlElementRef(name = "E-EB06-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EEB06ProcedureModifier> eeb06ProcedureModifier;
    @XmlElementRef(name = "E-EB07-Description", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EEB07Description> eeb07Description;
    @XmlElementRef(name = "E-EB08-Product_Service_ID", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EEB08ProductServiceID> eeb08ProductServiceID;
    @XmlAttribute(name = "ApplicationInfo")
    protected String applicationInfo;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the eeb01ProductServiceIDQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EEB01ProductServiceIDQualifier }
     *     
     */
    public EEB01ProductServiceIDQualifier getEEB01ProductServiceIDQualifier() {
        return eeb01ProductServiceIDQualifier;
    }

    /**
     * Sets the value of the eeb01ProductServiceIDQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EEB01ProductServiceIDQualifier }
     *     
     */
    public void setEEB01ProductServiceIDQualifier(EEB01ProductServiceIDQualifier value) {
        this.eeb01ProductServiceIDQualifier = value;
    }

    /**
     * Gets the value of the eeb02ProductServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link EEB02ProductServiceID }
     *     
     */
    public EEB02ProductServiceID getEEB02ProductServiceID() {
        return eeb02ProductServiceID;
    }

    /**
     * Sets the value of the eeb02ProductServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EEB02ProductServiceID }
     *     
     */
    public void setEEB02ProductServiceID(EEB02ProductServiceID value) {
        this.eeb02ProductServiceID = value;
    }

    /**
     * Gets the value of the eeb03ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEB03ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<EEB03ProcedureModifier> getEEB03ProcedureModifier() {
        return eeb03ProcedureModifier;
    }

    /**
     * Sets the value of the eeb03ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEB03ProcedureModifier }{@code >}
     *     
     */
    public void setEEB03ProcedureModifier(JAXBElement<EEB03ProcedureModifier> value) {
        this.eeb03ProcedureModifier = ((JAXBElement<EEB03ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the eeb04ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEB04ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<EEB04ProcedureModifier> getEEB04ProcedureModifier() {
        return eeb04ProcedureModifier;
    }

    /**
     * Sets the value of the eeb04ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEB04ProcedureModifier }{@code >}
     *     
     */
    public void setEEB04ProcedureModifier(JAXBElement<EEB04ProcedureModifier> value) {
        this.eeb04ProcedureModifier = ((JAXBElement<EEB04ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the eeb05ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEB05ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<EEB05ProcedureModifier> getEEB05ProcedureModifier() {
        return eeb05ProcedureModifier;
    }

    /**
     * Sets the value of the eeb05ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEB05ProcedureModifier }{@code >}
     *     
     */
    public void setEEB05ProcedureModifier(JAXBElement<EEB05ProcedureModifier> value) {
        this.eeb05ProcedureModifier = ((JAXBElement<EEB05ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the eeb06ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEB06ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<EEB06ProcedureModifier> getEEB06ProcedureModifier() {
        return eeb06ProcedureModifier;
    }

    /**
     * Sets the value of the eeb06ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEB06ProcedureModifier }{@code >}
     *     
     */
    public void setEEB06ProcedureModifier(JAXBElement<EEB06ProcedureModifier> value) {
        this.eeb06ProcedureModifier = ((JAXBElement<EEB06ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the eeb07Description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEB07Description }{@code >}
     *     
     */
    public JAXBElement<EEB07Description> getEEB07Description() {
        return eeb07Description;
    }

    /**
     * Sets the value of the eeb07Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEB07Description }{@code >}
     *     
     */
    public void setEEB07Description(JAXBElement<EEB07Description> value) {
        this.eeb07Description = ((JAXBElement<EEB07Description> ) value);
    }

    /**
     * Gets the value of the eeb08ProductServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEB08ProductServiceID }{@code >}
     *     
     */
    public JAXBElement<EEB08ProductServiceID> getEEB08ProductServiceID() {
        return eeb08ProductServiceID;
    }

    /**
     * Sets the value of the eeb08ProductServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEB08ProductServiceID }{@code >}
     *     
     */
    public void setEEB08ProductServiceID(JAXBElement<EEB08ProductServiceID> value) {
        this.eeb08ProductServiceID = ((JAXBElement<EEB08ProductServiceID> ) value);
    }

    /**
     * Gets the value of the applicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationInfo() {
        if (applicationInfo == null) {
            return "Required when a Medical Procedure Code was used from the 270 to determine the response being identified in the 2110C loop; OR Required when the Information Source supports Medical Procedure Code based 271 transactions and a Medical Procedure Code is available and appropriate for the eligibility or benefits being identified in the 2110C loop. If not required by this implementation guide or if EB03 is used, do not send.";
        } else {
            return applicationInfo;
        }
    }

    /**
     * Sets the value of the applicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationInfo(String value) {
        this.applicationInfo = value;
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
