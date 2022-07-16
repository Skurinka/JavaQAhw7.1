package javaqa.javaqahw71.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthsAboveAverageServiceTest {
    @Test
    void ShouldCountFor12MonthsProperly() {
        MonthsAboveAverageService service = new MonthsAboveAverageService();

        long[] sales = {12, 16, 10, 3, 6, 1, 24, 55, 50, 70, 49, 23};
        int expected = 4;
        int actual = service.aboveAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void ShouldCountFor20MonthsProperly() {
        MonthsAboveAverageService service = new MonthsAboveAverageService();

        long[] sales = {4187, 6365, 7879, 5235, 4234, 9635, 1231, 5146, 1233, 6847, 1254, 1456, 1323, 2893, 7465, 2383, 4363, 2323, 3267, 3623};
        int expected = 10;
        int actual = service.aboveAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void ShouldCountForAllNullsProperly() {
        MonthsAboveAverageService service = new MonthsAboveAverageService();

        long[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int expected = 0;
        int actual = service.aboveAverage(sales);

        Assertions.assertEquals(expected, actual);

    }
}
