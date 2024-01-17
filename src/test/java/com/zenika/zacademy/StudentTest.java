package com.zenika.zacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testToString() {
        Person xavier = new Student("Xavier", "Cassel", "0701059304", "Rue de dinan", "karineagile@yahoo.fr");
        String resultString = xavier.toString();
        String expectedString = String.format("""
                Student %s %s
                \uD83D\uDCF1: %s
                \uD83D\uDCE7: %s
                \uD83D\uDCE0: %s
                """, xavier.firstName, xavier.lastName, xavier.phoneNumber, xavier.email, xavier.adress);

        assertEquals(expectedString, resultString);
    }
}