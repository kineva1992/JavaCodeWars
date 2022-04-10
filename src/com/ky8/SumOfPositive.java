package com.ky8;

public class SumOfPositive {

    public static void main(String[] args)
    {
        SumOfPositive sums = new SumOfPositive();
        System.out.println(sums.sum(new int[]{1,2,3,4,5}));

    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i:arr)
        {
            if(i > 0)
                sum +=i;
        }
        return sum;
    }
}
