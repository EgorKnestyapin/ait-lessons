package ait.homework.test;

import ait.homework.utils.OddEvenComparator;
import ait.homework.utils.OddEvenComparatorVersion2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenComparatorTest {
    Integer[] nums;

    @BeforeEach
    void setUp() {
        nums = new Integer[]{1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
    }

    /* Write OddEvenComparator implementing Comparator with the method compare for sorting an array of Integers
    in the order: The even integers should go before odd numbers.
     */
    @Test
    void testOddEvenComparator() {
        System.out.println("==== testOddEvenComparator ====");
        Arrays.sort(nums, new OddEvenComparator());
        System.out.println(Arrays.toString(nums));
    }

    @Test
    void testOddEvenComparatorLambda() {
        System.out.println("==== testOddEvenComparatorLambda ====");
        Arrays.sort(nums, (num1, num2) -> num1 % 2 - num2 % 2);
        System.out.println(Arrays.toString(nums));
    }

    /* Update OddEvenComparator with the method compare for sorting an array of Integers in the order: The even
    integers should go before odd numbers in the ascending order . The odd integers should go after the even ones
    in the descending order. Write Junit Test Case for OddEvenComparator.
     */
    @Test
    void testOddEvenComparatorVersion2() {
        System.out.println("==== testOddEvenComparatorVersion2 ====");
        Integer[] expected = {2, 4, 6, 8, 9, 7, 5, 3, 3, 1};
        Arrays.sort(nums, new OddEvenComparatorVersion2());
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void testOddEvenComparatorLambdaVersion2() {
        System.out.println("==== testOddEvenComparatorLambdaVersion2 ====");
        Integer[] expected = {2, 4, 6, 8, 9, 7, 5, 3, 3, 1};
        Arrays.sort(nums, (num1, num2) -> {
            int res = num1 % 2 - num2 % 2;
            return res != 0 ? res : (num1 % 2 == 0) && (num2 % 2 == 0) ? num1 - num2 : num2 - num1;
        });
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }
}