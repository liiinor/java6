package ru.netology.stats.java6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void findSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.salesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAverageSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMaxSalesAmountMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;
        long actual = service.maxSalesAmountMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMinSalesAmountMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.minSalesAmountMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findSalesBelowAverageMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 10;
        long actual = service.salesBelowAverageMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findSalesAboveAverageMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 11;
        long actual = service.salesAboveAverageMonth(sales);

        Assertions.assertEquals(expected, actual);
    }
}
