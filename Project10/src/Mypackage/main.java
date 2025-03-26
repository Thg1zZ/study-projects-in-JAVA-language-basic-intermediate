package Mypackage;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);
		int N, quantnegativos;
		quantnegativos = 0;

		System.out.print("Qual a ordem da Matriz:");
		N = le.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				System.out.print("Elemento[" + i + "]" + "[" + j + "]");
				mat[i][j] = le.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {

					quantnegativos++;
				}
			}
		}

		System.out.println("DIAGONAL PRINCIPAL");

		for (int i = 0; i < N; i++) {

			System.out.print(" " + mat[i][i]);
		}

		System.out.println();

		System.out.print("Quantidade de Negativos=" + quantnegativos);

		le.close();

	}

}
