package Entities;

public class Doctor {
    String name;
    int id;
    String address;
    int contactNumber;
    String specialty;

    public Doctor(String name, int id, String address, int contactNumber, String specialty) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.contactNumber = contactNumber;
        this.specialty = specialty;
    }
}
