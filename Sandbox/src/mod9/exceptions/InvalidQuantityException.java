package mod9.exceptions;

/**
 * Class description: This is thrown if a negative or decimal quantity is
 * provided.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class InvalidQuantityException extends Exception {

	public InvalidQuantityException() {
		super("Quantity must a positive whole number.");
	}

	public InvalidQuantityException(String message) {
		super(message);
	}

}
