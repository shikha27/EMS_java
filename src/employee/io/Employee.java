package employee.io;

public class Employee {

	private long id;
	private String name;
	private double salary;
	private static int count = 0;

	// public Employee(long id2, String name2, Double salary2){}
	public Employee(String name, double salary) {
		this.id = ++count;
		this.name = name;
		this.salary = salary;

	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
