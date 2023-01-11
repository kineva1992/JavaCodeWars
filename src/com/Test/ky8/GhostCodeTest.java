package com.Test.ky8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;
import com.ky8.GhostCode;

public class GhostCodeTest {

    @Test
    public void exempleTest(){
        String result = GhostCode.helloName("Javatlacati");

        assertEquals("Hello my name is Javatlacati is not "+result,"Hello my name is Javatlacati",result);
    }
}
