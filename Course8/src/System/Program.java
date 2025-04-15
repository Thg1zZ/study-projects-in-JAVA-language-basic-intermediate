package System;

public class Program {

	private String name;
	private String email;

	public Program(String name, String email) {

		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Name :" + name + ", email :" + email + ".";
	}

}
