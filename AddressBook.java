package com.bridgelabzz.AddressBookk;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AddressBook {
	private static final Logger LOG = LogManager.getLogger("App.class");

	public static void main(String[] args) {
		LOG.info("Wecome to address Book Program");
		Scanner value = new Scanner(System.in);
		int PhoneNumber;
		String Address, FirstName, lastName;
		LOG.info("Enter the first name");
		FirstName = value.nextLine();
		LOG.info("Enter the last name");
		lastName = value.nextLine();
		LOG.info("Enter the Address name");
		Address = value.nextLine();
		LOG.info("Enter the phone number");
		PhoneNumber = value.nextInt();
		LOG.info("FistName" + FirstName);
		LOG.info("LastName" + lastName);
		LOG.info("Address" + Address);
		LOG.info("PhoneNumber" + PhoneNumber);
	}
}
