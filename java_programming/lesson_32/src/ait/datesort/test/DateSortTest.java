package ait.datesort.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;

public class DateSortTest {
    Comparator<String> dateComparator;

    @BeforeEach
    void setUp() {
        dateComparator = (s1, s2) -> {
            int[] date1 = new int[3];
            int[] date2 = new int[3];
            for (int i = 0; i < 3; i++) {
                date1[i] = Integer.parseInt(s1.split("-")[i]);
                date2[i] = Integer.parseInt(s2.split("-")[i]);
            }
            if (date1[2] > date2[2]) {
                return 1;
            } else if (date1[2] < date2[2]) {
                return -1;
            } else {
                if (date1[1] > date2[1]) {
                    return 1;
                } else if (date1[1] < date2[1]) {
                    return -1;
                } else {
                    if (date1[0] > date1[0]) {
                        return 1;
                    } else if (date1[0] < date2[0]) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, dateComparator);
        assertArrayEquals(expected, dates);
    }
}