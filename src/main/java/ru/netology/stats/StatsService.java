package ru.netology.stats;

public class StatsService {

    long sales[] = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

    public int sumSales(long[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = (int) (sumSales + sales[i]);
        }
        return sumSales;
    }

    public int averageSales(long[] sales) {
        int averageSales = sumSales(sales)/sales.length;
        return averageSales;
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

    public int lessThanAverageSales(long[] sales) {
        int lessSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                lessSales++;
            }
        }
        return lessSales;
    }

    public int moreThanAverageSales(long[] sales) {
        int moreSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                moreSales++;
            }
        }
        return moreSales;
    }
}
