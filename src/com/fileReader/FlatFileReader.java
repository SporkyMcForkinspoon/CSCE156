package com.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import com.datacontainers.*;

public class FlatFileReader {
	
	public ArrayList<Value> readValues(String fileName) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File(fileName));
			sc.nextLine(); // reads the number of records from the first line
			
			// This Value ArrayList stores the Value objects 
			ArrayList<Value> valueList = new ArrayList<Value>();
			
			while(sc.hasNext()) {
				String line = sc.nextLine(); // reads each line starting from 2nd line
				String data[] = line.split(",|;"); // tokenizes the line and stores in a string array 
				
				Value value = null;
				
				if (data[1].equals("M")) { //If the data[1] is "M", prepares a movie ticket product Value.
					String productIdNumber = data[0].replaceAll("^\\s+", "").trim(); //Removes all starting and ending white space from the token before passing to the variable.
					String productType = data[1].replaceAll("^\\s+", "").trim();
					String movieDate = data[2].replaceAll("^\\s+", "").trim();
					String name = data[3].replaceAll("^\\s+", "").trim();
					String street = data[4].replaceAll("^\\s+", "").trim();
					String city = data[5].replaceAll("^\\s+", "").trim();
					String state = data[6].replaceAll("^\\s+", "").trim();
					String postalCode = data[7].replaceAll("^\\s+", "").trim();
					String country = data[8].replaceAll("^\\s+", "").trim();
					String screenNumber = data[9].replaceAll("^\\s+", "").trim();
					String price = data[10].replaceAll("^\\s+", "").trim();
					
					// Creates an Address object
					Address address = new Address(street, city, state, postalCode, country);
					// Creates a movie product type Value object
					value = new Value(productIdNumber, productType, movieDate, name, address, screenNumber, price);
				}
				
				else if (data[1].equals("P")) { // "P" is for parking pass
					String productIdNumber = data[0].replaceAll("^\\s+", "").trim();
					String productType = data[1].replaceAll("^\\s+", "").trim();
					String price = data[2].replaceAll("^\\s+", "").trim();
					
					//Creates a parking product Value object
					value = new Value(productIdNumber, productType, price);
				}
				
				else if (data[1].equals("R")) { //"R" is for refreshment
					String productIdNumber = data[0].replaceAll("^\\s+", "").trim();
					String productType = data[1].replaceAll("^\\s+", "").trim();
					String name = data[2].replaceAll("^\\s+", "").trim();
					String price = data[3].replaceAll("^\\s+", "").trim();
					
					//Creates a refreshment product Value object
					value = new Value(productIdNumber, productType, name, price);
				}
				
				else if (data[1].equals("S") && data.length == 6){ //There are two "S" product types.  This deals with season passes, which always have an array length of 6.
					String productIdNumber = data[0].replaceAll("^\\s+", "").trim();
					String productType = data[1].replaceAll("^\\s+", "").trim();
					String name = data[2].replaceAll("^\\s+", "").trim();
					String startDate = data[3].replaceAll("^\\s+", "").trim();
					String endDate = data[4].replaceAll("^\\s+", "").trim();
					String price = data[5].replaceAll("^\\s+", "").trim();
					
					//Creates a season pass product Value object
					value = new Value(productIdNumber, productType, name, startDate, endDate, price);
				}
				
				// "G" and "S" are both customer types, but "S" can also be season pass.  Students always have an array length of 9.
				else if (data[1].equals("G") || (data[1].equals("S") & data.length == 9)) {
					String customerIdNumber = data[0].replaceAll("^\\s+", "").trim();
					String customerType = data[1].replaceAll("^\\s+", "").trim();
					String personIdNumber = data[2].replaceAll("^\\s+", "").trim();
					String name = data[3].replaceAll("^\\s+", "").trim();
					String street = data[4].replaceAll("^\\s+", "").trim();
					String city = data[5].replaceAll("^\\s+", "").trim();
					String state = data[6].replaceAll("^\\s+", "").trim();
					String postalCode = data[7].replaceAll("^\\s+", "").trim();
					String country = data[8].replaceAll("^\\s+", "").trim();
					
					// Creates an Address object
					Address address = new Address(street, city, state, postalCode, country);
					
					// Creates a customer type Value object
					value = new Value(customerIdNumber, customerType, personIdNumber, name, address);
				}
				
				else {
					//Any other value for data[1] will always be a person.
					//Persons can have an arbitrary number of email addresses, including none.
					String personIdNumber = data[0].replaceAll("^\\s+", "").trim();
					String lastName = data[1].replaceAll("^\\s+", "").trim();
					String firstName = data[2].replaceAll("^\\s+", "").trim();
					String street = data[3].replaceAll("^\\s+", "").trim();
					String city = data[4].replaceAll("^\\s+", "").trim();
					String state = data[5].replaceAll("^\\s+", "").trim();
					String postalCode = data[6].replaceAll("^\\s+", "").trim();
					String country = data[7].replaceAll("^\\s+", "").trim();
					if (data.length >= 9) {
						ArrayList<String> emails = new ArrayList<String>();
						for (int i = 8; i < data.length; i++) {
							emails.add(data[i].replaceAll("^\\s+", ""));
						}
						
						// Creates an Address object
						Address address = new Address(street, city, state, postalCode, country);
						
						// Creates a person type Value object (w/ email)
						value = new Value(personIdNumber, lastName, firstName, address, emails);
					}
					else {
						// Creates an Address object
						Address address = new Address(street, city, state, postalCode, country);
						//Creates a person type Value object (w/o email)
						value = new Value (personIdNumber, lastName, firstName, address);
					}
				}
				valueList.add(value); //Used at the end of the while loop, rather than at the end of each if statement.
			}
			sc.close();
			return valueList;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}	
	}
}