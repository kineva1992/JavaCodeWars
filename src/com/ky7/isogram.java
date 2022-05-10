package com.ky7;


import java.util.*;

public class isogram {
    public static boolean  isIsogram(String str) {

        return str.length() == 0 ? true : str.length() == new HashSet<>(Arrays.asList(str.toLowerCase().split(""))).size();
    }
}
