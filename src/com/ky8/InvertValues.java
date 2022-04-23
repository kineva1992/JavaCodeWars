package com.ky8;

public class InvertValues {
    public static int[] invert(int[] array) {

        int[] resultArray = new int[array.length];
        for(int i = 0; i < array.length; i++)
        {
            resultArray[i] = array[i] * -1;
        }
        return resultArray;
    }
}
