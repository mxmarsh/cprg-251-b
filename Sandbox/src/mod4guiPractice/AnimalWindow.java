package mod4guiPractice;

import javax.swing.*;

/**
 * Class description:
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class AnimalWindow extends JFrame {

	public AnimalWindow() {
		// call the superclass constructor
		super("Welcome to the Pet Selector");

		// set the size
		setSize(400, 300);

		// set what happens when the window closes
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create and add panel(s)

	}

	private JPanel createHomePanel() {
		JPanel panel = new JPanel();

		// add top panel

		// add bottom panel

		return panel;
	}

	private JPanel createTopPanel() {
		JPanel panel = new JPanel();

		// label

		return panel;

	}

	private JPanel createBottomPanel() {

		JPanel panel = new JPanel();

		// 2 buttons

		return panel;

	}

}
