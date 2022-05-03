package com.ky7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BingoOrNot {
    public static String bingo(int[] numberArray){
        var nums = Arrays.stream(numberArray).boxed().collect(Collectors.toList());
        return "BINGO".chars().map(i -> i - 64).allMatch(nums::contains)? "WIN" : "LOSE";
    }
}
