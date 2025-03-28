package Mypackage;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);

		int x, y;

		System.out.println("Digite o valor um:");
		y = le.nextInt();
		System.out.println("Digite o valor dois");
		x = le.nextInt();

		if (x % y == 0 || y % x == 0) {

			System.out.println("São multiplos.");

		} else {

			System.out.println("Não são multiplos.");
		}

	}

}
