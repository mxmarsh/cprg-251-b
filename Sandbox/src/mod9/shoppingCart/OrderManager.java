package mod9.shoppingCart;

import java.util.ArrayList;

/**
 * 
 * Class description: represents a shopping cart containing Products
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */
public class OrderManager {

	private ArrayList<Product> products;
	public static final double GST_RATE = 0.05;

	public OrderManager() {
		products = new ArrayList<Product>();
	}

	public void add(Product p) {
		products.add(p);
	}

	public int getNumberOfItems() {
		return products.size();
	}

	public double calculateSubtotal() {
		double subtotal = 0;

		for (Product p : products) {
			// get the price
			double price = p.getPrice();
			// get the quantity
			double quantity = p.getQuantity();
			// multiply them together
			// add them to the subtotal
			subtotal += price * quantity;
		}

		return subtotal;
	}

	public double calculateTotal() {
		// calculate the GST
		// return subtotal + GST
		return calculateSubtotal() * (1 + GST_RATE);
	}

	public boolean isEmpty() {
		if (products.size() == 0)
			return true;
		else
			return false;
	}

	public boolean contains(String product) {
		// loop through the arrayList
		for (Product p : products) {
			// if the product name matches, return true
			if (p.getName() == product)
				return true;
		}

		// otherwise, return false
		return false;
	}

}
