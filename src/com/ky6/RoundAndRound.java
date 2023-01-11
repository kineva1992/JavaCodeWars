package com.ky6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundAndRound {
    /**
     * Since there are lots of katas requiring you to round numbers to 2 decimal places, you decided to extract the method to ease out the process.
     *
     * And you can't even get this right!
     *
     * Quick, fix the bug before everyone in CodeWars notices that you can't even round a number correctly!
     *
     * @param number
     * @return
     */

    public static double roundTo2DecimalPlaces(double number) {
        return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
