package com.epam.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SorterOrderSumsElement {
    private static Logger logger = LogManager.getLogger();
    int[] sumArray;
    Swapper swapper = new Swapper();

    public int[][] sortAscendingOrder(int[][] array) {
        array = swapper.swapAscending(countRowSums(array), array);
        logger.log(Level.INFO, "Ordered in ascending order of the sums of the elements of the rows of the matrix");
        return array;
    }

    public int[][] sortDescendingOrder(int[][] array) {
        array = swapper.swapDescending(countRowSums(array), array);
        logger.log(Level.INFO, "Ordered in descending order of the sums of the elements of the rows of the matrix");
        return array;
    }

    private int[] countRowSums(int[][] array) {
        sumArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j : array[i]) {
                sumArray[i] += j;
            }
        }
        return sumArray;
    }
}
