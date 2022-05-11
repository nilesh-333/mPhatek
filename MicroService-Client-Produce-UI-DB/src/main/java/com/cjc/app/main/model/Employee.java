package com.cjc.app.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{

	@Id
	private double PhoneNo;
	private String Firstname;
	private String Emailaddress;
	private String Lastname;
	public double getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(double d) {
		PhoneNo = d;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getEmailaddress() {
		return Emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		Emailaddress = emailaddress;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	

}
