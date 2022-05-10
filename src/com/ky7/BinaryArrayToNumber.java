package com.ky7;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int i = 0,p = 0;

        for(int index : binary)
            i = i << 1 | index;
        return i;

    }
}
