package com.Test.ky8;

import com.ky8.*;

import org.junit.Test;
import org.junit.jupiter.api.parallel.Execution;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void test1()
    {
        assertEquals("hello world!",HelloWorld.great());
    }
}
