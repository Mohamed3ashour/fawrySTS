package com.fawry.fawrySTS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String username;
	private String email;
	private String password;
	private Integer Phone ;
	private Integer Phonebalance ;
	private Integer userbalance ;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getPhone() {
		return Phone;
	}
	public void setPhone(Integer phone) {
		Phone = phone;
	}
	public Integer getPhonebalance() {
		return Phonebalance;
	}
	public void setPhonebalance(Integer phonebalance) {
		Phonebalance = phonebalance;
	}
	public Integer getUserbalance() {
		return userbalance;
	}
	public void setUserbalance(Integer userbalance) {
		this.userbalance = userbalance;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
