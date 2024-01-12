package jUnitTestClasses;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import jUnit5Classes.Calculator;

public class Ex_01_e_CalculatorMutiTesting {
	
	@Test
	public void testPositiveNumbers() {
		
		Calculator calc= new Calculator();
		int sum=calc.addAgain(10, 10);
		System.out.println("The sum is "+sum);
		assertEquals(20,sum);
				
	}
	
	@Test
	public void testNegativeNumbers() {
		
		Calculator calc= new Calculator();
		int sum=calc.addAgain(-10, -10);
		System.out.println("The sum is "+sum);
		assertEquals(20,sum);
				
	}

}
