package mod9.contracts;

import mod9.exceptions.SquareRootNegativeException;

/**
 * 
 * Class description: A contract to create a simple calculator
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */
public interface SimpleCalculator {

	/**
	 * This methods adds together 2 provided values and returns the sum.
	 * 
	 * @param num1 the first value
	 * @param num2 the second value
	 * @return the sum of the 2 values
	 */
	public double add(double num1, double num2);

	/**
	 * This method subtracts the second number from the first and returns the
	 * difference.
	 * 
	 * @param num1 the first value
	 * @param num2 the second value
	 * @return the difference between the 2 values
	 */
	public double subtract(double num1, double num2);

	/**
	 * This method multiplies two numbers together and returns the product.
	 * 
	 * @param num1 the first value
	 * @param num2 the second value
	 * @return the product of the 2 values
	 */
	public double multiply(double num1, double num2);

	/**
	 * This method divides the first number by the second and returns the quotient.
	 * 
	 * @param num1 the first value
	 * @param num2 the second value
	 * @return the quotient of num1/num2
	 * @throws ArithmeticException if the second number is zero.
	 */
	public double divide(double num1, double num2) throws ArithmeticException;

	/**
	 * Method to calculate the square of a number
	 * 
	 * @param num the value provided
	 * @return the square of that number (num * num)
	 */
	public double square(double num);

	/**
	 * Method calculates the square root of a number.
	 * 
	 * @param num the value provided
	 * @return the square root of the number given (num ^ .5)
	 * @throws SquareRootNegativeException if the value provided is negative
	 */
	public double squareRoot(double num) throws SquareRootNegativeException;

}
