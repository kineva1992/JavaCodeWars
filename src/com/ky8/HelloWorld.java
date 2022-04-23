package com.ky8;


import java.util.Locale;

public class HelloWorld {

    public static final String HELLO = "Hello";
    public static final String WORLD = "World";
    public static final boolean isBool = false;

    public static String great()
    {

        if(isBool)
        {
            return new String("████▀▀▀▀▀▀▐████\n" +
                    "█▐██▐▐▐▐▐▐▐▐█▐█\n" +
                    "██▐█▐▐▐▐▐▐▐████\n" +
                    "█▐██▐▐▐▐▐▐▐▐█▐█\n" +
                    "██▐█▐▐▐▐▐▐▐████\n" +
                    "█▐██▐▐▐▐▐▐▐▐█▐█\n" +
                    "██▐█▐▐▐▐▐▐▐████\n" +
                    "█▐██▐▐▐▐▐▐▐▐█▐█\n" +
                    "██▐█▐▐▐▐▐▐▐████\n" +
                    "████▄▄▄▄▄▄▐████\n" +
                    "\n" +
                    "[:|||||||:] ... [:||||:] ... [:|||||||:]\n" +
                    "\n" +
                    "\n");
        }
        else
        {
            return HELLO.toLowerCase(Locale.ROOT) + " " + WORLD.toLowerCase(Locale.ROOT) + "!";
        }





    }

}
