package javaqa.javaqahw71.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllSalesAmountServiceTest {
    @Test
    void shouldCount12monthsProperly (){
        AllSalesAmount service = new AllSalesAmount();

        long [] sales = {12, 16, 10, 3, 6, 1, 24, 55, 50, 70, 49, 23};
        int expected = 319;
        int actual = service.salesAmount(sales);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void shouldCountAllOnesProperly () {
        AllSalesAmount service = new AllSalesAmount();

        long[] sales = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 12;
        int actual = service.salesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountAllNullsProperly () {
        AllSalesAmount service = new AllSalesAmount();

        long[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int expected = 0;
        int actual = service.salesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }
}
