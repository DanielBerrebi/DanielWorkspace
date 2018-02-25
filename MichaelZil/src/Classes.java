import java.util.Scanner;

//We declare a class that holds data
//In this case, a Student with attributes like name and age
class Student{
	//class members (public by default):
	String name;
	//If a member has the private modifier
	//Other classes can't access it directly.
	private int age;
	int grade;
	String course;
	
	//Method for setting the age
	//We declare this method because age is private, hence, no one can access it from outside
	//So we declare setAge method to enable others to set our age
	public void setAge(int newAge){
		if(newAge >= 18 && newAge <= 120){
			age = newAge;
		}
	}
	
	//Again, if others can't access the private age, how can they know the age?
	//We declare a public getAge method for retrieving the age
	public int getAge(){
		return age;
	}
	
	//You can declare any method inside classes
	//Here we declare the printDetails for just printing to the console the Student details
	public void printDetails(){
		System.out.println(name + ", aged " + age + "\nlearning " + course + ", scored " + grade+"\n");
	}
}

public class Classes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Object of that class
		Student yossi = new Student();
		yossi.setAge(25);
		//yossi.age = 25;
		yossi.name = "Yossi Amsalem";
		yossi.course = "Computers";
		yossi.grade = 80;
		
		yossi.printDetails();
		
		Student rachel = new Student();
		rachel.setAge(40);
		//rachel.age = 40;
		rachel.name = "Rachel Yosifun";
		rachel.course = "Math";
		rachel.grade = 70;
		
		rachel.printDetails();
		
		int[] numbers = new int[3];
		numbers[0] = 9;
		numbers[1] = 10;
		numbers[2] = 11;
		
		
		Student s1 = yossi;
		s1.setAge(s1.getAge()+1);
		//s1.age++;
		s1.printDetails();
		
		s1 = new Student();
		s1.name = "Superman 1";
		s1.setAge(1000);
		//s1.age = 1000;
		s1.course = "Cryptonation";
		s1.grade = 100;
		
		//s1 = yossi;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Student s2;
		Student s3;
		
		Student[] students = new Student[3];
		
		students[0] = new Student();
		
	}
}
