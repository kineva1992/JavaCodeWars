package com.ky7;


import java.util.Arrays;


public class CalculateAverage {

    /*Write a function which calculates the average of the numbers in a given list.

    Note: Empty arrays should return 0.*/

    public static double find_average(int[] array){
        double sum = 0, avg = 0;
        if(array.length == 0)
            return 0;
        else
        {
            for(int i = 0; i < array.length;i++)
            {
                sum += array[i];
                avg = sum / array.length;
            }
            return avg;
        }
    }

    public static double find_averageVer2(int[] array){
       return Arrays.stream(array).average().orElse(0);
    }
}
