package javaqa.javaqahw71.services;

public class AverageSalesService {

    public int averageSales(long[] sales) {
        int avSales;
        long amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
        }
        return avSales = (int) amount / sales.length;

    }
}