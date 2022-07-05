package mod9.calculator;

import mod9.contracts.SimpleCalculator;
import mod9.exceptions.SquareRootNegativeException;

public class OurCalculator implements SimpleCalculator {

	@Override
	public double add(double num1, double num2) {
		return num1 + num2;
	}

	@Override
	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

	@Override
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	@Override
	public double divide(double num1, double num2) throws ArithmeticException {
		if (num2 == 0)
			throw new ArithmeticException("cannot divide by zero.");

		return num1 / num2;
	}

	@Override
	public double square(double num) {
		return num * num;
	}

	@Override
	public double squareRoot(double num) throws SquareRootNegativeException {
		if (num < 0)
			throw new SquareRootNegativeException("Cannot take the square root of a negative number");
		return Math.pow(num, .5);
	}

}
