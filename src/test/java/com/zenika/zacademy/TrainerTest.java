package com.zenika.zacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void testToString() {
        Person xavier = new Trainer("Xavier", "Cassel", "0701059304", "Rue de dinan", "karineagile@yahoo.fr");
        String resultString = xavier.toString();
        String expectedString = "Formateur " + xavier.firstName + " " + xavier.lastName + "\n" +
                "\uD83D\uDCF1: " + xavier.phoneNumber + "\n" +
                "\uD83D\uDCE7: " + xavier.email + "\n" +
                "\uD83C\uDFE0: " + xavier.adress + "\n";

        assertEquals(expectedString, resultString);
    }
}