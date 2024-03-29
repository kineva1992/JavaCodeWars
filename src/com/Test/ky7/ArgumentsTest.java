package com.Test.ky7;

import com.ky7.Arguments;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.math.BigInteger;

public class ArgumentsTest {

    @Test
    public void sampleTest(){
        assertEquals(3, Arguments.countArgs(1,2,3));
        assertEquals(3, Arguments.countArgs(1, 2, "uhsaf uas"));
        assertEquals(1, Arguments.countArgs(1));
        assertEquals(4, Arguments.countArgs('a', 865, "asfhgajsf", new BigInteger("123456")));
        assertEquals(0, Arguments.countArgs());
    }
}
