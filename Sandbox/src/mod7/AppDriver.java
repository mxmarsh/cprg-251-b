package mod7;

import javax.swing.JOptionPane;

/**
 * Class description: A very silly little program for us to play around with
 * Exceptions.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class AppDriver {

	public static void main(String[] args) {

		try {
			doSomething();
		} catch (Exception e) {

			System.out.println("Sorry, something went wrong.");
			JOptionPane.showMessageDialog(null, "Sorry, something went wrong.");
		}

	}

	/**
	 * Another silly method to show rethrowing.
	 * 
	 * @throws Exception if doSomethingElse was provided a negative value.
	 */
	public static void doSomething() throws Exception {
		try {
			doSomethingElse(0);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			throw e; // rethrowing an existing exception
		}
	}

	/**
	 * This method may or may not throw an Exception.
	 * 
	 * @param x represents the input into the method
	 * @throws Exception if the provided value is less than zero
	 */
	public static void doSomethingElse(int x) throws Exception {
		if (x < 0)
			throw new Exception("This is really silly problem that should not have happened.");
	}

}
