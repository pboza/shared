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
 * 2014-06-21T16:08:17.270-04:00
 * Generated source version: 3.0.0
 * 
 */
@WebServiceClient(name = "RailService", 
                  wsdlLocation = "file:/Users/pedroboza/eclipse-workspace/Travelport Tutorial/wsdl/universal_v27_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v27_0") 
public class RailService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v27_0", "RailService");
    public final static QName RailExchangeCreateReservationPort = new QName("http://www.travelport.com/service/universal_v27_0", "RailExchangeCreateReservationPort");
    public final static QName RailCreateReservationPort = new QName("http://www.travelport.com/service/universal_v27_0", "RailCreateReservationPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/pedroboza/eclipse-workspace/Travelport Tutorial/wsdl/universal_v27_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RailService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/pedroboza/eclipse-workspace/Travelport Tutorial/wsdl/universal_v27_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RailService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RailService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RailService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RailService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RailService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RailService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns RailExchangeCreateReservationPortType
     */
    @WebEndpoint(name = "RailExchangeCreateReservationPort")
    public RailExchangeCreateReservationPortType getRailExchangeCreateReservationPort() {
        return super.getPort(RailExchangeCreateReservationPort, RailExchangeCreateReservationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RailExchangeCreateReservationPortType
     */
    @WebEndpoint(name = "RailExchangeCreateReservationPort")
    public RailExchangeCreateReservationPortType getRailExchangeCreateReservationPort(WebServiceFeature... features) {
        return super.getPort(RailExchangeCreateReservationPort, RailExchangeCreateReservationPortType.class, features);
    }
    /**
     *
     * @return
     *     returns RailCreateReservationPortType
     */
    @WebEndpoint(name = "RailCreateReservationPort")
    public RailCreateReservationPortType getRailCreateReservationPort() {
        return super.getPort(RailCreateReservationPort, RailCreateReservationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RailCreateReservationPortType
     */
    @WebEndpoint(name = "RailCreateReservationPort")
    public RailCreateReservationPortType getRailCreateReservationPort(WebServiceFeature... features) {
        return super.getPort(RailCreateReservationPort, RailCreateReservationPortType.class, features);
    }

}
