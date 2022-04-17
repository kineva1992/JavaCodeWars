package com.ky8;

public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        if(n % x == 0 && n % y == 0)
            return true;
        else if(n % x == 0 && n % y != 0)
            return false;
        else if(n % x != 0 && n % y == 0)
        return false;
        else
            return false;

    }
}
