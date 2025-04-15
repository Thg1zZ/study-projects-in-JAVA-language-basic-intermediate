package course9array;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.funcprogram;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);

		List<funcprogram> list = new ArrayList<>();

		System.out.println("How many employees will be registered?");
		int quantregist = le.nextInt();

		for (int i = 0; i < quantregist; i++) {

			System.out.println("Employed #" + (i + 1) + ":");
			System.out.print("Id:");
			Integer id = le.nextInt();

			System.out.print("Name:");
			le.nextLine();
			String name = le.nextLine();

			System.out.print("Salary:");
			Double salary = le.nextDouble();
			funcprogram func = new funcprogram(id, name, salary);

			list.add(func);

		}

		System.out.println("Enter the employee id that will have salary increase");
		int idsalary = le.nextInt();
	
		
		
		funcprogram func= list.stream().filter(x ->x.getId().equals(idsalary)).findFirst().orElse(null);
		
		if(func==null) {
			System.out.println("This does not exist!");
			
		}else {
			
			System.out.println("Enter de percentage:");
			double percentage=le.nextDouble();
			func.IncreaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List of employes: ");
			
			for(funcprogram e : list) {
				
				 System.out.println(e.toString());
			}
				
			

		le.close();
	}
	}


