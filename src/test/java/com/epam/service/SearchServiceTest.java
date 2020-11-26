package com.epam.service;

import com.epam.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchServiceTest {
    CustomArray array;
    SearchService searchEngine;

    @BeforeMethod
    public void setUp() {
        array = new CustomArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        searchEngine = new SearchService();
    }

    @Test
    public void testSearchMaxNumber() {
        int actual = searchEngine.searchMaxNumber(array);
        int expected = 10;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchMinNumber() {
        int actual = searchEngine.searchMinNumber(array);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchThreeDigitNumbersWithoutRepetitions() {
        int[] actual = searchEngine.searchThreeDigitNumbersWithoutRepetitions(array);
        int[] expected = {};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBinarySearch() {
        int actual = searchEngine.binarySearch(array, 7);
        int expected = 6;
        Assert.assertEquals(actual, expected);
    }
}