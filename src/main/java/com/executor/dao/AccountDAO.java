package com.executor.dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.executor.model.AccountOwner;
import com.executor.model.BasicInfo;
import com.executor.model.Beneficiary;
import com.executor.model.FinancialInfo;

@Component
public class AccountDAO {
	
	// For mocking
	HashMap<String, List<String>> accountNumbers = new HashMap<String, List<String>>()
	{{
			put("1", Arrays.asList("12345", "12346"));
			put("2", Arrays.asList("12347", "12348"));
			put("3", Arrays.asList("12349"));
	}};
	
	public List<String> retrieveAccountNumbers(String clientID) {
		return accountNumbers.get(clientID);
	}

	public BasicInfo retrieveBasicInfo(String accountNumber) throws InterruptedException {
		Thread.sleep(3000);
		return new BasicInfo();
	}

	public AccountOwner retrieveAccountOwner(String accountNumber) throws InterruptedException {
		Thread.sleep(3000);
		return new AccountOwner();
	}

	public List<Beneficiary> retrieveBeneficiaries(String accountNumber) throws InterruptedException {
		Thread.sleep(3000);
		return Beneficiary.getMockBeneficiaries();
	}

	public FinancialInfo retrieveFinancialInfo(String accountNumber) throws InterruptedException {
		Thread.sleep(3000);
		return new FinancialInfo();
	}

}
