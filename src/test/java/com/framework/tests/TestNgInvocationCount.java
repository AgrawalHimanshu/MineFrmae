package com.framework.tests;

import org.testng.annotations.Test;


public class TestNgInvocationCount {
	
	
	@Test(invocationCount = 5)
	public void test_01(){
		System.out.println("In Test");
	}

}
