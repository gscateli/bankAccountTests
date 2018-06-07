package masterclass.challenge1.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import masterclass.challenge1.BankAccount;

public class BankAccountTest {

	BankAccount account;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before the tests...");
	}

	@Before
	public void setup() {
		account = new BankAccount("Guilherme", 1000.00, "Cateli", "guicateli@gmail.com", "3727-2556",
				BankAccount.CHECKING);
	}

	@Test
	public void testGetBalance() throws Exception {
		assertEquals(1000.00, account.getBalance(), 0);
	}

	@Test
	public void withDrawBranch() throws Exception {
		double balance = account.withdrawFunds(600.00, true);
		assertEquals(400.00, balance, 0);

	}

	@Test
	public void withDrawNotBranch() throws Exception {
		double balance = account.withdrawFunds(500.00, false);
		assertEquals(500.00, balance, 0);

	}

	@Test
	public void testGetBalanceWithDraw() throws Exception {
		account.withdrawFunds(400.00, true);
		assertEquals(600.00, account.getBalance(), 0);
	}

	@Test
	public void testDepositFunds() throws Exception {
		double balance = account.depositFunds(200.00, true);
		assertEquals(1200.00, balance, 0);
	}

	@Test
	public void isCheckingTrue() {
		assertEquals(true, account.isChecking());
	}

	public void isCheckingFalse() {
		assertEquals(false, account.isChecking());
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After the tests...");
	}

}
