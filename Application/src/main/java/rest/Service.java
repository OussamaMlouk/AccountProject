package rest;
import java.util.HashMap;

import repositries.Account;

public class Service {
	private Integer id = 0;
	HashMap<Integer, Account> accountMap = new HashMap<>();
	
	public void addToAccountMap(Account account) {
		accountMap.put(id, account);
		id +=1;
		
	}
	
	public Object retrieveAccountById(int id) {
		return accountMap.get(id);
	}
	

}
