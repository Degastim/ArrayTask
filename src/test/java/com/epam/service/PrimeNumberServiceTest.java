package com.epam.service;

import com.epam.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimeNumberServiceTest {
    PrimeNumberService primeNumberService;
    CustomArray array;

    @BeforeMethod
    public void setUp() {
        primeNumberService = new PrimeNumberService();
        array = new CustomArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    @Test
    public void testFindPrimeNumbers() {
        int[] actual = primeNumberService.findPrimeNumbers(array);
        int[] expected = {1, 2, 3, 5, 7};
        Assert.assertEquals(actual, expected);
    }
}