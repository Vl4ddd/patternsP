import java.util.List;

import entity.hospital.Hospital;
import entity.people.Doctor;
import entity.people.Nurse;
import entity.people.Patient;
import factory.HospitalFactory;
import observer.LoggingPatientObserver;
import service.DoctorPatientService;

public class Main {

     public static void main(String[] args) {
        DoctorPatientService relationService = new DoctorPatientService();
        HospitalFactory factory = new HospitalFactory(relationService);

        relationService.registerObserver(new LoggingPatientObserver());

        Hospital hospital = Hospital.getInstance();
        
        Doctor surgeon = (Doctor) factory.createEmployee(
            "doctor", "D001", "Михаил", "Теткин", "+234234234", 
            "123", "Хирургический", "Хирург");

        hospital.addEmployee(surgeon);
            
        Nurse nurse = (Nurse) factory.createEmployee(
            "nurse", "N001", "Жека", "Основин", "+9876543210",
            "234", "Хирургический", null);

        hospital.addEmployee(nurse);
        
        Patient patient1 = factory.createPatient("P001", "Влад", "Останин", "+123123123");
        hospital.addPatient(patient1);
        Patient patient2 = factory.createPatient("P002", "Влад", "Бабушкин", "+345345345");
        hospital.addPatient(patient2);
        
        relationService.assignPatientToDoctor(surgeon, patient1);
        relationService.assignPatientToDoctor(surgeon, patient2);
        
        List<Patient> patients = relationService.getPatientsForDoctor(surgeon);
        System.out.println("Доктор " + surgeon.getFullName() + " лечит " + patients.size() + " пациентов");

        hospital.printEmployees();
    }
}
