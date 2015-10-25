package com.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest2 {
	
	private HelloWorld helloWorld;

	@Before
	public void setUp() throws Exception {
		
		helloWorld = new HelloWorld();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHello() {
		String expacted = "Hello Alex!!!@@";
		String actual = "";
		helloWorld.setName("Alex");
		actual = helloWorld.hello();
		Assert.assertEquals("The return result should equal", expacted, actual);
	}

}
