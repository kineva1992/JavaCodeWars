package com.Test.ky7;

import static org.junit.Assert.*;
import org.junit.Test;

import com.ky7.*;

public class AmagramDetectionTest {

    @Test
    public void Test1(){
        assertEquals(true, AmagramDetection.isAnagram("foefet", "toffee"));
        assertEquals(true, AmagramDetection.isAnagram("Buckethead", "DeathCubeK"));
        assertEquals(true, AmagramDetection.isAnagram("Twoo", "Woot"));
        assertEquals(false, AmagramDetection.isAnagram("apple", "pale"));
    }

}
