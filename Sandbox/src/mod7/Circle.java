package mod7;

import mod7.exceptions.InvalidRadiusException;

/**
 * Class description: This represents a Circle.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Circle {

	private double radius; // the radius of the circle

	/**
	 * 
	 * Initializes the newly created Circle
	 * 
	 * @param radius Radius of the circle
	 * @throws InvalidRadiusException if the radius is negative
	 */
	public Circle(double radius) throws InvalidRadiusException {
		// check to see if the radius is valid.
		if (radius < 0)
			// if not, throw a new exception
			throw new InvalidRadiusException();

		// set the radius to the new value
		this.radius = radius;
	}

}
