package com.ky7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HighAndLow {

    public static String highAndLow(String numbers) {

        String[] numberToArray = numbers.split(" ");

        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0; i < numberToArray.length; i++)
        {
            list.add(Integer.parseInt(numberToArray[i]));
        }
        Collections.sort(list);

        return list.get(list.size() - 1) + " " + list.get(0);

    }
}
