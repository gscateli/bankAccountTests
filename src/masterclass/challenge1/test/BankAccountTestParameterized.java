package masterclass.challenge1.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import masterclass.challenge1.BankAccount;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {
	private BankAccount account;

	private double amount;
	private boolean branch;
	private double expected;

	@Before
	public void setup() {
		account = new BankAccount("Guilherme", 1000.00, "Cateli", "guicateli@gmail.com", "3727-2556",
				BankAccount.CHECKING);
		System.out.println("Running test...");
	}

	public BankAccountTestParameterized(double amount, boolean branch, double expected) {
		this.amount = amount;
		this.branch = branch;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> testConditions() {
		return Arrays.asList(new Object[][] { { 100.00, true, 1100.00 }, { 234.00, false, 1234.00 },
				{ 4600.89, false, 5600.89 }, { 5000.00, true, 400.00 }, { 459.00, false, 1459.00 } });

	}

	@Test
	public void testDepositFunds() throws Exception {
		account.depositFunds(amount, branch);
		assertEquals(expected, account.getBalance(), 0);
	}

}
