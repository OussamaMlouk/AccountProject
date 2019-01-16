package rest;

import static org.junit.Assert.assertEquals;

import com.google.gson.Gson;

import repositries.Account;

public class App {
	
	private App() {
		
	}

	public static void main(String[] args) {

//		System.out.println("hello");
//
//		Gson gson = new Gson();

//		Service s0 = new Service();
//		Account a0 = new Account("Oussama", "Mlouk", 100000);

//		s0.addToAccountMap(a0);
//		String accountMap = gson.toJson(s0);
//		String account0 = gson.toJson(a0);
//
//		System.out.println(accountMap);
//		System.out.println(account0);
		
//		Account a0 = new Account("","",000000 );
//		Account a1 = new Account("","",000000 );
//		Service s0 = new Service();
//		s0.addToAccountMap(a0);
//		s0.addToAccountMap(a1);
//		System.out.println(s0.retrieveAccountById(1));
//		
////		s0.searchAccount("");
//		
//		System.out.println(s0.retrieveAccountById(1).getFirstName().equals(""));
//		System.out.println(s0.searchAccount(""));
		
		Account a0 = new Account("","",000001);
		Account a1 = new Account("","",000001);
		Account a2 = new Account("","",000001);
		Account a3 = new Account("","",000001);
		Service s0 = new Service();
		s0.addToAccountMap(a0);
		s0.addToAccountMap(a1);
		s0.addToAccountMap(a2);
		s0.addToAccountMap(a3);

		System.out.println(s0.searchAccount(""));
		
	}
}
