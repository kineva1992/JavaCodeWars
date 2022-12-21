package com.Test.ky7;

import com.ky7.PowersOfI;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class PowersOfITest {

    @Test
    public void powersOfI(){
        assertEquals("1", PowersOfI.pofi2(0));
        assertEquals("i", PowersOfI.pofi2(1));
        assertEquals("-1",PowersOfI.pofi2(2));
        assertEquals("-i",PowersOfI.pofi2(3));
        assertEquals("1",PowersOfI.pofi2(4));
        assertEquals("i",PowersOfI.pofi2(5));
        assertEquals("-1",PowersOfI.pofi2(6));
        assertEquals("-i",PowersOfI.pofi2(7));
        assertEquals("1",PowersOfI.pofi2(8));
        assertEquals("i",PowersOfI.pofi2(9));
        assertEquals("-1",PowersOfI.pofi2(10));
    }

}
