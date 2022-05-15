package com.Paf.PCM.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="username")
	private String userName;
	
	@Column(name = "no_of_units")
	private String noOfUnits;
	
	@Column(name = "price_per_unit")
	private String pricePerUnit;
	
	
	
	
	public User() {
		
	}
	
	public User(String userName, String noOfUnits, String pricePerUnit) {
		super();
		this.userName = userName;
		this.noOfUnits = noOfUnits;
		this.pricePerUnit = pricePerUnit;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNoOfUnits() {
		return noOfUnits;
	}
	public void setNoOfUnits(String noOfUnits) {
		this.noOfUnits = noOfUnits;
	}
	public String getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(String pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	

}
