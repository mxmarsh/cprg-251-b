package tests;

import static org.junit.Assert.assertSame;

import org.junit.jupiter.api.*;

/**
 * Class description:
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

class MyWindowTests {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testOnePlusThree() {

		// try to add 1 + 3
		int actual = 1 + 3;
		// expect the answer to be 4
		int expected = 4;

		// assert that the answer is 4
		assertSame(expected, actual);

	}

}
