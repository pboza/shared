
package com.travelport.service.hotel_v27_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T13:10:40.735-04:00
 * Generated source version: 3.0.0
 */

@WebFault(name = "ErrorInfo", targetNamespace = "http://www.travelport.com/schema/common_v27_0")
public class HotelFaultMessage extends Exception {
    
    private com.travelport.schema.common_v27_0.ErrorInfo errorInfo;

    public HotelFaultMessage() {
        super();
    }
    
    public HotelFaultMessage(String message) {
        super(message);
    }
    
    public HotelFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public HotelFaultMessage(String message, com.travelport.schema.common_v27_0.ErrorInfo errorInfo) {
        super(message);
        this.errorInfo = errorInfo;
    }

    public HotelFaultMessage(String message, com.travelport.schema.common_v27_0.ErrorInfo errorInfo, Throwable cause) {
        super(message, cause);
        this.errorInfo = errorInfo;
    }

    public com.travelport.schema.common_v27_0.ErrorInfo getFaultInfo() {
        return this.errorInfo;
    }
}
