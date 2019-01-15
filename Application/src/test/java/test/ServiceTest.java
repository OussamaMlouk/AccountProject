package test;

import org.junit.Test;

import repositries.Account;
import rest.Service;

import static org.junit.Assert.*;

public class ServiceTest {
	
	
	
	@Test
	public void firstTest() {
		Account a0 = new Account("Oussama","Mlouk",000000);
		assertEquals(a0.getFirstName(),"Oussama");
		assertEquals(a0.getLastName(),"Mlouk");
		assertEquals(a0.getAccountNumber(),000000);
	}
	
	@Test
	public void secondTest() {
		Account a0 = new Account("Oussama","Mlouk",000000);
		Service s0 = new Service();
		s0.addToAccountMap(a0);
		assertEquals(a0,s0.retrieveAccountById(0));
	}
	
}
