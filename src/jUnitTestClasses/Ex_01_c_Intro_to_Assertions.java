package jUnitTestClasses;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class Ex_01_c_Intro_to_Assertions {
	
	
	@Test
	
	void test() {
		// assertEquals(Expected,Actual);
		//assertEquals(2,2);---pass
		//assertEquals(2,3);----fail
		
		int someNumberfromProgram=4;
		assertEquals(2,someNumberfromProgram);
	}
	

}
