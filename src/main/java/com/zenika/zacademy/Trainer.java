package com.zenika.zacademy;

public class Trainer extends Person {
    public Trainer(String firstName, String lastName, String phoneNumber, String adress, String email) {
        super( firstName, lastName, phoneNumber,adress, email);
    }

    @Override
    public String toString() {
        return "Formateur \n" +
                "Prénom : " + firstName + "\n" +
                "Nom : " + lastName + "\n" +
                "N° de téléphone : " + phoneNumber + "\n" +
                "Email : " + email + "\n" +
                "Adresse : " + adress;
    }
}
