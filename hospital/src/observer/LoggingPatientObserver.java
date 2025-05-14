package observer;
import entity.people.Doctor;
import entity.people.Patient;

public class LoggingPatientObserver implements PatientAssignmentObserver {
    @Override
    public void onPatientAssigned(Doctor doctor, Patient patient) {
        System.out.printf("[LOG] Пациент %s присоединился к врачу %s (%s)%n",
                patient.getFullName(), doctor.getFullName(), doctor.getSpecialization());
    }
}