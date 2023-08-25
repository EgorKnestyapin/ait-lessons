package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateTest {
    Duplicate duplicate;

    int[] array;

    @BeforeEach
    void setUp() {
        array = new int[]{5, 6, 8, 3, 5, 2, 7};
    }

    @Test
    void findDuplicates() {
        assertTrue(Duplicate.findDuplicates(array));
        array = new int[]{5, 4, 7, 2, 1};
        assertFalse(Duplicate.findDuplicates(array));
        array = new int[]{5, 4, 7, 2, 5};
        assertTrue(Duplicate.findDuplicates(array));
    }
}