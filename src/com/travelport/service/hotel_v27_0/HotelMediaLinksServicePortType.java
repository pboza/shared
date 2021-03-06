package com.travelport.service.hotel_v27_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T13:10:41.039-04:00
 * Generated source version: 3.0.0
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/hotel_v27_0", name = "HotelMediaLinksServicePortType")
@XmlSeeAlso({com.travelport.schema.common_v27_0.ObjectFactory.class, com.travelport.schema.hotel_v27_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HotelMediaLinksServicePortType {

    @WebResult(name = "HotelMediaLinksRsp", targetNamespace = "http://www.travelport.com/schema/hotel_v27_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/HotelService")
    public com.travelport.schema.hotel_v27_0.HotelMediaLinksRsp service(
        @WebParam(partName = "parameters", name = "HotelMediaLinksReq", targetNamespace = "http://www.travelport.com/schema/hotel_v27_0")
        com.travelport.schema.hotel_v27_0.HotelMediaLinksReq parameters
    ) throws HotelFaultMessage;
}
