package com.epam.service;

import com.epam.entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

public class SearchService {
    private static Logger logger = LogManager.getLogger();

    public int searchMaxNumber(CustomArray arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int maxNumber = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        logger.log(Level.INFO, "Found max number in array");
        return maxNumber;
    }

    public int searchMinNumber(CustomArray arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int minNumber = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < minNumber) {
                minNumber = i;
            }
        }
        logger.log(Level.INFO, "Found min number in array");
        return minNumber;
    }

    public int[] searchThreeDigitNumbersWithoutRepetitions(CustomArray arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int[] resultArray = new int[0];
        int counter = 0;
        final int LOWER_LIMIT_RANGE = 100;
        final int UPPER_LIMIT_RANGE = 999;
        for (int i : array) {
            if (i >= LOWER_LIMIT_RANGE && i <= UPPER_LIMIT_RANGE) {
                int thirdDigit = i % 10;
                int secondDigit = ((i - thirdDigit) / 10) % 10;
                int firstDigit = i / 100;
                if (thirdDigit != secondDigit && secondDigit != firstDigit) {
                    resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                    resultArray[counter] = i;
                    counter++;
                }
            }
        }
        logger.log(Level.INFO, "Found all three-digit numbers that do not have the same decimal notation");
        return resultArray;
    }

    public int binarySearch(CustomArray arrayWrapper, int searchValue) {
        int[] array = arrayWrapper.getArray();
        int arrayLength = array.length;
        int position = (arrayLength - 1) / 2;
        int last = arrayLength - 1;
        int first = 0;
        while ((array[position] != searchValue)) {
            if (array[position] > searchValue) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        logger.log(Level.INFO, "Performed binary search for number" + searchValue);
        return position;
    }
}
