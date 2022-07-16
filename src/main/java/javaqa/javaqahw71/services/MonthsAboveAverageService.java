package javaqa.javaqahw71.services;

public class MonthsAboveAverageService {
    public int aboveAverage(long[] sales) {
        AverageSalesService service = new AverageSalesService();

        int amount = 0;
        int avSales = service.averageSales(sales);
        for (long sale : sales) {
            if (sale > avSales) {
                amount = amount + 1;
            }

        }
        return amount;
    }
}

