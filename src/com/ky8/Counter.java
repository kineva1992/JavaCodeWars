package com.ky8;

import org.jetbrains.annotations.NotNull;

public class Counter {

    public static void main(String[] args)
    {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        Counter couter = new Counter();
        System.out.println(couter.countSheeps(array1));
    }

    public int countSheeps(Boolean[] arrayOfSheeps) {

        if(arrayOfSheeps.length == 0)
            return 0;
        int count = 0;
        for(int i = 0; i < arrayOfSheeps.length;i++)
        {
            if(arrayOfSheeps[i] != null && arrayOfSheeps[i] == true)
                count += 1;

            else{
                count += 0;
            }
        }

        return count;
    }
}
