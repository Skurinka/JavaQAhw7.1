package javaqa.javaqahw71.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageSalesServiceTest {
    @Test
    void shouldCount12MonthsProperly() {
        AverageSalesService service = new AverageSalesService();

        long[] sales = {12, 16, 10, 3, 6, 1, 24, 55, 50, 70, 49, 23};
        int expected = 26;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountAllOnesProperly() {
        AverageSalesService service = new AverageSalesService();

        long[] sales = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 1;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountAllNullsProperly() {
        AverageSalesService service = new AverageSalesService();

        long[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int expected = 0;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}


