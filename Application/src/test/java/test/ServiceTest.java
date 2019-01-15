package test;

import org.junit.Test;

import repositries.Account;
import rest.Service;

import static org.junit.Assert.*;

public class ServiceTest {
	
	String firstName = "Oussama";
	String lastName = "Mlouk";
	
	@Test
	public void firstTest() {
		Account a0 = new Account(firstName,lastName,000000);
		assertEquals(firstName, a0.getFirstName());
		assertEquals(lastName, a0.getLastName());
		assertEquals(a0.getAccountNumber(),000000);
	}
	
	@Test
	public void secondTest() {
		Account a0 = new Account(firstName,lastName,000000);
		Service s0 = new Service();
		s0.addToAccountMap(a0);
		assertEquals(a0,s0.retrieveAccountById(0));
	}
	
	@Test
	public void thirdTest() {
		Account a0 = new Account(firstName,lastName,000001);
		assertEquals(000001,a0.getAccountNumber());
	}
	
}
