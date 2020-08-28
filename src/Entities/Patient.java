package Entities;

public class Patient {
    String name;
    int  age;
    int  id;
    String insurance;
    int contactNumber;
    String address;

    public Patient(String name, int age, int id, String insurance, int contactNumber, String address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.insurance = insurance;
        this.contactNumber = contactNumber;
        this.address = address;
    }
}

