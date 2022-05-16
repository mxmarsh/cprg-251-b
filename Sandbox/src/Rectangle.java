/**
 * This class represents a Rectangle object.
 * 
 * @author dana (dana.marsh@sait.ca)
 * @author moose (moral support)
 * 
 * @version 1.0
 */
public class Rectangle {

	// instance fields:

	/**
	 * This represents the width of the Rectangle
	 */
	private double width;
	private double height;

	// constructors:
	public Rectangle() {
		System.out.println("creating a rectangle...");
	}

	/**
	 * The user-defined constructor
	 * 
	 * @param w
	 *            The width of the new Rectangle
	 * @param h
	 *            The height of the new Rectangle
	 */
	public Rectangle(double w, double h) {
		this.width = w; // this. is optional here
		this.height = h; // this. is optional here
	}

	// get/set methods

	/**
	 * This method sets the value of the width attribute.
	 * 
	 * @param w
	 *            The width of the rectangle
	 */
	public void setWidth(double w) {
		width = w;
	}

	public void setHeight(double h) {
		height = h;
	}

	/**
	 * Returns the width of the Rectangle.
	 * 
	 * @return The width of the Rectangle.
	 */
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getParimeter() {
		return 2 * (width + height); // adding up all the sides of the rectangle
	}

	public double getArea() {
		return width * height;
	}

}
