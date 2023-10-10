package homework;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    /* Создайте класс товар Alcohol с полями:
    title - название
    strength - крепость алкоголя
    price
    Создайте лист из 6-7 товаров с разными значениями, пусть какое-нибудь одно значение дублируется/повторяетсся.
     */
    public static void main(String[] args) {
        List<Alcohol> alcoholList = List.of(
                new Alcohol("Vodka", 40, 20),
                new Alcohol("Whiskey", 50, 40),
                new Alcohol("Gin", 45, 32),
                new Alcohol("Vodka", 40, 20),
                new Alcohol("Absent", 70, 28),
                new Alcohol("Wine", 15, 10),
                new Alcohol("Beer", 5, 5)
        );
        // Задание 1 ⭐⭐ Получите LinkedList из топ 3 самых дорогих товаров.
        List<Alcohol> expensiveAlcohol = alcoholList.stream()
                .sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice()))
                .limit(3)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(expensiveAlcohol);

        // Задание 2 ⭐⭐ Получите самый дешевый товар
        List<Alcohol> cheapestAlcohol = alcoholList.stream()
                .sorted((a, b) -> Double.compare(a.getPrice(), b.getPrice()))
                .limit(1)
                .toList();
        System.out.println(cheapestAlcohol.get(0));

        // Задание 3 ⭐⭐ Создайте Set из исходного листа.
        Set<Alcohol> alcoholSet = new HashSet<>(alcoholList);
        System.out.println(alcoholSet);

        // Задание 4 ⭐⭐⭐ Создайте Map из исходного листа, в котором ключами будут - названия товаров,
        // а значениями будут цены.
        Map<String, Double> alcoholTitlePriceMap = alcoholList.stream()
                .distinct()
                .collect(Collectors.toMap(Alcohol::getTitle, Alcohol::getPrice));
        System.out.println(alcoholTitlePriceMap);

        // Задание 5 ⭐⭐⭐ Создайте Map из исходного листа, в котором ключами будут - названия товаров,
        // а значениям будет крепость.
        Map<String, Integer> alcoholTitleStrengthMap = alcoholList.stream()
                .distinct()
                .collect(Collectors.toMap(Alcohol::getTitle, Alcohol::getStrength));
        System.out.println(alcoholTitleStrengthMap);
    }
}
