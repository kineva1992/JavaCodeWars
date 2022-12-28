package com.ky7;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> newList = new ArrayList<>();

        for(Object s : list){
            if(s instanceof Integer)
            {
                newList.add(s);
            }
            else
                continue;
        }
        return newList;
    }
}
