package com.ky7;

public class PowersOfI {
    public static String pofi(int n) {

        int sign = PowersOfI.getSign(n);

        if(n % 2 == 0)
        {
            return sign == 1 ? "1":"-1";
        }
        else
            return sign == 1 ? "i":"-i";
    }

    private static int getSign(int n){
        int value = 1;
        int counter = 0;

        for(int i = 0; i <= n; i++){
            if(counter == 2)
            {
                value *= -1;
                counter++;
            }
        }
        return value < 0 ? -1 : 1;
    }


    public static String pofi2(int n){
        return new String[] {"1","i","-1","-i"}[n%4];
    }

}
