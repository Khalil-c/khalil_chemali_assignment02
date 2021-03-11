package com.nackademin.khalil_chemali_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BacisCalculatorTest {
	BasicCalculator bc = new BasicCalculator();
	Random r = new Random();
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());

	@Test
	public void testAddition() {
		double firstnr = 0.0;
		double secondnr = 0.0;
		double resultnr = 0.0;
		for(int i =0; i<5;i++) {
		firstnr = r.nextDouble();
		secondnr = r.nextDouble();
		resultnr = firstnr + secondnr;
		LOG.info(i+1 +" Testing addition with "+ firstnr+" and "+ secondnr);
		assertEquals(bc.addition(firstnr, secondnr),resultnr,0);
		}
		LOG.info("Testing addition with Negative numbers -"+ firstnr+" and -"+ secondnr);
		assertEquals(bc.addition((firstnr*-1), (secondnr*-1)),(resultnr*-1),0);
		LOG.info("Testing addition with Zero "+ firstnr+" and "+ 0);
		assertEquals(bc.addition(firstnr, 0),firstnr,0);
		
	}
	@Test
	public void testSubtraction() {
		double firstnr = 0.0;
		double secondnr = 0.0;
		double resultnr = 0.0;
		for(int i =0; i<5;i++) {
		firstnr = r.nextDouble();
		secondnr = r.nextDouble();
		resultnr = firstnr - secondnr;
		LOG.info(i+1+" Testing subtraction with "+ firstnr+" and "+ secondnr);
		assertEquals(bc.subtraction(firstnr, secondnr),resultnr,0);
		}
		LOG.info("Testing subtraction with Negative numbers -"+ firstnr+" and -"+ secondnr);
		assertEquals(bc.subtraction((firstnr*-1), (secondnr*-1)),(resultnr*-1),0);
		LOG.info("Testing subtraction with Zero "+ firstnr+" and "+ 0);
		assertEquals(bc.subtraction(firstnr, 0),firstnr,0);
		
		
	}
	@Test
	public void testMultiplication() {
		double firstnr = 0.0;
		double secondnr = 0.0;
		double resultnr = 0.0;
		for(int i =0; i<5;i++) {
		firstnr = r.nextDouble();
		secondnr = r.nextDouble();
		resultnr = firstnr * secondnr;
		LOG.info(i+1+" Testing multiplication with "+ firstnr+" and "+ secondnr);
		assertEquals(bc.multiplication(firstnr, secondnr),resultnr,0);
		}
		LOG.info("Testing multiplication with Negative numbers -"+ firstnr+" and -"+ secondnr);
		assertEquals(bc.multiplication((firstnr*-1), (secondnr*-1)),(resultnr*1),0);
		LOG.info("Testing multiplication with Zero "+ firstnr+" and "+ 0);
		assertEquals(bc.multiplication(firstnr, 0),0,0);
		
		
	}
	@Test
	public void testDivision() {
		double firstnr = 0.0;
		double secondnr = 0.0;
		double resultnr = 0.0;
		for(int i =0; i<5;i++) {
		firstnr = r.nextDouble();
		secondnr = r.nextDouble();
		resultnr = firstnr / secondnr;
		LOG.info(i+1+" Testing division with "+ firstnr+" and "+ secondnr);
		assertEquals(bc.division(firstnr, secondnr),resultnr,0);
		}
		LOG.info("Testing division with Negative numbers -"+ firstnr+" and -"+ secondnr);
		assertEquals(bc.division((firstnr*-1), (secondnr*-1)),(resultnr*1),0);
		LOG.info("Testing division with Zero "+ firstnr+" and "+ 0);
		assertEquals(bc.division(firstnr, 0),-0.123456789,0);
		
		
	}
}
