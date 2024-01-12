package jUnitTestClasses;


import org.junit.jupiter.api.Test;

import jUnit5Classes.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Ex_02_a_private_methodss_Assert_equals {
	@Test
	//change main method to a test method
	public void testMethod1() 
	
	{
	   Calculator calc=new Calculator();
	   int sum=calc.addAgain(10,20);
	   System.out.println("The total is:"+sum);
	   
	   assertEquals(30, sum);
	 }
	
	@Test
	//change main method to a test method
	public void testMethod2() 
	
	{
	   Calculator calc=new Calculator();
	   int sum=calc.addAgain(-10,-30);
	   System.out.println("The total is:"+sum);
	   
	   assertEquals(40, sum);
	 }
	@Test
	//New Addition private
	//PRIVATE METHOD
	private void testMethod3() 
	
	{
	   Calculator calc=new Calculator();
	   int sum=calc.addAgain(-10,-30);
	   System.out.println("The total is:"+sum);
	   
	   assertEquals(-40, sum);
	 }


}
