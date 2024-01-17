package com.zenika.zacademy;

import net.datafaker.Faker;

import java.util.Iterator;
import java.util.Locale;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("fr"));

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        String email = faker.internet().emailAddress();
        String adress = faker.address().fullAddress();

        Person maximilien = new Student(firstName, lastName, phoneNumber, email, adress);

        Directory zacademyDirectory = new Directory();

        zacademyDirectory.addUnique(maximilien);

//        Iterator iter = zacademyDirectory.getPersons().iterator();

    }

}