package com.zenika.zacademy;

import java.util.Objects;

public abstract class Person {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String adress;
    public String email;

    public Person (String firstName, String lastName, String phoneNumber, String adress, String email) {
        this.firstName = firstName.toLowerCase();
        this.lastName = lastName.toLowerCase();
        this.phoneNumber = phoneNumber;
        this.email = email.toLowerCase();
        this.adress = adress.toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
