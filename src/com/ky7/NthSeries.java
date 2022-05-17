package com.ky7;

public class NthSeries {


    public static String seriesSum(int n) {
        double result = 0.0;
        for(int i = 0; i < n; i++)
        {
            result += 1.0 / (1 + 3 * i);
        }
        return String.format("%.2f", result);
    }

}


