package mod4gui;

import javax.swing.*;

/**
 * Class description: This is our implementation of a specialized JFrame.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class MyWindow extends JFrame {

	/**
	 * Initializes the newly created MyWindow
	 */
	public MyWindow() {
		// call the superclass constructor
		super("hey we created a window");

		// set the size of the window
		setSize(500, 200); // first parameter is width, second is height

		// when we close the window, terminate the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a new panel
		JPanel panel = createPanel();

		// add the new panel to our frame
		add(panel);
	}

	private JPanel createPanel() {

		// create a new panel:
		JPanel panel = new JPanel();

		// add some text
		JLabel label = new JLabel("this is a JLabel");
		panel.add(label);

		// add a button
		JButton button = new JButton("this is a JButton");
		panel.add(button);

		// return it
		return panel;
	}

}
