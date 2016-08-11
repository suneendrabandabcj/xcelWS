package com.xcelenergy.registration.model;

import java.io.Serializable;

public class ServicePlan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long planId;
	private String planDetails;
	private int cancellationFee;
	 
	public long getPlanId() {
		return planId;
	}
	public void setPlanId(long planId) {
		this.planId = planId;
	}
	public String getPlanDetails() {
		return planDetails;
	}
	public void setPlanDetails(String planDetails) {
		this.planDetails = planDetails;
	}
	public int getCancellationFee() {
		return cancellationFee;
	}
	public void setCancellationFee(int cancellationFee) {
		this.cancellationFee = cancellationFee;
	}
	
	
	
}
