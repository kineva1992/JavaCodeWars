package com.Test.ky7;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.ky7.ListFiltering;


public class ListFilteringTest {

    @Test
    public void Test1(){
        assertEquals(List.of(1, 2), ListFiltering.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
        assertEquals(List.of(1, 0, 15), ListFiltering.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
        assertEquals(List.of(1, 2, 123), ListFiltering.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }
}
