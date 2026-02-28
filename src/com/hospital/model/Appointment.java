package com.hospital.model;

import com.hospital.enums.AppointmentStatus;

public class Appointment {
	
	private Doctor doctor;
    private Patient patient;
    private String date;
    private AppointmentStatus status;
    
    public Appointment(Doctor doctor, Patient patient, String date) {

        if (!doctor.isAvailable()) {
            throw new IllegalStateException("Doctor is fully booked.");
        }

        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.status = AppointmentStatus.BOOKED;

        doctor.assignAppointment();     // Increase doctor's count
    }
    
    public void completeAppointment() {
        this.status = AppointmentStatus.COMPLETED;
    }

    public void cancelAppointment() {
        if (status == AppointmentStatus.BOOKED) {
            this.status = AppointmentStatus.CANCELLED;
        }
    }
    
    public AppointmentStatus getStatus() {
        return status;
    }

    public void displayAppointment() {
        System.out.println("Appointment Date: " + date);
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Patient: " + patient.getName());
        System.out.println("Status: " + status);
    }

	
}
