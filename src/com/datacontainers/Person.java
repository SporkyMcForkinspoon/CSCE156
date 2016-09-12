package com.datacontainers;

import java.util.ArrayList;

public class Person {
	
	private String idNumber;
	private String firstName;
	private String lastName;
	private Address address; // Person class owns Address class as a field
	private ArrayList<String> emails;
	
	// Constructor
	public Person(String idNumber, String firstName, String lastName, Address address, ArrayList<String> emails) {
		super();
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emails = emails;
	}
	
	// Getter and Setter methods
	public String getIdNumber () {
		return this.idNumber;
	}
	
	public void setIdNumber (String idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public ArrayList<String> getEmails () {
		return this.emails;
	}
	
	public void setEmails (ArrayList<String> emails) {
		this.emails = emails;
	}

}
