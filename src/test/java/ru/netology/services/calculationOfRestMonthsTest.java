package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
public class calculationOfRestMonthsTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    void calculationOfRestMonths(int income, int expenses, int threshold, int expected) {
        calculationOfRestMonths service = new calculationOfRestMonths();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}
