package mod4gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Class description: This is our implementation of a specialized JFrame.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class MyWindow extends JFrame {

	// fields:
	JButton button;

	/**
	 * Initializes the newly created MyWindow
	 */
	public MyWindow() {
		// call the superclass constructor explicitly
		// so that we can provide a title for our window:
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
		// JLabel label = new JLabel("this is a JLabel");
		// panel.add(label);

		// add a button
		button = new JButton("this is a JButton");
		panel.add(button);

		/*
		 * // create an action listener using an anonymous class: ActionListener al =
		 * new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * button.setText("clicked!"); } };
		 * 
		 * // add that listener to the button: button.addActionListener(al);
		 */

		// button.addActionListener(this); // this only works if we have a component
		// class

		button.addActionListener(new MyActionListener()); // create an instance of the inner class

		/*
		 * this will only work if we use BorderLayout: JButton buttonWest = new
		 * JButton("west"); panel.add(buttonWest, BorderLayout.WEST);
		 * 
		 * JButton buttonEast = new JButton("east"); panel.add(buttonEast,
		 * BorderLayout.EAST);
		 * 
		 * JButton buttonNorth = new JButton("north"); panel.add(buttonNorth,
		 * BorderLayout.NORTH);
		 * 
		 * JButton buttonSouth = new JButton("south"); panel.add(buttonSouth,
		 * BorderLayout.SOUTH);
		 */

		// return it
		return panel;
	}

	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// if button 1 was clicked:
			button.setText("I have been clicked!");
			// if button 2 was clicked:
			// something else
		}

	}

}
