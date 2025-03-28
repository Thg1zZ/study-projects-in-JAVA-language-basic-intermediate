package Mypackage;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		Double salario, aumento, Nsalario;
		int porcentagem;

		System.out.print("Digite o seu Salario atual:");
		salario = le.nextDouble();

		Nsalario = 0.0;
		aumento = 0.0;

		if (salario <= 1000.00) {
			porcentagem = 20;

			aumento = (double) (porcentagem * salario) / 100;
			Nsalario = (double) aumento + salario;

			System.out.println("Novo salario:" + String.format("%.2f", Nsalario));
			System.out.println("Aumento:" + String.format("%.2f", aumento));
			System.out.println("Porcentagem:" + porcentagem + "%");

		} else if (salario <= 3000.00) {

			porcentagem = 15;
			aumento = (double) (porcentagem * salario) / 100;
			Nsalario = (double) aumento + salario;

			System.out.println("Novo salario:" + String.format("%.2f", Nsalario));
			System.out.println("Aumento:" + String.format("%.2f", aumento));
			System.out.println("Porcentagem:" + porcentagem + "%");
		} else if (salario <= 8000.00) {

			porcentagem = 10;
			aumento = (double) (porcentagem * salario) / 100;
			Nsalario = (double) aumento + salario;

			System.out.println("Novo salario:" + String.format("%.2f", Nsalario));
			System.out.println("Aumento:" + String.format("%.2f", aumento));
			System.out.println("Porcentagem:" + porcentagem + "%");

		} else {

			porcentagem = 5;
			aumento = (double) (porcentagem * salario) / 100;
			Nsalario = (double) aumento + salario;

			System.out.println("Novo salario:" + String.format("%.2f", Nsalario));
			System.out.println("Aumento:" + String.format("%.2f", aumento));
			System.out.println("Porcentagem:" + porcentagem + "%");
		}

	}

}
