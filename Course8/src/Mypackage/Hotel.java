package Mypackage;

import java.util.Locale;
import java.util.Scanner;

import System.Program;

public class Hotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		System.out.println("How many rooms will be rented?");
		int n = le.nextInt();

		Program[] vect = new Program[10];

		for (int i = 1; i <= n; i++) {

			System.out.println("Rent #" + i + ":");
			System.out.println("Name:");
			le.nextLine();
			String name = le.nextLine();
			System.out.println("Email:");
			String email = le.nextLine();
			System.out.println("Room:");
			int room = le.nextInt();

			vect[room] = new Program(name, email);

		}
            System.out.println();
            System.out.println("BUSY ROOMS:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null)

				System.out.println(i + " : " + vect[i].toString());
		}

		le.close();
	}

}
