package entity.people;

public abstract class Employee extends Person {
    private final String employeeId;
    private final String department;

    public Employee(String id, String firstName, String lastName, String phoneNumber, String employeeId, String department) {
        super(id, firstName, lastName, phoneNumber);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public abstract double calculateSalary();
}