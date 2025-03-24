package Mypackage;

import java.util.Locale; 
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner le= new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite um numeros:");
		a=le.nextInt();
		System.out.println("Digite um numeros:");
		b=le.nextInt();

		while(a!=b){
			
			
			if(a<b){
				System.out.println("Crescente");
			
			}
			else{
				
				System.out.println("Decrescente");
				
				}
			
				
			System.out.println("Digite outros dois numeros");
			
			a=le.nextInt();
			b=le.nextInt();
			
			
			
		}
		
	 le.close();
	}
}
