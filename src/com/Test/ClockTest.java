package com.Test;

import com.ky8.Clock;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClockTest {

    @Test
    public void test1()
    {
        assertEquals(61000, Clock.Past(0,1,1));
    }
}
