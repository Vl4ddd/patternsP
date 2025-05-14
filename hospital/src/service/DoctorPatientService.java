package service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.people.Doctor;
import entity.people.Patient;
import observer.PatientAssignmentObservable;
import observer.PatientAssignmentObserver;


public class DoctorPatientService implements PatientAssignmentObservable {
    private final Map<Doctor, List<Patient>> doctorPatientMap = new HashMap<>();
    private final List<PatientAssignmentObserver> observers = new ArrayList<>();
    
    @Override
    public void registerObserver(PatientAssignmentObserver observer) {
        observers.add(observer);
    }
    
    @Override
    public void removeObserver(PatientAssignmentObserver observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers(Doctor doctor, Patient patient) {
        for (PatientAssignmentObserver observer : observers) {
            observer.onPatientAssigned(doctor, patient);
        }
    }
    
    public void assignPatientToDoctor(Doctor doctor, Patient patient) {
        doctorPatientMap.computeIfAbsent(doctor, k -> new ArrayList<>()).add(patient);
        notifyObservers(doctor, patient); 
    }
    
    public List<Patient> getPatientsForDoctor(Doctor doctor) {
        return doctorPatientMap.getOrDefault(doctor, Collections.emptyList());
    }
    
    public void removePatientFromDoctor(Doctor doctor, Patient patient) {
        doctorPatientMap.getOrDefault(doctor, Collections.emptyList()).remove(patient);
    }
}