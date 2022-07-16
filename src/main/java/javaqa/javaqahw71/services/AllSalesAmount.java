package javaqa.javaqahw71.services;

public class AllSalesAmount {
    public int salesAmount(long[] sales) {
        long amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
        }
        return (int) amount;
    }

}
