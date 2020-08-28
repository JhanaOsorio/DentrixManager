package Entities;

public class Patient extends Person{
      String insurance;


    public Patient(String name, int age, int id, String insurance, int contactNumber, String address) {
        super(name, age, id, contactNumber, address);
        this.insurance = insurance;

}
}

