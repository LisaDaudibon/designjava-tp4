package com.zenika.zacademy;

public class Student extends Person {
    public Student(String firstName, String lastName, String phoneNumber, String email, String adress) {
        super( firstName, lastName, phoneNumber,adress, email);
    }

    @Override
    public String toString() {
        return "Elève \n" +
                "Prénom : " + firstName + "\n" +
                "Nom : " + lastName + "\n" +
                "N° de téléphone : " + phoneNumber + "\n" +
                "Email : " + email + "\n" +
                "Adresse : " + adress;
    }

}
