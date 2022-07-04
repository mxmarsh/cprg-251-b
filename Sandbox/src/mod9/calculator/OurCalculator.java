package mod9.calculator;

import mod9.contracts.SimpleCalculator;

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double divide(double num1, double num2) throws ArithmeticException {
		// TODO Auto-generated method stub
		return 0;
	}

}
