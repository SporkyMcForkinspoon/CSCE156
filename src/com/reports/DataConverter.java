package com.reports;

import java.io.File;
import java.util.List;
import com.datacontainers.Value;
import com.fileReader.FlatFileReader;
import com.fileWriter.JsonWriter;

public class DataConverter {

	public static void main(String[] args) {
		
		/*Iterates through an arbitrary number of filenames, if a file is not found,
		 * or is of the wrong filetype, outputs text to that effect, and moves on to
		 * the next.
		 */
		for (int i = 0; i < args.length; i++){
			
			File newFile = new File (args[i]);
			
			 if (newFile.exists()) { //Checks that the specified file exists, error output code is at the end of the block.
				 
					if ((!args[i].substring(args[i].length() - 4, args[i].length()).equals(".dat"))
						&& !args[i].substring(args[i].length() - 4,  args[i].length()).equals(".csv")
						&& !args[i].substring(args[i].length() - 4,  args[i].length()).equals(".txt")) 
					{ //Checks for file type, with three common text file types accepted.
						System.out.println ("Error on file " + args[i] +": Input file must be .dat, .csv, or .txt.");
						}
					
					
					else {
						StringBuilder sb = new StringBuilder(); //Creates a new filename that will eventually be used for the new JSON file.  Assumes the users wants filename.json.
						sb.append(args[i].substring(0, args[i].length() - 3));
						sb.append("json");
						String newFileName = sb.toString();
				
						// Creates an AgnosticFileReader object
						FlatFileReader fr = new FlatFileReader();
				
						/* fr Reads data from the flat file;
						 * Creates Value objects; and
						 * Stores Value objects in a Value ArrayList
						 */
						List<Value> valueList = fr.readValues(args[i]);
						
						// Write Person ArrayList into a Json file
						JsonWriter valueWriter = new JsonWriter();
						valueWriter.jsonValueConverter(valueList, newFileName);
					}
			 }
			else {
				System.out.println("Error on file " + args[i] + ": File does not exist.");
			}
		}
	}
}