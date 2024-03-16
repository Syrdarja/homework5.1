package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class СalculationOfRestMonthsTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    void СalculationOfRestMonths(int income, int expenses, int threshold, int expected) {
        СalculationOfRestMonths service = new СalculationOfRestMonths();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}
