package com.ky7;

import java.util.Arrays;
import java.util.Locale;

public class AmagramDetection {

    public static boolean isAnagram(String test, String original) {
        if(test.length() != original.length())
            return false;

       test =  test.toLowerCase(Locale.ROOT);
       original = original.toLowerCase(Locale.ROOT);

        char[] s1 = test.toCharArray();
        char[] s2 = original.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        String s1ToTest = new String(s1);
        String s2ToOriginal = new String(s2);

        return s1ToTest.equals(s2ToOriginal);
    }

}
