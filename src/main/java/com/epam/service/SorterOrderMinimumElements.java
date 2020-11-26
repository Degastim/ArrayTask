package com.epam.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SorterOrderMinimumElements {
    private static Logger logger = LogManager.getLogger();
    int[] minArray;
    Swapper swapper = new Swapper();

    public int[][] sortDescendingOrderMinimumElements(int[][] array) {
        array = swapper.swapDescending(countMinArray(array), array);
        logger.log(Level.INFO, "Ordered in descending order of minimal elements of matrix rows");
        return array;
    }

    public int[][] sortAscendingOrderMinimumElements(int[][] array) {
        array = swapper.swapAscending(countMinArray(array), array);
        logger.log(Level.INFO, "Ordered in ascending order of minimal elements of matrix rows");
        return array;
    }

    private int[] countMinArray(int[][] array) {
        int arrayLength = array.length;
        minArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            minArray[i] = Integer.MAX_VALUE;
            for (int j : array[i]) {
                if (minArray[i] > j) {
                    minArray[i] = j;
                }
            }
        }
        return minArray;
    }
}
