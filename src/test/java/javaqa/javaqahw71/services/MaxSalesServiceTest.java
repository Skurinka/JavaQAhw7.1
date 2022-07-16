package javaqa.javaqahw71.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxSalesServiceTest {
    @Test
    void shouldCount12MonthsProperly() {
        MaxSalesService service = new MaxSalesService();
        long[] sales = {12, 16, 10, 3, 6, 1, 24, 55, 50, 70, 49, 23};
        int expected = 10;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCountProperly() {
        MaxSalesService service = new MaxSalesService();
        long[] sales = {187, 365, 879, 535, 424, 965, 131, 546, 123, 687};
        int expected = 6;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountProperlyWithOneNull() {
        MaxSalesService service = new MaxSalesService();
        long[] sales = {0, 3, 1, 87, 14, 15, 12, 25, 36, 24, 26, 1};
        int expected = 4;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
