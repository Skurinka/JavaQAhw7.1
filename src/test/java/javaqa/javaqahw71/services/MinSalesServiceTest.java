package javaqa.javaqahw71.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MinSalesServiceTest {
    @Test
    void shouldCount12MonthsProperly() {
        MinSalesService service = new MinSalesService();

        long[] sales = {12, 16, 10, 3, 6, 1, 24, 55, 50, 70, 49, 23};
        int expected = 6;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCount20MonthsProperly() {
        MinSalesService service = new MinSalesService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int expected = 1;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCount20MonthsButWitBiggerNumbersProperly() {
        MinSalesService service = new MinSalesService();

        long[] sales = {4187, 6365, 7879, 5235, 4234, 9635, 8731, 5146, 1233, 6847, 6254, 4456, 6323, 2893, 7465, 2383, 4363, 2323, 3267, 3623};
        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}
