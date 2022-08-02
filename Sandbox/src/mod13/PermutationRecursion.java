package mod13;

import java.util.*;

/**
 * Class description: This class demonstrates recursion with the addition of a
 * "helper" method.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */
public class PermutationRecursion {

	/**
	 * Main method to allow for testing of permutate(). Loops until user chooses to
	 * exit.
	 */
	public static void main(String[] args) {
		String input;
		Scanner keyboard;

		do {
			keyboard = new Scanner(System.in);
			System.out.println("Please enter a series of chars.");
			input = keyboard.next();
			permutate(input); // call the public-facing permutation method

			System.out.println("\nWant to try another? (y/n)");
			input = keyboard.next();

		} while (!input.toLowerCase().equals("n"));

		keyboard.close();
		System.out.println("Goodbye!");
	}

	/**
	 * Public method to display the possible permutations of a provided String
	 * 
	 * @param s A string of characters
	 */
	public static void permutate(String s) {
		char[] chars = s.toCharArray();
		System.out.println("The permutations of " + s + " are:");
		permutateHelper(chars, "");
	}

	/**
	 * A private helper method.
	 * 
	 * @param chars  The characters to be used in the permutation.
	 * @param prefix The characters already ordered.
	 * @return The finished permutation as a String.
	 */
	private static String permutateHelper(char[] chars, String prefix) {
		String result;

		// base case
		if (chars.length <= 1) {
			result = prefix + String.valueOf(chars);
			System.out.println(result);
			return result;
		}
		// recursive case
		for (int currentChar = 0; currentChar < chars.length; currentChar++) { // for each character in the string

			// swap the current element with the first element
			swap(chars, 0, currentChar);

			// now that the 1st char is in place, calculate all permutations of the rest:
			char[] subArray = Arrays.copyOfRange(chars, 1, chars.length);
			permutateHelper(subArray, prefix + chars[0]);
		}

		return null;
	}

	/**
	 * Helper method to swap two characters in an array.
	 * 
	 * @param chars  The array
	 * @param first  The first element, to be swapped with the second.
	 * @param second The second element, to be swapped with the first.
	 */
	private static void swap(char[] chars, int first, int second) {
		char temp = chars[first];
		chars[first] = chars[second];
		chars[second] = temp;
	}
}
