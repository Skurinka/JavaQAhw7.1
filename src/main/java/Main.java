import javaqa.javaqahw71.services.*;

public class Main {
    public static void main(String[] args) {

        long[] sales = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        MinSalesService service = new MinSalesService();
        MaxSalesService service1 = new MaxSalesService();
        AllSalesAmount service2 = new AllSalesAmount();
        AverageSalesService service3 = new AverageSalesService();
        MonthsBellowAverageService service4 = new MonthsBellowAverageService();
        MonthsAboveAverageService service5 = new MonthsAboveAverageService();

        System.out.println("Месяц с минимальными продажами " + service.minSales(sales));

        System.out.println("Месяц с максимальными продажами " + service1.maxSales(sales));

        System.out.println("Общая сума продаж за все месяцы " + service2.salesAmount(sales));

        System.out.println("Средняя сумма продаж за все месяцы " + service3.averageSales(sales));

        System.out.println("Количество месяцев ниже средних значений продаж " + service4.bellowAverage(sales));

        System.out.println("Количество месяцев выше средних значений продаж " + service5.aboveAverage(sales));


    }
}