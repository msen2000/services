//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.30 at 07:43:57 PM PDT 
//


package org.delta.b2b.edi.t271;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify dependencies among and the content of hierarchically related groups of data segments
 * 
 * <p>Java class for L-2000D complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2000D">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-HL-Dependent_Level" type="{http://www.delta.org/b2b/edi/t271}S-HL-Dependent_Level"/>
 *         &lt;element name="S-TRN-Dependent_Trace_Number" type="{http://www.delta.org/b2b/edi/t271}S-TRN-Dependent_Trace_Number" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="L-2100D" type="{http://www.delta.org/b2b/edi/t271}L-2100D"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2000D" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Dependent Level" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2000D", propOrder = {
    "shlDependentLevel",
    "strnDependentTraceNumber",
    "l2100D"
})
public class L2000D {

    @XmlElement(name = "S-HL-Dependent_Level", required = true)
    protected SHLDependentLevel shlDependentLevel;
    @XmlElement(name = "S-TRN-Dependent_Trace_Number", nillable = true)
    protected List<STRNDependentTraceNumber> strnDependentTraceNumber;
    @XmlElement(name = "L-2100D", required = true)
    protected L2100D l2100D;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the shlDependentLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SHLDependentLevel }
     *     
     */
    public SHLDependentLevel getSHLDependentLevel() {
        return shlDependentLevel;
    }

    /**
     * Sets the value of the shlDependentLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHLDependentLevel }
     *     
     */
    public void setSHLDependentLevel(SHLDependentLevel value) {
        this.shlDependentLevel = value;
    }

    /**
     * Gets the value of the strnDependentTraceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strnDependentTraceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTRNDependentTraceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STRNDependentTraceNumber }
     * 
     * 
     */
    public List<STRNDependentTraceNumber> getSTRNDependentTraceNumber() {
        if (strnDependentTraceNumber == null) {
            strnDependentTraceNumber = new ArrayList<STRNDependentTraceNumber>();
        }
        return this.strnDependentTraceNumber;
    }

    /**
     * Gets the value of the l2100D property.
     * 
     * @return
     *     possible object is
     *     {@link L2100D }
     *     
     */
    public L2100D getL2100D() {
        return l2100D;
    }

    /**
     * Sets the value of the l2100D property.
     * 
     * @param value
     *     allowed object is
     *     {@link L2100D }
     *     
     */
    public void setL2100D(L2100D value) {
        this.l2100D = value;
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
            return "2000D";
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
            return "Dependent Level";
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
