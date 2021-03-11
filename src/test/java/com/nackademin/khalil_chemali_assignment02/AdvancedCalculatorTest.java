package com.nackademin.khalil_chemali_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator ac = new AdvancedCalculator();
	Random r = new Random();
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());


	@Test
	public void testSquare() {
		double firstnr = 0.0;
		double resultnr = 0.0;
		for (int i = 0; i < 5; i++) {
			firstnr = r.nextDouble();
			resultnr = firstnr * firstnr;
			LOG.info(i + 1 + " Testing square with " + firstnr );
			assertEquals(ac.square(firstnr), resultnr, 0);
		}
		LOG.info("Testing square with Negative numbers -" + firstnr );
		assertEquals(ac.square((firstnr * -1)), (resultnr * 1), 0);
		LOG.info("Testing square with Zero ");
		assertEquals(ac.square(0), 0, 0);

	}
	@Test
	public void testSquareRoot() {
		double firstnr = 0.0;
		double resultnr = 0.0;
		for (int i = 0; i < 5; i++) {
			firstnr = r.nextDouble();
			resultnr = Math.sqrt(firstnr); 
			LOG.info(i + 1 + " Testing squareRoot with " + firstnr );
			assertEquals(ac.squareRoot(firstnr), resultnr, 0);
		}
		LOG.info("Testing squareRoot with Negative numbers -" + firstnr );
		assertEquals(ac.squareRoot((firstnr * -1)), -0.123456789, 0);
		LOG.info("Testing squareRoot with Zero ");
		assertEquals(ac.squareRoot(0), 0, 0);

	}
	@Test
	public void testAbsoluteValue() {
		double firstnr = 0.0;
		double resultnr = 0.0;
		for (int i = 0; i < 5; i++) {
			firstnr = r.nextDouble();
			resultnr = Math.abs(firstnr); 
			LOG.info(i + 1 + " Testing absoluteValue with " + firstnr );
			assertEquals(ac.absoluteValue(firstnr), resultnr, 0);
		}
		LOG.info("Testing absoluteValue with Negative numbers -" + firstnr );
		assertEquals(ac.absoluteValue((firstnr * -1)), resultnr, 0);
		LOG.info("Testing absoluteValue with Zero ");
		assertEquals(ac.absoluteValue(0), 0, 0);

	}
	@Test
	public void testMaxValue() {
		double firstnr = 0.0;
		double secondnr = 0.0;
		double resultnr = 0.0;
		double negResultnr = 0.0;
		for(int i =0; i<5;i++) {
		firstnr = r.nextDouble();
		secondnr = r.nextDouble();
		resultnr = Math.max(firstnr , secondnr);
		LOG.info(i+1 +" Testing maxValue with "+ firstnr+" and "+ secondnr);
		assertEquals(ac.maxValue(firstnr, secondnr),resultnr,0);
		}
		negResultnr = Math.max((firstnr*-1), (secondnr*-1));
		LOG.info("Testing maxValue with Negative numbers -"+ firstnr+" and -"+ secondnr);
		assertEquals(ac.maxValue((firstnr*-1), (secondnr*-1)),(negResultnr*1),0);
		LOG.info("Testing maxValue with Zero "+ firstnr+" and "+ 0);
		assertEquals(ac.maxValue(firstnr, 0),firstnr,0);
	}
	@Test
	public void testPowerOf() {
		double firstnr = 0.0;
		double secondnr = 0.0;
		double resultnr = 0.0;
		double negResultnr = 0.0;
		for(int i =0; i<5;i++) {
		firstnr = r.nextDouble();
		secondnr = r.nextDouble();
		resultnr = Math.pow(firstnr , secondnr);
		LOG.info(i+1 +" Testing powerOf with "+ firstnr+" and "+ secondnr);
		assertEquals(ac.powerOf(firstnr, secondnr),resultnr,0);
		}
		negResultnr = Math.pow((firstnr*-1), (secondnr*-1));
		LOG.info("Testing powerOf with Negative numbers -"+ firstnr+" and -"+ secondnr);
		assertEquals(ac.powerOf((firstnr*-1), (secondnr*-1)),(negResultnr*1),0);
		LOG.info("Testing powerOf with Zero "+ firstnr+" and "+ 0);
		assertEquals(ac.powerOf(firstnr, 0),1,0);
	}
	
	

}
