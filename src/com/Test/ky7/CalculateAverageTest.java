package com.Test.ky7;

import com.ky7.CalculateAverage;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class CalculateAverageTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, CalculateAverage.find_averageVer2(new int[]{1,1,1}), DELTA);
        assertEquals(2, CalculateAverage.find_averageVer2(new int[]{1, 2, 3}), DELTA);
    }

}
