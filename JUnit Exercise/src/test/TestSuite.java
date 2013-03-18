package test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import mainpackage.Cashier;
import mainpackage.DCContainer;
import mainpackage.Envelope;
import mainpackage.NegativeBalanceException;

import org.junit.Test;

public class TestSuite {

	@Test
	public void testDCSubtract()
	{
		Cashier testCash = new Cashier();
		DCContainer cont1 = new DCContainer(2,45);
		DCContainer cont2 = new DCContainer(1,89);
		DCContainer actual;
		actual = testCash.subtractDC(cont1, cont2);
		Assert.assertEquals(0, actual.getDollars());
		Assert.assertEquals(56, actual.getCents());	
	}
	

	@Test (expected = NegativeBalanceException.class)
	public void negBalance() throws NegativeBalanceException {
		Cashier testCash = new Cashier();
		DCContainer cont1 = new DCContainer(2,45);
		DCContainer cont2 = new DCContainer(1,89);
		testCash.subtractDC(cont2, cont1);
	}
	
	@Test
	public void testFromEnvelope()
	{
		DCContainer actual;
		Envelope testEnvelope = new Envelope(1,3,2,3,6);
		Cashier testCash = new Cashier();
		actual = testCash.fromEnvelope(testEnvelope);
		Assert.assertEquals(2, actual.getDollars());
		Assert.assertEquals(16, actual.getCents());
	}
	
	@Test
	public void testToEnvelope()
	{
		Envelope actual;
		DCContainer testContainer = new DCContainer(1,47);
		Cashier testCash = new Cashier();
		actual = testCash.toEnvelope(testContainer);
		Assert.assertEquals(1, actual.dollars);
		Assert.assertEquals(1, actual.quarters);
		Assert.assertEquals(2, actual.dimes);
		Assert.assertEquals(0, actual.nickels);
		Assert.assertEquals(2, actual.pennies);
	}

}
