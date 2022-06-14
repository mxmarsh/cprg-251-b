package mod7exceptions;

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

	public static void doSomething() throws Exception {
		try {
			doSomethingElse(0);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			throw e; // rethrowing an existing exception
		}
	}

	public static void doSomethingElse(int x) throws Exception {
		if (x < 0)
			throw new Exception("This is really silly problem that should not have happened.");
	}

}
