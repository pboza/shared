
package com.travelport.schema.air_v27_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v27_0.FormOfPayment;
import com.travelport.schema.common_v27_0.FormOfPaymentRef;
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
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.travelport.com/schema/common_v27_0}FormOfPaymentRef" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v27_0}FormOfPayment" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}CustomerReceiptInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}EMDEndorsement" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}EMDCommission" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formOfPaymentRef",
    "formOfPayment",
    "customerReceiptInfo",
    "emdEndorsement",
    "emdCommission"
})
@XmlRootElement(name = "IssuanceModifiers")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
public class IssuanceModifiers
    implements Locatable
{

    @XmlElement(name = "FormOfPaymentRef", namespace = "http://www.travelport.com/schema/common_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected FormOfPaymentRef formOfPaymentRef;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected FormOfPayment formOfPayment;
    @XmlElement(name = "CustomerReceiptInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected CustomerReceiptInfo customerReceiptInfo;
    @XmlElement(name = "EMDEndorsement")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected String emdEndorsement;
    @XmlElement(name = "EMDCommission")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected EMDCommission emdCommission;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Locator locator;

    /**
     * Reference to FormOfPayment present in the UR to be used for EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentRef }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public FormOfPaymentRef getFormOfPaymentRef() {
        return formOfPaymentRef;
    }

    /**
     * Sets the value of the formOfPaymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentRef }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setFormOfPaymentRef(FormOfPaymentRef value) {
        this.formOfPaymentRef = value;
    }

    /**
     * FormOfPayment information to be used for EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

    /**
     * Information about customer receipt via email.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReceiptInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public CustomerReceiptInfo getCustomerReceiptInfo() {
        return customerReceiptInfo;
    }

    /**
     * Sets the value of the customerReceiptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReceiptInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setCustomerReceiptInfo(CustomerReceiptInfo value) {
        this.customerReceiptInfo = value;
    }

    /**
     * Endorsement details to be used during EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public String getEMDEndorsement() {
        return emdEndorsement;
    }

    /**
     * Sets the value of the emdEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setEMDEndorsement(String value) {
        this.emdEndorsement = value;
    }

    /**
     * Commission information to be used for EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link EMDCommission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public EMDCommission getEMDCommission() {
        return emdCommission;
    }

    /**
     * Sets the value of the emdCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDCommission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setEMDCommission(EMDCommission value) {
        this.emdCommission = value;
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
