package com.zenika.zacademy;

import java.util.ArrayList;

public class Directory {
    public ArrayList<Person> persons = new ArrayList<>();

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void addUnique(Person newPerson) {
        boolean isUnique = true;
        for (Person person: persons) {
            if (person.equals(newPerson)) {
                isUnique = false;
                break;
            }
        }
        if (isUnique){
            persons.add(newPerson);
        }

    }


//    public class String Search () {
//
//    }
    
}
