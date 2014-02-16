//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.25 at 02:23:02 PM PDT 
//


package org.delta.b2b.edi.t837;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To supply the full name of an individual or organizational entity
 * 
 * <p>Java class for L-2310E complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2310E">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-NM1-Supervising_Provider_Name" type="{http://www.delta.org/b2b/edi/t837}S-NM1-Supervising_Provider_Name"/>
 *         &lt;element name="S-REF-Supervising_Provider_Secondary_Identification" type="{http://www.delta.org/b2b/edi/t837}S-REF-Supervising_Provider_Secondary_Identification" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2310E" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Supervising Provider Name" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2310E", propOrder = {
    "snm1SupervisingProviderName",
    "srefSupervisingProviderSecondaryIdentification"
})
public class L2310E {

    @XmlElement(name = "S-NM1-Supervising_Provider_Name", required = true)
    protected SNM1SupervisingProviderName snm1SupervisingProviderName;
    @XmlElement(name = "S-REF-Supervising_Provider_Secondary_Identification", nillable = true)
    protected List<SREFSupervisingProviderSecondaryIdentification> srefSupervisingProviderSecondaryIdentification;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the snm1SupervisingProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link SNM1SupervisingProviderName }
     *     
     */
    public SNM1SupervisingProviderName getSNM1SupervisingProviderName() {
        return snm1SupervisingProviderName;
    }

    /**
     * Sets the value of the snm1SupervisingProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNM1SupervisingProviderName }
     *     
     */
    public void setSNM1SupervisingProviderName(SNM1SupervisingProviderName value) {
        this.snm1SupervisingProviderName = value;
    }

    /**
     * Gets the value of the srefSupervisingProviderSecondaryIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srefSupervisingProviderSecondaryIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSREFSupervisingProviderSecondaryIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SREFSupervisingProviderSecondaryIdentification }
     * 
     * 
     */
    public List<SREFSupervisingProviderSecondaryIdentification> getSREFSupervisingProviderSecondaryIdentification() {
        if (srefSupervisingProviderSecondaryIdentification == null) {
            srefSupervisingProviderSecondaryIdentification = new ArrayList<SREFSupervisingProviderSecondaryIdentification>();
        }
        return this.srefSupervisingProviderSecondaryIdentification;
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
            return "2310E";
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
            return "Supervising Provider Name";
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
