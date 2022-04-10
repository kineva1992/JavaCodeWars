package com.ky8;

//Complete the solution so that it reverses the string passed into it.
public class ReversedStrings {

    public static String solution(String str) {
        StringBuilder bilder = new StringBuilder(str);
        bilder.reverse();
        return bilder.toString();
    }
}
