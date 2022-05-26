package mod3;

public class CastingSandbox {

	public static void main(String[] args) {
		/* CASTING PRIMITIVE TYPES */
		// Implicit casting / widening:
		byte num1 = 5;
		int num2 = num1; // works!

		// Explicit casting / narrowing:
		int num3 = 1000;
		byte num4 = (byte) num3; // we have to explicitly list how we are casting

		/* CASTING REFERENCE TYPES */
		// Up-casting:
		Rectangle a = new Rectangle();
		Shape b = a; // b is the "declared type" of the object, even though it's actually still a
						// Rectangle! That means, b only has access to methods in the Shape class.

		// System.out.println("the area of the shape is " + b.getArea());
		// ^ doesn't work. getArea() is not in the Shape class.

		b.setColor("aquamarine"); // modifying b means we also modify object a

		// Down-casting:
		Rectangle c = (Rectangle) b; // successful downcast!
		System.out.println("The area of the Rectangle is" + c.getArea());

		// Circle d = (Circle) b;
		// this does not work: the actual type of b is a Rectangle

		// before we downcast, we need to make sure we CAN downcast:
		if (b instanceof Circle) {
			System.out.println("b is a Circle");
			Circle d = (Circle) b;
		} else
			System.out.println("b is NOT a Circle");

		if (b instanceof Rectangle) {
			System.out.println("b is a Rectangle");
			Rectangle d = (Rectangle) b;
		} else
			System.out.println("b is NOT a Rectangle");

		if (b instanceof Shape)
			System.out.println("b is a Shape");
		else
			System.out.println("b is NOT a Shape");

	}

}
