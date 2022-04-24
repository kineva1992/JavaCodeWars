package com.Test;

import com.ky8.YouOnlyNeedOne;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class YouOnlyNeedOneTest {
    @Test
    public void testSomething() {
        assertEquals(YouOnlyNeedOne.checkVer2(new Object[] {66, 101}, 66), true);
        assertEquals(YouOnlyNeedOne.checkVer2(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(YouOnlyNeedOne.checkVer2(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(YouOnlyNeedOne.checkVer2(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
    }
}
