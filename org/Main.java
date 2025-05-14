package org;

import java.util.List;

import org.entity.Doctor;
import org.entity.Nurse;
import org.entity.Patient;
import org.factory.HospitalFactory;
import org.observer.LoggingPatientObserver;
import org.service.DoctorPatientService;

public class Main {

     public static void main(String[] args) {
        DoctorPatientService relationService = new DoctorPatientService();
        HospitalFactory factory = new HospitalFactory(relationService);

        relationService.registerObserver(new LoggingPatientObserver());
        
        Doctor surgeon = (Doctor) factory.createEmployee(
            "doctor", "D001", "Михаил", "Теткин", "+234234234", 
            "123", "Хирургический", "Хирург");
            
        Nurse nurse = (Nurse) factory.createEmployee(
            "nurse", "N001", "Anna", "Sidorova", "+9876543210",
            "234", "Хирургический", null);
        
        Patient patient1 = factory.createPatient("P001", "Влад", "Останин", "+123123123");
        Patient patient2 = factory.createPatient("P002", "Влад", "Бабушкин", "+345345345");
        
        relationService.assignPatientToDoctor(surgeon, patient1);
        relationService.assignPatientToDoctor(surgeon, patient2);
        
        List<Patient> patients = relationService.getPatientsForDoctor(surgeon);
        System.out.println("Доктор " + surgeon.getFullName() + " лечит " + patients.size() + " пациентов");
    }
}
