package fr.eurecom.tvrdfizator.core.datastructures;

import java.util.Date;

public class Version {
	
	
	private String serviceID; 
	private String service; 
	private Date startTime;
	private Date endTime;
	private String program;  
	private String format;
	

	public String getServiceID() {
		return serviceID;
	}
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	public void print() {
		System.out.println("VERSION: ----------------------------------------------------");
		System.out.println("  ServiceID: "+serviceID);
		System.out.println("  Service: "+service);
		System.out.println("  StartTime: "+ startTime);
		System.out.println("  endTime: "+endTime);
		System.out.println("  program: "+program);
		System.out.println("  format: "+format);
		System.out.println("-------------------------------------------------------------");

	}

	
}
