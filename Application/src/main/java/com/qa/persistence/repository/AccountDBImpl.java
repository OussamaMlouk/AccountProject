package com.qa.persistence.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import static javax.transaction.Transactional.TxType.*;

import java.util.Collection;

import javax.inject.Inject;
import javax.transaction.Transactional;
import com.qa.util.*;

import com.qa.persistence.domain.Account;

@Transactional(SUPPORTS)
public class AccountDBImpl {
	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;

	public String getAllAccounts() {
		Query query = em.createQuery("SELECT a FROM Account a");
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return util.getJSONForObject(accounts);
	}

	@Transactional(REQUIRED)
	public String createAccount(String account) {
		Account anAccount = util.getObjectForJSON(account, Account.class);
		em.persist(anAccount);
		return "{\"message\": \"account sucessfully added\"}";
	}

	public Account findAccount(Long id) {
		return em.find(Account.class, id);
	}

	@Transactional(REQUIRED)
	public String deleteAccount(Long id) {
		Account accountInDB = findAccount(id);
		if (accountInDB != null) {
			em.remove(accountInDB);
			return "{\"message\": \"account successfully deleted\"}";
		} else {
			return "{\"message\": \"account not found\"}";
		}

	}

	@Transactional(REQUIRED)
	public String updateAccount(String account, Long id) {
		Account accountInDB = findAccount(id);
		if (accountInDB != null) {
			deleteAccount(id);
			createAccount(account);
			return "{\"message\": \"account successfully updated\"}";
		} else {
			return "{\"message\": \"account not found\"}";
		}

	}

}
