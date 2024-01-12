package jUnitTestClasses;

import org.junit.jupiter.api.Test;

import jUnit5Classes.Calculator;

public class Ex_01_b_Intro_to_Testing_No_Assertion {

	@Test
	
	public void testMethod1() {
		
		Calculator calc= new Calculator();
		int total= calc.addAgain(10, 20);
		System.out.println("The total is"+ total);
	}
}
