package com.assets.model;

import javax.persistence.Embeddable;

@Embeddable
public class assignment_status {
	
	private String available,assigned,recoverd;

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getAssigned() {
		return assigned;
	}

	public void setAssigned(String assigned) {
		this.assigned = assigned;
	}

	public String getRecoverd() {
		return recoverd;
	}

	public void setRecoverd(String recoverd) {
		this.recoverd = recoverd;
	}
	
	

}
