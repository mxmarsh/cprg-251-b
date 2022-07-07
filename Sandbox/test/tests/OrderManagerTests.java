package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import mod9.exceptions.*;
import mod9.shoppingCart.*;

class OrderManagerTests {

	private OrderManager order;

	@BeforeEach
	void setUp() throws Exception {
		order = new OrderManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		order = null;
	}

	@Test
	public void testAdd() {
		try {
			// create a new Product object
			Product p = new Product("apples", 2, .50);
			// add that Product to the OrderManager
			order.add(p);
			// assert that the # of products in the order is now 1
			int expected = 1;
			int actual = order.getNumberOfItems();
			assertEquals(expected, actual);
		} catch (InvalidQuantityException ex) {
			fail("Should not have thrown an InvalidQuantityException.");
		} catch (InvalidPriceException ex) {
			fail("Should not have thrown an InvalidPriceException.");
		}
	}

	@Test
	public void testAddInvalidQuantity() {
		assertThrows(InvalidQuantityException.class, () -> {
			// create a Product object with an invalid quantity
			Product p = new Product("apples", -2, .50);
			// add that Product to the Order Manager
			order.add(p);
		});
	}

	@Test
	public void testAddInvalidPrice() {
		assertThrows(InvalidPriceException.class, () -> {
			Product p = new Product("Pears", 4, -5.30);
			order.add(p);
		});
	}

	@Test
	public void testCalculateSubtotal() {
		try {
			// add 2 apples @ 50 cents each
			Product apples = new Product("apple", 2, .50);
			order.add(apples);
			// 3 bananas @ $1 each
			Product bananas = new Product("bananas", 3, 1);
			order.add(bananas);
			// expect the subtotal to be $4
			double expected = 4;
			double actual = order.calculateSubtotal();
			assertEquals(expected, actual, .01);

		} catch (InvalidQuantityException ex) {
			fail("Should not have thrown an InvalidQuantityException.");
		} catch (InvalidPriceException ex) {
			fail("Should not have thrown an InvalidPriceException.");
		}
	}

	@Test
	public void testCalculateTotal() {
		try {
			// add 2 apples @ 50 cents each
			Product apples = new Product("apple", 2, .50);
			order.add(apples);
			// 3 bananas @ $1 each
			Product bananas = new Product("bananas", 3, 1);
			order.add(bananas);
			// expect the subtotal to be $4 --> total is $4 + .20 tax = 4.20
			double expected = 4.20;
			double actual = order.calculateTotal();
			assertEquals(expected, actual, .01);

		} catch (InvalidQuantityException ex) {
			fail("Should not have thrown an InvalidQuantityException.");
		} catch (InvalidPriceException ex) {
			fail("Should not have thrown an InvalidPriceException.");
		}
	}

	@Test
	public void testIsEmpty() {
		// create an empty order
		// assert that it's empty
		assertTrue(order.isEmpty());
	}

	@Test
	public void testIsNotEmpty() {
		try {
			// add an item to an order
			order.add(new Product("apple", 2, .5));
			// assert that it's not empty
			assertFalse(order.isEmpty());
		} catch (Exception ex) {
			fail("Exception should not be thrown.");
		}
	}

	@Test
	public void testGetSize() {
		// create empty order
		// expect that the value is 0
		assertEquals(0, order.getNumberOfItems());
	}

	@Test
	public void testContains() {
		try {
			// add apples & bananas to the order
			order.add(new Product("apples", 3, .5));
			order.add(new Product("bananas", 17, 1));
			// check to see if apples is in the order
			assertTrue(order.contains("apples"));
		} catch (Exception ex) {
			fail("Exception should not be thrown.");
		}
	}

	@Test
	public void testNotContains() {
		try {
			// add apples & bananas to the order
			order.add(new Product("apples", 3, .5));
			order.add(new Product("bananas", 17, 1));
			// check to see if pears is in the order
			assertFalse(order.contains("pears"));
		} catch (Exception ex) {
			fail("Exception should not be thrown.");
		}
	}
}
