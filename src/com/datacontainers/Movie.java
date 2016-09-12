package com.datacontainers;

public class Movie extends Product{
	private String productIdNumber;
	private String movieDate;
	private String name;
	private Address address;
	private String screenNumber;
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

	/**
	 * @return the productIdNumber
	 */
	public String getProductIdNumber() {
		return productIdNumber;
	}

	/**
	 * @return the movieDate
	 */
	public String getMovieDate() {
		return movieDate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

}
