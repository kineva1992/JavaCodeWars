package com.ky7;

/*      Filter the number
        Oh, no! The number has been mixed up with the text. Your goal is to retrieve the number from the text, can you return the number back to its original state?

        Task
        Your task is to return a number from a string.

        Details
        You will be given a string of numbers and letters mixed up, you have to return all the numbers in that string in the order they occur.*/


public class FilterTheNumber {

    public static void main(String[] args)
    {
        System.out.println(FilterTheNumber.filterString("aa1bb2cc3dd"));
    }

    public static long filterString(final String value) {

        String resultSting = value.replaceAll("[^0-9]","");

        return Long.parseLong(resultSting);
    }

}
