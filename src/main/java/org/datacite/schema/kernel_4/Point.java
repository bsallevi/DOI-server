//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.11 at 04:29:56 PM CET 
//


package org.datacite.schema.kernel_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for point complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="pointLongitude" type="{http://datacite.org/schema/kernel-4}longitudeType"/&gt;
 *         &lt;element name="pointLatitude" type="{http://datacite.org/schema/kernel-4}latitudeType"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "point", propOrder = {

})
public class Point {

    protected float pointLongitude;
    protected float pointLatitude;

    /**
     * Gets the value of the pointLongitude property.
     * 
     */
    public float getPointLongitude() {
        return pointLongitude;
    }

    /**
     * Sets the value of the pointLongitude property.
     * 
     */
    public void setPointLongitude(float value) {
        this.pointLongitude = value;
    }

    /**
     * Gets the value of the pointLatitude property.
     * 
     */
    public float getPointLatitude() {
        return pointLatitude;
    }

    /**
     * Sets the value of the pointLatitude property.
     * 
     */
    public void setPointLatitude(float value) {
        this.pointLatitude = value;
    }

}
