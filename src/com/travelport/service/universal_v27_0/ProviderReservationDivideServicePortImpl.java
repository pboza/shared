
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.universal_v27_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T16:08:17.008-04:00
 * Generated source version: 3.0.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "ProviderReservationDivideService",
                      portName = "ProviderReservationDivideServicePort",
                      targetNamespace = "http://www.travelport.com/service/universal_v27_0",
                      wsdlLocation = "file:/Users/pedroboza/eclipse-workspace/Travelport Tutorial/wsdl/universal_v27_0/UniversalRecord.wsdl",
                      endpointInterface = "com.travelport.service.universal_v27_0.ProviderReservationDivideServicePortType")
                      
public class ProviderReservationDivideServicePortImpl implements ProviderReservationDivideServicePortType {

    private static final Logger LOG = Logger.getLogger(ProviderReservationDivideServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.universal_v27_0.ProviderReservationDivideServicePortType#service(com.travelport.schema.universal_v27_0.ProviderReservationDivideReq  parameters )*
     */
    public com.travelport.schema.universal_v27_0.ProviderReservationDivideRsp service(com.travelport.schema.universal_v27_0.ProviderReservationDivideReq parameters) throws UniversalRecordFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.universal_v27_0.ProviderReservationDivideRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UniversalRecordFaultMessage("UniversalRecordFaultMessage...");
    }

}
