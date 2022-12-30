package com.ky7;

public class ChangingLetters {

    public static String swap(String st){

        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

        for(int i = 0; i < 5; i++){

            st = st.replace(vowels[i], vowels[i + 5]);

        }
        return st;
    }

}
