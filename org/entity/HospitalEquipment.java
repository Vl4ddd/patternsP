package org.entity;
public class HospitalEquipment {
    private final String equipmentId;
    private final String name;
    private boolean inUse;

    public HospitalEquipment(String equipmentId, String name) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.inUse = false;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public String getName() {
        return name;
    }

    public boolean getInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}