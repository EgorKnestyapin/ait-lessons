package unit_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {
    int[] array;

    @BeforeEach
    void setUp() {
        array = new int[]{10, 20, 30, 40, 50, 60, 70};
    }

    @Test
    void sumElOddIndex() {
        assertEquals(120, ArraySum.sumElOddIndex(array));
    }
}