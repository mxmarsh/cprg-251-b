package samples251;

import java.awt.*;

/**
 * Class description: A demo of the difference between equals() and ==.
 * 
 * equals(), if it's been overridden correctly by a subclass, should compare the
 * content of two objects and return true if the content (their state) is the
 * same.
 * 
 * == is meant to compare the reference of the object: are they both pointing to
 * the same object in memory?
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class EqualsVsEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/* different objects are, well, different */
		Shape a = new Rectangle(2, 4);
		Shape b = new Rectangle(3, 5);

		System.out.println("Shape A is a 2x4 rectangle. Shape b is a 3x5 rectangle. Let's call both methods.");
		System.out.println("a.equals(b): " + a.equals(b));
		System.out.println("     a == b: " + (a == b));
		System.out.println("Make sense... they aren't the same dimensions, and they're 2 different objects.\n");

		/* what about two objects with the same state? */
		Shape c = new Rectangle(2, 4);

		System.out.println("Shape C is another 2x4 rectangle.");
		System.out.println("a.equals(c): " + a.equals(c));
		System.out.println("     a == c: " + (a == c));
		System.out.println(
				"equals() is comparing the content, and both are 2x4 rectangles. Hence, true.\n== is comparing the actual location of the object: and since these are two separate objects with different reference locations, that returns false.\n");

		/* and finally, what if we have two references to the SAME object? */
		Shape d = a;
		System.out.println("Shape D is another reference to Shape A.");
		System.out.println("a.equals(d): " + a.equals(d));
		System.out.println("     a == d: " + (a == d));
		System.out.println("Both are true, because both are pointing to the same object.");
	}

}
