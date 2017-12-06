package com.emirates.sharedcab.middleware.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RouteInfo {


	
	@Id
	private String id;
	private String from;
	private String to;
	private String cabId;
	private String confirm;
	private String pnr;
	private String paxCount;
	private String lastName;
	private String pickUpTime;
	private String createdDate;
	private String createdBy ;
	private String fromCoordinates;
	private String toCoordinates;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getCabId() {
		return cabId;
	}
	public void setCabId(String cabId) {
		this.cabId = cabId;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPickUpTime() {
		return pickUpTime;
	}
	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getPaxCount() {
		return paxCount;
	}
	public void setPaxCount(String paxCount) {
		this.paxCount = paxCount;
	}
	public String getFromCoordinates() {
		return fromCoordinates;
	}
	public void setFromCoordinates(String fromCoordinates) {
		this.fromCoordinates = fromCoordinates;
	}
	public String getToCoordinates() {
		return toCoordinates;
	}
	public void setToCoordinates(String toCoordinates) {
		this.toCoordinates = toCoordinates;
	}


	
}
