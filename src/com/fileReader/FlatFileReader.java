package com.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import com.datacontainers.Address;
import com.datacontainers.Person;
import com.datacontainers.Customer;
import com.datacontainers.Product;

public class FlatFileReader {
	
	public ArrayList<Person> readPersons() {
	Scanner sc = null;
		
		try {
			sc = new Scanner(new File("data/Persons.dat"));
			sc.nextLine(); // reads the number of records from the first line
			
			// This Person ArrayList stores the Person objects 
			ArrayList<Person> personList = new ArrayList<Person>();
			
			while(sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				String data[] = line.split(",|;"); // tokenizes the line and stores in a string array 
				
				// Stores the array elements of each line into strings
				String idNumber = data[0];
				String lastName = data[1];
				String firstName = data[2];
				String street = data[3];
				String city = data[4];
				String state = data[5];
				String postalCode = data[6];
				String country = data[7];
				ArrayList<String> emails = new ArrayList<String>();
				if (data.length > 8){
					for (int i = 8; i < data.length; i++) {
						emails.add(data[i]);
					}
				}
				
				// Creates an Address object
				Address address = new Address(street, city, state, postalCode, country);
				
				// Creates a Person object
				Person person = new Person(idNumber, lastName, firstName, address, emails);
				
				// Adds the Person object into Person ArrayList
				personList.add(person);
			}
			sc.close();
			return personList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public ArrayList<Customer> readCustomers() {
	Scanner sc = null;
		
		try {
			sc = new Scanner(new File("data/Customers.dat"));
			sc.nextLine(); // reads the number of records from the first line
			
			// This Customer ArrayList stores the Customer objects 
			ArrayList<Customer> customerList = new ArrayList<Customer>();
			
			while(sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				String data[] = line.split(",|;"); // tokenizes the line and stores in a string array 
				
				// Stores the array elements of each line into strings
				String customerIdNumber = data[0];
				String customerType = data[1];
				String personIdNumber = data[2];
				String name = data[3];
				String street = data[4];
				String city = data[5];
				String state = data[6];
				String postalCode = data[7];
				String country = data[8];

				// Creates an Address object
				Address address = new Address(street, city, state, postalCode, country);
				
				// Creates a Customer object
				Customer customer = new Customer(customerIdNumber, customerType, personIdNumber, name, address);
				
				// Adds the Customer object into Customer ArrayList
				customerList.add(customer);
			}
			sc.close();
			return customerList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}	
	}

	public ArrayList<Product> readProducts() {
	Scanner sc = null;
		
		try {
			sc = new Scanner(new File("data/Products.dat"));
			sc.nextLine(); // reads the number of records from the first line
			
			// This Person ArrayList stores the Person objects 
			ArrayList<Product> productList = new ArrayList<Product>();
			
			while(sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				String data[] = line.split(",|;"); // tokenizes the line and stores in a string array 
				
				Product product = null;
				
				if (data[1].equals("M")) {
					String productIdNumber = data[0];
					String productType = data[1];
					String movieDate = data[2];
					String name = data[3];
					String street = data[4];
					String city = data[5];
					String state = data[6];
					String postalCode = data[7];
					String country = data[8];
					String screenNumber = data[9];
					String price = data[10];
					
					// Creates an Address object
					Address address = new Address(street, city, state, postalCode, country);
					// Creates a Product object
					product = new Product(productIdNumber, productType, movieDate, name, address, screenNumber, price);
				}
				
				else if (data[1].equals("S")){
					String productIdNumber = data[0];
					String productType = data[1];
					String name = data[2];
					String startDate = data[3];
					String endDate = data[4];
					String price = data[5];
					
					//Creates a Product object
					product = new Product(productIdNumber, productType, startDate, endDate, price);
				}
				
				else if (data[1].equals("P")) {
					String productIdNumber = data[0];
					String productType = data[1];
					String price = data[2];
					
					//Creates a Product object
					product = new Product(productIdNumber, productType, price);
				}

				else if (data[1].equals("R")) {
					String productIdNumber = data[0];
					String productType = data[1];
					String name = data[2];
					String price = data[3];
					
					product = new Product(productIdNumber, productType, name, price);
				}
				
				// Adds the Person object into Person ArrayList
				productList.add(product);
			}
			sc.close();
			return productList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
}
