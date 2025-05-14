package observer;
import entity.people.Doctor;
import entity.people.Patient;

public interface PatientAssignmentObserver {
    void onPatientAssigned(Doctor doctor, Patient patient);
}