/*
 * UC 9 : Ability to view Persons by City or State .
 */
package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		entryOptions();
	}

	// Contact to Create,update,delete method
	public static void entryOptions() {
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		while (flag == 1) {
			System.out.println(" Welcome to address book program ");
			System.out.println(" Select a choice : 1. Add 2.Edit 3.Delete 4.Search 5.View person 6.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				if (addressBook.contactList.isEmpty()) {
					System.out.println(" Address book is empty ");
					break;
				}
				addressBook.editContact();
				break;
			case 3:
				if (addressBook.contactList.isEmpty()) {
					System.out.println(" Address book is empty ");
					break;
				}
				addressBook.deleteContact();
				break;
			case 4:
				addressBook.searchByCity();
				break;
			case 5:
				if (addressBook.contactList.isEmpty()) {
					System.out.println(" Address book is empty ");
					break;
				}
				addressBook.viewPersonByCity();
				break;
			case 6:
				flag = 0;
				break;
			default:
				System.out.println(" Enter a valid choice");
				break;
			}
		}
		System.out.println(addressBook.contactList);
	}

}
