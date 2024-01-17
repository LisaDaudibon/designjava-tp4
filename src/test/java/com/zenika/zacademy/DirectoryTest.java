package com.zenika.zacademy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryTest {

    private final Directory directory = new Directory();
    private final Person karine = new Trainer("Karine", "Sabatier", "0701020304", "Rue de rennes", "karineagile4ever@yahoo.fr");

    @BeforeEach
    void setupTest () {
        directory.getPersons().clear();
    }

    @Test
    void shouldAddUniquePersonToArrayListPersons( ) {
        directory.addUnique(karine);

        assertEquals(1, (directory.getPersons().size()));

    }

    @Test
    void shouldNotAddPersonToArrayListPersonsIfEmailIsNotUnique( ) {
        Person xavier = new Trainer("Xavier", "Cassel", "0701059304", "Rue de dinan", "karineagile4ever@yahoo.fr");

        directory.addUnique(karine);
        directory.addUnique(xavier);

        assertEquals(1, (directory.getPersons().size()));

    }
}