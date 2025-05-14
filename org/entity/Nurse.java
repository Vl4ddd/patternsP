package org.entity;

class Nurse extends Employee implements HospitalEmployee {
    private Doctor supervisingDoctor;

    public Nurse(String id, String firstName, String lastName, String phoneNumber, String employeeId,
            String department, Doctor supervisingDoctor) {
        super(id, firstName, lastName, phoneNumber, employeeId, department);
        this.supervisingDoctor = supervisingDoctor;
    }

    @Override
    public void performDuties() {
        System.out.println("Медсестра " + getFullName() + " стажируется у " + supervisingDoctor.getFullName());
    }

    @Override
    public String getPosition() {
        return "Медсестра";
    }

    @Override
    public double calculateSalary() {
        return 5000;
    }

    public void takeBloodTest(Patient patient) {
        System.out.println("Медсестра берет анализ крови " + patient.getFullName());
    }

    public void takeBloodTest(Patient patient, String analysis) {
        System.out.println("Медсестра берет анализ крови " + patient.getFullName() + " на " + analysis);
    }
}