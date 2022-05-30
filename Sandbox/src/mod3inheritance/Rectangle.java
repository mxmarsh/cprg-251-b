package mod3inheritance;

/**
 * Class description: Represents a Rectangle object.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Rectangle extends Shape {

	// fields:
	private double width;
	private double height;

	// methods:

	public Rectangle() {
		// super();
		System.out.println("Rectangle() constructor is running.");

	}

	public Rectangle(String color) {
		super(color);
		System.out.println("Rectangle() constructor is running.");
	}

	public Rectangle(double height, double width) {

		this.height = height;
		this.width = width;
	}

	/**
	 * Getter method for width
	 * 
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Getter method for height
	 * 
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Accessor method to get the area of the triangle.
	 * 
	 * @return Area of the rectangle.
	 */
	public double getArea() {
		return width * height;
	}
}
