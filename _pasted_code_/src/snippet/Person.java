package inheritance;

public class Person {
	//private members
	private String name;
	private int age;		
	//true is female
	private boolean gender;
		
	//Constructor for getting the initial values
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//Another constructor for getting more values
	public Person(String name, int age, boolean gender){
		this(name, age);
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}
