package mod6.contracts;

/**
 * Class description: Our interface for some i/o functionality.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public interface InputOutput {

	/**
	 * Display some text.
	 * 
	 * @param text The text to be displayed.
	 */
	public void display(String text);

	/**
	 * Prompts the user for input.
	 * 
	 * @param text The prompt the user will see.
	 * @return The user input.
	 */
	public String prompt(String text);

}
