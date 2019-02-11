//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 03:43:03 PM CEST 
//
package org.datacite.schema.kernel_4;

import fr.cnes.doi.utils.spec.Requirement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for titleType.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="titleType"&gt; &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string"&gt; &lt;enumeration value="AlternativeTitle"/&gt;
 * &lt;enumeration value="Subtitle"/&gt; &lt;enumeration value="TranslatedTitle"/&gt;
 * &lt;enumeration value="Other"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt;
 * </pre>
 *
 */
@Requirement(reqId = Requirement.DOI_SRV_010, reqName = Requirement.DOI_SRV_010_NAME)
@Requirement(reqId = Requirement.DOI_SRV_040, reqName = Requirement.DOI_SRV_040_NAME)
@Requirement(reqId = Requirement.DOI_INTER_060, reqName = Requirement.DOI_INTER_060_NAME)
@XmlType(name = "titleType")
@XmlEnum
public enum TitleType {

    /**
     *
     */
    @XmlEnumValue("AlternativeTitle")
    ALTERNATIVE_TITLE("AlternativeTitle"),
    /**
     *
     */
    @XmlEnumValue("Subtitle")
    SUBTITLE("Subtitle"),
    /**
     *
     */
    @XmlEnumValue("TranslatedTitle")
    TRANSLATED_TITLE("TranslatedTitle"),
    /**
     *
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TitleType(String v) {
        value = v;
    }

    /**
     * Returns the value
     *
     * @return the value
     */
    public String value() {
        return value;
    }

    /**
     * Returns the title type
     *
     * @param v the value
     * @return the title type
     */
    public static TitleType fromValue(String v) {
        for (TitleType c : TitleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
