package com.zenika.zacademy;

import java.util.*;

public class Directory {
    public HashSet<Person> persons = new HashSet<>();

    public HashSet<Person> getPersons() {
        return persons;
    }

    public void addUnique(Person newPerson) {
        persons.add(newPerson);
    }

    public Person SearchByName (String searchNamed) {
        String searchNamedByLowerCase = searchNamed.toLowerCase();

//        for (Person currentPerson : persons) {
//            if (searchNamedByLowerCase.contains(currentPerson.firstName) ||searchNamedByLowerCase.contains(currentPerson.lastName)) {
//                return currentPerson;
//            }
//        }
//
//        return null;

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

}
