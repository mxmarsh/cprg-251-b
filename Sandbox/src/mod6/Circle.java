package mod6;

/**
 * Class description:  
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Circle extends Shape {

	private double radius;
	
	/**
	 * Initializes the newly created Circle
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
