
package com.travelport.schema.common_v12_0;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for typeAgencyHierarchyReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeAgencyHierarchyReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ProfileID" use="required" type="{http://www.travelport.com/schema/common_v12_0}typeProfileID" />
 *       &lt;attribute name="ProfileType" use="required" type="{http://www.travelport.com/schema/common_v12_0}typeAgencyProfileLevel" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAgencyHierarchyReference")
@XmlSeeAlso({
    TypeAgencyHierarchyLongReference.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
public class TypeAgencyHierarchyReference
    implements Locatable
{

    @XmlAttribute(name = "ProfileID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    protected BigInteger profileID;
    @XmlAttribute(name = "ProfileType", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    protected TypeAgencyProfileLevel profileType;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    protected Locator locator;

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public BigInteger getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public void setProfileID(BigInteger value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAgencyProfileLevel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public TypeAgencyProfileLevel getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAgencyProfileLevel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public void setProfileType(TypeAgencyProfileLevel value) {
        this.profileType = value;
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
