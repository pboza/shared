
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.air_v27_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T13:09:31.676-04:00
 * Generated source version: 3.0.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "AirService",
                      portName = "AirPrePayPort",
                      targetNamespace = "http://www.travelport.com/service/air_v27_0",
                      wsdlLocation = "file:/Users/pedroboza/eclipse-workspace/Travelport Tutorial/wsdl/air_v27_0/Air.wsdl",
                      endpointInterface = "com.travelport.service.air_v27_0.AirPrePayPortType")
                      
public class AirPrePayPortImpl implements AirPrePayPortType {

    private static final Logger LOG = Logger.getLogger(AirPrePayPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.air_v27_0.AirPrePayPortType#service(com.travelport.schema.air_v27_0.AirPrePayReq  parameters )*
     */
    public com.travelport.schema.air_v27_0.AirPrePayRsp service(com.travelport.schema.air_v27_0.AirPrePayReq parameters) throws AirFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.air_v27_0.AirPrePayRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new AirFaultMessage("AirFaultMessage...");
    }

}
