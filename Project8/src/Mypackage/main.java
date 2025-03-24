package Mypackage;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner le= new Scanner(System.in);
		int x,y, soma, troca;
		troca=0;
		
		System.out.print("Digite dois numeros:");
		x=le.nextInt();
		y=le.nextInt();
		
	  if(x>y){
			troca=x;
			x=y;
			y=troca;
		}
	  
	   soma=0;
		for(int i= x+1; i<y; i++){
		        if(i % 2!=0){
		        soma= soma+i ;
		        }
		      }
		
		System.out.println("SOMA DOS IMPARES:"+soma);
		
		le.close();
	}

}
