
package com.travelport.schema.air_v27_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v27_0.BaseRsp;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v27_0}BaseRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}AirPricingSolution"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}FareRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airPricingSolution",
    "fareRule"
})
@XmlRootElement(name = "AirRepriceRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
public class AirRepriceRsp
    extends BaseRsp
{

    @XmlElement(name = "AirPricingSolution", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected AirPricingSolution airPricingSolution;
    @XmlElement(name = "FareRule")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected List<FareRule> fareRule;

    /**
     * Gets the value of the airPricingSolution property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingSolution }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public AirPricingSolution getAirPricingSolution() {
        return airPricingSolution;
    }

    /**
     * Sets the value of the airPricingSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingSolution }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setAirPricingSolution(AirPricingSolution value) {
        this.airPricingSolution = value;
    }

    /**
     * Gets the value of the fareRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRule }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public List<FareRule> getFareRule() {
        if (fareRule == null) {
            fareRule = new ArrayList<FareRule>();
        }
        return this.fareRule;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
