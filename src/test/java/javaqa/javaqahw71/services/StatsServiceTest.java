package javaqa.javaqahw71.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldCountMinSaleMonth() {
        StatsService service = new StatsService();
        long[] sales = {12, 16, 10, 3, 6, 1, 24, 55, 50, 70, 49, 23};
        int expected = 6;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {12, 16, 10, 3, 6, 1, 24, 55, 50, 70, 49, 23};
        int expected = 10;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCountAllSellsAmount() {
        StatsService service = new StatsService();
        long[] sales = {33, 22, 11, 44, 66, 66, 66, 66, 87, 29, 87, 87};
        int expected = 664;
        int actual = service.salesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountAverage() {
        StatsService service = new StatsService();
        long[] sales = {4187, 6365, 7879, 5235, 4234, 9635, 1231, 5146, 1233, 6847, 1254, 1456, 1323, 2893, 7465, 2383, 4363, 2323, 3267, 3623};
        int expected = 4117;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsBellowAverage() {
        StatsService service = new StatsService();
        long[] sales = {33, 22, 11, 44, 66, 66, 66, 66, 87, 29, 87, 87};
        int expected = 5;
        int actual = service.bellowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {12, 16, 10, 3, 6, 1, 24, 55, 50, 70, 49, 23};
        int expected = 4;
        int actual = service.aboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}

