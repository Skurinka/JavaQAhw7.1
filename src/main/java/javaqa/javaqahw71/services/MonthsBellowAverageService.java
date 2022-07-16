package javaqa.javaqahw71.services;


public class MonthsBellowAverageService {
    public int bellowAverage(long[] sales) {
        AverageSalesService service = new AverageSalesService();

        int amount = 0;
        int avSales = service.averageSales(sales);
        for (long sale : sales) {
            if (sale < avSales) {
                amount = amount + 1;
            }

        }
        return amount;
    }
}
