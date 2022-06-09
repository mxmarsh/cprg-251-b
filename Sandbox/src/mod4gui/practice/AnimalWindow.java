package mod4gui.practice;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * Class description: demo GUI techniques
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class AnimalWindow extends JFrame {

	// fields
	private JPanel cardPanel;
	private CardLayout cards;
	private JButton dogButton;
	private JButton catButton;
	private JButton homeFromDog;
	private JButton homeFromCat;
	ActionListener al = new MyActionListener();

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
		cardPanel.add("cat", createCatPanel());

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
		catButton = new JButton("cat");

		dogButton.addActionListener(al);
		catButton.addActionListener(al);

		panel.add(dogButton);
		panel.add(catButton);

		return panel;
	}

	private JPanel createDogPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		// create the top half:
		JPanel topPanel = new JPanel();

		// add content to top half:
		JLabel label = new JLabel("yes, dogs are best");
		topPanel.add(label);

		// add top half to the panel:
		panel.add(topPanel, BorderLayout.NORTH);

		// create the bottom half:
		JPanel bottomPanel = new JPanel();

		// add content to bottom half:
		homeFromDog = new JButton("go home");
		bottomPanel.add(homeFromDog);
		homeFromDog.addActionListener(al);

		// add bottom half to the panel:
		panel.add(bottomPanel, BorderLayout.SOUTH);

		return panel;
	}

	private JPanel createCatPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		// create the top half:
		JPanel topPanel = new JPanel();

		// add content to top half:
		JLabel label = new JLabel("I guess cats are pretty cool, too");
		topPanel.add(label);

		// add top half to the panel:
		panel.add(topPanel, BorderLayout.NORTH);

		// create the bottom half:
		JPanel bottomPanel = new JPanel();

		// add content to bottom half:
		homeFromCat = new JButton("go home");
		bottomPanel.add(homeFromCat);
		homeFromCat.addActionListener(al);

		// add bottom half to the panel:
		panel.add(bottomPanel, BorderLayout.SOUTH);

		return panel;
	}

	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == dogButton) {
				cards.show(cardPanel, "dog");
			} else if (e.getSource() == catButton) {
				cards.show(cardPanel, "cat");
			} else if (e.getSource() == homeFromDog || e.getSource() == homeFromCat) {
				cards.show(cardPanel, "home");
			}
		}
	}

}
