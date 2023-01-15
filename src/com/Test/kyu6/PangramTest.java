package com.Test.kyu6;

import com.ky6.Pangram;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class PangramTest {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        Pangram pc = new Pangram();
        assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        Pangram pc = new Pangram();
        assertEquals(false, pc.check(pangram2));
    }
}
