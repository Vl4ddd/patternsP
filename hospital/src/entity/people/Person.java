package entity.people;

abstract class Person {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;

    public Person(String id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return getFullName() + " (ID: " + id + ")";
    }
}