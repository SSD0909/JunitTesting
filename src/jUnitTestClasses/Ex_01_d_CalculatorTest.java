package jUnitTestClasses;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import jUnit5Classes.Calculator;

public class Ex_01_d_CalculatorTest {
	
	@Test
	public void testMethod() {
		
		Calculator calc= new Calculator();
		int sum=calc.addAgain(10, 10);
		System.out.println("The sum is "+sum);
		assertEquals(20,sum);
				
	}

}
