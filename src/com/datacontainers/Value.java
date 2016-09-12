package com.datacontainers;

import java.util.ArrayList;

public class Value {
	//Variable names are not ordered arbitrarily.  Changes will cause the JSON file to output in the wrong order.
	private String customerIdNumber;
	private String productIdNumber;
	private String productType;	
	private String customerType;
	private String personIdNumber;
	private String lastName;
	private String firstName;
	private String movieDate;
	private String name;
	private Address address;
	private ArrayList<String> emails;
	private String startDate;
	private String endDate;
	private String screenNumber;
	private String price;
	
	//Constructors
	
	//Customer Constructor
	public Value(String customerIdNumber, String customerType, String personIdNumber, String name, Address address) {
		super();
		this.customerIdNumber = customerIdNumber;
		this.customerType = customerType;
		this.personIdNumber = personIdNumber;
		this.name = name;
		this.address = address;
			}
	
	//Movie constructor
	public Value(String productIdNumber, String productType, String movieDate, String name, Address address, String screenNumber, String price) {
		super();
		this.productIdNumber = productIdNumber;
		this.productType = productType;
		this.movieDate = movieDate;
		this.name = name;
		this.address = address;
		this.screenNumber = screenNumber; 
		this.price = price;
	}
	
	//Parking constructor
	public Value(String productIdNumber, String productType, String price) {
		this.productIdNumber = productIdNumber;
		this.productType = productType;
		this.price = price;
	}
	
	//Person Constructor (W/ Email)
	public Value(String personIdNumber, String firstName, String lastName, Address address, ArrayList<String> emails) {
		super();
		this.personIdNumber = personIdNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emails = emails;
	}
	
	//Person Constructor (No Email)
	public Value(String personIdNumber, String firstName, String lastName, Address address) {
		super();
		this.personIdNumber = personIdNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	//Refreshment constructor
	public Value(String productIdNumber, String productType, String name, String price) {
		super();
		this.productIdNumber = productIdNumber;
		this.productType = productType;
		this.name = name;
		this.price = price;
	}
	
	//Season Pass constructor
	public Value(String productIdNumber, String productType, String name, String startDate, String endDate, String price) {
		super();
		this.productIdNumber = productIdNumber;
		this.productType = productType;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
	}
	
	//Getter and Setter methods
	public Address getAddress() {
		return this.address;
	}
	
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
	
	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public ArrayList<String> getEmails () {
		return this.emails;
	}
	public void setEmails (ArrayList<String> emails) {
		this.emails = emails;
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
	
	public String getMovieDate() {
		return this.movieDate;
	}
	public void setMovieDate(String movieDate) {
		this.movieDate = movieDate;
	}
	
	public String getName () {
		return this.name;
	}
	public void setName (String name){
		this.name = name;
	}
	
	public String getPersonIdNumber () {
		return this.personIdNumber;
	}
	public void setPersonIdNumber (String personIdNumber) {
		this.personIdNumber = personIdNumber;
	}
	
	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getProductIdNumber () {
		return this.productIdNumber;
	}
	public void setProductIdNumber (String productIdNumber) {
		this.productIdNumber = productIdNumber;
	}
	
	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	

	public String getScreenNumber() {
		return this.screenNumber;
	}
	public void setScreenNumber(String screenNumber) {
		this.screenNumber = screenNumber;
	}
	
	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
}