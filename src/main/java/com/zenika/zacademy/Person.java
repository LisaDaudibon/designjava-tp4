package com.zenika.zacademy;

public abstract class Person {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String adress;
    public String email;

    public Person (String firstName, String lastName, String phoneNumber, String email, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.adress = adress;
    }

}
