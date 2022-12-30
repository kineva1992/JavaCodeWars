package com.Test.ky7;

import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;
import com.ky7.ChangingLetters;

public class ChangingLettersTest {

    @Test
    public void swap_1() {
        assertEquals("HEllOWOrld!",ChangingLetters.swap("HelloWorld!"));
    }

    @Test
    public void swap_2() {
        assertEquals("SUndAy",ChangingLetters.swap("Sunday"));
    }
}
