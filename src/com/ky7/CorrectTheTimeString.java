package com.ky7;

public class CorrectTheTimeString {
    /**
     * A new task for you!
     *
     * You have to create a method, that corrects a given time string.
     * There was a problem in addition, so many of the time strings are broken.
     * Time is formatted using the 24-hour clock, so from 00:00:00 to 23:59:59.
     *
     * Examples:
     * "09:10:01" -> "09:10:01"
     * "11:70:10" -> "12:10:10"
     * "19:99:99" -> "20:40:39"
     * "24:01:01" -> "00:01:01"
     *
     * If the input-string is null or empty return exactly this value! (empty string for C++) If the time-string-format is invalid, return null. (empty string for C++)
     *
     * Have fun coding it and please don't forget to vote and rank this kata! :-)
     *
     * I have created other katas. Have a look if you like coding and challenges.
     *
     * */
    public static String timeCorrect(String timestring)
    {
        if(timestring == null || timestring.equals(""))
            return null;
        if(!timestring.matches("\\d{2}:\\d{2}:\\d{2}"))
            return null;

        String[] element = timestring.split(":");

        int hour = Integer.parseInt(element[0]);
        int min = Integer.parseInt(element[1]);
        int second = Integer.parseInt(element[2]);

        min += second / 60;
        second = second % 60;
        hour += min / 60;
        min = min % 60;
        hour = hour % 24;

        return String.format("%02d:%02d:%02d", hour, min, second);

    }
}
