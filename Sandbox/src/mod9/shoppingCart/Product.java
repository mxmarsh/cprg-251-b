package mod9.shoppingCart;

import mod9.exceptions.*;

/**
 * Class description: represents a product in a shopping cart
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Product {

	private String name;
	private int quantity;
	private double price;

	public Product(String name, int quantity, double price) throws InvalidQuantityException, InvalidPriceException {
		if (quantity <= 0)
			throw new InvalidQuantityException();

		if (price < 0)
			throw new InvalidPriceException();

		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public String getName() {
		return this.name;
	}

}
