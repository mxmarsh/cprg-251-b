package mod7.exceptions;

/**
 * Class description: Represents an invalid radius being provided.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class InvalidRadiusException extends Exception {

	/**
	 * Initializes the newly created InvalidRadiusException
	 */
	public InvalidRadiusException() {
		super("The radius cannot be negative.");
	}

}
