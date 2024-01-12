package jUnitTestClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import jUnit5Classes.Calculator;

public class Ex_02_b_Before_And_After {

	//New
	//Creating the calculator object 
		Calculator calc;
		
		
		@Test
		//change main method to a test method
		public void testMethod1() 
		
		{
		   calc=new Calculator();
		   int sum=calc.addAgain(10,20);
		   System.out.println("The total is:"+sum);
		   
		   assertEquals(30, sum);
		 }
		
		@Test
		//change main method to a test method
		
		public void testMethod2() 
		
		{
		   calc=new Calculator();
		   int sum=calc.addAgain(-10,-30);
		   System.out.println("The total is:"+sum);
		   
		   assertEquals(-40, sum);
		 }

	}
