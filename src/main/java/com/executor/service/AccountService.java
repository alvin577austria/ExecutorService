package com.executor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.executor.dao.AccountDAO;
import com.executor.model.AccountOwner;
import com.executor.model.BasicInfo;
import com.executor.model.Beneficiary;
import com.executor.model.FinancialInfo;

@Service
public class AccountService {
	
	@Autowired
	AccountDAO accountDAO;

	public List<String> getAccountNumbers(String clientID) {
		return accountDAO.retrieveAccountNumbers(clientID);
	}
	
	public BasicInfo getBasicInfo(String accountNumber) throws InterruptedException {
		System.out.println("start basic info");
		return accountDAO.retrieveBasicInfo(accountNumber);
	}
	
	public AccountOwner getAccountOwner(String accountNumber) throws InterruptedException {
		System.out.println("start account owner");
		return accountDAO.retrieveAccountOwner(accountNumber);
	}
	
	public List<Beneficiary> getBeneficiaries(String accountNumber) throws InterruptedException {
		System.out.println("start beneficiaries");
		return accountDAO.retrieveBeneficiaries(accountNumber);
	}
	
	public FinancialInfo getFinancialInfo(String accountNumber) throws InterruptedException {
		System.out.println("start financial info");
		return accountDAO.retrieveFinancialInfo(accountNumber);
	}
	
}
