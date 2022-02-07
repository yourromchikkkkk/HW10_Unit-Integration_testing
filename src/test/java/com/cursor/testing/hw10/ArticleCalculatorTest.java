package com.cursor.testing.hw10;

import com.cursor.testing.hw10.calculator.ArticleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArticleCalculatorTest {
    static ArticleCalculator calculator;

    @BeforeAll
    static void beforeAll() {
        calculator = new ArticleCalculator();
    }

   @Test
    void articleCalculatorUpperCaseTest() {
        Assertions.assertEquals(13.25, calculator.calculate("ABCDABA"));
        Assertions.assertEquals(7.25, calculator.calculate("AAAAAAA"));
        Assertions.assertEquals(17, calculator.calculate("BBBB"));
        Assertions.assertEquals(5, calculator.calculate("CCCCCC"));
        Assertions.assertEquals(1.5, calculator.calculate("DD"));
    }

    @Test
    void articleCalculatorLowerCaseTest() {
        Assertions.assertEquals(13.25, calculator.calculate("abcdaba"));
        Assertions.assertEquals(13.25, calculator.calculate("aBcDAba"));
    }

    @Test
    void articleCalculatorThrowsExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.calculate("GYYRETH"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.calculate("abcdabaF"));
    }
}
