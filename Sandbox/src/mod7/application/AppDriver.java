package mod7.application;

import java.util.Scanner;

import mod7.exceptions.InvalidRadiusException;
import mod7.problemdomain.Circle;

public class AppDriver {

	public static void main(String[] args) {
		// prompt the user for a radius
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the radius of the circle:");
		double radius = keyboard.nextDouble();

		// create a new Circle using the provided radius
		try {
			Circle circle = new Circle(radius);
			// the next line will only run if the previous line did NOT throw an exception
			System.out.println("Your Circle has been created. Congratulations.");
		} catch (InvalidRadiusException e) {
			System.out.println(e.getMessage());
		} finally {
			keyboard.close();
		}

	}

}
