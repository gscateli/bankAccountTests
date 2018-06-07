package masterclass.challenge1;

public class Main {

	public static void main(String[] args) {
		BankAccount guilherme = new BankAccount("1273839", 500, "guilherme", "guicateli@gmail.com", "3748-4940",
				BankAccount.CHECKING);
		VipCustomer guilhermeVIP = new VipCustomer();
		VipCustomer joanaVIP = new VipCustomer("Joana", "joanadark@hotmail.com");
		VipCustomer carolVIP = new VipCustomer("Carol Freitas", 990.90, "carollima@gmail.com");

		System.out.println(guilherme.getBalance());
		System.out.println(guilherme.depositFunds(256.56, true));
		System.out.println(guilherme.withdrawFunds(100, true));
		System.out.println(guilherme.withdrawFunds(1000, false));

		System.out.println(guilherme.getBalance());

		System.out.println(guilhermeVIP.getCreditLimit());
		System.out.println(joanaVIP.getCreditLimit());
		System.out.println(carolVIP.getCreditLimit());

	}

}
