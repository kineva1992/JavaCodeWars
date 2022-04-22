package com.ky8;

/*Complete the square sum function so that it squares each number passed into it and then sums the results together.*/

public class SquareSum {

    public static void main(String[] args)
    {
        System.out.println(SquareSum.squareSumVer2(new int[] {1,2,2}));
    }

    public static int squareSum(int[] n)
    {
        int sum = 0;

        for(int i = 0; i < n.length; i++)
        {
            sum += n[i] * n[i];
        }
        return sum;
    }

    public static int squareSumVer2(int[] n)
    {
        int sum = 0;
        for(int i : n)
        {
            sum += i * i;
        }
        return sum;
    }

}
