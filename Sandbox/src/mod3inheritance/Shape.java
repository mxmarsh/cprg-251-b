package mod3inheritance;

/**
 * Class description: This represents the Shape superclass.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Shape extends Object {

	// fields:
	private String color;

	// methods:
	public Shape() {
		this.color = "blue";
		System.out.println("Shape() constructor is running.");
	}

	public Shape(String color) {
		this.color = color;
		System.out.println("Shape() constructor is running.");
	}

	/**
	 * Getter method for color
	 * 
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Setter method for color
	 * 
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
