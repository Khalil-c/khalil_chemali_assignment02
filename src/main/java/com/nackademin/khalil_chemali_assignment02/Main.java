package com.nackademin.khalil_chemali_assignment02;

public class Main {

	public static void main(String[] args) {
		// bc is an object of class BasicCalculator
		BasicCalculator bc = new BasicCalculator();
		System.out.println(bc.addition(4.0, 3.0));
		System.out.println(bc.subtraction(4.0, 3.0));
		System.out.println(bc.multiplication(4.0, 3.0));
		System.out.println(bc.division(4.0, 2.0));
		
		AdvancedCalculator ac = new AdvancedCalculator();
		
		System.out.println(ac.square(4.0));
		System.out.println(ac.squareRoot(9.0));
		System.out.println(ac.absoluteValue(-5));
		System.out.println(ac.maxValue(4.0, 8.0));
		System.out.println(ac.powerOf(4.0, 3.0));
		
		
	}

}
