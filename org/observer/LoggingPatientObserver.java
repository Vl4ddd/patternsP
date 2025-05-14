package org.observer;
import org.entity.Doctor;
import org.entity.Patient;
import org.entity.PatientAssignmentObserver;

class LoggingPatientObserver implements PatientAssignmentObserver {
    @Override
    public void onPatientAssigned(Doctor doctor, Patient patient) {
        System.out.printf("[LOG] Пациент %s присоединился к врачу %s (%s)%n",
                patient.getFullName(), doctor.getFullName(), doctor.getSpecialization());
    }
}