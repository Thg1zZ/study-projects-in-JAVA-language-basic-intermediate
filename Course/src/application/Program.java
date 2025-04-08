package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data:");
		System.out.print("Name :");
		product.name = le.nextLine();
		System.out.print("Price :");
		product.price = le.nextDouble();
		System.out.print("Quantity in Stock:");
		product.quantity = le.nextInt();

		System.out.println("Product data: " + product);

		System.out.println();

		System.out.print("Enter the number of products to added in stock:");
		int quantity = le.nextInt();
		product.addProducts(quantity);

		System.out.println("Update data:" + product);

		System.out.println();
		
		System.out.print("Enter the number of products to remove in stock:");
		quantity=le.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Update data:" + product);

		

		le.close();
	}

}
