package com.insurance.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * @Author Shubham 
 * 
 */
@Entity
@Table(name = "premium")
public class Premium {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String premiumId;
	private int policyId;
	private String policyHolderName;
	private double installmentPremiumAmount;
	private Date policyCommencementDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPremiumId() {
		return premiumId;
	}

	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public double getInstallmentPremiumAmount() {
		return installmentPremiumAmount;
	}

	public void setInstallmentPremiumAmount(double installmentPremiumAmount) {
		this.installmentPremiumAmount = installmentPremiumAmount;
	}

	public Date getPolicyCommencementDate() {
		return policyCommencementDate;
	}

	public void setPolicyCommencementDate(Date policyCommencementDate) {
		this.policyCommencementDate = policyCommencementDate;
	}

	@Override
	public String toString() {
		return "Premium [id=" + id + ", premiumId=" + premiumId + ", policyId=" + policyId + ", policyHolderName="
				+ policyHolderName + ", installmentPremiumAmount=" + installmentPremiumAmount
				+ ", policyCommencementDate=" + policyCommencementDate + "]";
	}

}
