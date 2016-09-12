package com.reports;

import java.util.List;
import com.datacontainers.*;
import com.fileReader.FlatFileReader;
import com.fileWriter.JsonCustomerConverter;
import com.fileWriter.JsonPersonConverter;
import com.fileWriter.JsonProductConverter;


public class DataConverter {

	public static void main(String[] args) {
		
		// Create a FlatFileReader object
		FlatFileReader fr = new FlatFileReader();
		
		/* fr Reads data from the flat file;
		 * Creates Person objects; and
		 * Stores Person objects in a Person ArrayList
		 */
		List<Person> personList = fr.readPersons();
		List<Customer> customerList = fr.readCustomers();
		List<Product> productList = fr.readProducts();
		
		new JsonPersonConverter(personList); // data/person.json
		new JsonCustomerConverter(customerList); // data/customer.json
		new JsonProductConverter(productList); // data/product.json
		
		
	}
}