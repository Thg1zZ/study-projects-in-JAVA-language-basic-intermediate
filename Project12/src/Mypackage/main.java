package Mypackage;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		int produto, quant;
		Double valor, valorTotal;

		do {
			System.out.println("");


			System.out.print("\n----OPCOES ABAIXO----\n");

			System.out.println("1 -Hamburger");
			System.out.println("2 -Cheeseburger");
			System.out.println("3 -Batata-Frita");
			System.out.println("4 -MilkShake 300ml");
			System.out.println("5 -MilkShake 700ml");
			System.out.println("6 -Sair");

			System.out.print("Escolha opção:");
			produto = le.nextInt();

			valorTotal = 0.0;
			valor = 0.0;

			switch (produto) {

			case 1:
				System.out.print("Digite a Quantidade de Hamburger:");
				quant = le.nextInt();

				valor = 5.00;

				valorTotal = (Double) valor * quant;

				System.out.print("O valor total em Hamburger é " + String.format("%.2f", valorTotal));
				break;

			case 2:
				System.out.print("Digite a Quantidade de Cheeserburger:");
				quant = le.nextInt();

				valor = 3.50;

				valorTotal = (Double) valor * quant;

				System.out.print("O valor total em Cheeserburger é " + String.format("%.2f", valorTotal));
				break;

			case 3:
				System.out.print("Digite a Quantidade de Batata-Frita:");
				quant = le.nextInt();

				valor = 4.80;

				valorTotal = (Double) valor * quant;

				System.out.print("O valor total em Batata-Frita é " + String.format("%.2f", valorTotal));
				break;

			case 4:
				System.out.print("Digite a Quantidade de MilkShake 300ml:");
				quant = le.nextInt();

				valor = 11.90;

				valorTotal = (Double) valor * quant;

				System.out.print("O valor total em MilkShake 300ml é " + String.format("%.2f", valorTotal));
				break;

			case 5:
				System.out.print("Digite a Quantidade de MilkShake 700ml:");
				quant = le.nextInt();

				valor = 14.99;

				valorTotal = (Double) valor * quant;

				System.out.print("O valor total em MilkShake 700ml é " + String.format("%.2f", valorTotal));
				break;

			case 6:

				System.out.print("Saindo...\n");
				break;

			}

		} while (produto != 6);

		le.close();

	}

}
