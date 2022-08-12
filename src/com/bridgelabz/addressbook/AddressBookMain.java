/*
 * UC 2 : Ability to add a new Contact to Address Book.
 */
package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public void addContactDetails() {
		ContactsDetails contacts = new ContactsDetails();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name of persion : ");
		contacts.setFirstName(sc.next());
		System.out.println("Enter the Last name of persion : ");
		contacts.setFirstName(sc.next());
		System.out.println("Enter the Address name of persion : ");
		contacts.setAddress(sc.next());
		System.out.println("Enter the City name of persion : ");
		contacts.setCity(sc.next());
		System.out.println("Enter the State name of persion : ");
		contacts.setState(sc.next());
		System.out.println("Enter the Email of persion : ");
		contacts.setEmail(sc.next());
		System.out.println("Enter the Zip of persion : ");
		contacts.setZip(sc.nextInt());
		System.out.println("Enter the Phone Number of persion : ");
		contacts.setPhoneNumber(sc.nextLong());

		System.out.println("------------------------------------------------");
		System.out.println(contacts.toString());
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program");
		System.out.println("---------------------------------------------");

		AddressBookMain addContact = new AddressBookMain();
		addContact.addContactDetails();
	}

}
