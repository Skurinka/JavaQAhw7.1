package javaqa.javaqahw71.services;

import org.w3c.dom.ls.LSOutput;

public class StatsService {
    long[] sales;

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;
    }

    public int averageSales(long[] sales) {
        int avSales;
        long amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
        }
        return avSales = (int) amount / sales.length;
    }

    public int salesAmount(long[] sales) {
        long amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
        }
        return (int) amount;
    }

    public int aboveAverage(long[] sales) {
        StatsService service = new StatsService();
        int amount = 0;
        for (long sale : sales) {
            if (sale > service.averageSales(sales)) {
                amount = amount + 1;
            }
        }
        return amount;
    }

    public int bellowAverage(long[] sales) {
        StatsService service = new StatsService();
        int amount = 0;
        for (long sale : sales) {
            if (sale < service.averageSales(sales)) {
                amount = amount + 1;
            }

        }
        return amount;
    }
}
