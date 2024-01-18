package com.zenika.zacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PromotionTest {

    private final Promotion promotion = new Promotion(9, "javatar");
    private final Person karine = new Trainer("Karine", "Sabatier", "0701020304", "Rue de rennes", "karineagile4ever@yahoo.fr");
    private final Person max = new Student("Xavier", "Cassel", "0701059304", "Rue de dinan", "karineagile@yahoo.fr");

    @BeforeEach
    void setupTest () {
        promotion.getTrainers().clear();
        promotion.getStudents().clear();
    }

    @Test
    void shouldAddTrainerToPromotionHashSet() {
        promotion.addStudentOrTrainerToPromotion(max);
        assertEquals( 1, promotion.getStudents().size());
    }

    @Test
    void shouldAddStudentToPromotionHashSet() {
        promotion.addStudentOrTrainerToPromotion(karine);
        assertEquals(1, promotion.getTrainers().size());
    }

    @Test
    void shouldFormatTheMessageForStudentsAndTrainersInPromotion() {
        promotion.addStudentOrTrainerToPromotion(karine);
        promotion.addStudentOrTrainerToPromotion(max);
        String resultString = promotion.toString().trim();
        String expectedString = """
                Promotion javatar N°9
                
                \uD83D\uDC77 Formers:
               
                Formateur karine sabatier
                \uD83D\uDCF1: 0701020304
                \uD83D\uDCE7: karineagile4ever@yahoo.fr
                \uD83C\uDFE0: rue de rennes
                
                \uD83E\uDDD1\u200D\uD83C\uDF93 Élèves:
                
                Élèves xavier cassel
                \uD83D\uDCF1: 0701059304
                \uD83D\uDCE7: karineagile@yahoo.fr
                🏠: rue de dinan
                        """.trim();

        assertEquals(expectedString, resultString);
    }

    @Test
    void shouldFormatTheMessageForStudentsInPromotion() {
        promotion.addStudentOrTrainerToPromotion(max);
        String resultString = promotion.toString().trim();
        String expectedString = """
                Promotion javatar N°9
                
                \uD83E\uDDD1\u200D\uD83C\uDF93 Élèves:
                
                Élèves xavier cassel
                \uD83D\uDCF1: 0701059304
                \uD83D\uDCE7: karineagile@yahoo.fr
                🏠: rue de dinan
                """.trim();
        assertEquals(expectedString, resultString);
    }
    @Test
    void shouldFormatTheMessageForTrainersInPromotion() {
        promotion.addStudentOrTrainerToPromotion(karine);
        String resultString = promotion.toString().trim();
        String expectedString = """
                Promotion javatar N°9
                
                👷 Formers:
                                
                Formateur karine sabatier
                \uD83D\uDCF1: 0701020304
                \uD83D\uDCE7: karineagile4ever@yahoo.fr
                \uD83C\uDFE0: rue de rennes
                """.trim();
        assertEquals(expectedString, resultString);
    }
}