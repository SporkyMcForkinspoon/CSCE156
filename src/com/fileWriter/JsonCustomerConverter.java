package com.fileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.datacontainers.Customer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonCustomerConverter {

	public JsonCustomerConverter(List<Customer> customers) {
	
	//Gson gson = new Gson();
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	File jsonOutput = new File("data/Customers.json");
	
	PrintWriter jsonPrintWriter = null;
	
	try {
		jsonPrintWriter = new PrintWriter(jsonOutput);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} 
	
	for(Customer aCustomer : customers) {
		// Use toJson method to convert Person object into a String
		String customerOutput = gson.toJson(aCustomer); 
		jsonPrintWriter.write(customerOutput + "\n");
	}
	
	jsonPrintWriter.close();
}
}
