package mypackage;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0, y = 0;

		System.out.print("Quantas pessoas serão digitadas?");
		x = sc.nextInt();

		sc.nextLine();

		String[] nome1 = new String[x];
		String[] sexo = new String[x];
		Double[] salario1 = new Double[x];

		for (int i = 0; i < x; i++) {
			System.out.print("Digite o nome da pessoa " + (i + 1) + ":");
			nome1[i] = sc.nextLine();

			System.out.print("Digite o salario Recebido do " + (i + 1) + ":");
			salario1[i] = sc.nextDouble();

			System.out.print("Digite o Sexo da pessoa " + (i + 1) + ":");
			sc.nextLine();
			sexo[i] = sc.nextLine();

		}

		System.out.print("Quer ver a informação de qual pessoa de 1 até " + (x) + ":");
		y = sc.nextInt();

		boolean encontrado = false;

		for (int i = 0; i < x; i++) {
			if (i == y - 1) {

				System.out.println("O nome " + nome1[i] + " do sexo " + sexo[i] + " Recebe: "
						+ String.format("%.2f", salario1[i]));

				encontrado = true;

				break;
			}

		}
		 if (!encontrado) {

			System.out.println("Numero invalido!");
		}

		sc.close();

	}

}
