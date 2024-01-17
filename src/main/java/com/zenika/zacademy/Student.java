package com.zenika.zacademy;

public class Student extends Person {
    public Student(String firstName, String lastName, String phoneNumber, String email, String adress) {
        super( firstName, lastName, phoneNumber,adress, email);
    }

    @Override
    public String toString() {
        return String.format("""
                Élèves %s %s
                \uD83D\uDCF1: %s
                \uD83D\uDCE7: %s
                \uD83D\uDCE0: %s
                """, firstName, lastName, phoneNumber, email, adress);
    }

}
