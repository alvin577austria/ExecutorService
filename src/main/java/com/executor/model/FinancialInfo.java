package com.executor.model;

import java.math.BigDecimal;
import java.util.Date;

public class FinancialInfo {
	
	BigDecimal totalAssets;
	
	String sourceOfFunds;
	
	Date paidToDate;
	
	Date dueDate;
	
	BigDecimal amountDue;
	
	public FinancialInfo() {
		setTotalAssets(new BigDecimal(12345));
		setSourceOfFunds("Employment");
		setPaidToDate(new Date());
	}

	public BigDecimal getTotalAssets() {
		return totalAssets;
	}

	public void setTotalAssets(BigDecimal totalAssets) {
		this.totalAssets = totalAssets;
	}

	public String getSourceOfFunds() {
		return sourceOfFunds;
	}

	public void setSourceOfFunds(String sourceOfFunds) {
		this.sourceOfFunds = sourceOfFunds;
	}

	public Date getPaidToDate() {
		return paidToDate;
	}

	public void setPaidToDate(Date paidToDate) {
		this.paidToDate = paidToDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(BigDecimal amountDue) {
		this.amountDue = amountDue;
	}
	
}
