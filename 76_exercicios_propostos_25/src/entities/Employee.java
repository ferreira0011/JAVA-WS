package entities;

public class Employee {

	// Attributes object
	private Integer id;
	private String name;
	private Double salary;

	// Default builder
	public Employee() {

	}

	// Constructor with arguments
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Methods getters and setters
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
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// Method
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}

	// ToString
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
