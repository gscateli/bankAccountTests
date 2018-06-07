package masterclass.challenge1;

public class VipCustomer {

	private String name;
	private double creditLimit;
	private String email;

	public VipCustomer() {
		this("John Doe", 430.90, "johndoe@gmail.com");
	}

	public VipCustomer(String name, String email) {
		this(name, 500.45, email);
	}

	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}
}
