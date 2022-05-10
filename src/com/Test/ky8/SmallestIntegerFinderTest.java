package com.Test.ky8;

import com.ky8.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SmallestIntegerFinderTest {
    @Test
    public void test1()
    {
        int expected = 11;
        int actual = SmallestIntegerFinder.findSmallestIntVer2(new int[]{78,56,232,12,11,43});
        assertEquals(expected,actual);
    }

    @Test
    public void test2()
    {
        assertEquals(-345, SmallestIntegerFinder.findSmallestInt(new int[]{34, -345, -1, 100}));
    }
}
