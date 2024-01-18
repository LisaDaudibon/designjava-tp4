package com.zenika.zacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void shouldFormatMessageForStudent() {
        Person xavier = new Student("Xavier", "Cassel", "0701059304", "Rue de dinan", "karineagile@yahoo.fr");
        String resultString = xavier.toString();
        String expectedString = String.format("""
                 Élèves xavier cassel
                📱: 0701059304
                📧: karineagile@yahoo.fr
                🏠: rue de dinan
                """);

        assertEquals(expectedString.trim(), resultString.trim());
    }
}