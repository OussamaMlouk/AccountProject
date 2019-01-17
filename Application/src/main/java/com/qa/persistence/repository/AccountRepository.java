package com.qa.persistence.repository;

import com.qa.persistence.domain.Account;

public interface AccountRepository {
	public String getAllAccounts();

	public String createAccount(String account);

	public Account findAccount(Long id);

	public String deleteAccount(Long id);

	public String updateAccount(String account, Long id);
}
