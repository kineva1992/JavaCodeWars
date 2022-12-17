package com.ky8;

public class BinaryAddition {

    /**
     * Implement a function that adds two numbers together and returns their sum in binary. The conversion can be done before, or after the addition.
     *
     * The binary number returned should be a string.
     *
     * Examples:(Input1, Input2 --> Output (explanation)))
     * 1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
     * 5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)
     *
     * @param a first param
     * @param b second param
     * @return conversion toStringBirary
     */
    public static String binaryAddition(int a, int b)
    {
        int resultParam = a + b;
        return Integer.toString(resultParam, 2);
    }
}
