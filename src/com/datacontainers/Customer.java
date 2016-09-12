package com.datacontainers;

public class Customer {
	private String customerIdNumber;
	private String customerType;
	private String personIdNumber;
	private String name;
	private Address address;
	
	//Constructor
	public Customer(String customerIdNumber, String customerType, String personIdNumber, String name, Address address) {
		super();
		this.customerIdNumber = customerIdNumber;
		this.customerType = customerType;
		this.personIdNumber = personIdNumber;
		this.name = name;
		this.address = address;
			}
	
	//Getter and Setter methods
	public String getCustomerIdNumber () {
		return this.customerIdNumber;
	}
	public void setCustomerIdNumber (String customerIdNumber) {
		this.customerIdNumber = customerIdNumber;
	}
	
	public String getCustomerType() {
		return this.customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	
	public String getPersonIdNumber () {
		return this.personIdNumber;
	}
	public void setPersonIdNumber (String personIdNumber){
		this.personIdNumber = personIdNumber;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return this.address;
	}
}