package com.ky7;

public class DoubleValueEveryNextCall {

    /***
     * DESCRIPTION:
     * This kata is about static method that should return different values.
     * On the first call it must be 1, on the second and others - it must be a double from previous value.
     *
     * Look tests for more examples, good luck :)
     */


    private static int num = 1;
    public static int getNumber() {
        int number = num;
        num += num;
        return number;
    }
}
