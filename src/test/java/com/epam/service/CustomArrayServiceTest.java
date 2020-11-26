package com.epam.service;

import com.epam.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomArrayServiceTest {
    CustomArrayService customArrayService;
    CustomArray array;

    @BeforeMethod
    public void setUp() {
        customArrayService = new CustomArrayService();
        array = new CustomArray();
    }

    @Test
    public void testFillFromConsole() {
    }

    @Test
    public void testFillFromFile() {
        customArrayService.fillFromFile(array, "data/text.txt");
        int[] actual = array.getArray();
        int[] expected = {1, 2, 3, 4};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFillRandomNumber() {
    }
}