package com.hospital.model;

public class Patient extends Person{
	
	private String disease;
    
	public Patient(String name, int age, String disease) {
		super(name, age);
		this.disease = disease;
	}
    
	@Override
	public void displayDetails() {
		System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
		
	}
}
