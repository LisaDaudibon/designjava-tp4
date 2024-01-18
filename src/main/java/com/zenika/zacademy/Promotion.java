package com.zenika.zacademy;

import java.util.HashSet;

public class Promotion {
    public int id = 0;
    public String name = "";

    public Promotion( int id, String name) {
        this.id = id;
        this.name = name;
    }

    HashSet<Person> trainers = new HashSet<>();
    HashSet<Person> students = new HashSet<>();

    public HashSet<Person> getTrainers() {
        return new HashSet<>(trainers);
    }
    public HashSet<Person> getStudents() {
        return new HashSet<>(students);
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
        StringBuilder message = new StringBuilder(String.format("Promotion %s N°%s\n\n", name, id));
        if (!trainers.isEmpty()){
            message.append("👷 Formers:\n\n");
            for (Person trainer : trainers){
                message.append(trainer.toString()).append("\n");
            }
        }
        if (!students.isEmpty()) {
            message.append("🧑‍🎓 Élèves:\n\n");
            for (Person student : students) {
                message.append(student.toString());
            }
        }
        return message.toString();
    }
}
