
package com.travelport.schema.universal_v27_0;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
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
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="IncludeAllNames" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IncludeAgentInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MaxResults" type="{http://www.travelport.com/schema/common_v27_0}typeMaxResults" default="20" />
 *       &lt;attribute name="StartFromResult" type="{http://www.travelport.com/schema/common_v27_0}typeStartFromResult" default="1" />
 *       &lt;attribute name="ExcludeAir" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExcludeVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExcludeHotel" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExcludeGround" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ProviderReservationSearchModifiers")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
public class ProviderReservationSearchModifiers
    implements Locatable
{

    @XmlAttribute(name = "IncludeAllNames")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean includeAllNames;
    @XmlAttribute(name = "IncludeAgentInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean includeAgentInfo;
    @XmlAttribute(name = "MaxResults")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Integer maxResults;
    @XmlAttribute(name = "StartFromResult")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected BigInteger startFromResult;
    @XmlAttribute(name = "ExcludeAir")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean excludeAir;
    @XmlAttribute(name = "ExcludeVehicle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean excludeVehicle;
    @XmlAttribute(name = "ExcludeHotel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean excludeHotel;
    @XmlAttribute(name = "ExcludeGround")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean excludeGround;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Locator locator;

    /**
     * Gets the value of the includeAllNames property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public boolean isIncludeAllNames() {
        if (includeAllNames == null) {
            return false;
        } else {
            return includeAllNames;
        }
    }

    /**
     * Sets the value of the includeAllNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setIncludeAllNames(Boolean value) {
        this.includeAllNames = value;
    }

    /**
     * Gets the value of the includeAgentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public boolean isIncludeAgentInfo() {
        if (includeAgentInfo == null) {
            return false;
        } else {
            return includeAgentInfo;
        }
    }

    /**
     * Sets the value of the includeAgentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setIncludeAgentInfo(Boolean value) {
        this.includeAgentInfo = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public int getMaxResults() {
        if (maxResults == null) {
            return  20;
        } else {
            return maxResults;
        }
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the startFromResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public BigInteger getStartFromResult() {
        if (startFromResult == null) {
            return new BigInteger("1");
        } else {
            return startFromResult;
        }
    }

    /**
     * Sets the value of the startFromResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setStartFromResult(BigInteger value) {
        this.startFromResult = value;
    }

    /**
     * Gets the value of the excludeAir property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public boolean isExcludeAir() {
        if (excludeAir == null) {
            return false;
        } else {
            return excludeAir;
        }
    }

    /**
     * Sets the value of the excludeAir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setExcludeAir(Boolean value) {
        this.excludeAir = value;
    }

    /**
     * Gets the value of the excludeVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public boolean isExcludeVehicle() {
        if (excludeVehicle == null) {
            return false;
        } else {
            return excludeVehicle;
        }
    }

    /**
     * Sets the value of the excludeVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setExcludeVehicle(Boolean value) {
        this.excludeVehicle = value;
    }

    /**
     * Gets the value of the excludeHotel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public boolean isExcludeHotel() {
        if (excludeHotel == null) {
            return false;
        } else {
            return excludeHotel;
        }
    }

    /**
     * Sets the value of the excludeHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setExcludeHotel(Boolean value) {
        this.excludeHotel = value;
    }

    /**
     * Gets the value of the excludeGround property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public boolean isExcludeGround() {
        if (excludeGround == null) {
            return false;
        } else {
            return excludeGround;
        }
    }

    /**
     * Sets the value of the excludeGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setExcludeGround(Boolean value) {
        this.excludeGround = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
