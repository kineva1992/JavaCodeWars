package com.Test.ky7;

import static org.junit.Assert.*;

import java.util.Arrays;

import com.ky7.RoundToTheNextMultipleOf5;
import org.junit.Test;

public class RoundToTheNextMultipleOf5Test {
    @Test
    public void basicTests() {
        int[][] arr = {
                {0, 0},
                {1, 5},
                {3, 5},
                {5, 5},
                {7, 10},
                {39, 40}
        };
        Arrays.stream(arr)
                .forEach(
                        (testCase) -> {
                            assertEquals(
                                    "Input: " + testCase[0],
                                    testCase[1],
                                    RoundToTheNextMultipleOf5.roundToNext5(testCase[0]));
                        });
    }
}
