package Mypackage;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);

		int l, c;

		System.out.print("Quantas linhas?");
		l = le.nextInt();
		System.out.print("Quantas colunas?");
		c = le.nextInt();

		int[][] mat = new int[l][c];

		for (int i = 0; i < l; i++) {

			for (int j = 0; j < c; j++) {

				System.out.print("Elemento[" + i + "," + j + "]");
				mat[i][j] = le.nextInt();
			}
		}

		System.out.println("MATRIZ DIGITADAS:");

		for (int i = 0; i < l; i++) {

			System.out.println();

			for (int j = 0; j < c; j++) {

				System.out.print(mat[i][j] + " ");

			}
		}
     le.close();
	}

}
