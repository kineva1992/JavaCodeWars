package com.Test.ky7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import com.ky7.AngleSum;


public class AngleSumTest {

    @Test
    public void test1(){
        assertEquals(180, AngleSum.sumOfAngles(3));
        assertEquals(360, AngleSum.sumOfAngles(4));
    }
}
