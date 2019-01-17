package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.HashMap;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Account;
import com.qa.persistence.domain.AccountJavaSE;
import com.qa.util.JSONUtil;

@Alternative
@Transactional(SUPPORTS)
public class Service implements AccountRepository {
	private Long id = (long) 0;
	private HashMap<Long, Account> accountMap = new HashMap<>();

	@Inject
	private JSONUtil util;

	@Override
	public String getAllAccounts() {
		return util.getJSONForObject(accountMap);
	}

	@Override
	public String createAccount(String account) {
		accountMap.put(id, util.getObjectForJSON(account, Account.class) );
		id += 1;
		return "{\"message\": \"account sucessfully added\"}";
	}

	@Override
	public Account findAccount(Long id) {
		return accountMap.get(id);
	}

	@Override
	public String deleteAccount(Long id) {
		if (findAccount(id) != null) {
			accountMap.remove(id);
			return "{\"message\": \"account successfully deleted\"}";
		} else {
			return "{\"message\": \"account not found\"}";
		}
	}

	@Override
	public String updateAccount(String account, Long id) {
		if (findAccount(id) != null) {
			accountMap.remove(id);
			accountMap.put(id, util.getObjectForJSON(account, Account.class));
			return "{\"message\": \"account successfully updated\"}";
		} else {
			return "{\"message\": \"account not found\"}";
		}
	}

}
