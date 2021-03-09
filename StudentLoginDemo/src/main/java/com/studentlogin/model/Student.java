package com.studentlogin.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private String email;
	private String name;
	private String mobile;
	private String password;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Student [email=" + email + ", name=" + name + ", mobile=" + mobile + ", password=" + password + "]";
	}
	
}
