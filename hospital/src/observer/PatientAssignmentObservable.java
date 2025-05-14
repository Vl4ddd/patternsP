package observer;

import entity.people.Doctor;
import entity.people.Patient;

public interface PatientAssignmentObservable {
    void registerObserver(PatientAssignmentObserver observer);
    void removeObserver(PatientAssignmentObserver observer);
    void notifyObservers(Doctor doctor, Patient patient);
}