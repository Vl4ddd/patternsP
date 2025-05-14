package org.entity;

class Doctor extends Employee implements HospitalEmployee {
    private final String specialization;

    public Doctor(String id, String firstName, String lastName, String phoneNumber, String employeeId, 
                 String department, String specialization) {
        super(id, firstName, lastName, phoneNumber, employeeId, department);
        this.specialization = specialization;
    }
    
    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Доктор " + getFullName() + " работает");
    }

    @Override
    public String getPosition() {
        return "Доктор (" + specialization + ")";
    }

    @Override
    public double calculateSalary() {
        return 10000;
    }

    public void prescribeMedication(Patient patient, String drug) {
        System.out.println("Выписано " + drug + " пациенту " + patient.getFullName());
        patient.updateMedicalHistory("Выписано: " + drug);
    }

    public void prescribeMedication(Patient patient, String drug, String period) {
        System.out.println("Выписано " + drug + " на период" + period + " пациенту " + patient.getFullName());
        patient.updateMedicalHistory("Выписано: " + drug + " на период " + period);
    }
}