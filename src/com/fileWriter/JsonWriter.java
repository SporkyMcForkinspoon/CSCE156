package com.fileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import com.datacontainers.Value;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonWriter {
	public void jsonValueConverter(List<Value> values, String newFileName) {
		
		//Gson gson = new Gson();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		File jsonOutput = new File(newFileName);
		
		PrintWriter jsonPrintWriter = null;
		
		try {
			jsonPrintWriter = new PrintWriter(jsonOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		for(Value aValue : values) {
			// Use toJson method to convert Person object into a String
			String productOutput = gson.toJson(aValue); 
			jsonPrintWriter.write(productOutput + "\n");
		}
	
		jsonPrintWriter.close();
	}
}