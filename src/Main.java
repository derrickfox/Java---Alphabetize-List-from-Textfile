/*
 * Derrick Fox
 * CS 214 - Advanced Java
 * Project 3 - Alphabetize List
 * February 23, 2015
 * Java 1.8 JavaFX 2.2
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		// Declare two ArrayLists
		// The first is the hold the contents of the file
		// The second is hold each element of the list as it is being alphabetized
		ArrayList<String> words = new ArrayList<String>();		
		ArrayList<String> newWords = new ArrayList<String>();
		String filename = "Project3.txt";
		File file = new File(filename); 
		System.out.println("This is the list before the ordering...");
		
		// Try/Catch statement to ensure smooth loading of the file
		try {
			Scanner inputStream = new Scanner(file);
			while (inputStream.hasNext()){
				String data = inputStream.next();
				words.add(data);
				
			// A for-loop reads each element into the ArrayList from the file
			}
			for (int i = 0; i <= words.size() - 1; i++){
				newWords.add(words.get(i).toLowerCase());
			}
			
			// Here the alphabetizing is taking place
			java.util.Collections.sort(newWords);	
			System.out.println(words);
			System.out.println("And this is the list after it has been alphabetized...");
			System.out.println(newWords);
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File failed to open.");
		}		
	}
}
