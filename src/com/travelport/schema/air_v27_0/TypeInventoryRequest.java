
package com.travelport.schema.air_v27_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeInventoryRequest.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeInventoryRequest">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Seamless"/>
 *     &lt;enumeration value="DirectAccess"/>
 *     &lt;enumeration value="Basic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeInventoryRequest")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
public enum TypeInventoryRequest {

    @XmlEnumValue("Seamless")
    SEAMLESS("Seamless"),
    @XmlEnumValue("DirectAccess")
    DIRECT_ACCESS("DirectAccess"),
    @XmlEnumValue("Basic")
    BASIC("Basic");
    private final String value;

    TypeInventoryRequest(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeInventoryRequest fromValue(String v) {
        for (TypeInventoryRequest c: TypeInventoryRequest.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
