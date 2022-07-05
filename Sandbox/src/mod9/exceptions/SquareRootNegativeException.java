package mod9.exceptions;

/**
 * 
 * Class description: the exception that is thrown when we attempt to take the
 * square root of a negative number.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */
public class SquareRootNegativeException extends Exception {

	public SquareRootNegativeException() {
		super();
	}

	public SquareRootNegativeException(String message) {
		super(message);
	}
}
