package com.fileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.datacontainers.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonProductConverter {
	public JsonProductConverter(List<Product> products) {
	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	File jsonOutput = new File("data/Products.json");
	
	PrintWriter jsonPrintWriter = null;
	
	try {
		jsonPrintWriter = new PrintWriter(jsonOutput);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} 
	
	for(Product aProduct : products) {
		// Use toJson method to convert Person object into a String
		String productOutput = gson.toJson(aProduct); 
		jsonPrintWriter.write(productOutput + "\n");
	}
	
	jsonPrintWriter.close();
}
}
