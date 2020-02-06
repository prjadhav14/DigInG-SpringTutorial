package edu.asu.diging.tutorial.spring.domain;

public class Reason {
	
	private String description;
	public Reason(String desc) {
		description=desc;
	}
	public String getReason() {
		return description;
	}
	public void setReason(String reason) {
		this.description = reason;
	}
}
