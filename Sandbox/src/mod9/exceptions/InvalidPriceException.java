package mod9.exceptions;

/**
 * Class description: This is thrown if a Product has an invalid price (i.e.
 * negative price).
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class InvalidPriceException extends Exception {

	public InvalidPriceException() {
		super("Price must be greater than 0.");
	}

	public InvalidPriceException(String message) {
		super(message);
	}
}
