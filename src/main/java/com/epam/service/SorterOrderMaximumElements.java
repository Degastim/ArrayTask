package com.epam.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SorterOrderMaximumElements {
    private static Logger logger = LogManager.getLogger();
    int[] maxArray;
    Swapper swapper = new Swapper();

    public int[][] sortDescendingOrderMaximumElements(int[][] array) {
        array = swapper.swapDescending(countMaxArray(array), array);
        logger.log(Level.INFO, "Ordered in descending order of maximum elements of matrix rows;\n");
        return array;
    }

    public int[][] sortAscendingOrderMaximumElements(int[][] array) {
        logger.log(Level.INFO, "Ordered in ascending order of maximum elements of matrix rows;\n");
        array = swapper.swapAscending(countMaxArray(array), array);
        return array;
    }

    private int[] countMaxArray(int[][] array) {
        int arrayLength = array.length;
        maxArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            maxArray[i] = Integer.MIN_VALUE;
            for (int j : array[i]) {
                if (maxArray[i] < j) {
                    maxArray[i] = j;
                }
            }
        }
        return maxArray;
    }
}
