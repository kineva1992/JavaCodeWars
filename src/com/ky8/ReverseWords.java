package com.ky8;

public class ReverseWords {
    public static String reverseWords(String str){
        if (str == null){
            return null;
        }
        str = str.trim();
        if ("".equals(str)){
            return "";
        }
        StringBuffer sentense = new StringBuffer();
        String[] words = str.split(" +");
        for (int i = words.length-1; i > 0; --i){
            sentense.append(words[i]+" ");
        }
        sentense.append(words[0]);

        return sentense.toString();
    }
}
