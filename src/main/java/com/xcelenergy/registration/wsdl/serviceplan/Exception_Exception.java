
package com.xcelenergy.registration.wsdl.serviceplan;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://soap.ws.registration.utility.com/")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.xcelenergy.registration.wsdl.serviceplan.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, com.xcelenergy.registration.wsdl.serviceplan.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Exception_Exception(String message, com.xcelenergy.registration.wsdl.serviceplan.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.xcelenergy.registration.wsdl.serviceplan.Exception
     */
    public com.xcelenergy.registration.wsdl.serviceplan.Exception getFaultInfo() {
        return faultInfo;
    }

}
