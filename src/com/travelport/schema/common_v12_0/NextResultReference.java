
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.travelport.com/schema/common_v12_0>typeNonBlanks">
 *       &lt;attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v12_0}typeProviderCode" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "NextResultReference")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
public class NextResultReference
    implements Locatable
{

    @XmlValue
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    protected String value;
    @XmlAttribute(name = "ProviderCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    protected String providerCode;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    protected Locator locator;

    /**
     * At least one character data in Next Result Reference 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
