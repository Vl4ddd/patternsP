package org.entity;
import java.util.ArrayList;
import java.util.List;

class Hospital {
    private static Hospital instance;
    private final List<Employee> employees;
    private final List<Patient> patients;
    private final List<Room> rooms;

    private Hospital() {
        this.employees = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public static Hospital getInstance() {
        if (instance == null) {
            instance = new Hospital();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void printSickEmployees() {
        System.out.println("Sick employees:");
        for (Patient patient : patients) {
            for (Employee employee : employees) {
                if (employee.getId().equals(patient.getId())) {
                    System.out.println(employee.getFullName() + " - " + patient.getMedicalHistory());
                }
            }
        }
    }
}