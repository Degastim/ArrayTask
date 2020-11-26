package com.epam.service;

import com.epam.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SorterTest {
    CustomArray array;
    Sorter sorting;

    @BeforeMethod
    public void setUp() {
        array = new CustomArray(new int[]{1, 56, 7, 25, 78, 25, 792, 4, 6});
        sorting = new Sorter();
    }

    @Test
    public void testBubbleSort() {

        int[] actual = sorting.bubbleSort(array);
        int[] expected = {1, 4, 6, 7, 25, 25, 56, 78, 792};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        int[] actual = sorting.insertionSort(array);
        int[] expected = {1, 4, 6, 7, 25, 25, 56, 78, 792};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() {
        int[] actual = sorting.selectionSort(array);
        int[] expected = {1, 4, 6, 7, 25, 25, 56, 78, 792};
        Assert.assertEquals(actual, expected);
    }
}