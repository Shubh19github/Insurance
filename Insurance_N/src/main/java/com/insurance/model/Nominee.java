package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * @Author Shital
 * 
 */
@Entity
@Table(name = "Nominee_details")
public class Nominee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int nomineeId;
	private String name;
	private String relation;
	private String percentage;
	private Integer userid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNomineeId() {
		return nomineeId;
	}
	public void setNomineeId(int nomineeId) {
		this.nomineeId = nomineeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Nominee [id=" + id + ", nomineeId=" + nomineeId + ", name=" + name + ", relation=" + relation
				+ ", percentage=" + percentage + ", userid=" + userid + "]";
	}

	

}
