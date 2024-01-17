package com.zenika.zacademy;

import net.datafaker.Faker;

import java.util.Iterator;
import java.util.Locale;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Faker faker = new Faker(new Locale("fr"));
//
//        String firstName = faker.name().firstName();
//        String lastName = faker.name().lastName();
//        String phoneNumber = faker.phoneNumber().phoneNumber();
//        String email = faker.internet().emailAddress();
//        String adress = faker.address().fullAddress();
//
//        Person maximilien = new Student(firstName, lastName, phoneNumber, email, adress);

        int FAKER_HASHSET_LENGTH = 10;

        Faker faker = new Faker(new Locale("fr"));
        List<String> firstNames =
                faker.collection(
                                () -> faker.name().firstName())
                        .len(FAKER_HASHSET_LENGTH)
                        .generate();

        List<String> lastNames =
                faker.collection(
                                () -> faker.name().lastName())
                        .len(FAKER_HASHSET_LENGTH)
                        .generate();

        List<String> phoneNumber =
                faker.collection(
                                () -> faker.phoneNumber().phoneNumber())
                        .len(FAKER_HASHSET_LENGTH)
                        .generate();

        List<String> address =
                faker.collection(
                                () -> faker.address().streetAddress())
                        .len(FAKER_HASHSET_LENGTH)
                        .generate();

        List<String> email =
                faker.collection(
                                () -> faker.internet().emailAddress())
                        .len(FAKER_HASHSET_LENGTH)
                        .generate();


        Directory directory = new Directory();


        Person Person1 = new Student(firstNames.get(0), lastNames.get(0), phoneNumber.get(0), address.get(0), email.get(0));
        Person Person2 = new Trainer(firstNames.get(1), lastNames.get(1), phoneNumber.get(1), address.get(1), email.get(1));
        Person Person3 = new Trainer(firstNames.get(2), lastNames.get(2), phoneNumber.get(2), address.get(2), email.get(2));
        Person Person4 = new Student(firstNames.get(3), lastNames.get(3), phoneNumber.get(3), address.get(3), email.get(3));
        Person Person5 = new Trainer(firstNames.get(4), lastNames.get(4), phoneNumber.get(4), address.get(4), email.get(4));
        Person Person6 = new Trainer(firstNames.get(5), lastNames.get(5), phoneNumber.get(5), address.get(5), email.get(5));
        Person Person7 = new Student(firstNames.get(6), lastNames.get(6), phoneNumber.get(6), address.get(6), email.get(6));
        Person Person8 = new Trainer(firstNames.get(7), lastNames.get(7), phoneNumber.get(7), address.get(7), email.get(7));
        Person Person9 = new Trainer(firstNames.get(8), lastNames.get(8), phoneNumber.get(8), address.get(8), email.get(8));
        Person Person10 = new Trainer(firstNames.get(9), lastNames.get(9), phoneNumber.get(9), address.get(9), email.get(9));

        directory.addUnique(Person1);
        directory.addUnique(Person2);
        directory.addUnique(Person3);
        directory.addUnique(Person4);
        directory.addUnique(Person5);
        directory.addUnique(Person6);
        directory.addUnique(Person7);
        directory.addUnique(Person8);
        directory.addUnique(Person9);
        directory.addUnique(Person10);

        Person karine = new Trainer("Karine", "Sabatier", "0701020304", "Rue de rennes", "karineagile4ever@yahoo.fr");
        directory.addUnique(karine);
//        System.out.println(karine);
        System.out.println(directory.getPersons());

        Scanner sc = new Scanner(System.in);
        System.out.println("Qui recherchez vous ? ");

        String userInput = sc.nextLine();
        directory.SearchByName(userInput);


    }

}