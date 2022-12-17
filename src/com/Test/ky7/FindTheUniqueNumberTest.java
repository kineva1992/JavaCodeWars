package com.Test.ky7;

import com.ky7.FindTheUniqueNumber;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class FindTheUniqueNumberTest {
    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindTheUniqueNumber.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindTheUniqueNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertEquals(0.55,FindTheUniqueNumber.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }),precision);
    }
}
