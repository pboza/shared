
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *       &lt;sequence>
 *         &lt;element name="EmergencyContact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v12_0}PhoneNumber" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Relationship" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="HomeAirport" type="{http://www.travelport.com/schema/common_v12_0}typeAirport" />
 *       &lt;attribute name="VisaExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v12_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emergencyContact"
})
@XmlRootElement(name = "TravelerInformation")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
public class TravelerInformation
    implements Locatable
{

    @XmlElement(name = "EmergencyContact")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    protected TravelerInformation.EmergencyContact emergencyContact;
    @XmlAttribute(name = "HomeAirport")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    protected String homeAirport;
    @XmlAttribute(name = "VisaExpirationDate")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    protected XMLGregorianCalendar visaExpirationDate;
    @XmlAttribute(name = "BookingTravelerRef", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    protected String bookingTravelerRef;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    protected Locator locator;

    /**
     * Gets the value of the emergencyContact property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInformation.EmergencyContact }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public TravelerInformation.EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * Sets the value of the emergencyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInformation.EmergencyContact }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public void setEmergencyContact(TravelerInformation.EmergencyContact value) {
        this.emergencyContact = value;
    }

    /**
     * Gets the value of the homeAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public String getHomeAirport() {
        return homeAirport;
    }

    /**
     * Sets the value of the homeAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public void setHomeAirport(String value) {
        this.homeAirport = value;
    }

    /**
     * Gets the value of the visaExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public XMLGregorianCalendar getVisaExpirationDate() {
        return visaExpirationDate;
    }

    /**
     * Sets the value of the visaExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public void setVisaExpirationDate(XMLGregorianCalendar value) {
        this.visaExpirationDate = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v12_0}PhoneNumber" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Relationship" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phoneNumber"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
    public static class EmergencyContact
        implements Locatable
    {

        @XmlElement(name = "PhoneNumber")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
        protected PhoneNumber phoneNumber;
        @XmlAttribute(name = "Name")
        @XmlSchemaType(name = "anySimpleType")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
        protected String name;
        @XmlAttribute(name = "Relationship")
        @XmlSchemaType(name = "anySimpleType")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
        protected String relationship;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
        protected Locator locator;

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link PhoneNumber }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
        public PhoneNumber getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneNumber }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
        public void setPhoneNumber(PhoneNumber value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the relationship property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
        public String getRelationship() {
            return relationship;
        }

        /**
         * Sets the value of the relationship property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T12:56:12-04:00", comments = "JAXB RI v2.2.7")
        public void setRelationship(String value) {
            this.relationship = value;
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

}
