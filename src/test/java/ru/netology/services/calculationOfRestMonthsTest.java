package ru.netology.services;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;
public class calculationOfRestMonthsTest {
    @Test
    void calculationOfRestMonthsIncome10_000 () {
        calculationOfRestMonths service = new calculationOfRestMonths();
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate (income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void calculationOfRestMonthsIncome100_000 () {
        calculationOfRestMonths service = new calculationOfRestMonths();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate (income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
