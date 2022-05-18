package SampleSnippets;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class description: A quick demo of how to randomly shuffle the contents of a
 * ListArray.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Shuffling {

	public static void main(String[] args) {
		/* initialize an array of words: */
		ArrayList<String> words = new ArrayList<>();

		words.add("apple");
		words.add("banana");
		words.add("coconut");

		/* print out the array */
		display(words);

		/* shuffle the array */
		Collections.shuffle(words);
		System.out.println("every day I'm shufflin'\n");

		/* print it out again */
		display(words);

	}

	public static void display(ArrayList<String> myArray) {

		System.out.print("ArrayList: ");
		for (String e : myArray) {
			System.out.print(e + ". ");
		}
		System.out.println("\n");
	}

}
