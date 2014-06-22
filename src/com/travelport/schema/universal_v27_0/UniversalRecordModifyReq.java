
package com.travelport.schema.universal_v27_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v27_0.BaseReq;
import com.travelport.schema.common_v27_0.ContinuityCheckOverride;
import com.travelport.schema.common_v27_0.FileFinishingInfo;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v27_0}BaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v27_0}ContinuityCheckOverride" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v27_0}RecordIdentifier"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v27_0}UniversalModifyCmd" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v27_0}FileFinishingInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v27_0}QueueNextModifiers" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Version" use="required" type="{http://www.travelport.com/schema/common_v27_0}typeURVersion" />
 *       &lt;attribute name="OverrideMCT" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "continuityCheckOverride",
    "recordIdentifier",
    "universalModifyCmd",
    "fileFinishingInfo",
    "queueNextModifiers"
})
@XmlRootElement(name = "UniversalRecordModifyReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
public class UniversalRecordModifyReq
    extends BaseReq
{

    @XmlElement(name = "ContinuityCheckOverride", namespace = "http://www.travelport.com/schema/common_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected ContinuityCheckOverride continuityCheckOverride;
    @XmlElement(name = "RecordIdentifier", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected RecordIdentifier recordIdentifier;
    @XmlElement(name = "UniversalModifyCmd", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected List<UniversalModifyCmd> universalModifyCmd;
    @XmlElement(name = "FileFinishingInfo", namespace = "http://www.travelport.com/schema/common_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected FileFinishingInfo fileFinishingInfo;
    @XmlElement(name = "QueueNextModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected QueueNextModifiers queueNextModifiers;
    @XmlAttribute(name = "ReturnRecord")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean returnRecord;
    @XmlAttribute(name = "Version", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected BigInteger version;
    @XmlAttribute(name = "OverrideMCT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean overrideMCT;

    /**
     * Gets the value of the continuityCheckOverride property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuityCheckOverride }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public ContinuityCheckOverride getContinuityCheckOverride() {
        return continuityCheckOverride;
    }

    /**
     * Sets the value of the continuityCheckOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuityCheckOverride }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setContinuityCheckOverride(ContinuityCheckOverride value) {
        this.continuityCheckOverride = value;
    }

    /**
     * Gets the value of the recordIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link RecordIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public RecordIdentifier getRecordIdentifier() {
        return recordIdentifier;
    }

    /**
     * Sets the value of the recordIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setRecordIdentifier(RecordIdentifier value) {
        this.recordIdentifier = value;
    }

    /**
     * Gets the value of the universalModifyCmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the universalModifyCmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniversalModifyCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniversalModifyCmd }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public List<UniversalModifyCmd> getUniversalModifyCmd() {
        if (universalModifyCmd == null) {
            universalModifyCmd = new ArrayList<UniversalModifyCmd>();
        }
        return this.universalModifyCmd;
    }

    /**
     * Gets the value of the fileFinishingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FileFinishingInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public FileFinishingInfo getFileFinishingInfo() {
        return fileFinishingInfo;
    }

    /**
     * Sets the value of the fileFinishingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileFinishingInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setFileFinishingInfo(FileFinishingInfo value) {
        this.fileFinishingInfo = value;
    }

    /**
     * Gets the value of the queueNextModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link QueueNextModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public QueueNextModifiers getQueueNextModifiers() {
        return queueNextModifiers;
    }

    /**
     * Sets the value of the queueNextModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueNextModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setQueueNextModifiers(QueueNextModifiers value) {
        this.queueNextModifiers = value;
    }

    /**
     * Gets the value of the returnRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public boolean isReturnRecord() {
        if (returnRecord == null) {
            return false;
        } else {
            return returnRecord;
        }
    }

    /**
     * Sets the value of the returnRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setReturnRecord(Boolean value) {
        this.returnRecord = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the overrideMCT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public boolean isOverrideMCT() {
        if (overrideMCT == null) {
            return false;
        } else {
            return overrideMCT;
        }
    }

    /**
     * Sets the value of the overrideMCT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setOverrideMCT(Boolean value) {
        this.overrideMCT = value;
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

}
