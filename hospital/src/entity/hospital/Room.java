package entity.hospital;

import entity.people.HospitalEmployee;

class Room {
    private final String roomNumber;
    private final String type;
    private HospitalEquipment equipment;
    private HospitalEmployee employee;

    public Room(String roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public void assignEquipment(HospitalEquipment equipment) {
        this.equipment = equipment;
    }

    public HospitalEquipment getEquipment() {
        return equipment;
    }

    public void assignStaff(HospitalEmployee employee ) {
        this.employee = employee;
    }

    public HospitalEmployee getEmployee() {
        return employee;
    }
}