package org.observer;
import src.Entity.Doctor;
import src.Entity.Patient;

interface PatientAssignmentObserver {
    void onPatientAssigned(Doctor doctor, Patient patient);
}