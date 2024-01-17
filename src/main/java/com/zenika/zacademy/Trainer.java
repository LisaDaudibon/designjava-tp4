package com.zenika.zacademy;

public class Trainer extends Person {
    public Trainer(String firstName, String lastName, String phoneNumber, String adress, String email) {
        super( firstName, lastName, phoneNumber,adress, email);
    }

    @Override
    public String toString() {
        return "Formateur " + firstName + " " + lastName + "\n" +
                "\uD83D\uDCF1: " + phoneNumber + "\n" +
                "\uD83D\uDCE7: " + email + "\n" +
                "\uD83C\uDFE0: " + adress;
    }
}
