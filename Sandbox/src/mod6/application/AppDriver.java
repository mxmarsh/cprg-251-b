package mod6.application;

import mod6.contracts.InputOutput;
import mod6.drivers.JOptionPaneDriver;

/**
 * Class description: Entry point for our program
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class AppDriver {

	public static void main(String[] args) {
		// create a driver object
		// InputOutput io = new ScannerDriver();
		InputOutput io = new JOptionPaneDriver();

		// call prompt() to get the user's name
		String name = io.prompt("What is your name?");

		// call display() to greet them.
		io.display("Hello, " + name + "!");

	}

}
