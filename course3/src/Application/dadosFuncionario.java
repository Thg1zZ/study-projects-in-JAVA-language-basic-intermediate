package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Sistem;

public class dadosFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		Sistem sistem = new Sistem();

		System.out.print("Name:");
		sistem.name = le.nextLine();
		System.out.print("Gross Salary:");
		sistem.grossSalary = le.nextDouble();

		System.out.print("Tax:");
		sistem.tax = le.nextDouble();

		System.out.println("Employee: " + sistem.name + ", $ " + String.format("%.2f", sistem.NetSalary()));

		System.out.println("Which percentage to increase salary?");
		sistem.increaseSalary(le.nextDouble());

		le.close();
	}

}
