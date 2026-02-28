package com.hospital.services;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import com.hospital.model.*;

public class Hospital {
	private HashMap<Integer, Doctor> doctors;
    private HashMap<Integer, Patient> patients;
    private Queue<Appointment> appointmentQueue;

    public Hospital() {
        doctors = new HashMap<>();
        patients = new HashMap<>();
        appointmentQueue = new LinkedList<>();
    }

    // Add Doctor
    public void addDoctor(Doctor doctor) {
        doctors.put(doctor.getId(), doctor);
    }

    // Add Patient
    public void addPatient(Patient patient) {
        patients.put(patient.getId(), patient);
    }

    // Book Appointment
    public void bookAppointment(int doctorId, int patientId, String date) {

        Doctor doctor = doctors.get(doctorId);
        Patient patient = patients.get(patientId);

        if (doctor == null || patient == null) {
            System.out.println("Invalid Doctor or Patient ID.");
            return;
        }

        try {
            Appointment appointment = new Appointment(doctor, patient, date);
            appointmentQueue.add(appointment);
            System.out.println("Appointment booked successfully.");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    // Process Next Appointment
    public void processNextAppointment() {
        Appointment appointment = appointmentQueue.poll();

        if (appointment == null) {
            System.out.println("No appointments in queue.");
            return;
        }

        appointment.completeAppointment();
        appointment.displayAppointment();
    }

    // Search Doctor
    public void searchDoctor(int doctorId) {
        Doctor doctor = doctors.get(doctorId);

        if (doctor != null) {
            doctor.displayDetails();
        } else {
            System.out.println("Doctor not found.");
        }
    }

    // Search Patient
    public void searchPatient(int patientId) {
        Patient patient = patients.get(patientId);

        if (patient != null) {
            patient.displayDetails();
        } else {
            System.out.println("Patient not found.");
        }
    }
}
