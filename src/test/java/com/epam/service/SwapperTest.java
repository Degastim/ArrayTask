package com.epam.service;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwapperTest {
    Swapper swapper;
    int[] additionalArray;
    int[][] array;

    @BeforeMethod
    public void setUp() {
        swapper = new Swapper();
        additionalArray = new int[]{1, 6, 5};
        array = new int[][]{{1, 2, 3, 4}, {6, 7, 8}, {16, 7, 5}};
    }

    @Test
    public void testSwapDescending() {
        int[][] actual = swapper.swapDescending(additionalArray, array);
        int[][] expected = new int[][]{{6, 7, 8}, {16, 7, 5}, {1, 2, 3, 4}};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSwapAscending() {
        int[][] actual = swapper.swapAscending(additionalArray, array);
        int[][] expected = new int[][]{{1, 2, 3, 4}, {16, 7, 5}, {6, 7, 8}};
        Assert.assertEquals(actual, expected);
    }

}