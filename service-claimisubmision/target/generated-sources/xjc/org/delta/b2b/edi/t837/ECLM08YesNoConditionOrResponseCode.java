//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.25 at 02:23:02 PM PDT 
//


package org.delta.b2b.edi.t837;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Code indicating a Yes or No condition or response 
 * 
 * <p>Java class for E-CLM08-Yes_No_Condition_or_Response_Code complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="E-CLM08-Yes_No_Condition_or_Response_Code">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.delta.org/b2b/edi/t837>EDI-Element-String-Type">
 *       &lt;attribute name="EDIDataType" type="{http://www.w3.org/2001/XMLSchema}string" fixed="ID" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1073" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Yes/No Condition or Response Code" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "E-CLM08-Yes_No_Condition_or_Response_Code")
public class ECLM08YesNoConditionOrResponseCode
    extends EDIElementStringType
{


}
