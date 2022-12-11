package com.Test.ky8;

import com.ky8.ReverceWordss;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReverseWordsTestWithSplit {

    @Test
    public static void ReverseWordsTestWithSplitMethod() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverceWordss.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReverceWordss.reverseWords("apple"));
        assertEquals("a b c d", ReverceWordss.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReverceWordss.reverseWords("double  spaced  words"));

    }
}
