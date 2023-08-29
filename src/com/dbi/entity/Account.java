package com.dbi.entity;

public class Account {
	private String name;
	private String accNo;
	private String ifsc;
	private String branch;
	private String pin;
	private String phNo;
	
	public Account(String name, String accNo, String ifsc, String branch, String pin, String phNo) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.ifsc = ifsc;
		this.branch = branch;
		this.pin = pin;
		this.phNo = phNo;
	}
	
	public Account() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
}
