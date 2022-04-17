package com.ky8;


/*Complete the solution so that it reverses the string passed into it.

        'world'  =>  'dlrow'
        'word'   =>  'drow'*/

//Complete the solution so that it reverses the string passed into it.
public class ReversedStrings {

    public static void main(String[] args)
    {
        ReversedStrings revers = new ReversedStrings();

        System.out.println(revers.solution2("world"));
    }

    public static String solution(String str) {
        StringBuilder bilder = new StringBuilder(str);
        bilder.reverse();
        return bilder.toString();
    }

    public String solution2(String str) {

        String result = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            result += str.charAt(i);
        }

        return result;

    }
}
