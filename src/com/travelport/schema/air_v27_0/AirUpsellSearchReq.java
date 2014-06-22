
package com.travelport.schema.air_v27_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *     &lt;extension base="{http://www.travelport.com/schema/air_v27_0}AirBaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}AirItinerary"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}AirPriceResult" maxOccurs="16"/>
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
    "airItinerary",
    "airPriceResult"
})
@XmlRootElement(name = "AirUpsellSearchReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
public class AirUpsellSearchReq
    extends AirBaseReq
{

    @XmlElement(name = "AirItinerary", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected AirItinerary airItinerary;
    @XmlElement(name = "AirPriceResult", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected List<AirPriceResult> airPriceResult;

    /**
     * 
     *                                     Provider: 1G,1V,1P,1J,ACH-AirItinerary of the pricing request.
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link AirItinerary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public AirItinerary getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItinerary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setAirItinerary(AirItinerary value) {
        this.airItinerary = value;
    }

    /**
     * 
     *                                     Provider: 1G,1V,1P,1J,ACH-Result of AirPrice request. Upsell uses this to search for new offer.
     *                                 Gets the value of the airPriceResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPriceResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPriceResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPriceResult }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public List<AirPriceResult> getAirPriceResult() {
        if (airPriceResult == null) {
            airPriceResult = new ArrayList<AirPriceResult>();
        }
        return this.airPriceResult;
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
