package com.bridgelabz.addressbook;

public class ContactsDetails {

	private String firstName, lastName, city, state, email;
	private long zip, phoneNumber;

	ContactsDetails(String firstName, String lastName, String email, String city, String state, long phoneNumber,
			long zip) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstname(String firstName) {
		this.firstName = firstName;
	}

	public String getlastname() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhonenumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact details:" + "\n" + "FirstName=" + firstName + "\n" + "LastName=" + lastName + "\n" + "City="
				+ city + "\n" + "State=" + state + "\n" + "Zip=" + zip + "\n" + "PhoneNumber=" + phoneNumber + "\n"
				+ "Email=" + email;

	}

}
