package com.executor;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.executor.model.Account;
import com.executor.service.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	ClientService clientService;

	@GetMapping("/getAccounts")
	public List<Account> getAccounts(@RequestParam(value = "clientID", defaultValue = "1") String clientID) throws InterruptedException, ExecutionException {
		//return "Getting accounts for client id : " + clientID;
		return clientService.getAccounts(clientID);
	}

}
