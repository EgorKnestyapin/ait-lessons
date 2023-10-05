package lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println(calc(1,2, (n1,n2) -> n1 + n2));
        System.out.println(strListHandler(List.of(1,2,3,4), num -> Integer.bitCount(num)));
        System.out.println(listHandler(List.of("Jack", "John"), str -> str.toUpperCase()));
    }
    public static double calc(double num1, double num2, DoubleOperation operation) {
        return operation.apply(num1, num2);
    }
    public static <T> List<T> strListHandler(List<T> list, StringHandler<T> stringHandler) {
        List<T> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            res.add(stringHandler.handler(list.get(i)));
        }
        return res;
    }
    public static <T> List<T> listHandler(List<T> list, Function<T, T> function) {
        List<T> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            res.add(function.apply(list.get(i)));
        }
        return res;
    }
    public static <T> List<T> listHandler2(List<T> list, Predicate<T> predicate) {
        List<T> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(predicate.test(list.get(i)))
            res.add(list.get(i));
        }
        return res;
    }
}
