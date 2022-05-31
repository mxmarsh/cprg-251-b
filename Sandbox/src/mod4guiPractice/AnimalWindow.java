package mod4guiPractice;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * Class description:
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class AnimalWindow extends JFrame {

	// fields
	private JPanel cardPanel;
	private CardLayout cards;
	private JButton dogButton;

	public AnimalWindow() {
		// call the superclass constructor
		super("Welcome to the Pet Selector");

		// set the size
		this.setSize(400, 100);

		// set what happens when the window closes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a panel that represents all of the content
		cardPanel = new JPanel();

		// apply the card layout to that panel
		cards = new CardLayout();
		cardPanel.setLayout(cards);

		// add specific panels to each card
		cardPanel.add("home", createHomePanel());
		cardPanel.add("dog", createDogPanel());

		// pick which card to show
		cards.show(cardPanel, "home");

		// finally, add the panel to the frame
		this.add(cardPanel);

	}

	private JPanel createHomePanel() {
		JPanel panel = new JPanel();

		// change the layout:
		panel.setLayout(new BorderLayout());

		// add top panel
		JPanel topPanel = createTopPanel();
		panel.add(topPanel);

		// add bottom panel
		// panel.add(createBottomPanel(), BorderLayout.SOUTH);
		JPanel bottomPanel = createBottomPanel();
		panel.add(bottomPanel, BorderLayout.SOUTH);

		return panel;
	}

	private JPanel createTopPanel() {
		JPanel panel = new JPanel();

		JLabel label = new JLabel("which is best?");
		panel.add(label);

		return panel;

	}

	private JPanel createBottomPanel() {

		JPanel panel = new JPanel();

		dogButton = new JButton("dog");
		JButton catButton = new JButton("cat");

		dogButton.addActionListener(new MyActionListener());

		panel.add(dogButton);
		panel.add(catButton);

		return panel;

	}

	private JPanel createDogPanel() {
		JPanel panel = new JPanel();

		JLabel label = new JLabel("yes, dogs are best");
		panel.add(label);

		return panel;
	}

	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == dogButton) {
				cards.show(cardPanel, "dog");
			}

		}
	}

	/*
	 * 1. attach a listener to the cat button 2. create a cat card 3. add buttons to
	 * each of the dog and cat cards that send us back home
	 */
}
