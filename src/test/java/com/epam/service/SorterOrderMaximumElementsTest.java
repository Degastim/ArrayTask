package com.epam.service;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SorterOrderMaximumElementsTest {
    SorterOrderMaximumElements sorterOrderMaximumElements;
    int[][] array;

    @BeforeMethod
    public void setUp() {
        sorterOrderMaximumElements = new SorterOrderMaximumElements();
        array = new int[][]{{1, 2, 3, 4}, {5, 8, 9,}, {5, 7}};
    }

    @Test
    public void testSortDescendingOrderMaximumElements() {
        sorterOrderMaximumElements.sortDescendingOrderMaximumElements(array);
        int[][] expected = new int[][]{{5, 8, 9,}, {5, 7}, {1, 2, 3, 4}};
        Assert.assertEquals(array, expected);
    }

    @Test
    public void testSortAscendingOrderMaximumElements() {
        sorterOrderMaximumElements.sortAscendingOrderMaximumElements(array);
        int[][] expected = new int[][]{{1, 2, 3, 4}, {5, 7}, {5, 8, 9,}};
        Assert.assertEquals(array, expected);
    }
}