package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 7, 9, 3, 1);
        System.out.println(findPairNumSum1(list, 2));
        System.out.println(findPairNumSum2(list, 15));
    }

    /* Дан List<Integer>. Написать метод, который определит, есть лм в этом списке такая пара чисел,
    которые в сумме дают заданное число N.
     */
    public static boolean findPairNumSum1(List<Integer> list, int N) {
        List<Integer> res = new ArrayList<>(list);
        for (int i = 0; i < res.size() - 1; i++) {
            boolean isContains = res.contains(N - res.get(i));
            if (isContains) {
                return true;
            }
        }
        return false;
    }

    public static boolean findPairNumSum2(List<Integer> list, int N) {
        List<Integer> res = new ArrayList<>(list);
        for (int i = 0; i < res.size() - 1; i++) {
            for (int j = i + 1; j < res.size(); j++) {
                int sum = res.get(i) + res.get(j);
                if (sum == N) {
                    return true;
                }
            }
        }
        return false;
    }
}
