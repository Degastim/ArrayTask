package com.epam.service;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SorterOrderMinimumElementsTest {
    SorterOrderMinimumElements sorterOrderMinimumElements;
    int[][] array;

    @BeforeMethod
    public void setUp() {
        sorterOrderMinimumElements = new SorterOrderMinimumElements();
        array = new int[][]{{1, 2, 3, 4}, {5, 8, 9,}, {5, 7}};
    }

    @Test
    public void testSortDescendingOrderMinimumElements() {
        sorterOrderMinimumElements.sortDescendingOrderMinimumElements(array);
        int[][] expected = new int[][]{{5, 8, 9,}, {5, 7}, {1, 2, 3, 4}};
        Assert.assertEquals(array, expected);
    }

    @Test
    public void testSortAscendingOrderMinimumElements() {
        sorterOrderMinimumElements.sortAscendingOrderMinimumElements(array);
        int[][] expected = new int[][]{{1, 2, 3, 4}, {5, 8, 9,}, {5, 7}};
        Assert.assertEquals(array, expected);
    }
}