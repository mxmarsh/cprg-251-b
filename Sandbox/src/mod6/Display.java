package mod6;

import mod6.contracts.Displayable;

/**
 * Class description: implements the Displayable interface
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Display implements Displayable {
	@Override
	public void display() {
		System.out.println("hello, we are displaying things");
	}
}
