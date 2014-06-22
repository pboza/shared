
package com.travelport.service.universal_v27_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-21T16:08:16.820-04:00
 * Generated source version: 3.0.0
 */

@WebFault(name = "UniversalModifyErrorInfo", targetNamespace = "http://www.travelport.com/schema/universal_v27_0")
public class UniversalModifyFaultMessage extends Exception {
    
    private com.travelport.schema.universal_v27_0.UniversalModifyErrorInfo universalModifyErrorInfo;

    public UniversalModifyFaultMessage() {
        super();
    }
    
    public UniversalModifyFaultMessage(String message) {
        super(message);
    }
    
    public UniversalModifyFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UniversalModifyFaultMessage(String message, com.travelport.schema.universal_v27_0.UniversalModifyErrorInfo universalModifyErrorInfo) {
        super(message);
        this.universalModifyErrorInfo = universalModifyErrorInfo;
    }

    public UniversalModifyFaultMessage(String message, com.travelport.schema.universal_v27_0.UniversalModifyErrorInfo universalModifyErrorInfo, Throwable cause) {
        super(message, cause);
        this.universalModifyErrorInfo = universalModifyErrorInfo;
    }

    public com.travelport.schema.universal_v27_0.UniversalModifyErrorInfo getFaultInfo() {
        return this.universalModifyErrorInfo;
    }
}
