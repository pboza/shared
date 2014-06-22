
package com.travelport.schema.common_v27_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.universal_v27_0.AckScheduleChangeRsp;
import com.travelport.schema.universal_v27_0.AirCancelRsp;
import com.travelport.schema.universal_v27_0.AirCreateReservationRsp;
import com.travelport.schema.universal_v27_0.AirMerchandisingFulfillmentRsp;
import com.travelport.schema.universal_v27_0.HotelCancelRsp;
import com.travelport.schema.universal_v27_0.HotelCreateReservationRsp;
import com.travelport.schema.universal_v27_0.PassiveCancelRsp;
import com.travelport.schema.universal_v27_0.PassiveCreateReservationRsp;
import com.travelport.schema.universal_v27_0.ProviderReservationDisplayDetailsRsp;
import com.travelport.schema.universal_v27_0.ProviderReservationDivideRsp;
import com.travelport.schema.universal_v27_0.SavedTripCreateRsp;
import com.travelport.schema.universal_v27_0.SavedTripDeleteRsp;
import com.travelport.schema.universal_v27_0.SavedTripModifyRsp;
import com.travelport.schema.universal_v27_0.SavedTripRetrieveRsp;
import com.travelport.schema.universal_v27_0.SavedTripSearchRsp;
import com.travelport.schema.universal_v27_0.TypeRailCreateReservationRsp;
import com.travelport.schema.universal_v27_0.TypeRailReservationRsp;
import com.travelport.schema.universal_v27_0.UniversalRecordCancelRsp;
import com.travelport.schema.universal_v27_0.UniversalRecordHistorySearchRsp;
import com.travelport.schema.universal_v27_0.UniversalRecordImportRsp;
import com.travelport.schema.universal_v27_0.UniversalRecordModifyRsp;
import com.travelport.schema.universal_v27_0.UniversalRecordRetrieveRsp;
import com.travelport.schema.universal_v27_0.UniversalRecordSearchRsp;
import com.travelport.schema.universal_v27_0.VehicleCancelRsp;
import com.travelport.schema.universal_v27_0.VehicleCreateReservationRsp;
import com.travelport.schema.vehicle_v27_0.VehicleKeywordRsp;
import com.travelport.schema.vehicle_v27_0.VehicleLocationDetailRsp;
import com.travelport.schema.vehicle_v27_0.VehicleLocationRsp;
import com.travelport.schema.vehicle_v27_0.VehicleMediaLinksRsp;
import com.travelport.schema.vehicle_v27_0.VehicleRetrieveRsp;
import com.travelport.schema.hotel_v27_0.BaseHotelDetailsRsp;
import com.travelport.schema.hotel_v27_0.HotelDetailsRsp;
import com.travelport.schema.hotel_v27_0.HotelKeywordRsp;
import com.travelport.schema.hotel_v27_0.HotelMediaLinksRsp;
import com.travelport.schema.hotel_v27_0.HotelRetrieveRsp;
import com.travelport.schema.hotel_v27_0.HotelRulesRsp;
import com.travelport.schema.air_v27_0.AirExchangeQuoteRsp;
import com.travelport.schema.air_v27_0.AirExchangeRsp;
import com.travelport.schema.air_v27_0.AirExchangeTicketingRsp;
import com.travelport.schema.air_v27_0.AirFareDisplayRsp;
import com.travelport.schema.air_v27_0.AirFareRulesRsp;
import com.travelport.schema.air_v27_0.AirMerchandisingDetailsRsp;
import com.travelport.schema.air_v27_0.AirMerchandisingOfferAvailabilityRsp;
import com.travelport.schema.air_v27_0.AirPrePayRsp;
import com.travelport.schema.air_v27_0.AirRefundQuoteRsp;
import com.travelport.schema.air_v27_0.AirRefundRsp;
import com.travelport.schema.air_v27_0.AirRepriceRsp;
import com.travelport.schema.air_v27_0.AirRetrieveDocumentRsp;
import com.travelport.schema.air_v27_0.AirTicketingRsp;
import com.travelport.schema.air_v27_0.AirVoidDocumentRsp;
import com.travelport.schema.air_v27_0.BaseAirPriceRsp;
import com.travelport.schema.air_v27_0.EMDIssuanceRsp;
import com.travelport.schema.air_v27_0.EMDRetrieveRsp;
import com.travelport.schema.air_v27_0.FlightDetailsRsp;
import com.travelport.schema.air_v27_0.FlightInformationRsp;
import com.travelport.schema.air_v27_0.SeatMapRsp;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * The base type for all responses.
 * 
 * <p>Java class for BaseRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRsp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v27_0}ResponseMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="CommandHistory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRsp", propOrder = {
    "responseMessage"
})
@XmlSeeAlso({
    BaseSearchRsp.class,
    HotelCreateReservationRsp.class,
    UniversalRecordSearchRsp.class,
    SavedTripCreateRsp.class,
    UniversalRecordModifyRsp.class,
    SavedTripModifyRsp.class,
    UniversalRecordRetrieveRsp.class,
    PassiveCancelRsp.class,
    PassiveCreateReservationRsp.class,
    VehicleCancelRsp.class,
    UniversalRecordHistorySearchRsp.class,
    AckScheduleChangeRsp.class,
    UniversalRecordImportRsp.class,
    UniversalRecordCancelRsp.class,
    SavedTripSearchRsp.class,
    AirCreateReservationRsp.class,
    SavedTripDeleteRsp.class,
    TypeRailReservationRsp.class,
    AirMerchandisingFulfillmentRsp.class,
    TypeRailCreateReservationRsp.class,
    VehicleCreateReservationRsp.class,
    ProviderReservationDisplayDetailsRsp.class,
    HotelCancelRsp.class,
    SavedTripRetrieveRsp.class,
    AirCancelRsp.class,
    ProviderReservationDivideRsp.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
public class BaseRsp
    implements Locatable
{

    @XmlElement(name = "ResponseMessage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected List<ResponseMessage> responseMessage;
    @XmlAttribute(name = "TraceId")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected String traceId;
    @XmlAttribute(name = "TransactionId")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected String transactionId;
    @XmlAttribute(name = "ResponseTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected BigInteger responseTime;
    @XmlAttribute(name = "CommandHistory")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected String commandHistory;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    protected Locator locator;

    /**
     * Gets the value of the responseMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseMessage }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public List<ResponseMessage> getResponseMessage() {
        if (responseMessage == null) {
            responseMessage = new ArrayList<ResponseMessage>();
        }
        return this.responseMessage;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the responseTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public BigInteger getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setResponseTime(BigInteger value) {
        this.responseTime = value;
    }

    /**
     * Gets the value of the commandHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public String getCommandHistory() {
        return commandHistory;
    }

    /**
     * Sets the value of the commandHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T04:08:14-04:00", comments = "JAXB RI v2.2.7")
    public void setCommandHistory(String value) {
        this.commandHistory = value;
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
