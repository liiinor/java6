package ru.netology.stats.java6;

public class StatsService {
    public long salesAmount(long[] sales) {
        long amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public long averageSalesAmount(long[] sales) {
        long amount = salesAmount(sales);
        long average = amount / sales.length;

        return average;
    }

    public long maxSalesAmountMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public long minSalesAmountMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public long salesBelowAverageMonth(long[] sales) {
        long average = averageSalesAmount(sales);
        long belowAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAverage = i;
            }
        }
        return belowAverage;
    }

    public long salesAboveAverageMonth(long[] sales) {
        long average = averageSalesAmount(sales);
        long aboveAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAverage = i;
            }
        }
        return aboveAverage;
    }
}
