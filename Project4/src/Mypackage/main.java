package Mypackage;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner le= new Scanner(System.in);
		
		double b,a, area,p,d;
		
		System.out.print("Digite a BASE do Retangulo:");
		b=le.nextDouble();
		
		System.out.print("Digite a ALTURA do Retangulo:");
		a=le.nextDouble();
		
		area=b*a;
		p=2*(b+a);
		d=Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
		
		System.out.println("Area:"+String.format("%.3f", area));
		System.out.println("Perimetro:"+String.format("%.3f", p));
		System.out.println("Diagonal:"+String.format("%.4f", d));
		
		
		
		le.close();
		
		

	}

}
