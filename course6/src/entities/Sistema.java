package entities;

public class Sistema {

	private int account;
	private String name;
	private double valueinitial;
	private double tax = 5.00;

	public Sistema(int account, String name) {
		this.account = account;
		this.name = name;
	}

	public void deposit(double deposit) {
		this.valueinitial += deposit;
	}

	public String Tostring() {

		return "Account: " + account + " ,Holder: " + this.name + ", balance: $ " + String.format("%.2f", valueinitial);
	}

	public void withdrawal(double with) {

		this.valueinitial = this.valueinitial - with - tax;

	}

}
