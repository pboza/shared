package com.travelport.service.universal_v27_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T16:08:17.100-04:00
 * Generated source version: 3.0.0
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/universal_v27_0", name = "RailCreateReservationPortType")
@XmlSeeAlso({com.travelport.schema.passive_v27_0.ObjectFactory.class, com.travelport.schema.rail_v27_0.ObjectFactory.class, com.travelport.schema.vehicle_v27_0.ObjectFactory.class, com.travelport.schema.universal_v27_0.ObjectFactory.class, com.travelport.schema.common_v27_0.ObjectFactory.class, com.travelport.schema.hotel_v27_0.ObjectFactory.class, com.travelport.schema.air_v27_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RailCreateReservationPortType {

    @WebResult(name = "RailCreateReservationRsp", targetNamespace = "http://www.travelport.com/schema/universal_v27_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/RailService")
    public com.travelport.schema.universal_v27_0.RailCreateReservationRsp service(
        @WebParam(partName = "parameters", name = "RailCreateReservationReq", targetNamespace = "http://www.travelport.com/schema/universal_v27_0")
        com.travelport.schema.universal_v27_0.RailCreateReservationReq parameters
    ) throws RailFaultMessage;
}
