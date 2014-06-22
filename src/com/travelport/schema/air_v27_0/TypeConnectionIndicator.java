
package com.travelport.schema.air_v27_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeConnectionIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeConnectionIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AvailabilityAndPricing"/>
 *     &lt;enumeration value="TurnAround"/>
 *     &lt;enumeration value="Stopover"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeConnectionIndicator")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
public enum TypeConnectionIndicator {

    @XmlEnumValue("AvailabilityAndPricing")
    AVAILABILITY_AND_PRICING("AvailabilityAndPricing"),
    @XmlEnumValue("TurnAround")
    TURN_AROUND("TurnAround"),
    @XmlEnumValue("Stopover")
    STOPOVER("Stopover");
    private final String value;

    TypeConnectionIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeConnectionIndicator fromValue(String v) {
        for (TypeConnectionIndicator c: TypeConnectionIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
