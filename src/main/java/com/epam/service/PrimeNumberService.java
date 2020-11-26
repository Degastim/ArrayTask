package com.epam.service;

import com.epam.entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

public class PrimeNumberService {
    private static Logger Logger = LogManager.getLogger();

    public int[] findPrimeNumbers(CustomArray arrayWrapper) {
        int counter = 0;
        int[] resultArray = new int[0];
        int[] array = arrayWrapper.getArray();
        boolean NotPrimeNumber = true;
        for (int i : array) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    NotPrimeNumber = false;
                }
            }
            if (NotPrimeNumber) {
                resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                resultArray[counter] = i;
                counter++;
            }
            NotPrimeNumber = true;
        }
        Logger.log(Level.INFO, "Found prime numbers in array");
        return resultArray;
    }
}
