package test;

import org.junit.Test;

import repositries.Account;
import rest.Service;

import static org.junit.Assert.*;

public class ServiceTest {
	
	String firstName = "Oussama";
	String lastName = "Mlouk";
	
	@Test
	public void newAccountTest() {
		Account a0 = new Account(firstName,lastName,000000);
		assertEquals(firstName, a0.getFirstName());
		assertEquals(lastName, a0.getLastName());
		assertEquals(a0.getAccountNumber(),000000);
	}
	
	@Test
	public void retrieveAccountByIdTest() {
		Account a0 = new Account(firstName,lastName,000000 );
		Account a1 = new Account(firstName,lastName,000000 );
		Service s0 = new Service();
		s0.addToAccountMap(a0);
		s0.addToAccountMap(a1);
		assertEquals(a0,s0.retrieveAccountById(0));
		assertEquals(a1,s0.retrieveAccountById(1));
	}
	
	@Test
	public void accountNumberGetTest() {
		Account a0 = new Account(firstName,lastName,000001);
		assertEquals(000001,a0.getAccountNumber());
	}
	
	@Test
	public void  searchAccountTest1() {
		Account a0 = new Account(firstName,lastName,000001);
		Account a1 = new Account(firstName,lastName,000001);
		Account a2 = new Account(firstName,lastName,000001);
		Account a3 = new Account(firstName,lastName,000001);
		Service s0 = new Service();
		s0.addToAccountMap(a0);
		s0.addToAccountMap(a1);
		s0.addToAccountMap(a2);
		s0.addToAccountMap(a3);

		assertEquals(4,s0.searchAccount(firstName));
	}
	
	public void searchAccountTest2() {
		Account a0 = new Account("","",000001);
		Account a1 = new Account(" "," ",000001);
		Account a2 = new Account("  ","  ",000001);
		Account a3 = new Account("   ","   ",000001);
		Service s0 = new Service();
		s0.addToAccountMap(a0);
		s0.addToAccountMap(a1);
		s0.addToAccountMap(a2);
		s0.addToAccountMap(a3);
		
		assertEquals(1,s0.searchAccount(" "));
		assertEquals(1,s0.searchAccount("  "));
	}
	
}
