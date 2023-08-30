package ait.homework.utils;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 % 2 - o2 % 2;
    }
}
