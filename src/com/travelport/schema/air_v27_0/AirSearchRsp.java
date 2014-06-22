
package com.travelport.schema.air_v27_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.rail_v27_0.RailFareIDList;
import com.travelport.schema.rail_v27_0.RailFareList;
import com.travelport.schema.rail_v27_0.RailFareNoteList;
import com.travelport.schema.rail_v27_0.RailJourneyList;
import com.travelport.schema.rail_v27_0.RailPricingSolution;
import com.travelport.schema.rail_v27_0.RailSegmentList;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Base Response for Air Search
 * 
 * <p>Java class for AirSearchRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirSearchRsp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/air_v27_0}BaseAvailabilitySearchRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}FareNoteList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}ExpertSolutionList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}RouteList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}AlternateRouteList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v27_0}AlternateLocationDistanceList" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.travelport.com/schema/air_v27_0}AirPricingSolution" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/air_v27_0}AirPricePointList" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v27_0}RailSegmentList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v27_0}RailJourneyList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v27_0}RailFareNoteList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v27_0}RailFareIDList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v27_0}RailFareList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v27_0}RailPricingSolution" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSearchRsp", propOrder = {
    "fareNoteList",
    "expertSolutionList",
    "routeList",
    "alternateRouteList",
    "alternateLocationDistanceList",
    "airPricingSolution",
    "airPricePointList",
    "railSegmentList",
    "railJourneyList",
    "railFareNoteList",
    "railFareIDList",
    "railFareList",
    "railPricingSolution"
})
@XmlSeeAlso({
    RetrieveLowFareSearchRsp.class,
    LowFareSearchRsp.class,
    ScheduleSearchRsp.class,
    LowFareSearchAsynchRsp.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
public class AirSearchRsp
    extends BaseAvailabilitySearchRsp
{

    @XmlElement(name = "FareNoteList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected FareNoteList fareNoteList;
    @XmlElement(name = "ExpertSolutionList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected ExpertSolutionList expertSolutionList;
    @XmlElement(name = "RouteList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected RouteList routeList;
    @XmlElement(name = "AlternateRouteList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected AlternateRouteList alternateRouteList;
    @XmlElement(name = "AlternateLocationDistanceList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected AlternateLocationDistanceList alternateLocationDistanceList;
    @XmlElement(name = "AirPricingSolution")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected List<AirPricingSolution> airPricingSolution;
    @XmlElement(name = "AirPricePointList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected AirPricePointList airPricePointList;
    @XmlElement(name = "RailSegmentList", namespace = "http://www.travelport.com/schema/rail_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected RailSegmentList railSegmentList;
    @XmlElement(name = "RailJourneyList", namespace = "http://www.travelport.com/schema/rail_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected RailJourneyList railJourneyList;
    @XmlElement(name = "RailFareNoteList", namespace = "http://www.travelport.com/schema/rail_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected RailFareNoteList railFareNoteList;
    @XmlElement(name = "RailFareIDList", namespace = "http://www.travelport.com/schema/rail_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected RailFareIDList railFareIDList;
    @XmlElement(name = "RailFareList", namespace = "http://www.travelport.com/schema/rail_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected RailFareList railFareList;
    @XmlElement(name = "RailPricingSolution", namespace = "http://www.travelport.com/schema/rail_v27_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    protected List<RailPricingSolution> railPricingSolution;

    /**
     * Gets the value of the fareNoteList property.
     * 
     * @return
     *     possible object is
     *     {@link FareNoteList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public FareNoteList getFareNoteList() {
        return fareNoteList;
    }

    /**
     * Sets the value of the fareNoteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareNoteList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setFareNoteList(FareNoteList value) {
        this.fareNoteList = value;
    }

    /**
     * Gets the value of the expertSolutionList property.
     * 
     * @return
     *     possible object is
     *     {@link ExpertSolutionList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public ExpertSolutionList getExpertSolutionList() {
        return expertSolutionList;
    }

    /**
     * Sets the value of the expertSolutionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpertSolutionList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setExpertSolutionList(ExpertSolutionList value) {
        this.expertSolutionList = value;
    }

    /**
     * Gets the value of the routeList property.
     * 
     * @return
     *     possible object is
     *     {@link RouteList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public RouteList getRouteList() {
        return routeList;
    }

    /**
     * Sets the value of the routeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setRouteList(RouteList value) {
        this.routeList = value;
    }

    /**
     * Gets the value of the alternateRouteList property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateRouteList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public AlternateRouteList getAlternateRouteList() {
        return alternateRouteList;
    }

    /**
     * Sets the value of the alternateRouteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateRouteList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setAlternateRouteList(AlternateRouteList value) {
        this.alternateRouteList = value;
    }

    /**
     * Gets the value of the alternateLocationDistanceList property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateLocationDistanceList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public AlternateLocationDistanceList getAlternateLocationDistanceList() {
        return alternateLocationDistanceList;
    }

    /**
     * Sets the value of the alternateLocationDistanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateLocationDistanceList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setAlternateLocationDistanceList(AlternateLocationDistanceList value) {
        this.alternateLocationDistanceList = value;
    }

    /**
     * Gets the value of the airPricingSolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingSolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingSolution }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public List<AirPricingSolution> getAirPricingSolution() {
        if (airPricingSolution == null) {
            airPricingSolution = new ArrayList<AirPricingSolution>();
        }
        return this.airPricingSolution;
    }

    /**
     * Gets the value of the airPricePointList property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricePointList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public AirPricePointList getAirPricePointList() {
        return airPricePointList;
    }

    /**
     * Sets the value of the airPricePointList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricePointList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setAirPricePointList(AirPricePointList value) {
        this.airPricePointList = value;
    }

    /**
     * Gets the value of the railSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link RailSegmentList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public RailSegmentList getRailSegmentList() {
        return railSegmentList;
    }

    /**
     * Sets the value of the railSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSegmentList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setRailSegmentList(RailSegmentList value) {
        this.railSegmentList = value;
    }

    /**
     * Gets the value of the railJourneyList property.
     * 
     * @return
     *     possible object is
     *     {@link RailJourneyList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public RailJourneyList getRailJourneyList() {
        return railJourneyList;
    }

    /**
     * Sets the value of the railJourneyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailJourneyList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setRailJourneyList(RailJourneyList value) {
        this.railJourneyList = value;
    }

    /**
     * Gets the value of the railFareNoteList property.
     * 
     * @return
     *     possible object is
     *     {@link RailFareNoteList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public RailFareNoteList getRailFareNoteList() {
        return railFareNoteList;
    }

    /**
     * Sets the value of the railFareNoteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareNoteList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setRailFareNoteList(RailFareNoteList value) {
        this.railFareNoteList = value;
    }

    /**
     * Gets the value of the railFareIDList property.
     * 
     * @return
     *     possible object is
     *     {@link RailFareIDList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public RailFareIDList getRailFareIDList() {
        return railFareIDList;
    }

    /**
     * Sets the value of the railFareIDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareIDList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setRailFareIDList(RailFareIDList value) {
        this.railFareIDList = value;
    }

    /**
     * Gets the value of the railFareList property.
     * 
     * @return
     *     possible object is
     *     {@link RailFareList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public RailFareList getRailFareList() {
        return railFareList;
    }

    /**
     * Sets the value of the railFareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public void setRailFareList(RailFareList value) {
        this.railFareList = value;
    }

    /**
     * Gets the value of the railPricingSolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railPricingSolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPricingSolution }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public List<RailPricingSolution> getRailPricingSolution() {
        if (railPricingSolution == null) {
            railPricingSolution = new ArrayList<RailPricingSolution>();
        }
        return this.railPricingSolution;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-06-21T01:09:29-04:00", comments = "JAXB RI v2.2.7")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
