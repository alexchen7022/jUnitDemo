package com.demo;

public class HelloWorld {

	private String name;

	public String hello() {
		return "Hello " + name +"!!!@@";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}

	public HelloWorld(String name) {
		super();
		this.name = name;
	}

	public HelloWorld() {
		super();
	}
	
	
}
