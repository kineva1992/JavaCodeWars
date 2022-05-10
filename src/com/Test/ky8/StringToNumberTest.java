package com.Test.ky8;

import com.ky8.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringToNumberTest {

    @Test
    public void test1()
    {
        assertEquals("stringToNumber(1234)",1234,StringToNumber.stringToNumber("1234"));
    }
    public void test2()
    {
        assertEquals("stringToNumber(604)",604,StringToNumber.stringToNumber("604"));
    }
}
