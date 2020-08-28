package Entities;

public class Doctor extends Person {
    String specialty;

    public Doctor(String name,int age, int id, String address, int contactNumber, String specialty) {
        super(name, age, id, contactNumber, address);
        this.specialty = specialty;
    }
}
