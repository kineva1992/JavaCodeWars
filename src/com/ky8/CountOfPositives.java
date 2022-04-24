package com.ky8;

public class CountOfPositives {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int[] resultSums = new int[2];

        if(input == null || input.length == 0)
        {
            return new int[] {};
        }

        else if(input != null || input.length > 0)
        {
            for(int i : input)
            {
                if(i > 0) resultSums[0] += 1;
                if(i < 0) resultSums[1] += i;
            }
            return resultSums;
        }
        else
        return input;
    }
}
