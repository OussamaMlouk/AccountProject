package rest;

import static org.junit.Assert.assertEquals;

import com.google.gson.Gson;

import repositries.Account;

public class App {

	private App() {

	}

	public static void main(String[] args) {

		Gson gson = new Gson();

		Service s0 = new Service();
		Account a0 = new Account("Oussama", "Mlouk", 100000);

		s0.addToAccountMap(a0);
		String accountMap = gson.toJson(s0);
		String account0 = gson.toJson(a0);
		
		System.out.println(accountMap);
		System.out.println(account0);

	}
}
