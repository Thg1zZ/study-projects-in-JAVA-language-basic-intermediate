package Mypackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner le= new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Primeiro valor:");
		a=le.nextInt();
		System.out.print("Segundo valor:");
		b=le.nextInt();
		System.out.print("Terceiro valor:");
		c=le.nextInt();
		
		if(a<b && a<c) {
			
			System.out.print("Menor:"+a);
			
		}else if(b<a && b<c){
			
			System.out.print("Menor:"+b);
		}else{
			
			System.out.print("Menor:"+c);
			
		}
		
      le.close();
	}

}
