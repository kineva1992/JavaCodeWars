package com.ky7;

public class AngleSum {

    /**
     * Find the total sum of internal angles (in degrees) in an n-sided simple polygon. N will be greater than 2.
     * @param n
     * @return
     */
    public static int sumOfAngles(int n) {
        if(n < 3)
            return 0;
        return ((n - 2) * 180);
    }
}
