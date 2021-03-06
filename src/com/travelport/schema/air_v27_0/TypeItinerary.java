
package com.travelport.schema.air_v27_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeItinerary.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeItinerary">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="Pocket"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeItinerary")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
public enum TypeItinerary {

    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Pocket")
    POCKET("Pocket");
    private final String value;

    TypeItinerary(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeItinerary fromValue(String v) {
        for (TypeItinerary c: TypeItinerary.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
