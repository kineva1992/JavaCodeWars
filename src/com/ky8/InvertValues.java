package com.ky8;

public class InvertValues {
    public static int[] invert(int[] array) {

        int[] resultArray = new int[array.length];
        if(array == null || array.length == 0)
            return new int[0];
        else{
        for(int i = 0; i < array.length; i++)
        {
            resultArray[i] = array[i] * -1;
        }
        return resultArray;
        }
    }
}
