package com.ky7;

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
     if(a1.length == 0 || a2.length == 0)
         return -1;

     int maxA1 = 0, minA1 = a1[0].length();
     int maxA2 = 0, minA2 = a2[0].length();

     for(String a : a1)
     {
         maxA1 = Math.max(maxA1, a.length());
         minA1 = Math.min(minA1, a.length());
     }

     for(String a : a2)
     {
         maxA2 = Math.max(maxA2, a.length());
         minA2 = Math.min(minA2, a.length());
     }
     return Math.max(Math.abs(maxA1 - minA2), Math.abs(maxA2 - minA1));
    }
}
