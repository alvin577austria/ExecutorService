package com.executor.model;

import java.util.Date;

public class BasicInfo {
	
	String accountName;
	
	String accountID;
	
	String status;
	
	Date creationDate;
	
	public BasicInfo() {
		setAccountName("Account 1");
		setStatus("Active");
		setCreationDate(new Date());
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
}
