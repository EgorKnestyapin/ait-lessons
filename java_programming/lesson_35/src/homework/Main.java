package homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List<Integer> list1 = Arrays.asList(1,2,3,4);
        // List<Integer> list2 = List.of(5,2,3,8);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>(list1);
        list2.add(5);
        list2.add(2);
        list2.add(3);
        list2.add(8);
        System.out.println(getEqualSameElementInTwoLists(list1, list2)); // [No, Yes, Yes, No]

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(1);
        System.out.println(getListWithoutNumbersMoreThan(list, 5)); // [4, 1]
    }
    /* Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист, содержащий элементы Yes
    или No, где значения на i-м месте зависит от того, равны ли элементы этих двух листов под номером i.
    Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
     */
    public static List<String> getEqualSameElementInTwoLists(List<Integer> list1, List<Integer> list2) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                res.add("Yes");
            } else {
                res.add("No");
            }
        }
        return res;
    }

    // Написать метод, принимающий лист целых чисел и целое число и возвращающий лист без элементов больших этого числа.
    public static List<Integer> getListWithoutNumbersMoreThan(List<Integer> list, int num) {
        List<Integer> res = new ArrayList<>();
        res.addAll(list);
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > num) {
                iterator.remove();
            }
        }
        return res;
    }
}
