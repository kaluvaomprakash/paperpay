package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_r")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name="h_id")
	int hId;
	@Column(name="mobile_number")
	String mobileNumber;
	@Column(name="password")
	String password;
	@Column(name="paper_amount")
	int paperAmount;
	@Column(name="paper_type")
	String paperType;
	@Column(name="details")
	String details;
	@Column(name="additional_charges")
	int additionalCharges;
	@Column(name="is_active")
	int isActive;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int gethId() {
		return hId;
	}
	public void sethId(int hId) {
		this.hId = hId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPaperAmount() {
		return paperAmount;
	}
	public void setPaperAmount(int paperAmount) {
		this.paperAmount = paperAmount;
	}
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getAdditionalCharges() {
		return additionalCharges;
	}
	public void setAdditionalCharges(int additionalCharges) {
		this.additionalCharges = additionalCharges;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", hId=" + hId + ", mobileNumber=" + mobileNumber + ", password=" + password
				+ ", paperAmount=" + paperAmount + ", paperType=" + paperType + ", details=" + details
				+ ", additionalCharges=" + additionalCharges + ", isActive=" + isActive + "]";
	}
}





