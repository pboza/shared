
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.vehicle_v27_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T16:07:23.256-04:00
 * Generated source version: 3.0.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "VehicleService",
                      portName = "VehicleMediaLinksServicePort",
                      targetNamespace = "http://www.travelport.com/service/vehicle_v27_0",
                      wsdlLocation = "file:/Users/pedroboza/eclipse-workspace/Travelport Tutorial/wsdl/vehicle_v27_0/Vehicle.wsdl",
                      endpointInterface = "com.travelport.service.vehicle_v27_0.VehicleMediaLinksServicePortType")
                      
public class VehicleMediaLinksServicePortImpl implements VehicleMediaLinksServicePortType {

    private static final Logger LOG = Logger.getLogger(VehicleMediaLinksServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.vehicle_v27_0.VehicleMediaLinksServicePortType#service(com.travelport.schema.vehicle_v27_0.VehicleMediaLinksReq  parameters )*
     */
    public com.travelport.schema.vehicle_v27_0.VehicleMediaLinksRsp service(com.travelport.schema.vehicle_v27_0.VehicleMediaLinksReq parameters) throws VehicleFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.vehicle_v27_0.VehicleMediaLinksRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new VehicleFaultMessage("VehicleFaultMessage...");
    }

}
