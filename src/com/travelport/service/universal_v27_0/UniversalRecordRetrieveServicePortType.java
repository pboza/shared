package com.travelport.service.universal_v27_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T16:08:17.129-04:00
 * Generated source version: 3.0.0
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/universal_v27_0", name = "UniversalRecordRetrieveServicePortType")
@XmlSeeAlso({com.travelport.schema.passive_v27_0.ObjectFactory.class, com.travelport.schema.rail_v27_0.ObjectFactory.class, com.travelport.schema.vehicle_v27_0.ObjectFactory.class, com.travelport.schema.universal_v27_0.ObjectFactory.class, com.travelport.schema.common_v27_0.ObjectFactory.class, com.travelport.schema.hotel_v27_0.ObjectFactory.class, com.travelport.schema.air_v27_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UniversalRecordRetrieveServicePortType {

    @WebResult(name = "UniversalRecordRetrieveRsp", targetNamespace = "http://www.travelport.com/schema/universal_v27_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/UniversalRecordService")
    public com.travelport.schema.universal_v27_0.UniversalRecordRetrieveRsp service(
        @WebParam(partName = "parameters", name = "UniversalRecordRetrieveReq", targetNamespace = "http://www.travelport.com/schema/universal_v27_0")
        com.travelport.schema.universal_v27_0.UniversalRecordRetrieveReq parameters,
        @WebParam(partName = "supportedVersions", name = "SupportedVersions", targetNamespace = "http://www.travelport.com/schema/universal_v27_0", header = true)
        com.travelport.schema.universal_v27_0.SupportedVersions supportedVersions
    ) throws UniversalRecordArchivedFaultMessage, UniversalRecordFaultMessage;
}
