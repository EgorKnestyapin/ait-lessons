package varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        print("apple");
        print("apple", "orange");
        print("apple", "orange", "pear");
        // создайте метод, который принимает произвольное количество интов, а возвращает их сумму
        // sumArguments
        System.out.println(sumArguments(1, 2, 3));
        System.out.println(stringArgsToList("a", "b", "c"));
        System.out.println(getStringLengthEqualsNum(2, "abc", "abw", "cfv"));
    }

    public static void print(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static int sumArguments(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    public static List<String> stringArgsToList(String... args) {
        return Arrays.asList(args);
    }

    public static String getStringLengthEqualsNum(int num, String... args) {
        Optional<String> firstFilterString = Arrays.stream(args)
                .filter(s -> s.length() == num)
                .findFirst();
        return firstFilterString.orElse(null);
    }
    public static String getStringLengthEqualsNum2(int num, String... args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() == num) return args[i];
        }
        return null;
    }
}
