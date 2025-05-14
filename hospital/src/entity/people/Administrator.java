package entity.people;

public class Administrator extends Employee {
    private static int adminCount = 0;

    public Administrator(String id, String firstName, String lastName, String phoneNumber, String employeeId, String department) {
        super(id, firstName, lastName, phoneNumber, employeeId, department);
        adminCount++;
    }

    public static int getAdminCount() {
        return adminCount;
    }

    @Override
    public double calculateSalary() {
        return 4000;
    }

    public void registerPatient(Patient patient) {
        System.out.println("Регистрация пациента: " + patient.getFullName());
    }
}