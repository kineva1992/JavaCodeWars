package com.ky7;

import java.util.Locale;

public class Accumul {
    public static String accum(String s) {
        StringBuilder bilder = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = -1; j < i; j++)
            {
                if(j == -1)
                    bilder.append(String.valueOf(arr[i]).toUpperCase(Locale.ROOT));
                else bilder.append(String.valueOf(arr[i]).toLowerCase(Locale.ROOT));
            }
            bilder.append("-");
        }
        return bilder.substring(0,bilder.length() - 1);
    }
}
