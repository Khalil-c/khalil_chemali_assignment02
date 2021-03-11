package com.nackademin.khalil_chemali_assignment02;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
	@Override
	public double square(double firstNumber) {
		return firstNumber * firstNumber;
	}

	@Override
	public double squareRoot(double firstNumber) {
		if (firstNumber < 0) {
			System.out.println("The number is negative....");
			return -0.123456789;
		}else return Math.sqrt(firstNumber);
	}

	@Override
	public double absoluteValue(double firstNumber) {
		return Math.abs(firstNumber);
	}

	@Override
	public double maxValue(double firstNumber, double secondNumber) {
		return Math.max(firstNumber, secondNumber);
	}

	@Override
	public double powerOf(double firstNumber, double secondNumber) {
		return Math.pow(firstNumber, secondNumber);
	}

}
