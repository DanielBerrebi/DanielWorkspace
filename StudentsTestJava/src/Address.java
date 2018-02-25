
public class Address {
	private int houseNum;
	private String city;
	private String street;

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address(int houseNum, String city, String street) {
		this.houseNum = houseNum;
		this.city = city;
		this.street = street;
	}

}
