package com.qa.rest;
import java.util.HashMap;

import com.qa.persistence.domain.AccountJavaSE;

public class Service {
	private Integer id = 0;
	private HashMap<Integer, AccountJavaSE> accountMap = new HashMap<>();
	
	public void addToAccountMap(AccountJavaSE account) {
		accountMap.put(id, account);
		id +=1;
		
	}
	
	public AccountJavaSE retrieveAccountById(int id) {
		return accountMap.get(id);
	}
	
	public int searchAccount(String firstName) {
		int count = 0;
		for(int i =0; i<id; i++) {
			if(retrieveAccountById(i).getFirstName().equals(firstName)) {
				count += 1;
			}
		}
		return count;
	}
	

}
