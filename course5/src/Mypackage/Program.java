package Mypackage;

import java.util.Locale;
import java.util.Scanner;

import Calculo.CurrencyConverte;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		System.out.println("What is the dolar price?");
		CurrencyConverte.valueDolar = le.nextDouble();
		System.out.println("How many dollars will be bought?");
		CurrencyConverte.amountDolar = le.nextDouble();
		System.out.println("Amount to be paid in reais= " + String.format("%.2f", CurrencyConverte.convert()));

		le.close();

	}

}
