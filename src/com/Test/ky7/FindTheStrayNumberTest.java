package com.Test.ky7;

import com.ky7.FindTheStrayNumber;
import com.ky7.Sum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindTheStrayNumberTest {

    @Test
    public void Test(){
        assertEquals(2,getActualFor(1,1,2));
        assertEquals(3,getActualFor(17, 17, 3, 17, 17, 17, 17));
    }

/*    private int getActualFor(int... number)
    {
        return FindTheStrayNumber.stray(number);
    }*/

    private int getActualFor(int... number)
    {
        return FindTheStrayNumber.stray(number);
    }
}
