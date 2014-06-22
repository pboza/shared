
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
 * 2014-06-21T16:08:16.638-04:00
 * Generated source version: 3.0.0
 * 
 */
public final class RailCreateReservationPortType_RailCreateReservationPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/universal_v27_0", "RailService");

    private RailCreateReservationPortType_RailCreateReservationPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RailService.WSDL_LOCATION;
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
      
        RailService ss = new RailService(wsdlURL, SERVICE_NAME);
        RailCreateReservationPortType port = ss.getRailCreateReservationPort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.universal_v27_0.RailCreateReservationReq _service_parameters = null;
        try {
            com.travelport.schema.universal_v27_0.RailCreateReservationRsp _service__return = port.service(_service_parameters);
            System.out.println("service.result=" + _service__return);

        } catch (RailFaultMessage e) { 
            System.out.println("Expected exception: RailFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
