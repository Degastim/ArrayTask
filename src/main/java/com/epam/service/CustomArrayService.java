package com.epam.service;

import com.epam.entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CustomArrayService {
    private static Logger logger = LogManager.getLogger();

    public void fillFromConsole(CustomArray arrayWrapper) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements of the array");
            int number = scanner.nextInt();
            int[] array = arrayWrapper.getArray();
            int arrayLength = array.length;
            array = Arrays.copyOf(array, arrayLength + number);
            for (int i = 0; i < number; i++) {
                array[arrayLength + i] = scanner.nextInt();
            }
            arrayWrapper.setArray(array);
            logger.info("Array filled from console");
        } catch (IndexOutOfBoundsException e) {
            logger.error("Array not filled from console");
        }
    }

    public void fillFromFile(CustomArray arrayWrapper, String fileName) {
        int[] array = arrayWrapper.getArray();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream("data/" + fileName));
            while (scanner.hasNextInt()) {
                int arrayLength = array.length;
                array = Arrays.copyOf(array, arrayLength + 1);
                array[arrayLength] = scanner.nextInt();
            }
            arrayWrapper.setArray(array);
            logger.info("Array filled from file");
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "Error filling from file.Error" + e);
        } finally {
            scanner.close();
        }
    }

    public void fillRandomNumber(CustomArray arrayWrapper, int numberNewElement) {
        int[] array = arrayWrapper.getArray();
        final int MULTIPLIER = 100;
        int arrayLength = array.length;
        array = Arrays.copyOf(array, arrayLength + numberNewElement);
        for (int i = 0; i < arrayLength + numberNewElement; i++) {
            array[i] = (int) (Math.random() * MULTIPLIER);
        }
        arrayWrapper.setArray(array);
        logger.info("Array is filled with random numbers");
    }
}
