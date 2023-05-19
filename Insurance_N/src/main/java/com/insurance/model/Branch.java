package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branch")
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchId;
	private String branchCode;
	private String branchName;
	private String iFSCCode;
	private String branchPhoneNo;
	private String address;
	private String micrCode;

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getiFSCCode() {
		return iFSCCode;
	}

	public void setiFSCCode(String iFSCCode) {
		this.iFSCCode = iFSCCode;
	}

	public String getBranchPhoneNo() {
		return branchPhoneNo;
	}

	public void setBranchPhoneNo(String branchPhoneNo) {
		this.branchPhoneNo = branchPhoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMicrCode() {
		return micrCode;
	}

	public void setMicrCode(String micrCode) {
		this.micrCode = micrCode;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchCode=" + branchCode + ", branchName=" + branchName
				+ ", iFSCCode=" + iFSCCode + ", branchPhoneNo=" + branchPhoneNo + ", address=" + address + ", micrCode="
				+ micrCode + "]";
	}

}
