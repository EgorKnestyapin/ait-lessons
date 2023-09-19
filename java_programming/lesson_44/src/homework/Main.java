package homework;

import java.util.*;

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
        if (list == null || list.size() < 2) return false;
        for (int i = 0; i < list.size() - 1; i++) {
            boolean isContains = list.contains(N - list.get(i));
            if (isContains) {
                return true;
            }
        }
        return false;
    }

    public static boolean findPairNumSum2(List<Integer> list, int N) {
        if (list == null || list.size() < 2) return false;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int sum = list.get(i) + list.get(j);
                if (sum == N) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findPairNumSum3(List<Integer> list, int N) {
        if (list == null || list.size() < 2) return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(N - list.get(i))) {
                return true;
            }
            set.add(N - list.get(i));
        }
        return false;
    }

    public static boolean findPairNumSum4(List<Integer> list, int N) {
        if (list == null || list.size() < 2) return false;
        Collections.sort(list);
        int lIndex = 0;
        int rIndex = list.size() - 1;
        while (lIndex < rIndex) {
            int lValue = list.get(lIndex);
            int rValue = list.get(rIndex);
            int sum = lValue + rValue;
            if (sum == N) {
                return true;
            }
            if (sum < N) {
                lIndex++;
            } else {
                rIndex--;
            }
        }
        return false;
    }
}
