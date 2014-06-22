
package com.travelport.schema.air_v27_0;

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
import com.travelport.schema.common_v27_0.Commission;
import com.travelport.schema.common_v27_0.SupplierLocator;
import com.travelport.schema.common_v27_0.TypeElementStatus;
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
 *         &lt;element name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v27_0}typeRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NetRemit" type="{http://www.travelport.com/schema/air_v27_0}typeTicketModifierAmountType" minOccurs="0"/>
 *         &lt;element name="NetFare" type="{http://www.travelport.com/schema/air_v27_0}typeTicketModifierAmountType" minOccurs="0"/>
 *         &lt;element name="ActualSellingFare" type="{http://www.travelport.com/schema/air_v27_0}typeTicketModifierAmountType" minOccurs="0"/>
 *         &lt;element name="InvoiceFare" type="{http://www.travelport.com/schema/air_v27_0}typeTicketModifierAccountingType" minOccurs="0"/>
 *         &lt;element name="CorporateDiscount" type="{http://www.travelport.com/schema/air_v27_0}typeTicketModifierAccountingType" minOccurs="0"/>
 *         &lt;element name="AccountingInfo" type="{http://www.travelport.com/schema/air_v27_0}typeTicketModifierAccountingType" minOccurs="0"/>
 *         &lt;element name="BulkTicket" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.travelport.com/schema/air_v27_0}typeBulkTicketModifierType">
 *                 &lt;attribute name="NonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GroupTour" type="{http://www.travelport.com/schema/air_v27_0}typeBulkTicketModifierType" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v27_0}Commission" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}TourCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}TicketEndorsement" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="ValueModifier" type="{http://www.travelport.com/schema/air_v27_0}typeTicketModifierValueType" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}DocumentSelect" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}DocumentOptions" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}SegmentSelect" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}SegmentModifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v27_0}SupplierLocator" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}DestinationPurposeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}LanguageOption" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}LandCharges" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}PrintBlankFormItinerary" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}ExcludeTicketing" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v27_0}attrElementKeyResults"/>
 *       &lt;attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v27_0}typeCarrier" />
 *       &lt;attribute name="ExemptVAT" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NetRemitApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FreeTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CurrencyOverrideCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v27_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerRef",
    "netRemit",
    "netFare",
    "actualSellingFare",
    "invoiceFare",
    "corporateDiscount",
    "accountingInfo",
    "bulkTicket",
    "groupTour",
    "commission",
    "tourCode",
    "ticketEndorsement",
    "valueModifier",
    "documentSelect",
    "documentOptions",
    "segmentSelect",
    "segmentModifiers",
    "supplierLocator",
    "destinationPurposeCode",
    "languageOption",
    "landCharges",
    "printBlankFormItinerary",
    "excludeTicketing"
})
@XmlRootElement(name = "TicketingModifiers")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
public class TicketingModifiers
    implements Locatable
{

    @XmlElement(name = "BookingTravelerRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected List<String> bookingTravelerRef;
    @XmlElement(name = "NetRemit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeTicketModifierAmountType netRemit;
    @XmlElement(name = "NetFare")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeTicketModifierAmountType netFare;
    @XmlElement(name = "ActualSellingFare")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeTicketModifierAmountType actualSellingFare;
    @XmlElement(name = "InvoiceFare")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeTicketModifierAccountingType invoiceFare;
    @XmlElement(name = "CorporateDiscount")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeTicketModifierAccountingType corporateDiscount;
    @XmlElement(name = "AccountingInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeTicketModifierAccountingType accountingInfo;
    @XmlElement(name = "BulkTicket")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TicketingModifiers.BulkTicket bulkTicket;
    @XmlElement(name = "GroupTour")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeBulkTicketModifierType groupTour;
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Commission commission;
    @XmlElement(name = "TourCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TourCode tourCode;
    @XmlElement(name = "TicketEndorsement")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected List<TicketEndorsement> ticketEndorsement;
    @XmlElement(name = "ValueModifier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeTicketModifierValueType valueModifier;
    @XmlElement(name = "DocumentSelect")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected DocumentSelect documentSelect;
    @XmlElement(name = "DocumentOptions")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected DocumentOptions documentOptions;
    @XmlElement(name = "SegmentSelect")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected SegmentSelect segmentSelect;
    @XmlElement(name = "SegmentModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected List<SegmentModifiers> segmentModifiers;
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected SupplierLocator supplierLocator;
    @XmlElement(name = "DestinationPurposeCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected DestinationPurposeCode destinationPurposeCode;
    @XmlElement(name = "LanguageOption")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected List<LanguageOption> languageOption;
    @XmlElement(name = "LandCharges")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected LandCharges landCharges;
    @XmlElement(name = "PrintBlankFormItinerary")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected PrintBlankFormItinerary printBlankFormItinerary;
    @XmlElement(name = "ExcludeTicketing")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected ExcludeTicketing excludeTicketing;
    @XmlAttribute(name = "PlatingCarrier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected String platingCarrier;
    @XmlAttribute(name = "ExemptVAT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean exemptVAT;
    @XmlAttribute(name = "NetRemitApplied")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean netRemitApplied;
    @XmlAttribute(name = "FreeTicket")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean freeTicket;
    @XmlAttribute(name = "CurrencyOverrideCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected String currencyOverrideCode;
    @XmlAttribute(name = "Key")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected String key;
    @XmlAttribute(name = "ElStat")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Boolean keyOverride;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Locator locator;

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public List<String> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<String>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Gets the value of the netRemit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeTicketModifierAmountType getNetRemit() {
        return netRemit;
    }

    /**
     * Sets the value of the netRemit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setNetRemit(TypeTicketModifierAmountType value) {
        this.netRemit = value;
    }

    /**
     * Gets the value of the netFare property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeTicketModifierAmountType getNetFare() {
        return netFare;
    }

    /**
     * Sets the value of the netFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setNetFare(TypeTicketModifierAmountType value) {
        this.netFare = value;
    }

    /**
     * Gets the value of the actualSellingFare property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeTicketModifierAmountType getActualSellingFare() {
        return actualSellingFare;
    }

    /**
     * Sets the value of the actualSellingFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setActualSellingFare(TypeTicketModifierAmountType value) {
        this.actualSellingFare = value;
    }

    /**
     * Gets the value of the invoiceFare property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeTicketModifierAccountingType getInvoiceFare() {
        return invoiceFare;
    }

    /**
     * Sets the value of the invoiceFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setInvoiceFare(TypeTicketModifierAccountingType value) {
        this.invoiceFare = value;
    }

    /**
     * Gets the value of the corporateDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeTicketModifierAccountingType getCorporateDiscount() {
        return corporateDiscount;
    }

    /**
     * Sets the value of the corporateDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setCorporateDiscount(TypeTicketModifierAccountingType value) {
        this.corporateDiscount = value;
    }

    /**
     * Gets the value of the accountingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeTicketModifierAccountingType getAccountingInfo() {
        return accountingInfo;
    }

    /**
     * Sets the value of the accountingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setAccountingInfo(TypeTicketModifierAccountingType value) {
        this.accountingInfo = value;
    }

    /**
     * Gets the value of the bulkTicket property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingModifiers.BulkTicket }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TicketingModifiers.BulkTicket getBulkTicket() {
        return bulkTicket;
    }

    /**
     * Sets the value of the bulkTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingModifiers.BulkTicket }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setBulkTicket(TicketingModifiers.BulkTicket value) {
        this.bulkTicket = value;
    }

    /**
     * Gets the value of the groupTour property.
     * 
     * @return
     *     possible object is
     *     {@link TypeBulkTicketModifierType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeBulkTicketModifierType getGroupTour() {
        return groupTour;
    }

    /**
     * Sets the value of the groupTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBulkTicketModifierType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setGroupTour(TypeBulkTicketModifierType value) {
        this.groupTour = value;
    }

    /**
     * Allows an agency to update the commission
     *                      to a new or different commission rate which will be applied at
     *                      time of ticketing. The commission Modifier allows the user
     *                      specify how the commission change is to applied
     *                   
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * Allows an agency to modify the tour code
     *                      information on the ticket
     * 
     * @return
     *     possible object is
     *     {@link TourCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TourCode getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setTourCode(TourCode value) {
        this.tourCode = value;
    }

    /**
     * Allows an agency to add user defined
     *                      ticketing endorsements the ticket Gets the value of the ticketEndorsement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketEndorsement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketEndorsement }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public List<TicketEndorsement> getTicketEndorsement() {
        if (ticketEndorsement == null) {
            ticketEndorsement = new ArrayList<TicketEndorsement>();
        }
        return this.ticketEndorsement;
    }

    /**
     * Gets the value of the valueModifier property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierValueType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeTicketModifierValueType getValueModifier() {
        return valueModifier;
    }

    /**
     * Sets the value of the valueModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierValueType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setValueModifier(TypeTicketModifierValueType value) {
        this.valueModifier = value;
    }

    /**
     * Gets the value of the documentSelect property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSelect }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public DocumentSelect getDocumentSelect() {
        return documentSelect;
    }

    /**
     * Sets the value of the documentSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSelect }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setDocumentSelect(DocumentSelect value) {
        this.documentSelect = value;
    }

    /**
     * Gets the value of the documentOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentOptions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public DocumentOptions getDocumentOptions() {
        return documentOptions;
    }

    /**
     * Sets the value of the documentOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentOptions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setDocumentOptions(DocumentOptions value) {
        this.documentOptions = value;
    }

    /**
     * Gets the value of the segmentSelect property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentSelect }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public SegmentSelect getSegmentSelect() {
        return segmentSelect;
    }

    /**
     * Sets the value of the segmentSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentSelect }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setSegmentSelect(SegmentSelect value) {
        this.segmentSelect = value;
    }

    /**
     * Gets the value of the segmentModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentModifiers }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public List<SegmentModifiers> getSegmentModifiers() {
        if (segmentModifiers == null) {
            segmentModifiers = new ArrayList<SegmentModifiers>();
        }
        return this.segmentModifiers;
    }

    /**
     * Gets the value of the supplierLocator property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierLocator }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public SupplierLocator getSupplierLocator() {
        return supplierLocator;
    }

    /**
     * Sets the value of the supplierLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierLocator }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setSupplierLocator(SupplierLocator value) {
        this.supplierLocator = value;
    }

    /**
     * Gets the value of the destinationPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationPurposeCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public DestinationPurposeCode getDestinationPurposeCode() {
        return destinationPurposeCode;
    }

    /**
     * Sets the value of the destinationPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationPurposeCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setDestinationPurposeCode(DestinationPurposeCode value) {
        this.destinationPurposeCode = value;
    }

    /**
     * Gets the value of the languageOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageOption }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public List<LanguageOption> getLanguageOption() {
        if (languageOption == null) {
            languageOption = new ArrayList<LanguageOption>();
        }
        return this.languageOption;
    }

    /**
     * Gets the value of the landCharges property.
     * 
     * @return
     *     possible object is
     *     {@link LandCharges }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public LandCharges getLandCharges() {
        return landCharges;
    }

    /**
     * Sets the value of the landCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandCharges }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setLandCharges(LandCharges value) {
        this.landCharges = value;
    }

    /**
     * Gets the value of the printBlankFormItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link PrintBlankFormItinerary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public PrintBlankFormItinerary getPrintBlankFormItinerary() {
        return printBlankFormItinerary;
    }

    /**
     * Sets the value of the printBlankFormItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintBlankFormItinerary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setPrintBlankFormItinerary(PrintBlankFormItinerary value) {
        this.printBlankFormItinerary = value;
    }

    /**
     * Gets the value of the excludeTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link ExcludeTicketing }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public ExcludeTicketing getExcludeTicketing() {
        return excludeTicketing;
    }

    /**
     * Sets the value of the excludeTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcludeTicketing }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setExcludeTicketing(ExcludeTicketing value) {
        this.excludeTicketing = value;
    }

    /**
     * Gets the value of the platingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * Gets the value of the exemptVAT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public Boolean isExemptVAT() {
        return exemptVAT;
    }

    /**
     * Sets the value of the exemptVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setExemptVAT(Boolean value) {
        this.exemptVAT = value;
    }

    /**
     * Gets the value of the netRemitApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public Boolean isNetRemitApplied() {
        return netRemitApplied;
    }

    /**
     * Sets the value of the netRemitApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setNetRemitApplied(Boolean value) {
        this.netRemitApplied = value;
    }

    /**
     * Gets the value of the freeTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public Boolean isFreeTicket() {
        return freeTicket;
    }

    /**
     * Sets the value of the freeTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setFreeTicket(Boolean value) {
        this.freeTicket = value;
    }

    /**
     * Gets the value of the currencyOverrideCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public String getCurrencyOverrideCode() {
        return currencyOverrideCode;
    }

    /**
     * Sets the value of the currencyOverrideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setCurrencyOverrideCode(String value) {
        this.currencyOverrideCode = value;
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
     * Gets the value of the elStat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
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
     *     &lt;extension base="{http://www.travelport.com/schema/air_v27_0}typeBulkTicketModifierType">
     *       &lt;attribute name="NonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public static class BulkTicket
        extends TypeBulkTicketModifierType
    {

        @XmlAttribute(name = "NonRefundable")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
        protected Boolean nonRefundable;

        /**
         * Gets the value of the nonRefundable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
        public Boolean isNonRefundable() {
            return nonRefundable;
        }

        /**
         * Sets the value of the nonRefundable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
        public void setNonRefundable(Boolean value) {
            this.nonRefundable = value;
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

}
