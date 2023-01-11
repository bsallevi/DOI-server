//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.11 at 02:45:17 PM CEST 
//


package org.datacite.schema.kernel_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for nameType.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * &nbsp;
 * <pre>
 * &lt;simpleType name="nameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Organizational"/&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "nameType")
@XmlEnum
public enum NameType {

    @XmlEnumValue("Organizational")
    ORGANIZATIONAL("Organizational"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal");
    private final String value;

    NameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameType fromValue(String v) {
        for (NameType c : NameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
