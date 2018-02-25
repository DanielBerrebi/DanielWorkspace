package Inheritance;

public class Employee extends Person {
		
	//private members
	private int salary;
	private int totalWorkingHours;
	
	//Constructor for getting initial values
	public Employee(String name, int age){
		//
		super(name, age);
	}
	
	//Constructor for getting more initial values
	public Employee(String name, int age, boolean gender, int salary, int totalHours){
		super(name, age, gender);
		this.salary = salary;
		this.totalWorkingHours = totalHours;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getTotalWorkingHours() {
		return totalWorkingHours;
	}

	public void setTotalWorkingHours(int totalWorkingHours) {
		this.totalWorkingHours = totalWorkingHours;
	}
}
