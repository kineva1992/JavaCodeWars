package com.ky8;
import java.util.Arrays;
import java.lang.reflect.Array;

public class SortAndStar {
    public static String twoSort(String[] s) {

        java.util.Arrays.sort(s);
        return String.join("***", s[0].split(""));
    }
}
