package com.ky7;

import java.util.Arrays;

public class FindTheStrayNumber {
    public static int stray(int[] numbers) {
        Arrays.sort(numbers);

        int compareValue = (int)numbers[1];
        int resultValue = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            if(compareValue == numbers[i])
            {
                continue;
            }
            else
            {
                resultValue = numbers[i];
            }
            return resultValue;
        }
        return (int)resultValue;
    }
}
