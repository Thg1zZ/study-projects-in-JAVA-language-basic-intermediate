package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Sistema;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		System.out.println("Enter account number:");
		int account = le.nextInt();
		le.nextLine();

		System.out.print("Enter account holder:");
		String name = le.nextLine();

		Sistema base = new Sistema(account, name);

		System.out.print("Is there na initial deposit:(y/n)?");
		String yesno = le.nextLine();

		if (yesno.equalsIgnoreCase("y")) {

			System.out.print("Enter initial deposit value:");

			base.deposit(le.nextDouble());

		}
        System.out.println();
		System.out.println("Account data:");
		System.out.print(base.Tostring());

		System.out.println();

		System.out.print("Enter a deposit value:");
		base.deposit(le.nextDouble());
		
		System.out.println();

		System.out.println("Update data:");
		System.out.print(base.Tostring());

		System.out.println();
		System.out.println("remembering that every withdrawal you pay a fee of $5.00");
		System.out.print("Enter Withdraw value :");
		base.withdrawal(le.nextDouble());
		
		System.out.println("withdrawing the money");

		System.out.println("Update account data:");
		System.out.println("" + base.Tostring());

		le.close();
	}

}
