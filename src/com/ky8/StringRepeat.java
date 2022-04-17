package com.ky8;

public class StringRepeat {

/*    Write a function called repeatStr which repeats the given string string exactly n times.

    Exemple
    repeatStr(6, "I") // "IIIIII"
    repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"*/

    public static void main(String[] args){
        System.out.println(StringRepeat.repeatStr(4,"a"));

    }
    public static String repeatStr(final int repeat, final String string) {
        String resultString = "";
        for(int i = 0; i < repeat; i++)
        {
            resultString += string;
        }
        return resultString;
    }

    public static String repeatStrVer2(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < repeat; i++)
        {
            sb.append(string);
        }
        return sb.toString();
    }
}
