package com.ky8;

/*We need a function that can transform a number into a string.

        What ways of achieving this do you know?

        Examples:
        123 --> "123"
        999 --> "999"*/

public class ConvertNumberString {

    public static void main(String[] args)
    {
        System.out.println(ConvertNumberString.numberToString(5));
    }

    public static String numberToString(int num) {
        return String.valueOf(num);
    }
}
