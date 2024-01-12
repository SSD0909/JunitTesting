package jUnitTestClasses;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.platform.commons.util.StringUtils;

@TestInstance(Lifecycle.PER_CLASS)
public class Ex_02_c_Before_And_After_LifecycleDemo {
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("@BeforeAll got executed !!!");
	}
	
	public Ex_02_c_Before_And_After_LifecycleDemo() {
		System.out.println("Constructor got executed !!!");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("@BeforeEach got executed !!!");
	}
	
	@Test
	public void testOne() {
		System.out.println("testOne() got executed !!!");
	}
	
	@Test
	public void testTwo() {
		System.out.println("testTwo() got executed !!!");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("@AfterEach got executed !!!");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("@AfterAll got executed !!!");
	}

}
