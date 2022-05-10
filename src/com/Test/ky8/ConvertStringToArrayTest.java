package com.Test.ky8;

import com.ky8.ConvertStringToArray;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class ConvertStringToArrayTest {

    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, ConvertStringToArray.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, ConvertStringToArray.stringToArray("I love arrays they are my favorite"));
    }
}
