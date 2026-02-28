package com.hospital.model;

abstract class Person {
	private static int count = 1;
	
	protected int id;
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.id = count++;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}
	
	public abstract void displayDetails();
}
