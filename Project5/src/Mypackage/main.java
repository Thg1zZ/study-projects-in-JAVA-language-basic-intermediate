package Mypackage;

import java.util.Locale; 
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		String nomes1, nomes2;
		int idade1, idade2;
		double media;

		System.out.println("DADOS DA PRIMEIRA PESSOA\n");
		System.out.print("Digite o primeiro nome:");
		nomes1 = le.nextLine();
		System.out.print("Digite idade:");
		idade1 = le.nextInt();
		le.nextLine();

		System.out.println("DADOS DA SEGUNDA PESSOA\n");
		System.out.print("Digite o segundo nome:");
		nomes2 = le.nextLine();
		System.out.print("Digite idade:");
		idade2 = le.nextInt();

		media = (double) (idade1 + idade2) / 2;

		System.out.println(
				"A idade media de " + nomes1 + " e " + nomes2 + " eh de " + String.format("%.1f", media) + " anos.");
		le.close();
	}

}
