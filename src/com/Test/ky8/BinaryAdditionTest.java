package com.Test.ky8;

import com.ky8.BinaryAddition;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryAdditionTest {
    @ParameterizedTest(name = "a = {1}, b = {2}")
    @CsvSource(value = """
                   10,    1,   1
                    1,    0,   1
                    1,    1,   0
                  100,    2,   2
               111111,   51,  12
    """)
    @DisplayName("Sample tests")
    void sampleTests(String expected, int a, int b) {
        assertEquals(expected, BinaryAddition.binaryAddition(a, b));
    }
}
