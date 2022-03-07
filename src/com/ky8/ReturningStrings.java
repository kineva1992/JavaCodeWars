package com.ky8;

public class ReturningStrings {
    public static String greet(String name)
    {
        if(name.equals(" ") || name.equals(""))
        {
            return "Hello";
        }
        else {
            return "Hello,"+" " + name +" " +"how are you doing today?";
        }
    }
    public static void main(String[] args)
    {
        System.out.println(greet(""));
    }
}
