package org.factory;
import org.entity.Administrator;
import org.entity.Doctor;
import org.entity.Employee;
import org.entity.Nurse;
import org.entity.Patient;
import org.service.DoctorPatientService;

class HospitalFactory implements PersonFactory {
    private final DoctorPatientService doctorPatientService;

    public HospitalFactory(DoctorPatientService service) {
        this.doctorPatientService = service;
    }

    @Override
    public Employee createEmployee(String type, String id, String firstName, String lastName,
                                 String phoneNumber, String employeeId, String department, 
                                 String specialization) {
        switch (type.toLowerCase()) {
            case "doctor":
                Doctor doctor = new Doctor(id, firstName, lastName, phoneNumber, 
                                        employeeId, department, specialization);
                return doctor;
                
            case "nurse":
                Doctor defaultDoctor = new Doctor("TEMP_DOC", "Default", "Doctor", 
                                                "0000000000", "TEMP_EMP", "General", "Therapist");
                Nurse nurse = new Nurse(id, firstName, lastName, phoneNumber, 
                                      employeeId, department, defaultDoctor);
                return nurse;
                
            case "administrator":
                Administrator admin = new Administrator(id, firstName, lastName, 
                                                      phoneNumber, employeeId, department);
                return admin;
            default:
                throw new IllegalArgumentException("Таких сотрудников нет: " + type);
        }
    }

    @Override
    public Patient createPatient(String id, String firstName, String lastName, String phoneNumber) {
        return new Patient(id, firstName, lastName, phoneNumber);
    }
     
}