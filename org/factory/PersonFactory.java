package org.factory;
import org.entity.Employee;
import org.entity.Patient;

interface PersonFactory {
    Patient createPatient(String id, String firstName, String lastName, String phoneNumber);
    Employee createEmployee(String type, String id, String firstName, String lastName, 
                          String phoneNumber, String employeeId, String department, String specialization);
}