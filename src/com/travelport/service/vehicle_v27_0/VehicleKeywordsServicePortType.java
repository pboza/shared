package com.travelport.service.vehicle_v27_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T16:07:23.297-04:00
 * Generated source version: 3.0.0
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/vehicle_v27_0", name = "VehicleKeywordsServicePortType")
@XmlSeeAlso({com.travelport.schema.vehicle_v27_0.ObjectFactory.class, com.travelport.schema.common_v27_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface VehicleKeywordsServicePortType {

    @WebResult(name = "VehicleKeywordRsp", targetNamespace = "http://www.travelport.com/schema/vehicle_v27_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/VehicleService")
    public com.travelport.schema.vehicle_v27_0.VehicleKeywordRsp service(
        @WebParam(partName = "parameters", name = "VehicleKeywordReq", targetNamespace = "http://www.travelport.com/schema/vehicle_v27_0")
        com.travelport.schema.vehicle_v27_0.VehicleKeywordReq parameters
    ) throws VehicleFaultMessage;
}
