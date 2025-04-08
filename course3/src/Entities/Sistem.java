package Entities;

public class Sistem {

	public String name;
	public double grossSalary;
	public double tax;

	public double NetSalary() {

		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {

		grossSalary += grossSalary * percentage / 100.0;

		System.out.println("Update data:" + name + ",$ " + grossSalary);

	}

}
