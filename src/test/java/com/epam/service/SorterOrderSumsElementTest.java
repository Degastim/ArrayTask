package com.epam.service;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SorterOrderSumsElementTest {
    SorterOrderSumsElement sorterOrderSumsElement;
    int[][] array;

    @BeforeMethod
    public void setUp() {
        sorterOrderSumsElement = new SorterOrderSumsElement();
        array = new int[][]{{1, 2, 3, 4}, {5, 8, 9,}, {5, 7}};
    }

    @Test
    public void testSortAscendingOrder() {
        sorterOrderSumsElement.sortAscendingOrder(array);
        int[][] expected = new int[][]{{1, 2, 3, 4}, {5, 7}, {5, 8, 9,}};
        Assert.assertEquals(array, expected);
    }

    @Test
    public void testSortDescendingOrder() {
        sorterOrderSumsElement.sortDescendingOrder(array);
        int[][] expected = new int[][]{{5, 8, 9,}, {5, 7}, {1, 2, 3, 4}};
        Assert.assertEquals(array, expected);
    }
}