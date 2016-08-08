
package com.xcelenergy.registration.wsdl.serviceplan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancellationFee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="planDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicePlan", propOrder = {
    "cancellationFee",
    "planDetails",
    "planId"
})
public class ServicePlan {

    protected int cancellationFee;
    protected String planDetails;
    protected long planId;

    /**
     * Gets the value of the cancellationFee property.
     * 
     */
    public int getCancellationFee() {
        return cancellationFee;
    }

    /**
     * Sets the value of the cancellationFee property.
     * 
     */
    public void setCancellationFee(int value) {
        this.cancellationFee = value;
    }

    /**
     * Gets the value of the planDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanDetails() {
        return planDetails;
    }

    /**
     * Sets the value of the planDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanDetails(String value) {
        this.planDetails = value;
    }

    /**
     * Gets the value of the planId property.
     * 
     */
    public long getPlanId() {
        return planId;
    }

    /**
     * Sets the value of the planId property.
     * 
     */
    public void setPlanId(long value) {
        this.planId = value;
    }

}
