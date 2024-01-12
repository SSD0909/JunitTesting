package jUnitTestClasses;



import org.junit.jupiter.api.Test;

import jUnit5Classes.Calculator;

public class JUnit5Test {

	
	@Test
	public void testMethod() {
		
		Calculator calc= new Calculator();
		int sum=calc.addAgain(10, 10);
		System.out.println("The sum is "+sum);		
	}
	
}
