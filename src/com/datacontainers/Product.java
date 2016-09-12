package com.datacontainers;

public class Product {
	private String productIdNumber;
	private String productType;
	private String name;
	private String movieDate;
	private String startDate;
	private String endDate;
	private String screenNumber;
	private Address address;
	private String price;
	
	//Constructors
	
	//Movie constructor
	public Product(String productIdNumber, String productType, String movieDate, String name, Address address, String screenNumber, String price) {
		super();
		this.productIdNumber = productIdNumber;
		this.productType = productType;
		this.movieDate = movieDate;
		this.name = name;
		this.address = address;
		this.screenNumber = screenNumber; 
		this.price = price;
	}
	
	//Season Pass constructor
	public Product(String productIdNumber, String productType, String startDate, String endDate, String price) {
		super();
		this.productIdNumber = productIdNumber;
		this.productType = productType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
	}
	
	//Parking constructor
	public Product(String productIdNumber, String productType, String price) {
		this.productIdNumber = productIdNumber;
		this.productType = productType;
		this.price = price;
	}
	
	//Refreshment constructor
	public Product(String productIdNumber, String productType, String name, String price) {
		super();
		this.productIdNumber = productIdNumber;
		this.productType = productType;
		this.name = name;
		this.price = price;
	}
	
	//Getter and Setter methods
	public String getProductIdNumber () {
		return this.productIdNumber;
	}
	public void setProductIdNumber (String productIdNumber) {
		this.productIdNumber = productIdNumber;
	}
	
	public String getpProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public String getName () {
		return this.name;
	}
	public void setName (String name){
		this.name = name;
	}
	
	public String getMovieDate() {
		return this.movieDate;
	}
	public void setMovieDate(String movieDate) {
		this.movieDate = movieDate;
	}
	
	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getScreenNumber() {
		return this.screenNumber;
	}
	public void setScreenNumber(String screenNumber) {
		this.screenNumber = screenNumber;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}