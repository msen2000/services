//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.25 at 02:23:02 PM PDT 
//


package org.delta.b2b.edi.t837;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify dependencies among and the content of hierarchically related groups of data segments
 * 
 * <p>Java class for L-2000A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2000A">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-HL-Billing_Provider_Hierarchical_Level" type="{http://www.delta.org/b2b/edi/t837}S-HL-Billing_Provider_Hierarchical_Level"/>
 *         &lt;element name="S-PRV-Billing_Provider_Specialty_Information" type="{http://www.delta.org/b2b/edi/t837}S-PRV-Billing_Provider_Specialty_Information" minOccurs="0"/>
 *         &lt;element name="S-CUR-Foreign_Currency_Information" type="{http://www.delta.org/b2b/edi/t837}S-CUR-Foreign_Currency_Information" minOccurs="0"/>
 *         &lt;choice maxOccurs="3">
 *           &lt;element name="L-2010AA" type="{http://www.delta.org/b2b/edi/t837}L-2010AA"/>
 *           &lt;element name="L-2010AB" type="{http://www.delta.org/b2b/edi/t837}L-2010AB" minOccurs="0"/>
 *           &lt;element name="L-2010AC" type="{http://www.delta.org/b2b/edi/t837}L-2010AC" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2000A" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Billing Provider Hierarchical Level" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2000A", propOrder = {
    "shlBillingProviderHierarchicalLevel",
    "sprvBillingProviderSpecialtyInformation",
    "scurForeignCurrencyInformation",
    "l2010AAOrL2010ABOrL2010AC"
})
public class L2000A {

    @XmlElement(name = "S-HL-Billing_Provider_Hierarchical_Level", required = true)
    protected SHLBillingProviderHierarchicalLevel shlBillingProviderHierarchicalLevel;
    @XmlElementRef(name = "S-PRV-Billing_Provider_Specialty_Information", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SPRVBillingProviderSpecialtyInformation> sprvBillingProviderSpecialtyInformation;
    @XmlElementRef(name = "S-CUR-Foreign_Currency_Information", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SCURForeignCurrencyInformation> scurForeignCurrencyInformation;
    @XmlElements({
        @XmlElement(name = "L-2010AC", type = L2010AC.class, nillable = true),
        @XmlElement(name = "L-2010AB", type = L2010AB.class, nillable = true),
        @XmlElement(name = "L-2010AA", type = L2010AA.class)
    })
    protected List<Object> l2010AAOrL2010ABOrL2010AC;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the shlBillingProviderHierarchicalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SHLBillingProviderHierarchicalLevel }
     *     
     */
    public SHLBillingProviderHierarchicalLevel getSHLBillingProviderHierarchicalLevel() {
        return shlBillingProviderHierarchicalLevel;
    }

    /**
     * Sets the value of the shlBillingProviderHierarchicalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHLBillingProviderHierarchicalLevel }
     *     
     */
    public void setSHLBillingProviderHierarchicalLevel(SHLBillingProviderHierarchicalLevel value) {
        this.shlBillingProviderHierarchicalLevel = value;
    }

    /**
     * Gets the value of the sprvBillingProviderSpecialtyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SPRVBillingProviderSpecialtyInformation }{@code >}
     *     
     */
    public JAXBElement<SPRVBillingProviderSpecialtyInformation> getSPRVBillingProviderSpecialtyInformation() {
        return sprvBillingProviderSpecialtyInformation;
    }

    /**
     * Sets the value of the sprvBillingProviderSpecialtyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SPRVBillingProviderSpecialtyInformation }{@code >}
     *     
     */
    public void setSPRVBillingProviderSpecialtyInformation(JAXBElement<SPRVBillingProviderSpecialtyInformation> value) {
        this.sprvBillingProviderSpecialtyInformation = ((JAXBElement<SPRVBillingProviderSpecialtyInformation> ) value);
    }

    /**
     * Gets the value of the scurForeignCurrencyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SCURForeignCurrencyInformation }{@code >}
     *     
     */
    public JAXBElement<SCURForeignCurrencyInformation> getSCURForeignCurrencyInformation() {
        return scurForeignCurrencyInformation;
    }

    /**
     * Sets the value of the scurForeignCurrencyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SCURForeignCurrencyInformation }{@code >}
     *     
     */
    public void setSCURForeignCurrencyInformation(JAXBElement<SCURForeignCurrencyInformation> value) {
        this.scurForeignCurrencyInformation = ((JAXBElement<SCURForeignCurrencyInformation> ) value);
    }

    /**
     * Gets the value of the l2010AAOrL2010ABOrL2010AC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l2010AAOrL2010ABOrL2010AC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL2010AAOrL2010ABOrL2010AC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L2010AC }
     * {@link L2010AB }
     * {@link L2010AA }
     * 
     * 
     */
    public List<Object> getL2010AAOrL2010ABOrL2010AC() {
        if (l2010AAOrL2010ABOrL2010AC == null) {
            l2010AAOrL2010ABOrL2010AC = new ArrayList<Object>();
        }
        return this.l2010AAOrL2010ABOrL2010AC;
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
            return "2000A";
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
            return "Billing Provider Hierarchical Level";
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
