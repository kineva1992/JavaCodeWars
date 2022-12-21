package com.ky7;

public class Sum {
    public int GetSum(int a, int b) {
        if(a == b)
            return a;
        int sum = 0;
        if(a > b){
            for (int i = b; i <= a; i++){
                sum += i;
            }
        }
        else{
            for (int i = a; i <= b; i++){
                sum += i;
            }
        }
        return sum;
    }

    public int GetSumV2(int a, int b){
        int result = 0;
        for(int i = Math.min(a,b);i < Math.max(a,b); i++){
            result += i;
        }
        return a == b ? a : result;
    }
}
