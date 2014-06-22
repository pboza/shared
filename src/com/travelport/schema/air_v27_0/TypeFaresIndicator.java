
package com.travelport.schema.air_v27_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFaresIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFaresIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PublicFaresOnly"/>
 *     &lt;enumeration value="PrivateFaresOnly"/>
 *     &lt;enumeration value="AgencyPrivateFaresOnly"/>
 *     &lt;enumeration value="AirlinePrivateFaresOnly"/>
 *     &lt;enumeration value="PublicAndPrivateFares"/>
 *     &lt;enumeration value="NetFaresOnly"/>
 *     &lt;enumeration value="AllFares"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFaresIndicator")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
public enum TypeFaresIndicator {

    @XmlEnumValue("PublicFaresOnly")
    PUBLIC_FARES_ONLY("PublicFaresOnly"),
    @XmlEnumValue("PrivateFaresOnly")
    PRIVATE_FARES_ONLY("PrivateFaresOnly"),
    @XmlEnumValue("AgencyPrivateFaresOnly")
    AGENCY_PRIVATE_FARES_ONLY("AgencyPrivateFaresOnly"),
    @XmlEnumValue("AirlinePrivateFaresOnly")
    AIRLINE_PRIVATE_FARES_ONLY("AirlinePrivateFaresOnly"),
    @XmlEnumValue("PublicAndPrivateFares")
    PUBLIC_AND_PRIVATE_FARES("PublicAndPrivateFares"),
    @XmlEnumValue("NetFaresOnly")
    NET_FARES_ONLY("NetFaresOnly"),

    /**
     * Applicable for 1G/1V air shop only
     * 
     */
    @XmlEnumValue("AllFares")
    ALL_FARES("AllFares");
    private final String value;

    TypeFaresIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFaresIndicator fromValue(String v) {
        for (TypeFaresIndicator c: TypeFaresIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
