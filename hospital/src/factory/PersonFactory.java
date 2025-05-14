package factory;
import entity.people.Employee;
import entity.people.Patient;

interface PersonFactory {
    Patient createPatient(String id, String firstName, String lastName, String phoneNumber);
    Employee createEmployee(String type, String id, String firstName, String lastName, 
                          String phoneNumber, String employeeId, String department, String specialization);
}