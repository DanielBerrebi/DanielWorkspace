
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address(20,"Netanya","Harzit");
		Student moti=new Student(22, "Moti Malol", address, 90, "Ort Guttman");
		Student daniel=new Student(22, "Daniel Berrebi", address, 86, "Beni Abi");
		daniel.printDetails();
		moti.printDetails();
		System.out.println("Changing address now");
		address.setCity("yavna");
		address.setHouseNum(45);
		address.setStreet("Rehov");
		daniel.printDetails();
		moti.printDetails();
	}

}
