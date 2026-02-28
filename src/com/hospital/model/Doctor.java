package com.hospital.model;

public class Doctor extends Person{
	private String specialization;
    private int maxAppointmentsPerDay;
    private int currentAppointments;
    
    public Doctor(String name, int age, String specialization, int maxAppointmentsPerDay) {
        super(name, age);
        this.specialization = specialization;
        this.maxAppointmentsPerDay = maxAppointmentsPerDay;
        this.currentAppointments = 0;
    }

	public boolean isAvailable() {
	    return currentAppointments < maxAppointmentsPerDay;
	}
	
	public void assignAppointment() {
        if (isAvailable()) {
            currentAppointments++;
        } else {
            System.out.println("Doctor is fully booked.");
        }
    }

	@Override
	public void displayDetails() {
		System.out.println("Doctor Id: " + id);
		System.out.println("Doctor name: " + name);
		System.out.println("Doctor Age: " + age);
		System.out.println("Doctor Specialization: " + specialization);		
		
	}
}
