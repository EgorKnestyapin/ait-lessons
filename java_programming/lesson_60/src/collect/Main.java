package collect;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "lime", "mango", "lime");
        // собираем в лист
        List<String> fruitsCapitals = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        // собираем в множество
        Set<String> fruitsSet = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(fruitsSet);
        // собираем в конкретную структуру
        LinkedList<String> fruitsLinkedList = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(LinkedList::new));
        // подсчет элеменетов
        Long count = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.counting());
        // собираем в map
        // у нас массив fruits, сохраним сами слова как ключи, а длину как значение
        Map<String, Integer> fruitsMap = fruits.stream()
                .distinct()
                .map(String::toUpperCase)
                .collect(Collectors.toMap(Function.identity(), fruit -> fruit.length()));
        System.out.println(fruitsMap);
    }
}
