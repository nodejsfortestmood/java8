package com.java8;

public class Person {
	public Person(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	private String name; // –’√˚
	private String location; // µÿ÷∑
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", location=" + location + "]";
	}
}
