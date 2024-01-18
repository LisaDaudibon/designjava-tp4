package com.zenika.zacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryTest {

    private final Directory directory = new Directory();
    private final Promotion promotion = new Promotion(9,"javatar");
    private final Person karine = new Trainer("Karine", "Sabatier", "0701020304", "Rue de rennes", "karineagile4ever@yahoo.fr");
    private final Person lucas = new Trainer("Xavier", "Cassel", "0701059304", "Rue de dinan", "karineagile4ever@yahoo.fr");
    private final Person max = new Student("Xavier", "Cassel", "0701059304", "Rue de dinan", "karineagile@yahoo.fr");

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
        directory.addUnique(karine);
        directory.addUnique(lucas);

        assertEquals(1, (directory.getPersons().size()));

    }

    @Nested
    class searchByName {
        @Test
        void shouldReturnPersonByFirstNameIfExist() {
            directory.addUnique(karine);
            Person personFound = directory.searchByName("karine");
            assertEquals(karine, personFound);
        }

        @Test
        void shouldReturnPersonByLastNameIfExist() {
            directory.addUnique(karine);
            Person personFound = directory.searchByName("Sabatier");
            assertEquals(karine, personFound);
        }

         @Test
        void shouldReturnPersonByFirstNameAndLastNameIfExists() {
            directory.addUnique(karine);
            Person personFound = directory.searchByName("Karine Sabatier");
            assertEquals(karine, personFound);
        }

        @Test
        void shouldReturnPersonByFirstNameAndLastNameWithoutCaseSensitiveIfExists() {
            directory.addUnique(karine);
            Person personFound = directory.searchByName("KarINe SABatier");
            assertEquals(karine, personFound);
        }

        @Test
        void shouldReturnNullIfPersonNotFound() {
            directory.addUnique(karine);
            Person personFound = directory.searchByName("maxime");
            assertNull(personFound);
        }
    }
    @Nested
    class searchByPromotionNumber {
        @Test
        void shouldCreateDirectoryOfPromotion () {
            directory.createDirectoryOfPromotion(promotion);
            assertEquals(1, directory.getPromotions().size());
        }

        @Test
        void shouldSearchStudentAndTeachersByPromotionId() {
            directory.createDirectoryOfPromotion(promotion);
            promotion.addStudentOrTrainerToPromotion(karine);
            promotion.addStudentOrTrainerToPromotion(max);
            String displaySearchResult = directory.searchByPromotionNumber(9).toString().trim();
            String expectedResult = """
                    Promotion javatar N°9
                                        
                    👷 Formers:
                                        
                    Formateur karine sabatier
                    📱: 0701020304
                    📧: karineagile4ever@yahoo.fr
                    🏠: rue de rennes
                                        
                    🧑‍🎓 Élèves:
                                        
                    Élèves xavier cassel
                    📱: 0701059304
                    📧: karineagile@yahoo.fr
                    🏠: rue de dinan
                    """.trim();
            assertEquals(expectedResult, displaySearchResult);
        }

        @Test
        void shouldSearchStudentByPromotionId() {
            directory.createDirectoryOfPromotion(promotion);
            promotion.addStudentOrTrainerToPromotion(karine);
            String displaySearchResult = directory.searchByPromotionNumber(9).toString().trim();
            String expectedResult = """
                    Promotion javatar N°9
                                        
                    👷 Formers:
                                        
                    Formateur karine sabatier
                    📱: 0701020304
                    📧: karineagile4ever@yahoo.fr
                    🏠: rue de rennes
                    """.trim();
            assertEquals(expectedResult, displaySearchResult);
        }
        @Test
        void shouldSearchByPromotionId() {
            directory.createDirectoryOfPromotion(promotion);
            promotion.addStudentOrTrainerToPromotion(max);
            String displaySearchResult = directory.searchByPromotionNumber(9).toString().trim();
            String expectedResult = """
                    Promotion javatar N°9   
                    
                    🧑‍🎓 Élèves:
                                        
                    Élèves xavier cassel
                    📱: 0701059304
                    📧: karineagile@yahoo.fr
                    🏠: rue de dinan
                    """.trim();
            assertEquals(expectedResult, displaySearchResult);
        }
    }
}