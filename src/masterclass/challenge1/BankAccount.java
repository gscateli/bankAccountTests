package masterclass.challenge1;

public class BankAccount {
	private String account;
	private double balance;
	private String name;
	private String email;
	private String phone;

	public static final int CHECKING = 1;
	public static final int SAVINGS = 2;

	private int accountType;

	public BankAccount(String account, double balance, String name, String email, String phone, int accountType) {
		this.account = account;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.accountType = accountType;
	}

	public String getAccount() {
		return account;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public int getAccountType() {
		return accountType;
	}

	public double depositFunds(double amount, boolean branch) {
		if ((amount > 3000.00) && branch)
			throw new IllegalArgumentException();

		this.balance += amount;
		return this.balance;
	}

	public double withdrawFunds(double amount, boolean branch) {
		if (((amount > 500) && !branch) || (amount > this.balance))
			throw new IllegalArgumentException();

		this.balance -= amount;
		return this.balance;
	}

	public boolean isChecking() {
		return accountType == CHECKING;
	}

	public boolean isSavings() {
		return accountType == SAVINGS;
	}

}
