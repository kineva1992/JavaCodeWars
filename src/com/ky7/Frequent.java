package com.ky7;

import java.util.ArrayList;
import java.util.Collections;

 abstract class FrequenJ{

    int count = 0;

     int intmostFrequentItemCount(){
        return count;
     }
}

public abstract class Frequent extends FrequenJ {


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
