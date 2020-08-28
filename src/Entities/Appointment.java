package Entities;

public class Appointment {
    int date;
    int time;
    String patientId;
    String doctorId;

    public Appointment(int date, int time, String patientId, String doctorId) {
        this.date = date;
        this.time = time;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }
}
