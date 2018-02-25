
public class Student extends Person {
	private int grade;
	private String schoolName;
	public Student(int age, String fullName, Address address, int grade, String schoolName) {
		super(age, fullName, address);
		this.grade = grade;
		this.schoolName = schoolName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public void printDetails(){
		System.out.println(getFullName()+" is "+getAge()+ " learn at "+getSchoolName()+
				"\n Address:City: "+getAddress().getCity()+" Street: "+getAddress().getStreet()+""+getAddress().getHouseNum());
	}
}
