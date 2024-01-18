package com.zenika.zacademy;

import java.util.*;

public class Directory {
    public HashSet<Person> persons = new HashSet<>();
    public HashSet<Promotion> promotions = new HashSet<>();
    public HashSet<Person> getPersons() {
        return persons;
    }
    public HashSet<Promotion> getPromotions() {
        return new HashSet<>(promotions);
    }

    public void addUnique(Person newPerson) {
        persons.add(newPerson);
    }

    public Person searchByName (String searchNamed) {
        String searchNamedByLowerCase = searchNamed.toLowerCase();

        List <Person> personFound = persons.stream().filter(currentPerson -> {
            if (searchNamedByLowerCase.contains(currentPerson.firstName) ||searchNamedByLowerCase.contains(currentPerson.lastName)) {
                return true;
            }
            return false;
        }).toList();

        if (personFound.isEmpty()) {
            return null;
        } else {
            System.out.println(personFound.getFirst());
            return personFound.getFirst();
        }
    }

    public void createDirectoryOfPromotion ( Promotion newPromotion) {
        promotions.add(newPromotion);
    }

    public Promotion searchByPromotionNumber (Integer promotionNumber) throws NoSuchElementException {
        List <Promotion> promotionFound = promotions.stream().filter(currentPromotion -> {
            return promotionNumber.equals(currentPromotion.id);
        }).toList();

        if (promotionFound.isEmpty()) {
            throw new NoSuchElementException( "Aucune promotion trouvée !" + promotionFound);
        } else{
            return promotionFound.getFirst();
        }
    }

}
