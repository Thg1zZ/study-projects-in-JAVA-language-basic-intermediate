package Mypackage;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner le= new Scanner (System.in);
		
		int N;
		double soma, media;
		soma=0;
		media=0;
		
		System.out.println("Quantos numeros vai digitar?");
		N=le.nextInt();
		double[] vet= new double[N];
		
		for(int i=0; i<N; i++) {
			
			System.out.println("Digite um numero:");
			vet[i]=le.nextDouble();
			
		}
		
		System.out.print("VALORES:");
        
		for(int i=0; i<N; i++) {
			
			System.out.print(" "+vet[i]);
			
			soma=soma+vet[i];
			
		}
        
       media= soma/N;
       
       System.out.println("\nSoma:"+ String.format("%.2f", soma));
       System.out.println("MEDIA:"+String.format("%.2f", media));
       
       
       
		
		
		
		
		

	}

}
