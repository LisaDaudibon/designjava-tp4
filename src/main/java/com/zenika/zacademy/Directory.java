package com.zenika.zacademy;

import java.util.ArrayList;

public class Directory {
    private ArrayList<Person> persons = new ArrayList<>();

    public void addUnique(Person newPerson) {
        boolean isNotUnique = false;
        for (Person person: persons) {
            if (person.email.equals(newPerson.email)) {
                isNotUnique = true;
                break;
            }
        }
        if (!isNotUnique){
            persons.add(newPerson);
        }

    }



//    public class String Search () {
//
//    }
    
}
