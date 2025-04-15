package Mypackage;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class NegativosOBJ {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		System.out.println("Digite a quantidade de vet?");
		int n = le.nextInt();

		Product[] vet = new Product[n];

		for (int i = 0; i < vet.length; i++) {

			double valores = le.nextDouble();
			vet[i] = new Product(valores);

		}

		double sum = 0.0;
		for (int i = 0; i < vet.length; i++) {
			sum += vet[i].getValores();
			;

		}
		System.out.println("valor total:" + sum);

		System.out.println("VALOR NEGATIVO");
		int valornegativo = 0;
		for (int i = 0; i < vet.length; i++) {

			if (vet[i].getValores() < 0) {

				System.out.println(" " + vet[i].getValores());

			} else if (vet[i].getValores() > 0) {

				valornegativo++;

			}

		}
		if (valornegativo == n) {

			System.out.println("NÃO POSSUI VALOR NEGATIVO");

		}
		System.out.println("TODOS OS VALORES");
		for (int i = 0; i < vet.length; i++) {

			System.out.print(" " + vet[i].getValores());

		}

		le.close();

	}

}
