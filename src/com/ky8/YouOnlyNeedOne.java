package com.ky8;

import java.util.Arrays;
import java.util.Objects;

public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

    public static boolean checkVer2(Object[] a, Object x) {

        for(Object o : a)
        {
            if(Objects.equals(o,x))
                return true;
        }
        return false;
    }


}
