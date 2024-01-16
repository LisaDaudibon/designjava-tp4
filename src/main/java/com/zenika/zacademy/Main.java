package com.zenika.zacademy;

import net.datafaker.Faker;

import java.util.Locale;

public class Main {
    Faker faker = new Faker(new Locale("fr"));

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String phoneNumber = faker.phoneNumber().phoneNumber();
    String email = faker.internet().emailAddress();
    String adress = faker.address().fullAddress();

    Person Maximilien = new Student(firstName, lastName, phoneNumber, email, adress);

}