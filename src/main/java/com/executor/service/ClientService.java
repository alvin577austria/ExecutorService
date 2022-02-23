package com.executor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.executor.model.Account;
import com.executor.model.AccountOwner;
import com.executor.model.BasicInfo;
import com.executor.model.Beneficiary;
import com.executor.model.FinancialInfo;

@Service
public class ClientService {
	
	@Autowired
	AccountService accountService;

	public List<Account> getAccounts(String clientID) throws InterruptedException, ExecutionException {
		List<String> accountNumbers = accountService.getAccountNumbers(clientID);
		List<Account> accounts = new ArrayList<Account>();
		
		// number of accounts * 4 parts of the account
		ExecutorService executor = Executors.newFixedThreadPool(accountNumbers.size() * 4);
		for(String accountNumber: accountNumbers) {
			Account account = new Account();
			Future<BasicInfo> basicInfo = executor.submit(() -> accountService.getBasicInfo(accountNumber));
			Future<AccountOwner> accountOwner = executor.submit(() -> accountService.getAccountOwner(accountNumber));
			Future<FinancialInfo> financialInfo = executor.submit(() -> accountService.getFinancialInfo(accountNumber));
			Future<List<Beneficiary>> beneficiaries = executor.submit(() -> accountService.getBeneficiaries(accountNumber));
			
			account.setAccountOwner(accountOwner.get());
			account.setBasicInfo(basicInfo.get());
			account.setBeneficiaries(beneficiaries.get());
			account.setFinancialInfo(financialInfo.get());
			
			accounts.add(account);
		}
		
		executor.shutdown();
		
		return accounts;
	}
	
	

}
