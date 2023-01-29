package com.Test.ky7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.ky7.DoubleValueEveryNextCall;

public class DoubleValueEveryNextCallTest {

    @Test
    void basicTest(){

        DoubleValueEveryNextCall A = new DoubleValueEveryNextCall();

        assertEquals(1, A.getNumber());
        assertEquals(2, A.getNumber());
        assertEquals(4, A.getNumber());
        assertEquals(8, A.getNumber());
        assertEquals(16, A.getNumber());
    }
}
