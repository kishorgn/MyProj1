package org.ignite.junit;


import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;

import org.junit.Test;

public class MyFirstClassTest {
	
	@Test
	public void myMeth1(){
		String str = "Welcome to JUnit!!!" ; 
		assertEquals("Welcome to JUnit", str);
	}
	
	@Test
	public void myMeth2(){
		int a = 5;
		assertEquals(5, a);
	}
}
