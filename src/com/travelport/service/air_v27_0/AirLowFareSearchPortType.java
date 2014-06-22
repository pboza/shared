package com.travelport.service.air_v27_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T13:09:31.808-04:00
 * Generated source version: 3.0.0
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/air_v27_0", name = "AirLowFareSearchPortType")
@XmlSeeAlso({com.travelport.schema.rail_v27_0.ObjectFactory.class, com.travelport.schema.common_v27_0.ObjectFactory.class, com.travelport.schema.air_v27_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AirLowFareSearchPortType {

    @WebResult(name = "LowFareSearchRsp", targetNamespace = "http://www.travelport.com/schema/air_v27_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/AirService")
    public com.travelport.schema.air_v27_0.LowFareSearchRsp service(
        @WebParam(partName = "parameters", name = "LowFareSearchReq", targetNamespace = "http://www.travelport.com/schema/air_v27_0")
        com.travelport.schema.air_v27_0.LowFareSearchReq parameters
    ) throws AirFaultMessage;
}
