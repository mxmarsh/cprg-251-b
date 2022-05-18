package samples;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class description: A quick demo of how to read from and write to a file. We
 * will write before reading, so this can be run even if you don't have anything
 * in your resources folder.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class FileIO {

	public static void main(String[] args) throws FileNotFoundException {
		/* initialize an array of words: */
		ArrayList<String> words = new ArrayList<>();

		words.add("apple");
		words.add("banana");
		words.add("coconut");

		/* write these words to a file, one per line */
		try {
			writeToFile(words);
		} catch (IOException e) {
			System.out.println("error writing to file");
		}

		/* read words from a file */
		try {
			readFromFile(words);
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
	} // end of method

	public static void readFromFile(ArrayList<String> myArray) throws FileNotFoundException {
		// create an object to represent the file we're reading from:
		File f = new File("res/test.txt");

		// create a Scanner object to get input from the File
		Scanner fileReader = new Scanner(f);

		System.out.println("Reading from file...");

		// loop through, reading each word
		while (fileReader.hasNext()) {
			String line = fileReader.nextLine();
			System.out.println("Word read: " + line);
			myArray.add(line);
		} // end of while loop

		System.out.println("File has been read.\n");

		// close the Scanner
		fileReader.close();

	} // end of method

	public static void writeToFile(ArrayList<String> myArray) throws IOException {
		// create an object to represent the file we're writing to
		FileWriter f = new FileWriter("res/test.txt");

		// create a PrintWriter object to print output to the file
		PrintWriter writer = new PrintWriter(f);

		System.out.println("Writing to file...");

		// print to the file, line-by-line
		for (String word : myArray) {
			writer.println(word);
			System.out.println(word + " written to file");
		} // end for loop

		System.out.println("File write complete.\n");

		// close the PrintWriter stream
		writer.close();

	} // end of method

} // end of class
