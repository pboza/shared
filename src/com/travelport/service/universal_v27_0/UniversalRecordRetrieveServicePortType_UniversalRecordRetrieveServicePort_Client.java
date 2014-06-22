
package com.travelport.service.universal_v27_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T16:08:16.726-04:00
 * Generated source version: 3.0.0
 * 
 */
public final class UniversalRecordRetrieveServicePortType_UniversalRecordRetrieveServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/universal_v27_0", "UniversalRecordService");

    private UniversalRecordRetrieveServicePortType_UniversalRecordRetrieveServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = UniversalRecordService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        UniversalRecordService ss = new UniversalRecordService(wsdlURL, SERVICE_NAME);
        UniversalRecordRetrieveServicePortType port = ss.getUniversalRecordRetrieveServicePort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.universal_v27_0.UniversalRecordRetrieveReq _service_parameters = null;
        com.travelport.schema.universal_v27_0.SupportedVersions _service_supportedVersions = null;
        try {
            com.travelport.schema.universal_v27_0.UniversalRecordRetrieveRsp _service__return = port.service(_service_parameters, _service_supportedVersions);
            System.out.println("service.result=" + _service__return);

        } catch (UniversalRecordArchivedFaultMessage e) { 
            System.out.println("Expected exception: UniversalRecordArchivedFaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (UniversalRecordFaultMessage e) { 
            System.out.println("Expected exception: UniversalRecordFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
