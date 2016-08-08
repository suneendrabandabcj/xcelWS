
package com.xcelenergy.registration.wsdl.serviceplan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xcelenergy.registration.wsdl.serviceplan package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllServicePlansResponse_QNAME = new QName("http://soap.ws.registration.utility.com/", "getAllServicePlansResponse");
    private final static QName _Exception_QNAME = new QName("http://soap.ws.registration.utility.com/", "Exception");
    private final static QName _ServicePlan_QNAME = new QName("http://soap.ws.registration.utility.com/", "servicePlan");
    private final static QName _GetAllServicePlans_QNAME = new QName("http://soap.ws.registration.utility.com/", "getAllServicePlans");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xcelenergy.registration.wsdl.serviceplan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServicePlan }
     * 
     */
    public ServicePlan createServicePlan() {
        return new ServicePlan();
    }

    /**
     * Create an instance of {@link GetAllServicePlans }
     * 
     */
    public GetAllServicePlans createGetAllServicePlans() {
        return new GetAllServicePlans();
    }

    /**
     * Create an instance of {@link GetAllServicePlansResponse }
     * 
     */
    public GetAllServicePlansResponse createGetAllServicePlansResponse() {
        return new GetAllServicePlansResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllServicePlansResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.registration.utility.com/", name = "getAllServicePlansResponse")
    public JAXBElement<GetAllServicePlansResponse> createGetAllServicePlansResponse(GetAllServicePlansResponse value) {
        return new JAXBElement<GetAllServicePlansResponse>(_GetAllServicePlansResponse_QNAME, GetAllServicePlansResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.registration.utility.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.registration.utility.com/", name = "servicePlan")
    public JAXBElement<ServicePlan> createServicePlan(ServicePlan value) {
        return new JAXBElement<ServicePlan>(_ServicePlan_QNAME, ServicePlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllServicePlans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.registration.utility.com/", name = "getAllServicePlans")
    public JAXBElement<GetAllServicePlans> createGetAllServicePlans(GetAllServicePlans value) {
        return new JAXBElement<GetAllServicePlans>(_GetAllServicePlans_QNAME, GetAllServicePlans.class, null, value);
    }

}
