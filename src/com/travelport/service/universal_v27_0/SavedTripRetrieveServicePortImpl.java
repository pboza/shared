
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
 * 2014-06-21T16:08:16.996-04:00
 * Generated source version: 3.0.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "SavedTripRetrieveService",
                      portName = "SavedTripRetrieveServicePort",
                      targetNamespace = "http://www.travelport.com/service/universal_v27_0",
                      wsdlLocation = "file:/Users/pedroboza/eclipse-workspace/Travelport Tutorial/wsdl/universal_v27_0/UniversalRecord.wsdl",
                      endpointInterface = "com.travelport.service.universal_v27_0.SavedTripRetrieveServicePortType")
                      
public class SavedTripRetrieveServicePortImpl implements SavedTripRetrieveServicePortType {

    private static final Logger LOG = Logger.getLogger(SavedTripRetrieveServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.universal_v27_0.SavedTripRetrieveServicePortType#service(com.travelport.schema.universal_v27_0.SavedTripRetrieveReq  parameters ,)com.travelport.schema.universal_v27_0.SupportedVersions  supportedVersions )*
     */
    public com.travelport.schema.universal_v27_0.SavedTripRetrieveRsp service(com.travelport.schema.universal_v27_0.SavedTripRetrieveReq parameters,com.travelport.schema.universal_v27_0.SupportedVersions supportedVersions) throws UniversalRecordFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        System.out.println(supportedVersions);
        try {
            com.travelport.schema.universal_v27_0.SavedTripRetrieveRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UniversalRecordFaultMessage("UniversalRecordFaultMessage...");
    }

}
