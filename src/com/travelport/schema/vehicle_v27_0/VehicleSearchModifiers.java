
package com.travelport.schema.vehicle_v27_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v27_0.BookingSource;
import com.travelport.schema.common_v27_0.LoyaltyCard;
import com.travelport.schema.common_v27_0.TypeRateCategory;
import com.travelport.schema.common_v27_0.TypeRateTimePeriod;
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
 *         &lt;element name="PermittedVendors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/vehicle_v27_0}Vendor" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedVendors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/vehicle_v27_0}Vendor" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v27_0}VehicleModifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v27_0}VehicleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v27_0}RateModifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateHostIndicator" type="{http://www.travelport.com/schema/vehicle_v27_0}typeRateHostIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v27_0}LoyaltyCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v27_0}ReferencePoint" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v27_0}BookingSource" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.travelport.com/schema/vehicle_v27_0}typeVehicleSearchDistance" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v27_0}typeRef" />
 *       &lt;attribute name="PreferredCurrency" type="{http://www.travelport.com/schema/common_v27_0}typeCurrency" />
 *       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnlimitedMileage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateCategory" type="{http://www.travelport.com/schema/common_v27_0}typeRateCategory" />
 *       &lt;attribute name="RateGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RatePeriod" type="{http://www.travelport.com/schema/common_v27_0}typeRateTimePeriod" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedVendors",
    "prohibitedVendors",
    "vehicleModifier",
    "vehicleType",
    "rateModifiers",
    "rateHostIndicator",
    "loyaltyCard",
    "referencePoint",
    "bookingSource",
    "distance"
})
@XmlRootElement(name = "VehicleSearchModifiers")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
public class VehicleSearchModifiers
    implements Locatable
{

    @XmlElement(name = "PermittedVendors")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected VehicleSearchModifiers.PermittedVendors permittedVendors;
    @XmlElement(name = "ProhibitedVendors")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected VehicleSearchModifiers.ProhibitedVendors prohibitedVendors;
    @XmlElement(name = "VehicleModifier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected List<VehicleModifier> vehicleModifier;
    @XmlElement(name = "VehicleType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected List<VehicleType> vehicleType;
    @XmlElement(name = "RateModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected List<RateModifiers> rateModifiers;
    @XmlElement(name = "RateHostIndicator")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeRateHostIndicator rateHostIndicator;
    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "ReferencePoint", namespace = "http://www.travelport.com/schema/common_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected String referencePoint;
    @XmlElement(name = "BookingSource", namespace = "http://www.travelport.com/schema/common_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected BookingSource bookingSource;
    @XmlElement(name = "Distance")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeVehicleSearchDistance distance;
    @XmlAttribute(name = "Key")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected String key;
    @XmlAttribute(name = "PreferredCurrency")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected String preferredCurrency;
    @XmlAttribute(name = "TourCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected String tourCode;
    @XmlAttribute(name = "UnlimitedMileage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean unlimitedMileage;
    @XmlAttribute(name = "RateCategory")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeRateCategory rateCategory;
    @XmlAttribute(name = "RateGuaranteed")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean rateGuaranteed;
    @XmlAttribute(name = "RatePeriod")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeRateTimePeriod ratePeriod;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Locator locator;

    /**
     * Gets the value of the permittedVendors property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSearchModifiers.PermittedVendors }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public VehicleSearchModifiers.PermittedVendors getPermittedVendors() {
        return permittedVendors;
    }

    /**
     * Sets the value of the permittedVendors property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSearchModifiers.PermittedVendors }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setPermittedVendors(VehicleSearchModifiers.PermittedVendors value) {
        this.permittedVendors = value;
    }

    /**
     * Gets the value of the prohibitedVendors property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSearchModifiers.ProhibitedVendors }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public VehicleSearchModifiers.ProhibitedVendors getProhibitedVendors() {
        return prohibitedVendors;
    }

    /**
     * Sets the value of the prohibitedVendors property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSearchModifiers.ProhibitedVendors }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setProhibitedVendors(VehicleSearchModifiers.ProhibitedVendors value) {
        this.prohibitedVendors = value;
    }

    /**
     * Gets the value of the vehicleModifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleModifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModifier }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public List<VehicleModifier> getVehicleModifier() {
        if (vehicleModifier == null) {
            vehicleModifier = new ArrayList<VehicleModifier>();
        }
        return this.vehicleModifier;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public List<VehicleType> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<VehicleType>();
        }
        return this.vehicleType;
    }

    /**
     * Gets the value of the rateModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateModifiers }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public List<RateModifiers> getRateModifiers() {
        if (rateModifiers == null) {
            rateModifiers = new ArrayList<RateModifiers>();
        }
        return this.rateModifiers;
    }

    /**
     * Gets the value of the rateHostIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateHostIndicator }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeRateHostIndicator getRateHostIndicator() {
        return rateHostIndicator;
    }

    /**
     * Sets the value of the rateHostIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateHostIndicator }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setRateHostIndicator(TypeRateHostIndicator value) {
        this.rateHostIndicator = value;
    }

    /**
     * Gets the value of the loyaltyCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<LoyaltyCard>();
        }
        return this.loyaltyCard;
    }

    /**
     * Search Car by reference point
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public String getReferencePoint() {
        return referencePoint;
    }

    /**
     * Sets the value of the referencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setReferencePoint(String value) {
        this.referencePoint = value;
    }

    /**
     * Supported Providers: 1P/1J. Only type IataNumber is valid.
     * 
     * @return
     *     possible object is
     *     {@link BookingSource }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public BookingSource getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingSource }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setBookingSource(BookingSource value) {
        this.bookingSource = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleSearchDistance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeVehicleSearchDistance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleSearchDistance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setDistance(TypeVehicleSearchDistance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the preferredCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public String getPreferredCurrency() {
        return preferredCurrency;
    }

    /**
     * Sets the value of the preferredCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setPreferredCurrency(String value) {
        this.preferredCurrency = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the unlimitedMileage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public Boolean isUnlimitedMileage() {
        return unlimitedMileage;
    }

    /**
     * Sets the value of the unlimitedMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setUnlimitedMileage(Boolean value) {
        this.unlimitedMileage = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateCategory }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeRateCategory getRateCategory() {
        return rateCategory;
    }

    /**
     * Sets the value of the rateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateCategory }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setRateCategory(TypeRateCategory value) {
        this.rateCategory = value;
    }

    /**
     * Gets the value of the rateGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public boolean isRateGuaranteed() {
        if (rateGuaranteed == null) {
            return false;
        } else {
            return rateGuaranteed;
        }
    }

    /**
     * Sets the value of the rateGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setRateGuaranteed(Boolean value) {
        this.rateGuaranteed = value;
    }

    /**
     * Gets the value of the ratePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateTimePeriod }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeRateTimePeriod getRatePeriod() {
        return ratePeriod;
    }

    /**
     * Sets the value of the ratePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateTimePeriod }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setRatePeriod(TypeRateTimePeriod value) {
        this.ratePeriod = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v27_0}Vendor" maxOccurs="unbounded"/>
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
        "vendor"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public static class PermittedVendors
        implements Locatable
    {

        @XmlElement(name = "Vendor", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
        protected List<Vendor> vendor;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
        protected Locator locator;

        /**
         * Gets the value of the vendor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vendor }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
        public List<Vendor> getVendor() {
            if (vendor == null) {
                vendor = new ArrayList<Vendor>();
            }
            return this.vendor;
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
     *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v27_0}Vendor" maxOccurs="unbounded"/>
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
        "vendor"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public static class ProhibitedVendors
        implements Locatable
    {

        @XmlElement(name = "Vendor", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
        protected List<Vendor> vendor;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
        protected Locator locator;

        /**
         * Gets the value of the vendor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vendor }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
        public List<Vendor> getVendor() {
            if (vendor == null) {
                vendor = new ArrayList<Vendor>();
            }
            return this.vendor;
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

}
