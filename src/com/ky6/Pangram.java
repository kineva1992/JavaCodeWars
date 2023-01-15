package com.ky6;

public class Pangram {
    public boolean check(String sentence){
        for(char a = 'A'; a <= 'Z'; a++){
            if((sentence.indexOf(a) < 0) && (sentence.indexOf((char)(a + 32)) < 0))
                return false;
        }
        return true;
    }
}
