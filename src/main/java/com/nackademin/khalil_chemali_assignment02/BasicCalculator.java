package com.nackademin.khalil_chemali_assignment02;
// A Calculator with basic functions
public class BasicCalculator implements BasicOperations {

	@Override
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public double division(double firstNumber, double secondNumber) {
		if (secondNumber == 0) {
			System.out.println("Division by zero....");
			return -0.123456789;
		}else
		return firstNumber / secondNumber;
	}

}
