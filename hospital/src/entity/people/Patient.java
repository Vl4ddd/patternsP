package entity.people;
import java.util.ArrayList;
import java.util.List;

import entity.Scheduleable;

public class Patient extends Person implements Scheduleable {
    private List<String> medicalHistory;
    private String currentAppointment;

    public Patient(String id, String firstName, String lastName, String phoneNumber) {
        super(id, firstName, lastName, phoneNumber);
        this.medicalHistory = new ArrayList<>();
    }

    public void updateMedicalHistory(String update) {
        this.medicalHistory.add(update);
    }

    public List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory);
    }

    public String getMedicalHistoryAsString() {
        return String.join("\n", medicalHistory);
    }

    public String getLastMedicalRecord() {
        return medicalHistory.isEmpty() ? "Записи отсутствуют" : medicalHistory.get(medicalHistory.size()-1);
    }

    @Override
    public void scheduleAppointment(String date, String time) {
        this.currentAppointment = date + " в " + time;
        System.out.println("Текущая запись для  " + getFullName() + ": " + currentAppointment);
    }

    @Override
    public String getAppointmentInfo() {
        if (currentAppointment != null && !currentAppointment.isBlank()) {
            return currentAppointment;
        } else {
            return "Запись на прием отсутствует";
        }

    }
}