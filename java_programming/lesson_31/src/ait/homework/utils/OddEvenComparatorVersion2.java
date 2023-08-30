package ait.homework.utils;

import java.util.Comparator;

public class OddEvenComparatorVersion2 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int res = o1 % 2 - o2 % 2;
        return res != 0 ? res : (o1 % 2 == 0) && (o2 % 2 == 0) ? o1 - o2 : o2 - o1;
    }
}
