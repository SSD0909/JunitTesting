package jUnitTestClasses;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import jUnit5Classes.Calculator;

public class Ex_01_f_Calculatordivision {
	
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

	@Test
	public void testDivisionPositive() {
		
		Calculator calc= new Calculator();
		int d=calc.divideAgain(100, 10);
		System.out.println("The output of division of Positive Numbers is "+d);
		assertEquals(10,d);
}
	
	@Test
	public void testDivisionNegative() {
		
		Calculator calc= new Calculator();
		int d=calc.divideAgain(-100, -10);
		System.out.println("The output of division of Negative Numbers is "+d);
		assertEquals(10,d);
}
}
