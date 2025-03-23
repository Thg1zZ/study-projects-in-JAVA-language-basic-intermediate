package Mypackage;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		int n;

		System.out.print("Quantos numeros serão digitados?");
		n = le.nextInt();

		double[] vet = new double[n];

		for (int i = 0; i < n; i++) {

			System.out.print("Valor [" + i + "]:");
			vet[i] = le.nextDouble();

		}
		
		System.out.print("VALORES DIGITADOS:");

		for (int i = 0; i < n; i++) {

			System.out.print("\n"+String.format("%.1f", vet[i]));
			

		}
		
		le.close();
	}
	
	

}
