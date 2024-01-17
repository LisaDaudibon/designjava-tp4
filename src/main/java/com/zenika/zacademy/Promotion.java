package com.zenika.zacademy;

import java.util.HashSet;

public class Promotion {
    public int id = 0;
    public String name = "";

    public Promotion( int id, String name) {
        this.id = id;
        this.name = name;
    }

    HashSet<Person> students = new HashSet<>();
    HashSet<Person> trainers = new HashSet<>();

    public HashSet<Person> getStudents() {
        return students;
    }

    public HashSet<Person> getTrainers() {
        return trainers;
    }

    public void addStudentOrTrainerToPromotion( Person newPerson) {
        if ( ("Student").equals(newPerson.getClass().getSimpleName()) ) {
            students.add(newPerson);
        } else if ( ("Trainer").equals(newPerson.getClass().getSimpleName()) ) {
            trainers.add(newPerson);
        }
    }

    @Override
    public String toString() {
        return String.format("""
                Promotion %s n°%s
                 
                👷 Formateurs:
                %s
                
                🧑‍💻 Élèves:
                %s
                """, name, id, trainers, students);
    }
}
