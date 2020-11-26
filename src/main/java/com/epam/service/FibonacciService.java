package com.epam.service;

import com.epam.entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

public class FibonacciService {
    private static Logger Logger = LogManager.getLogger();

    public int[] findingFibonacciNumbers(CustomArray arrayWrapper) {
        int counter = 0;
        int[] resultArray = new int[0];
        int[] array = arrayWrapper.getArray();
        for (int i : array) {
            if (Math.sqrt(5 * Math.pow(i, 2) + 4) % 1 == 0 || Math.sqrt(5 * Math.pow(i, 2) - 4) % 1 == 0) {
                resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                resultArray[counter] = i;
                counter++;
            }
        }
        Logger.log(Level.INFO, "Found fibonacci numbers in array");
        return resultArray;
    }
}
