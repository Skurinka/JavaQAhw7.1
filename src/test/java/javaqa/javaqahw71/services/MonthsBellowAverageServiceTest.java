package javaqa.javaqahw71.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthsBellowAverageServiceTest {
    @Test
    void shouldCount12MonthsProperly() {
        MonthsBellowAverageService service = new MonthsBellowAverageService();

        long[] sales = {12, 16, 10, 3, 6, 1, 24, 55, 50, 70, 49, 23};
        int expected = 8;
        int actual = service.bellowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountAllOnesProperly() {
        MonthsBellowAverageService service = new MonthsBellowAverageService();

        long[] sales = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 0;
        int actual = service.bellowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCount20MonthsProperly() {
        MonthsBellowAverageService service = new MonthsBellowAverageService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int expected = 7;
        int actual = service.bellowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
