package homework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("St", "s", "Strin", "str", "stri", "string");
        System.out.println(getShortOrLongStr(list)); // s
        List<String> list1 = Arrays.asList("String", "s", "Strin", "str", "stri", "st");
        System.out.println(getShortOrLongStr(list1)); // String
    }

    public static String getShortOrLongStr(List<String> list) {
        int indexShort = 0;
        int indexLong = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(indexShort).length() > list.get(i).length()) {
                indexShort = i;
            } else if (list.get(indexLong).length() < list.get(i).length()) {
                indexLong = i;
            }
        }
        return list.get(Math.min(indexLong, indexShort));
    }
}
