
package com.travelport.schema.vehicle_v27_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v27_0.BaseRsp;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v27_0}BaseRsp">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="99" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v27_0}Keyword" maxOccurs="99" minOccurs="0"/>
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
    "text",
    "keyword"
})
@XmlRootElement(name = "VehicleKeywordRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
public class VehicleKeywordRsp
    extends BaseRsp
{

    @XmlElement(name = "Text")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    protected List<String> text;
    @XmlElement(name = "Keyword", namespace = "http://www.travelport.com/schema/common_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    protected List<Keyword> keyword;

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:07:21-04:00", comments = "JAXB RI v2.2.7")
    public List<String> getText() {
        if (text == null) {
            text = new ArrayList<String>();
        }
        return this.text;
    }

    /**
     * A word that a vendor uses to describe corporate policy/information.Gets the value of the keyword property.
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
