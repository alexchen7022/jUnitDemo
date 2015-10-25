package com.demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld helloWorld;

	@BeforeClass
	public static void setUpOne() {
		System.out.println("setUpOne");
	}

	@AfterClass
	public static void tearDownOne() {
		System.out.println("tearDownOne");
	}

	@Before
	public void setUpEveryTime() throws Exception {
		System.out.println("setUpEveryTime");
		helloWorld = new HelloWorld();
	}

	@After
	public void tearDownEveryTime() throws Exception {
		System.out.println("tearDownEveryTime");
	}

	@Test
	public void testHello() {
		System.out.println("testHello");
		String expacted = "Hello Alex!!!";
		String actual = "";
		helloWorld.setName("Alex");
		actual = helloWorld.hello();
		Assert.assertEquals("The return result should equal", expacted, actual);
	}
	
	@Test
	public void testSetter() {
		System.out.println("testSetter");
		String expacted = "Alex";
		String actual = "";
		helloWorld.setName("Alex");
		actual = helloWorld.getName();
		Assert.assertEquals("The return result should equal", expacted, actual);
	}
	

}
