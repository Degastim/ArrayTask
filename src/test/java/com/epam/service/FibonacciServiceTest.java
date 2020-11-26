package com.epam.service;

import com.epam.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FibonacciServiceTest {
    CustomArray array;
    FibonacciService fibonacciService;

    @BeforeMethod
    public void setUp() {
        array = new CustomArray(new int[]{1, 2, 46, 72, 7, 26, 3451, 5, 62, 3, 5, 6, 7, 8});
        fibonacciService = new FibonacciService();
    }

    @Test
    public void testFindingFibonacciNumbers() {
        int[] actual = {1, 2, 5, 3, 5, 8};
        int[] expected = fibonacciService.findingFibonacciNumbers(array);
        Assert.assertEquals(actual, expected);
    }
}