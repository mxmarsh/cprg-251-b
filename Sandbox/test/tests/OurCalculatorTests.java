package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import mod9.calculator.OurCalculator;
import mod9.exceptions.SquareRootNegativeException;

class OurCalculatorTests {

	private OurCalculator calc;
	private double val1;
	private double val2;

	@BeforeEach
	void setUp() throws Exception {
		calc = new OurCalculator();
		val1 = 1.23;
		val2 = .999;
	}

	@AfterEach
	void tearDown() throws Exception {
		calc = null;
		val1 = 0;
		val2 = 0;
	}

	@Test
	public void testAdd() {
		// 1.23 + .999 = 2.229
		double expected = 2.229;
		double actual = calc.add(val1, val2);
		assertEquals(expected, actual, .001);
	}

	@Test
	public void testSubtract() {
		// 1.23 - .999 = .231
		double expected = .231;
		double actual = calc.subtract(val1, val2);
		assertEquals(expected, actual, .001);
	}

	@Test
	public void testSubtractNegative() {
		// -1.23 - (-.999) = -.231
		double expected = -.231;
		double actual = calc.subtract(-val1, -val2);
		assertEquals(expected, actual, .001);
	}

	@Test
	public void testMultiply() {
		double expected = 1.229;
		double actual = calc.multiply(val1, val2);
		assertEquals(expected, actual, 0.001, "Multiply Error");
	}

	@Test
	public void testDivide() {
		// 1.23 / .999 = 1.23123123123123123123;
		double expected = 1.23123123123123123123;
		double actual = calc.divide(val1, val2);
		assertEquals(expected, actual, .001);
	}

	@Test
	public void sillyTest() {

		assertThrows(Exception.class, () -> {
			Integer.parseInt("abc");
		});

	}

	@Test
	public void testDivideByZero() {
		// 1.23 divided by 0
		assertThrows(ArithmeticException.class, () -> {
			calc.divide(val1, 0);
		});
	}

	@Test
	public void testSquare() {
		double expected = 1.5129;
		double actual = calc.square(val1);
		assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testSquareRoot() {

		double expected = 1.1090;
		double actual;

		try {
			actual = calc.squareRoot(val1);
			assertEquals(expected, actual, .001, "SquareRoot is wrong");

		} catch (SquareRootNegativeException e) {
			// this is not expected
			fail("should not have thrown an exception");
		}
	}

	@Test
	public void testSquareRootv2() throws SquareRootNegativeException {
		// 1.23*1.23 = 1.5129
		double expected = 1.1090;
		double actual = calc.squareRoot(val1);
		assertEquals(expected, actual, .001, "divide failed");
	}

	@Test
	public void testSquareRootNegative() {
		try {
			calc.squareRoot(-val1);
			fail("should have thrown an exception already");
		} catch (SquareRootNegativeException e) {
			// good news!
			assertTrue(true);
		}
	}

	@Test
	public void testSquareRootNegativev2() {
		assertThrows(SquareRootNegativeException.class, () -> {
			calc.squareRoot(-val1);
		});
	}

}
