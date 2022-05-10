package com.ky7;

import java.util.List;

public class BinaryArrayToNumber {
    /*Given an array of ones and zeroes, convert the equivalent binary value to an integer.

    Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.*/
/*    Examples:

    Testing: [0, 0, 0, 1] ==> 1
    Testing: [0, 0, 1, 0] ==> 2
    Testing: [0, 1, 0, 1] ==> 5
    Testing: [1, 0, 0, 1] ==> 9
    Testing: [0, 0, 1, 0] ==> 2
    Testing: [0, 1, 1, 0] ==> 6
    Testing: [1, 1, 1, 1] ==> 15
    Testing: [1, 0, 1, 1] ==> 11*/

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int i = 0,p = 0;

        for(int index : binary)
            i = i << 1 | index;
        return i;

    }
}
