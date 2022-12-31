package com.Test.ky7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.ky7.Dinglemouse;

public class DinglemouseTest {
    @Test
    public void test() {
        assertEquals("Clint Eastwood", new Dinglemouse("Clint", "Eastwood").getFullName());
    }
}
