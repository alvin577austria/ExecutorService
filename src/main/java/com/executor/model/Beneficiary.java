package com.executor.model;

import java.util.ArrayList;
import java.util.List;

public class Beneficiary extends Person {
	
	Beneficiary(String name) {
		setFirstName(name);
	}

	public static List<Beneficiary> getMockBeneficiaries() {
		Beneficiary bene1 = new Beneficiary("Bene 1");
		Beneficiary bene2 = new Beneficiary("Bene 2");
		List<Beneficiary> beneficiaries = new ArrayList<Beneficiary>();
		beneficiaries.add(bene1);
		beneficiaries.add(bene2);
		return beneficiaries;
	}

}
