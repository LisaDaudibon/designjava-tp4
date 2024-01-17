package com.zenika.zacademy;

public class Student extends Person {
    public Student(String firstName, String lastName, String phoneNumber, String email, String adress) {
        super( firstName, lastName, phoneNumber,adress, email);
    }

    @Override
    public String toString() {
        return "Elève " +
                "Prénom : " + firstName +
                "Nom : " + lastName + "\n" +
                "\uD83D\uDCF1: " + phoneNumber + "\n" +
                "\uD83D\uDCE7: " + email + "\n" +
                "\uD83C\uDFE0: " + adress;
    }

}
