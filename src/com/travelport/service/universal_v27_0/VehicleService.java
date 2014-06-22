package com.travelport.service.universal_v27_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T16:08:17.187-04:00
 * Generated source version: 3.0.0
 * 
 */
@WebServiceClient(name = "VehicleService", 
                  wsdlLocation = "file:/Users/pedroboza/eclipse-workspace/Travelport Tutorial/wsdl/universal_v27_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v27_0") 
public class VehicleService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v27_0", "VehicleService");
    public final static QName VehicleCancelServicePort = new QName("http://www.travelport.com/service/universal_v27_0", "VehicleCancelServicePort");
    public final static QName VehicleReservationServicePort = new QName("http://www.travelport.com/service/universal_v27_0", "VehicleReservationServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/pedroboza/eclipse-workspace/Travelport Tutorial/wsdl/universal_v27_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(VehicleService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/pedroboza/eclipse-workspace/Travelport Tutorial/wsdl/universal_v27_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public VehicleService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public VehicleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VehicleService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public VehicleService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public VehicleService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public VehicleService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns VehicleCancelServicePortType
     */
    @WebEndpoint(name = "VehicleCancelServicePort")
    public VehicleCancelServicePortType getVehicleCancelServicePort() {
        return super.getPort(VehicleCancelServicePort, VehicleCancelServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleCancelServicePortType
     */
    @WebEndpoint(name = "VehicleCancelServicePort")
    public VehicleCancelServicePortType getVehicleCancelServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleCancelServicePort, VehicleCancelServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns VehicleReservationServicePortType
     */
    @WebEndpoint(name = "VehicleReservationServicePort")
    public VehicleReservationServicePortType getVehicleReservationServicePort() {
        return super.getPort(VehicleReservationServicePort, VehicleReservationServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleReservationServicePortType
     */
    @WebEndpoint(name = "VehicleReservationServicePort")
    public VehicleReservationServicePortType getVehicleReservationServicePort(WebServiceFeature... features) {
        return super.getPort(VehicleReservationServicePort, VehicleReservationServicePortType.class, features);
    }

}
