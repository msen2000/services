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
 * To define the end of an interchange of zero or more functional groups and interchange-related control segments
 * 
 * <p>Java class for S-IEA-Interchange_Control_Trailer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-IEA-Interchange_Control_Trailer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-IEA01-Number_of_Included_Functional_Groups" type="{http://www.delta.org/b2b/edi/t277}E-IEA01-Number_of_Included_Functional_Groups"/>
 *         &lt;element name="E-IEA02-Interchange_Control_Number" type="{http://www.delta.org/b2b/edi/t277}E-IEA02-Interchange_Control_Number"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="IEA" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Interchange Control Trailer" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-IEA-Interchange_Control_Trailer", propOrder = {
    "eiea01NumberOfIncludedFunctionalGroups",
    "eiea02InterchangeControlNumber"
})
public class SIEAInterchangeControlTrailer {

    @XmlElement(name = "E-IEA01-Number_of_Included_Functional_Groups", required = true)
    protected EIEA01NumberOfIncludedFunctionalGroups eiea01NumberOfIncludedFunctionalGroups;
    @XmlElement(name = "E-IEA02-Interchange_Control_Number", required = true)
    protected EIEA02InterchangeControlNumber eiea02InterchangeControlNumber;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the eiea01NumberOfIncludedFunctionalGroups property.
     * 
     * @return
     *     possible object is
     *     {@link EIEA01NumberOfIncludedFunctionalGroups }
     *     
     */
    public EIEA01NumberOfIncludedFunctionalGroups getEIEA01NumberOfIncludedFunctionalGroups() {
        return eiea01NumberOfIncludedFunctionalGroups;
    }

    /**
     * Sets the value of the eiea01NumberOfIncludedFunctionalGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIEA01NumberOfIncludedFunctionalGroups }
     *     
     */
    public void setEIEA01NumberOfIncludedFunctionalGroups(EIEA01NumberOfIncludedFunctionalGroups value) {
        this.eiea01NumberOfIncludedFunctionalGroups = value;
    }

    /**
     * Gets the value of the eiea02InterchangeControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EIEA02InterchangeControlNumber }
     *     
     */
    public EIEA02InterchangeControlNumber getEIEA02InterchangeControlNumber() {
        return eiea02InterchangeControlNumber;
    }

    /**
     * Sets the value of the eiea02InterchangeControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIEA02InterchangeControlNumber }
     *     
     */
    public void setEIEA02InterchangeControlNumber(EIEA02InterchangeControlNumber value) {
        this.eiea02InterchangeControlNumber = value;
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
            return "IEA";
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
            return "Interchange Control Trailer";
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
