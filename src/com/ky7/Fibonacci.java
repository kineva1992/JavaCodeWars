package com.ky7;

public class Fibonacci {

    public static long fib (int n){
        if(n == 1 || n == 2)
            return 1;
        if(n < 47)
            return fib(n - 2) + fib(n -1);
        else
        {
            long a[] = new long[n];
            a[0] = 1;
            a[1] = 1;
            for(int i = 2; i < n; i++)
            {
                a[i] = a[i - 1] + a[i - 2];
            }
            return a[n - 1];
        }


    }
}
