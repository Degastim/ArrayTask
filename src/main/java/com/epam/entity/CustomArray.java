package com.epam.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray(int[] array) {
        this.array = array;
    }

    public CustomArray() {
        this.array = new int[0];
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = array;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomArray customArrayObject = (CustomArray) o;
        int[] arrayObject = customArrayObject.array;
        if (arrayObject.length != array.length) {
            return false;
        }
        int i = 0;
        while (i < arrayObject.length) {
            if (arrayObject[i] != array[i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int[] thisArray = this.array;
        int sum = thisArray[0];
        for (int i = 1; i < thisArray.length; i++) {
            sum += i * thisArray[i];
        }
        return sum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Array{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }

}
