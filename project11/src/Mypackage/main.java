package Mypackage;

import java.util.Locale; 
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner le= new Scanner (System.in);
		
		String nome;
		Double Vhora, salario;
		int horasT;
		
		
		
		System.out.print("Digite o nome:");
		nome=le.nextLine();
		
		System.out.print("Digite o valor por hora:");
		Vhora=le.nextDouble();
		
		System.out.print("Digite horas Trabalhadas:");
		horasT=le.nextInt();
		
		salario=0.0;
		
			salario=(Double)Vhora*horasT;
		
		
		System.out.print("O pagamento para "+nome+" deve ser "+(String.format("%.2f", salario)));
		
		le.close();
		

	}

}
