package com.insurance.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyId;
	private String policyNumber;
	private Date policyEffectiveDate;
	private Date policyExpDate;
	private String payment_Option;
	private double totalAmount;
	private String status;
	private Date createdDate;
	private String additionalInfo;

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Date getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}

	public void setPolicyEffectiveDate(Date policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}

	public Date getPolicyExpDate() {
		return policyExpDate;
	}

	public void setPolicyExpDate(Date policyExpDate) {
		this.policyExpDate = policyExpDate;
	}

	public String getPayment_Option() {
		return payment_Option;
	}

	public void setPayment_Option(String payment_Option) {
		this.payment_Option = payment_Option;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyNumber=" + policyNumber + ", policyEffectiveDate="
				+ policyEffectiveDate + ", policyExpDate=" + policyExpDate + ", payment_Option=" + payment_Option
				+ ", totalAmount=" + totalAmount + ", status=" + status + ", createdDate=" + createdDate
				+ ", additionalInfo=" + additionalInfo + "]";
	}

}
