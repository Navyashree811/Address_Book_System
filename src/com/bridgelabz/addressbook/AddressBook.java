package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	static List<ContactsDetails> contactList = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static Scanner sc1 = new Scanner(System.in);

	// method for adding contacts
	public static void addContact() {
		System.out.println(" Enter your first name : ");
		String firstName = sc.nextLine();
		// No duplicate entries Allow
		for (int index = 0; index < contactList.size(); index++) {
			if (firstName.equals(contactList.get(index).getfirstName())) {
				System.out.println(firstName + " : name already exists ");
				AddressBookMain.entryOptions();
			}
		}
		System.out.println(" Enter your last name : ");
		String lastName = sc1.nextLine();
		System.out.println(" Enter your city name : ");
		
		String city = input.nextLine();
		System.out.println("Enter your state  : ");
		String state = input.nextLine();
		System.out.println(" Enter your zip code : ");
		long zip = input.nextLong();
		System.out.println(" Enter your phone number : ");
		long phoneNumber = input.nextLong();
		System.out.println(" Enter your email : ");
		String email = sc.nextLine();

		ContactsDetails addressBook = new ContactsDetails(firstName, lastName, email, city, state, phoneNumber, zip);
		contactList.add(addressBook);
		System.out.println("******************************************");
		System.out.println(addressBook.toString());
	}

// method for editing existing contact
	public void editContact() {
		Scanner nameInput = new Scanner(System.in);
		System.out.println(" Enter the first name ");
		String fName = nameInput.nextLine();
		for (int index = 0; index < contactList.size(); index++) {
			if (contactList.get(index).getfirstName().equals(fName)) {
				contactList.remove(index);
				AddressBook addressBook = new AddressBook();
				addressBook.addContact();
			} else {
				System.out.println(" There is no contact ");
			}
		}
	}

	public void deleteContact() {
		Scanner deleteNameInput = new Scanner(System.in);
		String deleteFirstName = deleteNameInput.nextLine();
		for (int increment = 0; increment < contactList.size(); increment++) {
			if (contactList.get(increment).getfirstName().equals(deleteFirstName)) {
				contactList.remove(increment);
			} else {
				System.out.println(" Name does not exist");
			}
		}
	}

}
