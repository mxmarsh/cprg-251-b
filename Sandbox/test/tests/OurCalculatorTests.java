package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import mod9.calculator.OurCalculator;

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
		assertEquals(expected, actual);

	}

	@Test
	public void testSubtract() {
		// 1.23 - .999 = .231
		double expected = .231;
		double actual = calc.subtract(val1, val2);
		assertEquals(expected, actual, .001, "subtract failed");
	}

	// add tests for multiply and divide
	// at least one test per method
	// don't worry about testing exceptions for now
}
