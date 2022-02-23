package com.executor.model;

import java.util.List;

public class Account {
	
	BasicInfo basicInfo;
	
	AccountOwner accountOwner;
	
	FinancialInfo financialInfo;
	
	List<Beneficiary> beneficiaries;

	public BasicInfo getBasicInfo() {
		return basicInfo;
	}

	public void setBasicInfo(BasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}

	public AccountOwner getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(AccountOwner accountOwner) {
		this.accountOwner = accountOwner;
	}

	public FinancialInfo getFinancialInfo() {
		return financialInfo;
	}

	public void setFinancialInfo(FinancialInfo financialInfo) {
		this.financialInfo = financialInfo;
	}

	public List<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}
	
}
