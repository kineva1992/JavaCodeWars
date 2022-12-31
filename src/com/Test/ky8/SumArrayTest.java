package com.Test.ky8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SumArrayTest {

    @Test
    public void sampleTests() {
        assertEquals(21, SumArray.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, SumArray.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, SumArray.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, SumArray.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }
}
