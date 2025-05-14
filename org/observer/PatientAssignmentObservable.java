package org.observer;
interface PatientAssignmentObservable {
    void registerObserver(PatientAssignmentObserver observer);
    void removeObserver(PatientAssignmentObserver observer);
    void notifyObservers(Doctor doctor, Patient patient);
}