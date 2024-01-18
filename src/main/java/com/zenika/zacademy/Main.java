package com.zenika.zacademy;

import net.datafaker.Faker;

import java.util.*;

public class Main {
    final static int FAKER_HASHSET_LENGTH = 10;
    private static void askingUserPromotionSearchRequest( Directory directory) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle promotion cherchez vous ? Taper 0 pour quitter. Entrez votre recherche :");
        int userSearch = 1000;
        while (userSearch > 0) {
            try {
                userSearch = sc.nextInt();
                System.out.println(directory.searchByPromotionNumber(userSearch));
                System.out.println("Taper 0 pour quitter ou cherchez un nouveau numéro de promotion : ");
            } catch (InputMismatchException exception) {
                System.out.println("Ce n'est pas un chiffre. ");
                sc.next();
            } catch (NoSuchElementException exception) {
                System.out.println("Aucune promotion trouvée ! ");
            } finally {
                System.out.println("Taper 0 pour quitter ou rentrer le numéro de la promotion que vous recherchez : ");
            }
        }
    }
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("fr"));

        List<String> firstNames = faker.collection(() -> faker.name().firstName()).len(FAKER_HASHSET_LENGTH).generate();
        List<String> lastNames = faker.collection(() -> faker.name().lastName()).len(FAKER_HASHSET_LENGTH).generate();
        List<String> phoneNumber = faker.collection(() -> faker.phoneNumber().phoneNumber()).len(FAKER_HASHSET_LENGTH).generate();
        List<String> address = faker.collection(() -> faker.address().streetAddress()).len(FAKER_HASHSET_LENGTH).generate();
        List<String> email = faker.collection(() -> faker.internet().emailAddress()).len(FAKER_HASHSET_LENGTH).generate();

        Person person1 = new Student(firstNames.get(0), lastNames.get(0), phoneNumber.get(0), address.get(0), email.get(0));
        Person person2 = new Trainer(firstNames.get(1), lastNames.get(1), phoneNumber.get(1), address.get(1), email.get(1));
        Person person3 = new Trainer(firstNames.get(2), lastNames.get(2), phoneNumber.get(2), address.get(2), email.get(2));
        Person person4 = new Student(firstNames.get(3), lastNames.get(3), phoneNumber.get(3), address.get(3), email.get(3));
        Person person5 = new Trainer(firstNames.get(4), lastNames.get(4), phoneNumber.get(4), address.get(4), email.get(4));
        Person person6 = new Trainer(firstNames.get(5), lastNames.get(5), phoneNumber.get(5), address.get(5), email.get(5));
        Person person7 = new Student(firstNames.get(6), lastNames.get(6), phoneNumber.get(6), address.get(6), email.get(6));
        Person person8 = new Trainer(firstNames.get(7), lastNames.get(7), phoneNumber.get(7), address.get(7), email.get(7));
        Person person9 = new Trainer(firstNames.get(8), lastNames.get(8), phoneNumber.get(8), address.get(8), email.get(8));
        Person person10 = new Trainer(firstNames.get(9), lastNames.get(9), phoneNumber.get(9), address.get(9), email.get(9));

        Directory directory = new Directory();

        directory.addUnique(person1);
        directory.addUnique(person2);
        directory.addUnique(person3);
        directory.addUnique(person4);
        directory.addUnique(person5);
        directory.addUnique(person6);
        directory.addUnique(person7);
        directory.addUnique(person8);
        directory.addUnique(person9);
        directory.addUnique(person10);

        Person karine = new Trainer("Karine", "Sabatier", "0701020304", "Rue de rennes", "karineagile4ever@yahoo.fr");
        Person xavier = new Student("Xavier", "Cassel", "0701059304", "Rue de dinan", "karineagile@yahoo.fr");
        directory.addUnique(karine);

        Promotion promotion = new Promotion(9, "javatar");
        directory.createDirectoryOfPromotion(promotion);
        promotion.addStudentOrTrainerToPromotion(karine);
        promotion.addStudentOrTrainerToPromotion(xavier);

        askingUserPromotionSearchRequest(directory);
    }
}