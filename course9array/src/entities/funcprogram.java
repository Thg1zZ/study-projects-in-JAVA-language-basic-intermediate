package entities;

public class funcprogram {
	
	private Integer id; 
	private String name;
	private Double Salary;
	
	public funcprogram () {
		
		
	};
	
	public funcprogram(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return Salary;
	}


	public void setSalary(Double salary) {
		Salary = salary;
	}

	
	
	public void IncreaseSalary(Double percentage) {
		
		Salary += Salary*percentage /100.0;
		
	}

	@Override
	public String toString() {
		return ""+ id + ", " + name + ", "+ String.format("%.2f", Salary);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
