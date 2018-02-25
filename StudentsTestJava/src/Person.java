
public class Person {
	private int age;
	private String fullName;
	private Address address;
	public Person(int age, String fullName, Address address) {
		this.age = age;
		this.fullName = fullName;
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
