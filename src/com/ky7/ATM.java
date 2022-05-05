package com.ky7;

public class ATM {
    public int solve(int n) {

        int[] nominals = {500,200,100,50,20,10};
        int count = 0;
        int rem = n;

        if(n % 10 != 0)
            return -1;
        else
        {
            for(int i = 0; i < nominals.length; i++)
            {
                if(rem == 0)
                    break;

                count += rem / nominals[i];
                rem = rem % nominals[i];
            }
            return count;
        }
    }
}
