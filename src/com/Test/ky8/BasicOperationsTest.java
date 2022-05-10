package com.Test.ky8;

import com.ky8.BasicOperations;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.runners.JUnit4;

public class BasicOperationsTest {
    BasicOperations basicOps = new BasicOperations();

    @Test
    public void testBasics()
    {
        System.out.println("Basic Tests");
        assertThat(basicOps.basicMathVer2("+", 4, 7), is(11));
        assertThat(basicOps.basicMathVer2("-", 15, 18), is(-3));
        assertThat(basicOps.basicMathVer2("*", 5, 5), is(25));
        assertThat(basicOps.basicMathVer2("/", 49, 7), is(7));
    }
}
