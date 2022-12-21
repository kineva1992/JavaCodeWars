package com.Test.ky7;

import com.ky7.Sum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SumTest {

    Sum sum = new Sum();

    @Test
    public void TestSum()
    {
        assertEquals(-1, sum.GetSum(0,-1));
        assertEquals(1,sum.GetSum(0,1));
        assertEquals(3, sum.GetSum(1,2));
        assertEquals(2, sum.GetSum(-1,2));
    }

}
