package Mypackage;

import java.util.Scanner;

public class Usuario{
	
	public static void main(String[] args) {
	 	Scanner le= new Scanner(System.in);	
		SmartTv smartTv=new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		
		System.out.print("Digite 1Ligar/ 2-Desligar Tv :");
		int valorTv=le.nextInt();
		if(valorTv==1) {
			
			smartTv.ligada=true;
		}
		
		
		System.out.print("Qual canal você quer?");
		int novoCanal=le.nextInt();
		
		smartTv.mudarCanal(novoCanal);
      
      
       System.out.println("TV ligada"+smartTv.ligada);
       System.out.println("Canal atual:"+smartTv.canal);
       System.out.println("Volume atual:"+smartTv.volume);
		
       
       
       le.close();
	}
}
