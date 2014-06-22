
package com.travelport.schema.common_v27_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDoorCount.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDoorCount">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TwoToThreeDoors"/>
 *     &lt;enumeration value="TwoToFourDoors"/>
 *     &lt;enumeration value="FourToFiveDoors"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeDoorCount")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
public enum TypeDoorCount {

    @XmlEnumValue("TwoToThreeDoors")
    TWO_TO_THREE_DOORS("TwoToThreeDoors"),
    @XmlEnumValue("TwoToFourDoors")
    TWO_TO_FOUR_DOORS("TwoToFourDoors"),
    @XmlEnumValue("FourToFiveDoors")
    FOUR_TO_FIVE_DOORS("FourToFiveDoors");
    private final String value;

    TypeDoorCount(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDoorCount fromValue(String v) {
        for (TypeDoorCount c: TypeDoorCount.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
