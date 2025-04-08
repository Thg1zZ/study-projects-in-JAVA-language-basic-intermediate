package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.println("Enter rectangle width and height");
		rectangle.width = le.nextDouble();
		rectangle.height = le.nextDouble();

		System.out.println("" + rectangle.ToString());

		System.out.println("Area :" + String.format("%.2f", rectangle.area()));
		System.out.println("Perimeter :" + String.format("%.2f", rectangle.perimeter()));
		System.out.println("Diagonal :"+ String.format("%.2f", rectangle.diagonal()));
		
		le.close();

	}

}
