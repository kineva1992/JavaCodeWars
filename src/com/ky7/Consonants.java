package com.ky7;

public class Consonants {

    private  boolean isConsonant(char ch){
        ch = Character.toUpperCase(ch);

        return !(ch == 'A' || ch == 'E' || ch == 'I'
        || ch == 'O' || ch == 'U') && ch >= 65 && ch <= 90;
    }

    public static int getCount(String str) {
        Consonants consonants = new Consonants();

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(consonants.isConsonant(str.charAt(i)))
                count++;
        }
        return count;
    }
}
