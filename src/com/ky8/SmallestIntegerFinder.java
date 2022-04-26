package com.ky8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;



public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }

    public static int findSmallestIntVer2(int [] args) {
        int result = args[0];
        for (int i : args)
        {
            if(i < result)
            {
                result = i;
            }
        }
        return result;

    }
}
