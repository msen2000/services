//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.24 at 03:57:26 PM PDT 
//


package org.delta.b2b.edi.t276;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Code indicating the date format, time format, or date and time format 
 * 
 * <p>Java class for E-DMG01-Date_Time_Period_Format_Qualifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="E-DMG01-Date_Time_Period_Format_Qualifier">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.delta.org/b2b/edi/t276>EDI-Element-String-Type">
 *       &lt;attribute name="EDIDataType" type="{http://www.w3.org/2001/XMLSchema}string" fixed="ID" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1250" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Date Time Period Format Qualifier" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "E-DMG01-Date_Time_Period_Format_Qualifier")
public class EDMG01DateTimePeriodFormatQualifier
    extends EDIElementStringType
{


}
