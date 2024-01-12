package jUnitTestClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import jUnit5Classes.BankAccount;
import jUnit5Classes.Calculator;

public class Ex_02_g_Before_And_After_include_beforeEach 
{
	
	//New
	 private Calculator calc;
	
	 @org.junit.Before
	    public void setup() {
		 calc=new Calculator();
	    }

	
	@Test
	//change main method to a test method
	public void testMethod1() 
	
	{
	   
	   int sum=calc.addAgain(10,20);
	   System.out.println("The total is:"+sum);
	   
	   assertEquals(30, sum);
	 }
	
	@Test
	//change main method to a test method
	
	public void testMethod2() 
	
	{
	  
	   int sum=calc.addAgain(-10,-30);
	   System.out.println("The total is:"+sum);
	   
	   assertEquals(-40, sum);
	 }

}
