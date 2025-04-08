package Application;

import java.util.Locale;
import java.util.Scanner;

import system.Sistema;

public class Alunos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le= new Scanner (System.in);
		Sistema sistem= new Sistema();
		
		System.out.print("Digite o nome:");
		sistem.nome=le.nextLine();		
		System.out.print("Digite o primeiro valor:");
		sistem.grade1=le.nextDouble();
		System.out.print("Digite o segundo valor:");
		sistem.grade2=le.nextDouble();
		System.out.print("Digite o terceiro valor:");
		sistem.grade3=le.nextDouble();
		
		
		if(sistem.finalGrade()>60) {
			System.out.println("Final Grade: "+String.format("%.2f", sistem.finalGrade()));
			System.out.println("PASS");
			
			
			
		}else {
			System.out.println("Final Grade: "+String.format("%.2f", sistem.finalGrade()));
			
			System.out.println("Failed");
			System.out.println("MISSING:"+String.format("%.2f",sistem.missingPoints())+" POINTS");
		}
		
		
            le.close();
	}

}
