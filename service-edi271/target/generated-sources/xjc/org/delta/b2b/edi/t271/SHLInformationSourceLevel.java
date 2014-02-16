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
 * To identify dependencies among and the content of hierarchically related groups of data segments
 * 
 * <p>Java class for S-HL-Information_Source_Level complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-HL-Information_Source_Level">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-HL01-Hierarchical_ID_Number" type="{http://www.delta.org/b2b/edi/t271}E-HL01-Hierarchical_ID_Number"/>
 *         &lt;element name="E-HL02-Hierarchical_Parent_ID_Number" type="{http://www.delta.org/b2b/edi/t271}E-HL02-Hierarchical_Parent_ID_Number" minOccurs="0"/>
 *         &lt;element name="E-HL03-Hierarchical_Level_Code" type="{http://www.delta.org/b2b/edi/t271}E-HL03-Hierarchical_Level_Code"/>
 *         &lt;element name="E-HL04-Hierarchical_Child_Code" type="{http://www.delta.org/b2b/edi/t271}E-HL04-Hierarchical_Child_Code"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="HL" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Information Source Level" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-HL-Information_Source_Level", propOrder = {
    "ehl01HierarchicalIDNumber",
    "ehl02HierarchicalParentIDNumber",
    "ehl03HierarchicalLevelCode",
    "ehl04HierarchicalChildCode"
})
public class SHLInformationSourceLevel {

    @XmlElement(name = "E-HL01-Hierarchical_ID_Number", required = true)
    protected EHL01HierarchicalIDNumber ehl01HierarchicalIDNumber;
    @XmlElementRef(name = "E-HL02-Hierarchical_Parent_ID_Number", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EHL02HierarchicalParentIDNumber> ehl02HierarchicalParentIDNumber;
    @XmlElement(name = "E-HL03-Hierarchical_Level_Code", required = true)
    protected EHL03HierarchicalLevelCode ehl03HierarchicalLevelCode;
    @XmlElement(name = "E-HL04-Hierarchical_Child_Code", required = true)
    protected EHL04HierarchicalChildCode ehl04HierarchicalChildCode;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the ehl01HierarchicalIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EHL01HierarchicalIDNumber }
     *     
     */
    public EHL01HierarchicalIDNumber getEHL01HierarchicalIDNumber() {
        return ehl01HierarchicalIDNumber;
    }

    /**
     * Sets the value of the ehl01HierarchicalIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHL01HierarchicalIDNumber }
     *     
     */
    public void setEHL01HierarchicalIDNumber(EHL01HierarchicalIDNumber value) {
        this.ehl01HierarchicalIDNumber = value;
    }

    /**
     * Gets the value of the ehl02HierarchicalParentIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EHL02HierarchicalParentIDNumber }{@code >}
     *     
     */
    public JAXBElement<EHL02HierarchicalParentIDNumber> getEHL02HierarchicalParentIDNumber() {
        return ehl02HierarchicalParentIDNumber;
    }

    /**
     * Sets the value of the ehl02HierarchicalParentIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EHL02HierarchicalParentIDNumber }{@code >}
     *     
     */
    public void setEHL02HierarchicalParentIDNumber(JAXBElement<EHL02HierarchicalParentIDNumber> value) {
        this.ehl02HierarchicalParentIDNumber = ((JAXBElement<EHL02HierarchicalParentIDNumber> ) value);
    }

    /**
     * Gets the value of the ehl03HierarchicalLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link EHL03HierarchicalLevelCode }
     *     
     */
    public EHL03HierarchicalLevelCode getEHL03HierarchicalLevelCode() {
        return ehl03HierarchicalLevelCode;
    }

    /**
     * Sets the value of the ehl03HierarchicalLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHL03HierarchicalLevelCode }
     *     
     */
    public void setEHL03HierarchicalLevelCode(EHL03HierarchicalLevelCode value) {
        this.ehl03HierarchicalLevelCode = value;
    }

    /**
     * Gets the value of the ehl04HierarchicalChildCode property.
     * 
     * @return
     *     possible object is
     *     {@link EHL04HierarchicalChildCode }
     *     
     */
    public EHL04HierarchicalChildCode getEHL04HierarchicalChildCode() {
        return ehl04HierarchicalChildCode;
    }

    /**
     * Sets the value of the ehl04HierarchicalChildCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHL04HierarchicalChildCode }
     *     
     */
    public void setEHL04HierarchicalChildCode(EHL04HierarchicalChildCode value) {
        this.ehl04HierarchicalChildCode = value;
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
            return "HL";
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
            return "Information Source Level";
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
