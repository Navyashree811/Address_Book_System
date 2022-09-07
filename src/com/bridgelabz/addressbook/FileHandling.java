package com.bridgelabz.addressbook;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class FileHandling {
	public void createFile() {
		try {
			File myObj = new File("AddressBook.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public void writeContactToFile(Map<String, AddressBook> addressBookSystem) {

		StringBuffer contactBuffer = new StringBuffer();
		for (String keyName : addressBookSystem.keySet()) {

			AddressBook addrBookObj = addressBookSystem.get(keyName);
			contactBuffer.append("Contact Details 	:\n");
			contactBuffer.append("Address Book Name :" + keyName + "\n");
			addrBookObj.getContacts().forEach((contact) -> {
				String contactString = ("FirstName :" + contact.getFirstName().toString().concat(", "));
				contactString += ("LastName	:" + contact.getLastName().toString().concat(", "));
				contactString += ("Address	:" + contact.getAddress().toString().concat(", "));
				contactString += ("City	:" + contact.getCity().toString().concat(", "));
				contactString += ("State :" + contact.getState().toString().concat(", "));
				contactString += ("PhoneNumber :" + String.valueOf(contact.getPhoneNumber()).concat(", "));
				contactString += ("Email :" + contact.getEmail().toString().concat(", "));
				contactString += ("Zip	:" + String.valueOf(contact.getZip()).concat("\n"));
				contactBuffer.append(" " + contactString);
			});
		}
		try {

			Files.write(Paths.get("AddressBook.txt"), contactBuffer.toString().getBytes());
			System.out.print("\nDetails written into file");
		} catch (IOException e) {
			System.out.print("Unable to write contact into file" + e.getMessage());
		}
	}

}
