
package com.travelport.schema.vehicle_v27_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v27_0.BaseSearchReq;
import com.travelport.schema.common_v27_0.Keyword;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v27_0}BaseSearchReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v27_0}Vendor"/>
 *         &lt;element name="PickupDateLocation" type="{http://www.travelport.com/schema/vehicle_v27_0}typePickupDateLocation"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v27_0}Keyword" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="KeywordList" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vendor",
    "pickupDateLocation",
    "keyword"
})
@XmlRootElement(name = "VehicleKeywordReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
public class VehicleKeywordReq
    extends BaseSearchReq
{

    @XmlElement(name = "Vendor", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    protected Vendor vendor;
    @XmlElement(name = "PickupDateLocation", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    protected TypePickupDateLocation pickupDateLocation;
    @XmlElement(name = "Keyword", namespace = "http://www.travelport.com/schema/common_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    protected List<Keyword> keyword;
    @XmlAttribute(name = "KeywordList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean keywordList;

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the pickupDateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TypePickupDateLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    public TypePickupDateLocation getPickupDateLocation() {
        return pickupDateLocation;
    }

    /**
     * Sets the value of the pickupDateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePickupDateLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    public void setPickupDateLocation(TypePickupDateLocation value) {
        this.pickupDateLocation = value;
    }

    /**
     * Used to request specific keyword details Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Keyword }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    public List<Keyword> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<Keyword>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the keywordList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    public Boolean isKeywordList() {
        return keywordList;
    }

    /**
     * Sets the value of the keywordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    public void setKeywordList(Boolean value) {
        this.keywordList = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
