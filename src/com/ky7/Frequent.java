package com.ky7;

import java.util.ArrayList;
import java.util.Collections;


/***
 * Complete the function to find the count of the most frequent item of an array.
 * You can assume that input is an array of integers. For an empty array return 0
 *
 * Example
 *
 * input array: [3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3]
 * ouptut: 5
 *
 * The most frequent number in the array is -1 and it occurs 5 times.
 */

public class Frequent {

    public static int mostFrequentItemCount(int[] collection) {

        ArrayList<Integer> arr = new ArrayList<>();
        int most = 0;
        int b = 0;

        if(collection.length == 0) return 0;

        else{
            for(int i : collection){
                arr.add(i);
            }


            for(int i : arr){
                b = Collections.frequency(arr,i);
                if(b > most)
                 most = b;
            }
            return most;
        }
    }

}
